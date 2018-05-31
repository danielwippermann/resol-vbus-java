/**
 * Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.
 * Copyright (C) 2018, Daniel Wippermann.
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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;

import de.resol.vbus.Connection.ConnectionState;

/**
 * The `BaseDeviceEmulator` class provides the basics for implementing
 * a device emulator. It provides `PropertyChangeListener` support
 * and allows receiving and sending data over a `Connection`.
 */
public abstract class BaseDeviceEmulator implements ConnectionListener {
	
	private Connection connection;
	
	private ConnectionState connectionState;
	
	private final PropertyChangeSupport pcs;
	
	/**
	 * Create a new `BaseDeviceEmulator` instance using the given `Connection`.
	 * 
	 * @param connection The connection to use.
	 */
	public BaseDeviceEmulator(Connection connection) {
		this.connection = connection;
		connectionState = ConnectionState.DISCONNECTED;
		pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * Return the connection used for this device emulator.
	 * 
	 * @return The `Connection` used for this device emulator.
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * Return the connection state for this device emulator.
	 * 
	 * The connection state is `DISCONNECTED` if the device emulator is
	 * stopped. Otherwise it follows the connection state of the
	 * `Connection` used for this device emulator.
	 * 
	 * @return The connection state.
	 */
	public ConnectionState getConnectionState() {
		return connectionState;
	}
	
	private void setConnectionState(ConnectionState newValue) {
		ConnectionState oldValue = connectionState;
		if (oldValue != newValue) {
			connectionState = newValue;
			pcs.firePropertyChange("connectionState", oldValue, newValue);
		}
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propName, PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(propName, listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(String propName, PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(propName, listener);
	}
	
	protected void firePropertyChange(String propName, Object oldValue, Object newValue) {
		pcs.firePropertyChange(propName, oldValue, newValue);
	}
	
	/**
	 * Start the device emulator by adding the event listener
	 * to the connection.
	 */
	public void start() {
		connection.addListener(this);
		setConnectionState(connection.getConnectionState());
	}
	
	/**
	 * Stop the device emulator by removing the event listener
	 * from the connection.
	 */
	public void stop() {
		connection.removeListener(this);
		setConnectionState(ConnectionState.DISCONNECTED);
	}

	@Override
	public void connectionStateChanged(Connection connection) {
		setConnectionState(connection.getConnectionState());
	}

	@Override
	public void packetReceived(Connection connection, Packet packet) {
		// nop, can be implemented by sub-class if necessary
	}

	@Override
	public void datagramReceived(Connection connection, Datagram dgram) {
		// nop, can be implemented by sub-class if necessary
	}

	@Override
	public void telegramReceived(Connection connection, Telegram tgram) {
		// nop, can be implemented by sub-class if necessary
	}

	/**
	 * Update internal time-related state.
	 * 
	 * @param deltaMs The amount of milliseconds passed since the last call to `update`.
	 * @return The amount of milliseconds until next preferred call to `update`.
	 */
	public abstract int update(int deltaMs);

	/**
	 * Send the provided header, ignoring possible I/O errors.
	 * 
	 * @param header The `Header` to send.
	 */
	public void send(Header header) {
		try {
			getConnection().send(header);
		} catch (IOException ex) {
			// nop
		}
	}

}
