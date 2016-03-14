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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import de.resol.vbus.Connection.ConnectionState;
import de.resol.vbus.ConnectionCustomizer.TransceiveAction;
import de.resol.vbus.ConnectionCustomizer.TransceiveState;
import de.resol.vbus.ConnectionTest.TestableConnection;

public class ConnectionCustomizerTest {

	public static class TestableConnectionCustomizer extends ConnectionCustomizer {
		
		public TestableConnectionCustomizer(int deviceAddress, ConfigurationOptimizer optimizer, Connection connection) {
			super(deviceAddress, optimizer, connection);
		}
	}
	
	private static class TestContext {

		int deviceAddress;
		
		ConfigurationOptimizer optimizer;
		
		ConfigurationValue[] testValues;

		TestableConnection connection;
		
		TestableConnectionCustomizer customizer;
		
	}

	TestContext createContext(boolean useOptimizer, ConfigurationValue[] testValues) {
		final TestContext ctx = new TestContext();
		
		ctx.deviceAddress = 0x2211;
		
		ctx.optimizer = ConfigurationOptimizerFactory.matchOptimizer(ctx.deviceAddress, null, null);
		
		ctx.testValues = ctx.optimizer.completeConfiguration(testValues);
		
		ctx.connection = new TestableConnection();
		ctx.connection.setConnectionState(ConnectionState.CONNECTED);

		ctx.customizer = new TestableConnectionCustomizer(ctx.deviceAddress, useOptimizer ? ctx.optimizer : null, ctx.connection) {
			
			@Override
			public Datagram transceiveValue(ConfigurationValue valueInfo, int value, TransceiveAction action, TransceiveState state) throws IOException {
				Datagram result = null;

				for (int i = 0; i < ctx.testValues.length; i++) {
					ConfigurationValue cv = ctx.testValues [i];
					if (cv.getValueIndex() == valueInfo.getValueIndex()) {
						result = new Datagram(System.currentTimeMillis(), 0, 0, 0, 0x0100, cv.getValueIndex(), cv.getValue());
						break;
					}
				}
				
				return result;
			}

		};

		return ctx;
	}

