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

/**
 * The `Connection` class provides the base functionality for all VBus live
 * connections regardless of physical medium.
 * 
 * Its `transceive` method allows an application to send a `Header` instance
 * and optionally wait for a response, including resending the `Header`
 * instance if necessary.
 * 
 * Based on that method several other helper methods provide a
 * convenient wrapper to common VBus operation like waiting for the master
 * to offer the VBus timing control to another VBus participant.
 */
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
	
	/**
	 * Creates a `Connection` instance, initializing its member to the given values.
	 * 
	 * @param selfAddress VBus address to use as source address in `Header` instances
	 * created by this `Connection`.
	 */
	protected Connection(int selfAddress) {
		this.selfAddress = selfAddress;
		listeners = new ArrayList<ConnectionListener>();
		connectionState = ConnectionState.DISCONNECTED;
	}

	/**
	 * Add a listener for connection state changes and incoming `Header` instances.
	 * 
	 * @param listener Listener to add.
	 */
	public void addListener(ConnectionListener listener) {
		listeners.add(listener);
	}
	
	/**
	 * Remove a listener that was previously added using `addListener`.
	 * 
	 * @param listener Listener to remove.
	 */
	public void removeListener(ConnectionListener listener) {
		listeners.remove(listener);
	}

	/**
	 * Get the state of this connection.
	 * 
	 * @return State of this connection.
	 */
	public ConnectionState getConnectionState() {
		return connectionState;
	}
	
	/**
	 * Sets the state of the connection and notifies listeners about the change.
	 * 
	 * @param newConnectionState New state to set this connection to.
	 */
	protected void setConnectionState(ConnectionState newConnectionState) {
		this.connectionState = newConnectionState;
		
		for (ConnectionListener listener : listeners) {
			listener.connectionStateChanged(this);
		}
	}
	
	/**
	 * Checks the current state and optionally changes it, notifying the listeners.
	 * 
	 * @param currentConnectionState Expected current connection state before the change.
	 * @param newConnectionState Expected new connection state after the change.
	 */
	protected void checkAndSetConnectionState(ConnectionState currentConnectionState, ConnectionState newConnectionState) {
		if (this.connectionState == currentConnectionState) {
			setConnectionState(newConnectionState);
		}
	}
	
	/**
	 * Establish a connection.
	 * 
	 * Must be implemented by sub-class.
	 * 
	 * @throws IOException
	 */
	public abstract void connect() throws IOException;
	
	/**
	 * Close a connection.
	 * 
	 * Must be implemented by sub-class.
	 * 
	 * @throws IOException
	 */
	public abstract void disconnect() throws IOException;
	
	/**
	 * Send a `Header` instance using this connection.
	 * 
	 * Must be implemented by sub-class.
	 * 
	 * @param header `Header` instance to send.
	 * @throws IOException
	 */
	public abstract void send(Header header) throws IOException;
	
	protected void emitHeaderReceived(Header header) {
		for (ConnectionListener listener : this.listeners) {
			if (header instanceof Packet) {
				listener.packetReceived(this, (Packet) header);
			} else if (header instanceof Datagram) {
				listener.datagramReceived(this, (Datagram) header);
			} else if (header instanceof Telegram) {
				listener.telegramReceived(this, (Telegram) header);
			}
		}
	}

	/**
	 * Transmits and / or receives `Header` instances.
	 * 
	 * The `txHeader` is not `null`, it will be sent using the `send` method.
	 * If a timeout is specified, any incoming `Header` instances are
	 * forwarded to the given `filter` to evaluate whether or not that is
	 * a `Header` the application was waiting for. If the filter returns
	 * `true`, the timeout is canceled and the `transceive` method returns
	 * early. If the timeout elapses without the `filter` returning `true`,
	 * the whole procedure is repeated `tries` times, each incrementing
	 * the timeout by `timeoutIncr`.
	 * 
	 * @param txHeader `Header` instance to send or `null` if listening only.
	 * @param initialTimeout Initial timeout in milliseconds during the first try.
	 * @param timeoutIncr Timeout increment in milliseconds for each failed try.
	 * @param tries Number of tries.
	 * @param filter Filter to cancel timeout early or `null` if cancellation
	 * is not necessary.
	 * @return The `Header` instance that the `filter` returned `true` for.
	 * @throws IOException
	 */
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
					if (txHeader != null) {
						send(txHeader);
					}

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
	
	/**
     * Waits for a VBus bus offering datagram (Command 0x0500).
	 * 
	 * @param timeout Timeout in milliseconds to wait for datagram
	 * @return `Datagram` containing the VBus bus offering command or `null` on timeout
	 * @throws IOException
	 */
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
	
	/**
     * Sends a VBus bus release datagram (Command 0x0600).
	 * 
	 * @param address VBus address of the participant to hand VBus over to.
	 * @param timeout Timeout in milliseconds to wait for `Packet` to be received.
	 * @param timeoutIncr Timeout increment in milliseconds.
	 * @param tries Number of tries.
	 * @return First `Packet` instance received after the VBus was released or `null` on timeout.
	 * @throws IOException
	 */
	public Packet releaseBus(int address, int timeout, int timeoutIncr, int tries) throws IOException {
		Datagram txDgram = new Datagram(0, 0, address, selfAddress, 0x0600, 0, 0);

		Header rxHeader = transceive(txDgram, timeout, timeoutIncr, tries, new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				return (header instanceof Packet);
			}
			
		});
		
		return ((Packet) rxHeader);
	}

	/**
     * Sends a Datagram to get a value from a device.
     *  
	 * @param address VBus address of the participant to get value from.
	 * @param valueId Value ID.
	 * @param timeout Timeout in milliseconds.
	 * @param timeoutIncr Timeout increment in milliseconds.
	 * @param tries Number of tries.
	 * @return `Datagram` instance containing the value or `null` on timeout.
	 * @throws IOException
	 */
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
	
	/**
     * Sends a Datagram to set a value in a device.
     *  
	 * @param address VBus address of the participant to set the value in.
	 * @param valueId Value ID.
	 * @param value Value to set.
	 * @param save `true` if the device should save the value permanently, otherwise `false
	 * @param timeout Timeout in milliseconds.
	 * @param timeoutIncr Timeout increment in milliseconds.
	 * @param tries Number of tries.
	 * @return `Datagram` instance containing the value or `null` on timeout.
	 * @throws IOException
	 */
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
	
	/**
     * Sends a Datagram to lookup a value ID hash in a device.
	 * 
	 * @param address VBus address of the participant to lookup the value ID hash in.
	 * @param valueId Value ID.
	 * @param timeout Timeout in milliseconds.
	 * @param timeoutIncr Timeout increment in milliseconds.
	 * @param tries Number of tries.
	 * @return `Datagram` instance containing the Value ID hash in the `value` field or `null` on timeout
	 * @throws IOException
	 */
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
	
	/**
     * Sends a Datagram to lookup a value ID in a device.
	 * 
	 * @param address VBus address of the participant to lookup the value ID in.
	 * @param valueIdHash Value ID hash.
	 * @param timeout Timeout in milliseconds.
	 * @param timeoutIncr Timeout increment in milliseconds.
	 * @param tries Number of tries.
	 * @return `Datagram` instance containing the Value ID or `null` on timeout
	 * @throws IOException
	 */
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
