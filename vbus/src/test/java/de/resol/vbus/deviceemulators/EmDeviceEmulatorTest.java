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
package de.resol.vbus.deviceemulators;

import static org.junit.Assert.*;

import java.beans.PropertyChangeEvent;

import org.junit.Test;

import de.resol.vbus.Header;
import de.resol.vbus.LittleEndianBuffer;
import de.resol.vbus.Packet;
import de.resol.vbus.TestableConnection;
import de.resol.vbus.TestablePropertyChangeListener;
import de.resol.vbus.deviceemulators.EmDeviceEmulator.Relay;

public class EmDeviceEmulatorTest {

	@Test
	public void testConstructor() {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);
		
		assertEquals(conn, device.getConnection());
		assertEquals(1, device.getSubAddress());
		
		int checkpoints = 0;
		try {
			new EmDeviceEmulator(conn, 0);
		} catch (Throwable t) {
			assertEquals("Sub address must be between 1 and 15", t.getMessage());
			checkpoints += 1;
		}
		
		try {
			new EmDeviceEmulator(conn, 16);
		} catch (Throwable t) {
			assertEquals("Sub address must be between 1 and 15", t.getMessage());
			checkpoints += 1;
		}
		
		assertEquals(2, checkpoints);
	}
	
	@Test
	public void testName() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		int checkpoints = 0;
		
		try {
			device.getResistorValueByNr(0);
		} catch (Throwable t) {
			assertEquals("Resistor number must be between 1 and 6", t.getMessage());
			checkpoints += 1;
		}
		
		try {
			device.getResistorValueByNr(7);
		} catch (Throwable t) {
			assertEquals("Resistor number must be between 1 and 6", t.getMessage());
			checkpoints += 1;
		}
		
		assertEquals(2, checkpoints);
	}
	
	@Test
	public void testGetResistorValueByNr() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		assertEquals(1000000000, device.getResistorValueByNr(1));
	}

	@Test
	public void testSetResistorValueByNr() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		device.setResistorValueByNr(1, 1000);

		assertEquals(1000, device.getResistorValueByNr(1));
	}
	
	@Test
	public void testSetResistorValueByNrAndPt1000Temperature() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		device.setResistorValueByNrAndPt1000Temperatur(1, 0.0f);
		device.setResistorValueByNrAndPt1000Temperatur(2, 100.0f);
		device.setResistorValueByNrAndPt1000Temperatur(3, -45.7f);
		device.setResistorValueByNrAndPt1000Temperatur(4, 266.3f);

		assertEquals(1000000, device.getResistorValueByNr(1));
		assertEquals(1385055, device.getResistorValueByNr(2));
		assertEquals( 820126, device.getResistorValueByNr(3));
		assertEquals(1999826, device.getResistorValueByNr(4));
	}

	@Test
	public void testCheckRelayNr() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		int checkpoints = 0;
		
		try {
			device.getRelayValueByNr(0);
		} catch (Throwable t) {
			assertEquals("Relay number must be between 1 and 5", t.getMessage());
			checkpoints += 1;
		}
		
		try {
			device.getRelayValueByNr(6);
		} catch (Throwable t) {
			assertEquals("Relay number must be between 1 and 5", t.getMessage());
			checkpoints += 1;
		}
		
		assertEquals(2, checkpoints);
	}
	
	@Test
	public void testGetRelayByNr() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		Relay relay = device.getRelayByNr(1);
		
		assertNotNull(relay);
	}
	
	@Test
	public void testGetRelayValueByNr() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		assertEquals(0, device.getRelayValueByNr(1));
	}

	@Test
	public void testPacketReceived() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		device.setResistorValueByNr(1, 1000000);
		device.setResistorValueByNr(2, 1200000);
		device.setResistorValueByNr(3, 1400000);

		TestablePropertyChangeListener pcl = new TestablePropertyChangeListener();
		device.addPropertyChangeListener(pcl);

		device.start();

		LittleEndianBuffer rxFrameData = new LittleEndianBuffer(48);
		rxFrameData.writeU8(0, 100);
		rxFrameData.writeU24(1, 4);
		rxFrameData.writeU8(4, 0);
		rxFrameData.writeU24(5, 20);
		
		Packet rxPacket = new Packet(System.currentTimeMillis(), 0, 0x6651, 0x7E11, 0x0200, 12, rxFrameData.getBuffer());
		
		conn.simulateRx(rxPacket);
		
		PropertyChangeEvent evt = pcl.dequeueEvent();

		assertEquals("relay1Value", evt.getPropertyName());
		assertEquals(0, evt.getOldValue());
		assertEquals(100, evt.getNewValue());
		
		pcl.assertQueueEmpty();

		Relay relay = device.getRelayByNr(1);
		
		assertEquals(100, relay.getValue1());
		assertEquals(4000, relay.getTime1());
		assertEquals(0, relay.getValue2());
		assertEquals(20000, relay.getTime2());
		assertEquals(100, relay.getValue());
		
		Header txHeader = conn.dequeueTx();
		assertTrue(txHeader instanceof Packet);
		
		Packet txPacket = (Packet) txHeader;
		assertEquals(0x7E11, txPacket.getDestinationAddress());
		assertEquals(0x6651, txPacket.getSourceAddress());
		assertEquals(0x0100, txPacket.getCommand());
		assertEquals(6, txPacket.getFrameCount());
		
		LittleEndianBuffer txFrameData = new LittleEndianBuffer(txPacket.getFrameData());
		assertEquals(1000000, txFrameData.readI32(0));
		assertEquals(1200000, txFrameData.readI32(4));
		assertEquals(1400000, txFrameData.readI32(8));
		assertEquals(1000000000, txFrameData.readI32(12));
		assertEquals(1000000000, txFrameData.readI32(16));
		assertEquals(1000000000, txFrameData.readI32(20));
	}
	
	@Test
	public void testUpdate() throws Exception {
		TestableConnection conn = new TestableConnection(0x0020);
		
		EmDeviceEmulator device = new EmDeviceEmulator(conn, 1);

		TestablePropertyChangeListener pcl = new TestablePropertyChangeListener();
		device.addPropertyChangeListener(pcl);

		device.start();

		LittleEndianBuffer rxFrameData = new LittleEndianBuffer(48);
		rxFrameData.writeU8(0, 100);
		rxFrameData.writeU24(1, 4);
		rxFrameData.writeU8(4, 0);
		rxFrameData.writeU24(5, 20);
		
		Packet rxPacket = new Packet(System.currentTimeMillis(), 0, 0x6651, 0x7E11, 0x0200, 12, rxFrameData.getBuffer());
		
		conn.simulateRx(rxPacket);
		
		PropertyChangeEvent evt = pcl.dequeueEvent();

		assertEquals("relay1Value", evt.getPropertyName());
		assertEquals(0, evt.getOldValue());
		assertEquals(100, evt.getNewValue());
		
		pcl.assertQueueEmpty();

		Relay relay = device.getRelayByNr(1);
		
		assertEquals(100, relay.getValue1());
		assertEquals(4000, relay.getTime1());
		assertEquals(0, relay.getValue2());
		assertEquals(20000, relay.getTime2());
		assertEquals(100, relay.getValue());
		
		device.update(3999);
		
		pcl.assertQueueEmpty();

		assertEquals(100, relay.getValue());
		
		device.update(2);
		
		evt = pcl.dequeueEvent();

		assertEquals("relay1Value", evt.getPropertyName());
		assertEquals(100, evt.getOldValue());
		assertEquals(0, evt.getNewValue());
		
		pcl.assertQueueEmpty();

		assertEquals(0, relay.getValue());
		
		device.update(19998);
		
		pcl.assertQueueEmpty();

		assertEquals(0, relay.getValue());
		
		device.update(2);
		
		evt = pcl.dequeueEvent();

		assertEquals("relay1Value", evt.getPropertyName());
		assertEquals(0, evt.getOldValue());
		assertEquals(100, evt.getNewValue());
		
		pcl.assertQueueEmpty();

		assertEquals(100, relay.getValue());
		
		device.update(3998);
		
		pcl.assertQueueEmpty();

		assertEquals(100, relay.getValue());
		
		device.update(2);
		
		evt = pcl.dequeueEvent();

		assertEquals("relay1Value", evt.getPropertyName());
		assertEquals(100, evt.getOldValue());
		assertEquals(0, evt.getNewValue());
		
		pcl.assertQueueEmpty();

		assertEquals(0, relay.getValue());
		
		device.update(1998);

		assertEquals(100, relay.getValue1());
		assertEquals(4000, relay.getTime1());
		assertEquals(0, relay.getValue2());
		assertEquals(20000, relay.getTime2());
		assertEquals(0, relay.getValue());
	
		device.update(2);
		
		pcl.assertQueueEmpty();

		assertEquals(0, relay.getValue1());
		assertEquals(0, relay.getTime1());
		assertEquals(0, relay.getValue2());
		assertEquals(0, relay.getTime2());
		assertEquals(0, relay.getValue());
	}

}
