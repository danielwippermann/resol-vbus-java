/**
 * Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.
 * Copyright (C) 2016, Daniel Wippermann.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
package de.resol.vbus;

import java.io.IOException;

public class ConnectionCustomizer extends Customizer {

	public static interface ConfigurationValueFilter {

		ConfigurationValue[] filterConfigurationValues(ConfigurationValue[] values, int round);

	}
	
	public static enum TransceiveAction {
		
		GET,
		
		SET,

		SAVE,

	}
	
	public static class TransceiveState {
		
		private long valueStartedAt;
		
		private boolean isBusTaken;
		
		private int masterAddress;
		
		private long masterLastContactedAt;
				
	}
	
	private Connection connection;
	
	private int maxRounds;
	
	private int triesPerValue;
	
	private long timeoutPerValue;
	
	private long masterTimeout;
	
	public ConnectionCustomizer(int deviceAddress, ConfigurationOptimizer optimizer, Connection connection) {
		super(deviceAddress, optimizer);
		this.connection = connection;
		this.maxRounds = 10;
		this.triesPerValue = 2;
		this.timeoutPerValue = 30000;
		this.masterTimeout = 8000;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	@Override
	protected ConfigurationValue[] loadConfigurationInternal(final ConfigurationValue[] valuesParam, final boolean optimize) throws IOException {
		return transceiveConfiguration(TransceiveAction.GET, new ConfigurationValueFilter() {
			
			public ConfigurationValue[] filterConfigurationValues(ConfigurationValue[] values, int round) {
				if (optimize) {
					if (round == 1) {
						values = ConnectionCustomizer.this.getOptimizer().optimizeLoadConfiguration(valuesParam);
					} else {
						values = ConnectionCustomizer.this.getOptimizer().optimizeLoadConfiguration(values);
					}
				} else {
					if (round == 1) {
						values = valuesParam;
					
						for (int i = 0; i < values.length; i++) {
							values [i].setPending(true);
						}
					}
				}
				
				return values;
			}

		});
	}
	
	@Override
	protected ConfigurationValue[] saveConfigurationInternal(final ConfigurationValue[] newValues, final ConfigurationValue[] oldValues, final boolean optimize) throws IOException {
		return transceiveConfiguration(TransceiveAction.SAVE, new ConfigurationValueFilter() {
			
			public ConfigurationValue[] filterConfigurationValues(ConfigurationValue[] values, int round) {
				if (optimize) {
					if (round == 1) {
						values = ConnectionCustomizer.this.getOptimizer().optimizeSaveConfiguration(newValues, oldValues);
					} else {
						values = ConnectionCustomizer.this.getOptimizer().optimizeSaveConfiguration(newValues, values);
					}
				} else {
					if (round == 1) {
						values = newValues;

						for (int i = 0; i < values.length; i++) {
							values [i].setPending(true);
						}
					}
				}

				return values;
			}

		});
	}
	
	public ConfigurationValue[] transceiveConfiguration(TransceiveAction action, ConfigurationValueFilter filter) throws IOException {
		TransceiveState state = new TransceiveState();
		
		int round = 0;
		
		ConfigurationValue[] values = null;

		while (round < maxRounds) {
			round++;

			values = filter.filterConfigurationValues(values, round);
			
			int pendingValues = 0;
			for (int i = 0; i < values.length; i++) {
				ConfigurationValue valueInfo = values [i];
				
				if (!valueInfo.isPending()) {
					continue;
				}
				
				pendingValues++;

				Datagram dgram = null;
				try {
					dgram = transceiveValue(valueInfo, valueInfo.getValue(), action, state);
				} catch (IOException ex) {
					// nop
				}
				
				valueInfo.setPending(false);
				valueInfo.setTransceived(dgram != null);
				
				if (dgram != null) {
					valueInfo.setValue(dgram.getValue());
				}
			}
			
			if (pendingValues == 0) {
				break;
			}
			
		}
		
		releaseBusIfTaken(state);
		
		return values;
	}
	
	public Datagram transceiveValue(ConfigurationValue valueInfo, int value, TransceiveAction action, TransceiveState state) throws IOException {
		state.valueStartedAt = System.currentTimeMillis();

		int address = getDeviceAddress();

		int tries = 0;
		
		Datagram result = null;
		while ((result == null) && (tries < triesPerValue)) {
			tries++;
			
			checkTransceiveValueState(state);
			
			if ((tries > 1) && state.isBusTaken) {
				state.isBusTaken = false;
				
				connection.releaseBus(state.masterAddress, 1500, 0, 2);
			}
			
			if (!state.isBusTaken) {
				checkTransceiveValueState(state);
				
				Datagram dgram = connection.waitForFreeBus(20000);
				if (dgram != null) {
					state.masterAddress = dgram.getSourceAddress();
				} else {
					state.masterAddress = 0;
				}
			}
			
			long now = System.currentTimeMillis();

			boolean contactMaster;
			if (state.masterAddress == 0) {
				contactMaster = false;
			} else if (state.masterAddress == address) {
				contactMaster = false;
			} else if (!state.isBusTaken) {
				contactMaster = true;
			} else if ((now - state.masterLastContactedAt) >= masterTimeout) {
				contactMaster = true;
			} else {
				contactMaster = false;
			}
			
			if (contactMaster) {
				checkTransceiveValueState(state);
				
				state.isBusTaken = true;
				state.masterLastContactedAt = now;
				
				connection.getValueById(state.masterAddress, 0, 500, 0, 1);
			}
			
			if (state.masterAddress == address) {
				state.isBusTaken = true;
				state.masterLastContactedAt = now;
			}
			
			boolean isValidValue;
			if (valueInfo.getValueIndex() != 0) {
				isValidValue = true;
			} else if (valueInfo.getValueIdHash() != 0) {
				checkTransceiveValueState(state);
				
				Datagram dgram = connection.getValueIdByIdHash(address, valueInfo.getValueIdHash(), 500, 500, 3);
				if (dgram != null) {
					valueInfo.setValueIndex(dgram.getValueId());
					isValidValue = true;
				} else {
					isValidValue = false;
				}
			} else {
				isValidValue = false;
			}

			if (isValidValue) {
				checkTransceiveValueState(state);
				
				if (state.masterAddress == address) {
					state.isBusTaken = true;
					state.masterLastContactedAt = System.currentTimeMillis();
				}
			
				Datagram dgram;
				if (action == TransceiveAction.GET) {
					dgram = connection.getValueById(address, valueInfo.getValueIndex(), 500, 500, 3);
				} else if (action == TransceiveAction.SET) {
					dgram = connection.setValueById(address, valueInfo.getValueIndex(), value, false, 500, 500, 3);
				} else if (action == TransceiveAction.SAVE) {
					dgram = connection.setValueById(address, valueInfo.getValueIndex(), value, true, 500, 500, 3);
				} else {
					throw new UnsupportedOperationException("Unsupported TransceiveAction value");
				}
				
				if (dgram != null) {
					result = dgram;
				}
			}
		}
		
		return result;
	}
	
	private void checkTransceiveValueState(TransceiveState state) throws IOException {
		// FIXME(daniel): check if connection is still CONNECTED and reconnect if necessary

		long now = System.currentTimeMillis();
		if ((now - state.valueStartedAt) >= timeoutPerValue) {
			throw new IOException("Exceeded the timeout per value");
		}
	}
	
	public void releaseBusIfTaken(TransceiveState state) throws IOException {
		if (state.isBusTaken) {
			state.isBusTaken = false;
			
			connection.releaseBus(state.masterAddress, 1500, 0, 1);
		}
	}
	
}
