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

import static org.junit.Assert.*;

import java.beans.PropertyChangeEvent;

import org.junit.Test;

import de.resol.vbus.Connection.ConnectionState;

public class BaseDeviceEmulatorTest {

	@Test
	public void testConstructor() throws Exception {
		Connection conn = new TestableConnection(0x0020);
		conn.connect();

		BaseDeviceEmulator device = new TestableDeviceEmulator(conn);
		
		assertEquals(conn, device.getConnection());
		assertEquals(ConnectionState.DISCONNECTED, device.getConnectionState());
	}

	@Test
	public void testPcs() throws Exception {
		Connection conn = new TestableConnection(0x0020);
		
		BaseDeviceEmulator device = new TestableDeviceEmulator(conn);
		
		TestablePropertyChangeListener pcl1 = new TestablePropertyChangeListener();
		device.addPropertyChangeListener(pcl1);

		TestablePropertyChangeListener pcl2 = new TestablePropertyChangeListener();
		device.addPropertyChangeListener("connectionState", pcl2);

		TestablePropertyChangeListener pcl3 = new TestablePropertyChangeListener();
		device.addPropertyChangeListener("unknownProp", pcl3);

		device.firePropertyChange("connectionState", ConnectionState.DISCONNECTED, ConnectionState.CONNECTED);
		
		PropertyChangeEvent evt = pcl1.dequeueEvent();
		assertEquals("connectionState", evt.getPropertyName());
		assertEquals(ConnectionState.DISCONNECTED, evt.getOldValue());
		assertEquals(ConnectionState.CONNECTED, evt.getNewValue());
		
		pcl1.assertQueueEmpty();

		evt = pcl2.dequeueEvent();
		assertEquals("connectionState", evt.getPropertyName());
		assertEquals(ConnectionState.DISCONNECTED, evt.getOldValue());
		assertEquals(ConnectionState.CONNECTED, evt.getNewValue());
		
		pcl2.assertQueueEmpty();
		
		pcl3.assertQueueEmpty();
		
		device.removePropertyChangeListener("unknownProp", pcl3);
		device.removePropertyChangeListener("connectionState", pcl2);
		device.removePropertyChangeListener(pcl1);
	}
	
	@Test
	public void testStart() throws Exception {
		Connection conn = new TestableConnection(0x0020);
		conn.connect();

		BaseDeviceEmulator device = new TestableDeviceEmulator(conn);
		
		TestablePropertyChangeListener pcl = new TestablePropertyChangeListener();
		device.addPropertyChangeListener(pcl);

		assertEquals(ConnectionState.DISCONNECTED, device.getConnectionState());
		
		device.start();
		
		assertEquals(ConnectionState.CONNECTED, device.getConnectionState());
		
		PropertyChangeEvent evt = pcl.dequeueEvent();
		assertEquals("connectionState", evt.getPropertyName());
		assertEquals(ConnectionState.DISCONNECTED, evt.getOldValue());
		assertEquals(ConnectionState.CONNECTED, evt.getNewValue());
		
		pcl.assertQueueEmpty();
	}

	@Test
	public void testStop() throws Exception {
		Connection conn = new TestableConnection(0x0020);
		conn.connect();

		BaseDeviceEmulator device = new TestableDeviceEmulator(conn);
		
		device.start();

		TestablePropertyChangeListener pcl = new TestablePropertyChangeListener();
		device.addPropertyChangeListener(pcl);

		device.stop();

		assertEquals(ConnectionState.DISCONNECTED, device.getConnectionState());
				
		PropertyChangeEvent evt = pcl.dequeueEvent();
		assertEquals("connectionState", evt.getPropertyName());
		assertEquals(ConnectionState.CONNECTED, evt.getOldValue());
		assertEquals(ConnectionState.DISCONNECTED, evt.getNewValue());
		
		pcl.assertQueueEmpty();
	}
	
	@Test
	public void testConnectionStateChange() throws Exception {
		Connection conn = new TestableConnection(0x0020);

		BaseDeviceEmulator device = new TestableDeviceEmulator(conn);
		
		device.start();

		TestablePropertyChangeListener pcl = new TestablePropertyChangeListener();
		device.addPropertyChangeListener(pcl);

		assertEquals(ConnectionState.DISCONNECTED, device.getConnectionState());

		conn.connect();

		PropertyChangeEvent evt = pcl.dequeueEvent();
		assertEquals("connectionState", evt.getPropertyName());
		assertEquals(ConnectionState.DISCONNECTED, evt.getOldValue());
		assertEquals(ConnectionState.CONNECTING, evt.getNewValue());
		
		evt = pcl.dequeueEvent();
		assertEquals("connectionState", evt.getPropertyName());
		assertEquals(ConnectionState.CONNECTING, evt.getOldValue());
		assertEquals(ConnectionState.CONNECTED, evt.getNewValue());
		
		pcl.assertQueueEmpty();
	}

	@Test
	public void testNopInterfaceCoverage() throws Exception {
		Connection conn = new TestableConnection(0x0020);

		BaseDeviceEmulator device = new TestableDeviceEmulator(conn);

		device.packetReceived(null, null);
		device.datagramReceived(null, null);
		device.telegramReceived(null, null);
		device.update(0);
	}
}