	@Test
	public void testLoadConfiguration() throws Exception {
		// ---- CASE 1: without optimizer ---- 
		if (true) {
			ConfigurationValue[] testValues = new ConfigurationValue[] {
				new ConfigurationValue("dT1ein", 0x0180, 0x6F508365, 80, 0, false, false),  // createConfigurationValueDescriptor("dT1ein", 0x0180, 0x6F508365, 0)
				new ConfigurationValue("dT1aus", 0x0190, 0x6F5073F2, 50, 0, false, false),  // createConfigurationValueDescriptor("dT1aus", 0x0190, 0x6F5073F2, 0)
				new ConfigurationValue("dT2ein", 0x0183, 0x6F510FC6, 60, 0, false, false),  // createConfigurationValueDescriptor("dT2ein", 0x0183, 0x6F510FC6, 0)
				new ConfigurationValue("dT2aus", 0x0193, 0x6F510053, 40, 0, false, false),  // createConfigurationValueDescriptor("dT2aus", 0x0193, 0x6F510053, 0)
			};

			TestContext ctx = createContext(false, testValues);
			
			ConfigurationValue[] inputValues = new ConfigurationValue[] {
				new ConfigurationValue("dT1ein", 0x0180, 0x6F508365, 0, 0, true, false),
				new ConfigurationValue("dT1aus", 0,      0x6F5073F2, 0, 0, true, false),
				new ConfigurationValue("dT2ein", 0,      0,          0, 0, true, false),
				new ConfigurationValue("dT2aus", 0x0193, 0x6F510053, 0, 0, true, false),
			};
			
			// NOTE(daniel): manually complete configuration since no optimizer is used to do it
			inputValues = ctx.optimizer.completeConfiguration(inputValues);
			
			ConfigurationValue[] outputValues = ctx.customizer.loadConfiguration(inputValues, false);
			
			ConfigurationValue cv;
			assertEquals(4, outputValues.length);

			cv = outputValues [0];
			assertEquals(0x0180, cv.getValueIndex());
			assertEquals(80, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [1];
			assertEquals(0x0183, cv.getValueIndex());
			assertEquals(60, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [2];
			assertEquals(0x0190, cv.getValueIndex());
			assertEquals(50, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [3];
			assertEquals(0x0193, cv.getValueIndex());
			assertEquals(40, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());
		}

		// ---- CASE 2: with optimizer, but without optimization ---- 
		if (true) {
			ConfigurationValue[] testValues = new ConfigurationValue[] {
				new ConfigurationValue("dT1ein", 0x0180, 0x6F508365, 80, 0, false, false),  // createConfigurationValueDescriptor("dT1ein", 0x0180, 0x6F508365, 0)
				new ConfigurationValue("dT1aus", 0x0190, 0x6F5073F2, 50, 0, false, false),  // createConfigurationValueDescriptor("dT1aus", 0x0190, 0x6F5073F2, 0)
				new ConfigurationValue("dT2ein", 0x0183, 0x6F510FC6, 60, 0, false, false),  // createConfigurationValueDescriptor("dT2ein", 0x0183, 0x6F510FC6, 0)
				new ConfigurationValue("dT2aus", 0x0193, 0x6F510053, 40, 0, false, false),  // createConfigurationValueDescriptor("dT2aus", 0x0193, 0x6F510053, 0)
			};

			TestContext ctx = createContext(true, testValues);
			
			ConfigurationValue[] inputValues = new ConfigurationValue[] {
				new ConfigurationValue("dT1ein", 0x0180, 0x6F508365, 0, 0, true, false),
				new ConfigurationValue("dT1aus", 0,      0x6F5073F2, 0, 0, true, false),
				new ConfigurationValue("dT2ein", 0,      0,          0, 0, true, false),
				new ConfigurationValue("dT2aus", 0x0193, 0x6F510053, 0, 0, true, false),
			};
			
			ConfigurationValue[] outputValues = ctx.customizer.loadConfiguration(inputValues, false);
			
			ConfigurationValue cv;
			assertEquals(4, outputValues.length);

			cv = outputValues [0];
			assertEquals(0x0180, cv.getValueIndex());
			assertEquals(80, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [1];
			assertEquals(0x0183, cv.getValueIndex());
			assertEquals(60, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [2];
			assertEquals(0x0190, cv.getValueIndex());
			assertEquals(50, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [3];
			assertEquals(0x0193, cv.getValueIndex());
			assertEquals(40, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());
		}


		// ---- CASE 3: with optimizer and optimization ---- 
		if (true) {
			ConfigurationValue[] testValues = new ConfigurationValue[] {
				new ConfigurationValue(null, 0x0001, 0, 1234, 0, false, false),
			};

			TestContext ctx = createContext(true, testValues);
			
			ConfigurationValue[] outputValues = ctx.customizer.loadConfiguration(null, true);
			
			ConfigurationValue cv;
			assertEquals(175, outputValues.length);

			cv = outputValues [0];
			assertEquals(0x0001, cv.getValueIndex());
			assertEquals(1234, cv.getValue());
			assertEquals(false, cv.isPending());
			assertEquals(true, cv.isTransceived());

			cv = outputValues [1];
			assertEquals(0x000A, cv.getValueIndex());
			assertEquals(false, cv.isPending());
			assertEquals(false, cv.isTransceived());
		}
	}

	static class TransceiveValueTestContext extends ConnectionAdapter {
		
		int deviceAddress;

		ConfigurationOptimizer optimizer;

		ConfigurationValue[] testValues;

		Connection connection;
		
		ArrayList<Datagram> dgramList;
		
		ConnectionCustomizer customizer;
		
		TransceiveState state;
		
		TransceiveValueTestContext(int valueIndex, int value) {
			this(new ConfigurationValue[] {
				new ConfigurationValue(null, valueIndex, 0, value, 0, false, false),
			});
		}
		
		TransceiveValueTestContext(ConfigurationValue[] testValues) {
			final TransceiveValueTestContext ctx = this;
			
			ctx.deviceAddress = 0x2211;
			
			ctx.optimizer = ConfigurationOptimizerFactory.matchOptimizer(ctx.deviceAddress, null, null);

			ctx.testValues = ctx.optimizer.completeConfiguration(testValues);
			
			ctx.connection = new TestableConnection() {
				
				@Override
				public void send(Header header) throws IOException {
					emitHeaderReceived(header);
				}
				
				@Override
				public Datagram waitForFreeBus(int timeout) throws IOException {
					return new Datagram(0, 0, 0, ctx.deviceAddress, 0x0500, 0, 0);
				}
				
			};
			
			ctx.connection.setConnectionState(ConnectionState.CONNECTED);

			ctx.dgramList = new ArrayList<Datagram>();

			ctx.connection.addListener(ctx);
			
			ctx.customizer = new ConnectionCustomizer(ctx.deviceAddress, ctx.optimizer, ctx.connection);

			ctx.state = new TransceiveState();
		}

		@Override
		public void datagramReceived(Connection connection, Datagram dgram) {
			dgramList.add(dgram);

			if (dgram.getDestinationAddress() == deviceAddress) {
				int valueIndex = dgram.getValueId();
				
				for (int i = 0; i < testValues.length; i++) {
					ConfigurationValue cv = testValues [i];
					if (cv.getValueIndex() == valueIndex) {
						int value = cv.getValue();

						Datagram response = new Datagram(0, 0, dgram.getSourceAddress(), deviceAddress, 0x0100, valueIndex, value);
						send(response);

						break;
					}
				}
			}
		}
		
		void send(Header header) {
			try {
				connection.send(header);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test
	public void testTransceiveValue() throws Exception {
		// ---- CASE 1: get value correctly ----
		if (true) {
			int valueIndex = 0x1234;
			int value = 0x12345678;
			
			TransceiveValueTestContext ctx = new TransceiveValueTestContext(valueIndex, value);

			ConfigurationValue cv = new ConfigurationValue(null, valueIndex, 0, 0, 0, true, false);

			Datagram dgram = ctx.customizer.transceiveValue(cv, 0, TransceiveAction.GET, ctx.state);

			assertNotNull(dgram);
			assertEquals(ctx.dgramList.get(1), dgram);
			
			dgram = ctx.dgramList.get(0);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0300_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(0, dgram.getValue());

			dgram = ctx.dgramList.get(1);
			assertNotNull(dgram);
			assertEquals("00_0020_2211_20_0100_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());
		}
		
		// ---- CASE 2: set value correctly ----
		if (true) {
			int valueIndex = 0x1234;
			int value = 0x12345678;
			
			TransceiveValueTestContext ctx = new TransceiveValueTestContext(valueIndex, value);

			ConfigurationValue cv = new ConfigurationValue(null, valueIndex, 0, 0, 0, true, false);

			Datagram dgram = ctx.customizer.transceiveValue(cv, value, TransceiveAction.SET, ctx.state);

			assertNotNull(dgram);
			assertEquals(ctx.dgramList.get(1), dgram);
			
			dgram = ctx.dgramList.get(0);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0200_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());

			dgram = ctx.dgramList.get(1);
			assertNotNull(dgram);
			assertEquals("00_0020_2211_20_0100_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());
		}

		// ---- CASE 3: set and save value correctly ----
		if (true) {
			int valueIndex = 0x1234;
			int value = 0x12345678;
			
			TransceiveValueTestContext ctx = new TransceiveValueTestContext(valueIndex, value);

			ConfigurationValue cv = new ConfigurationValue(null, valueIndex, 0, 0, 0, true, false);

			Datagram dgram = ctx.customizer.transceiveValue(cv, value, TransceiveAction.SAVE, ctx.state);

			assertNotNull(dgram);
			assertEquals(ctx.dgramList.get(1), dgram);
			
			dgram = ctx.dgramList.get(0);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0400_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());

			dgram = ctx.dgramList.get(1);
			assertNotNull(dgram);
			assertEquals("00_0020_2211_20_0100_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());
		}

		// ---- CASE 4: release and wait for free bus again correctly ----
		if (true) {
			int valueIndex = 0x1234;
			int value = 0x12345678;
			
			final boolean[] released = new boolean [1];
			
			TransceiveValueTestContext ctx = new TransceiveValueTestContext(valueIndex, value) {
				
				public void datagramReceived(Connection connection, Datagram dgram) {
					if (dgram.getCommand() == 0x0600) {
						dgramList.add(dgram);

						released [0] = true;
						
						Packet packet = new Packet(0, 0, 0x0010, deviceAddress, 0x0100, 0, null);
						send(packet);
					} else if (released [0]) {
						super.datagramReceived(connection, dgram);
					} else {
						dgramList.add(dgram);
					}
				}
				
			};

			ConfigurationValue cv = new ConfigurationValue(null, valueIndex, 0, 0, 0, true, false);

			Datagram dgram = ctx.customizer.transceiveValue(cv, value, TransceiveAction.SAVE, ctx.state);

			assertEquals(6, ctx.dgramList.size());

			assertNotNull(dgram);
			assertEquals(ctx.dgramList.get(5), dgram);
			
			dgram = ctx.dgramList.get(0);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0400_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());

			dgram = ctx.dgramList.get(1);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0400_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());

			dgram = ctx.dgramList.get(2);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0400_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());

			dgram = ctx.dgramList.get(3);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0600_0000", dgram.getId());
			assertEquals(0, dgram.getValueId());
			assertEquals(0, dgram.getValue());

			dgram = ctx.dgramList.get(4);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0400_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());

			dgram = ctx.dgramList.get(5);
			assertNotNull(dgram);
			assertEquals("00_0020_2211_20_0100_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());
		}

		// ---- CASE 5: get value using ID hash correctly ----
		if (true) {
			final int valueIndex = 0x1234;
			final int valueIdHash = 0x76543210;
			int value = 0x12345678;
			
			TransceiveValueTestContext ctx = new TransceiveValueTestContext(valueIndex, value) {
				
				@Override
				public void datagramReceived(Connection connection, Datagram dgram) {
					if (dgram.destinationAddress != deviceAddress) {
						dgramList.add(dgram);
					} else if ((dgram.getCommand() == 0x1100) && (dgram.getValue() == valueIdHash)) {
						dgramList.add(dgram);
						
						Datagram response = new Datagram(0, 0, dgram.getSourceAddress(), deviceAddress, 0x0100, valueIndex, valueIdHash);
						
						send(response);
					} else if (dgram.getCommand() == 0x0300) {
						super.datagramReceived(connection, dgram);
					} else {
						dgramList.add(dgram);
					}
				}
				
			};

			ConfigurationValue cv = new ConfigurationValue(null, 0, valueIdHash, 0, 0, true, false);

			Datagram dgram = ctx.customizer.transceiveValue(cv, 0, TransceiveAction.GET, ctx.state);

			assertEquals(4, ctx.dgramList.size());

			assertNotNull(dgram);
			assertEquals(ctx.dgramList.get(3), dgram);
			
			dgram = ctx.dgramList.get(0);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_1100_0000", dgram.getId());
			assertEquals(0, dgram.getValueId());
			assertEquals(valueIdHash, dgram.getValue());

			dgram = ctx.dgramList.get(1);
			assertNotNull(dgram);
			assertEquals("00_0020_2211_20_0100_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(valueIdHash, dgram.getValue());

			dgram = ctx.dgramList.get(2);
			assertNotNull(dgram);
			assertEquals("00_2211_0020_20_0300_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(0, dgram.getValue());

			dgram = ctx.dgramList.get(3);
			assertNotNull(dgram);
			assertEquals("00_0020_2211_20_0100_0000", dgram.getId());
			assertEquals(valueIndex, dgram.getValueId());
			assertEquals(value, dgram.getValue());
		}
	}

}
