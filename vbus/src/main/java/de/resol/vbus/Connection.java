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
import java.util.ArrayList;

public abstract class Connection {

	public enum ConnectionState {
		DISCONNECTED,
		CONNECTING,
		CONNECTED,
		INTERRUPTED,
		RECONNECTING,
		DISCONNECTING,
	}
	
	protected int selfAddress;
	
	protected ArrayList<ConnectionListener> listeners;
	
	protected ConnectionState connectionState;
	
	public void addListener(ConnectionListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(ConnectionListener listener) {
		listeners.remove(listener);
	}

	protected Connection(int selfAddress) {
		this.selfAddress = selfAddress;
		listeners = new ArrayList<ConnectionListener>();
		connectionState = ConnectionState.DISCONNECTED;
	}

	public ConnectionState getConnectionState() {
		return connectionState;
	}
	
	protected void setConnectionState(ConnectionState newConnectionState) {
		this.connectionState = newConnectionState;
		
		for (ConnectionListener listener : listeners) {
			listener.connectionStateChanged(this);
		}
	}
	
	protected void checkAndSetConnectionState(ConnectionState currentConnectionState, ConnectionState newConnectionState) {
		if (this.connectionState == currentConnectionState) {
			setConnectionState(newConnectionState);
		}
	}
	
	public abstract void connect() throws IOException;
	
	public abstract void disconnect() throws IOException;
	
	public abstract void send(Header header) throws IOException;
	
	public Header transceive(Header txHeader, int initialTimeout, int timeoutIncr, int tries, final HeaderFilter filter) throws IOException {
		final Header[] rxHeader = new Header [1];

		ConnectionListener listener = new ConnectionAdapter() {
			
			@Override
			public void packetReceived(Connection connection, Packet packet) {
				headerReceived(packet);
			}
			
			@Override
			public void datagramReceived(Connection connection, Datagram dgram) {
				headerReceived(dgram);
			}
			
			@Override
			public void telegramReceived(Connection connection, Telegram tgram) {
				headerReceived(tgram);
			}

			private void headerReceived(Header header) {
				if (filter != null) {
					if (filter.filterHeader(header)) {
						synchronized (rxHeader) {
							rxHeader [0] = header;
							rxHeader.notifyAll();
						}
					}
				}
			}

		};
		
		addListener(listener);

		try {
			int timeout = initialTimeout;
			
			synchronized (rxHeader) {
				for (int currentTry = 0; currentTry < tries; currentTry++) {
					send(txHeader);

					if (rxHeader [0] == null) {
						try {
							rxHeader.wait(timeout);
						} catch (InterruptedException ex) {
							// NOTE(daniel): just ignore that exception at the moment
						}
					}

					if (rxHeader [0] != null) {
						break;
					}
					
					timeout += timeoutIncr; 
				}
			}
		} finally {
			removeListener(listener);
		}

		return rxHeader [0];
	}
	
	public Datagram waitForFreeBus(int timeout) throws IOException {
		Header rxHeader = transceive(null, timeout, 0, 1, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Datagram) {
					Datagram dgram = (Datagram) header;
					if (dgram.getCommand() == 0x0500) {
						return true;
					}
				}
				return false;
			}
			
		});
		
		return ((Datagram) rxHeader);
	}
	
	public Packet releaseBus(int address, int timeout, int timeoutIncr, int tries) throws IOException {
		Datagram txDgram = new Datagram(0, 0, address, selfAddress, 0x0600, 0, 0);

		Header rxHeader = transceive(txDgram, timeout, timeoutIncr, tries, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				return (header instanceof Packet);
			}
			
		});
		
		return ((Packet) rxHeader);
	}

	public Datagram getValueById(final int address, final int valueId, int timeout, int timeoutIncr, int tries) throws IOException {
		Datagram txDgram = new Datagram(0, 0, address, selfAddress, 0x0300, valueId, 0);
		
		Header rxHeader = transceive(txDgram, timeout, timeoutIncr, tries, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Datagram) {
					Datagram dgram = (Datagram) header;
					if (dgram.getDestinationAddress() != selfAddress) {
						// nop
					} else if (dgram.getSourceAddress() != address) {
						// nop
					} else if (dgram.getCommand() != 0x0100) {
						// nop
					} else if (dgram.getValueId() != valueId) {
						// nop
					} else {
						return true;
					}
				}
				return false;
			}
			
		});
		
		return ((Datagram) rxHeader);
	}
	
	public Datagram setValueById(final int address, final int valueId, int value, boolean save, int timeout, int timeoutIncr, int tries) throws IOException {
		Datagram txDgram = new Datagram(0, 0, address, selfAddress, save ? 0x0400 : 0x0200, valueId, value);
		
		Header rxHeader = transceive(txDgram, timeout, timeoutIncr, tries, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Datagram) {
					Datagram dgram = (Datagram) header;
					if (dgram.getDestinationAddress() != selfAddress) {
						// nop
					} else if (dgram.getSourceAddress() != address) {
						// nop
					} else if (dgram.getCommand() != 0x0100) {
						// nop
					} else if (dgram.getValueId() != valueId) {
						// nop
					} else {
						return true;
					}
				}
				return false;
			}
			
		});
		
		return ((Datagram) rxHeader);
	}
	
	public Datagram getValueIdHashById(final int address, final int valueId, int timeout, int timeoutIncr, int tries) throws IOException {
		Datagram txDgram = new Datagram(0, 0, address, selfAddress, 0x1000, valueId, 0);
		
		Header rxHeader = transceive(txDgram, timeout, timeoutIncr, tries, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Datagram) {
					Datagram dgram = (Datagram) header;
					if (dgram.getDestinationAddress() != selfAddress) {
						// nop
					} else if (dgram.getSourceAddress() != address) {
						// nop
					} else if (dgram.getCommand() != 0x0100) {
						// nop
					} else if (dgram.getValueId() != valueId) {
						// nop
					} else {
						return true;
					}
				}
				return false;
			}
			
		});
		
		return ((Datagram) rxHeader);
	}
	
	public Datagram getValueIdByIdHash(final int address, final int valueIdHash, int timeout, int timeoutIncr, int tries) throws IOException {
		Datagram txDgram = new Datagram(0, 0, address, selfAddress, 0x1100, 0, valueIdHash);
		
		Header rxHeader = transceive(txDgram, timeout, timeoutIncr, tries, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Datagram) {
					Datagram dgram = (Datagram) header;
					if (dgram.getDestinationAddress() != selfAddress) {
						// nop
					} else if (dgram.getSourceAddress() != address) {
						// nop
					} else if (dgram.getCommand() != 0x0100) {
						// nop
					} else if (dgram.getValue() != valueIdHash) {
						// nop
					} else {
						return true;
					}
				}
				return false;
			}
			
		});
		
		return ((Datagram) rxHeader);
	}

}
