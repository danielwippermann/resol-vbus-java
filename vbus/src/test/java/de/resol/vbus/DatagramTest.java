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

import static org.junit.Assert.*;

import org.junit.Test;

import de.resol.vbus.HeaderTest.TestableHeader;

public class DatagramTest {

	@Test
	public void testConstructor() {
		Datagram testDgram1 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330);
		assertEquals(0, testDgram1.timestamp);
		assertEquals(0x13, testDgram1.channel);
		assertEquals(0x2336, testDgram1.destinationAddress);
		assertEquals(0x3335, testDgram1.sourceAddress);
		assertEquals(0x4334, testDgram1.command);
		assertEquals(0x5333, testDgram1.valueId);
		assertEquals(0x63328330, testDgram1.value);
	}

	@Test
	public void testGetCommand() throws Exception {
		int refValue1 = 0x4334;
		Datagram testDgram1 = new Datagram(0, 0, 0, 0, refValue1, 0, 0);
		assertEquals(refValue1, testDgram1.getCommand());
	}
	
	@Test
	public void testGetValueId() throws Exception {
		int refValue1 = 0x5333;
		Datagram testDgram1 = new Datagram(0, 0, 0, 0, 0, refValue1, 0);
		assertEquals(refValue1, testDgram1.getValueId());
	}
	
	@Test
	public void testGetValue() throws Exception {
		int refValue1 = 0x63328330;
		Datagram testDgram1 = new Datagram(0, 0, 0, 0, 0, 0, refValue1);
		assertEquals(refValue1, testDgram1.getValue());
	}
	
	@Test
	public void testGetProtocolVersion() throws Exception {
		Datagram testDgram1 = new Datagram(0, 0, 0, 0, 0, 0, 0);
		assertEquals(0x20, testDgram1.getProtocolVersion());
	}
	
	@Test
	public void testToLiveBuffer() throws Exception {
		String refValue1 = "aa362335332034433353300332630851";
		
		Datagram testDgram1 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330);
		byte[] testBuffer1 = testDgram1.toLiveBuffer(null, 0, 0);
		assertEquals(refValue1, Hex.encodeHexString(testBuffer1));
		
		byte[] testBuffer2 = new byte [testBuffer1.length + 2];
		assertEquals(testBuffer2, testDgram1.toLiveBuffer(testBuffer2, 1, testBuffer2.length - 1));
		assertEquals("00" + refValue1 + "00", Hex.encodeHexString(testBuffer2));
		
		assertEquals(null, testDgram1.toLiveBuffer(testBuffer2, 3, testBuffer2.length - 3));
	}
	
	@Test
	public void testGetInfo() throws Exception {
		Datagram testDgram1 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330);
		assertEquals(0, testDgram1.getInfo());

		Datagram testDgram2 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x0900, 0x5333, 0x63328330);
		assertEquals(0x5333, testDgram2.getInfo());
	}
	
	@Test
	public void testGetId() throws Exception {
		Datagram testDgram1 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330);
		assertEquals("13_2336_3335_20_4334_0000", testDgram1.getId());

		Datagram testDgram2 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x0900, 0x5333, 0x63328330);
		assertEquals("13_2336_3335_20_0900_5333", testDgram2.getId());
	}
	
	@Test
	public void testCompareTo() throws Exception {
		Datagram testDgram1 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330);
		Datagram testDgram2 = new Datagram(0, 0x13, 0x2336, 0x3335, 0x0900, 0x5333, 0x63328330);
		
		assertEquals(0, testDgram1.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330)));

		assertTrue(0 < testDgram1.compareTo(new TestableHeader(0, 0x00, 0x7F7F, 0x7F7F, 0x7F)));
		assertTrue(0 > testDgram1.compareTo(new TestableHeader(0, 0x7F, 0x0000, 0x0000, 0x00)));

		assertTrue(0 < testDgram1.compareTo(new TestableHeader(0, 0x13, 0x0000, 0x7F7F, 0x7F)));
		assertTrue(0 > testDgram1.compareTo(new TestableHeader(0, 0x13, 0x7F7F, 0x0000, 0x00)));

		assertTrue(0 < testDgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x0000, 0x7F)));
		assertTrue(0 > testDgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x7F7F, 0x00)));

		assertTrue(0 < testDgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3335, 0x00)));
		assertTrue(0 > testDgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3335, 0x7F)));

		assertTrue(0 < testDgram1.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x0000, 0xFFFF, 0xFFFFFFFF)));
		assertTrue(0 > testDgram1.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x7F7F, 0x0000, 0x00000000)));
		
		assertEquals(0, testDgram1.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0xFFFF, 0xFFFFFFFF)));
		assertEquals(0, testDgram1.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x4334, 0x0000, 0x00000000)));
		
		assertEquals(0, testDgram2.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x0900, 0x5333, 0x63328330)));
		assertTrue(0 < testDgram2.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x0900, 0x0000, 0xFFFFFFFF)));
		assertTrue(0 > testDgram2.compareTo(new Datagram(0, 0x13, 0x2336, 0x3335, 0x0900, 0xFFFF, 0x00000000)));
	}
	
	@Test
	public void testFromLiveBuffer() throws Exception {
		byte[] refBuffer1 = Hex.decodeHex("FFaa362335332034433353300332630851".toCharArray());
		int refStart1 = 1;
		
		long refTimestamp1 = System.currentTimeMillis();
		int refChannel1 = 0x13;
		int refDestinationAddress1 = 0x2336;
		int refSourceAddress1 = 0x3335;
		int refCommand1 = 0x4334;
		int refValueId1 = 0x5333;
		int refValue1 = 0x63328330;
		
		Datagram testDgram1 = Datagram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, refTimestamp1, refChannel1);
		
		assertEquals(refTimestamp1, testDgram1.timestamp);
		assertEquals(refChannel1, testDgram1.channel);
		assertEquals(refDestinationAddress1, testDgram1.destinationAddress);
		assertEquals(refSourceAddress1, testDgram1.sourceAddress);
		assertEquals(refCommand1, testDgram1.command);
		assertEquals(refValueId1, testDgram1.valueId);
		assertEquals(refValue1, testDgram1.value);

		// fail on missing bytes in header
		assertEquals(null, Datagram.fromLiveBuffer(refBuffer1, refStart1, 15, 0, 0));

		// fail on missing sync byte in header
		refBuffer1 [refStart1] = (byte) 0xBB;
		assertEquals(null, Datagram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
		refBuffer1 [refStart1] = (byte) 0xAA;

		// fail on checksum error in header
		refBuffer1 [refStart1 + 15]--;
		assertEquals(null, Datagram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));

		// fail on wrong protocol version in header
		refBuffer1 [refStart1 + 5]++;
		assertEquals(null, Datagram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
		
		// fail on MSB in header
		refBuffer1 [refStart1 + 15] = (byte) 0x80;
		assertEquals(null, Datagram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
	}

}
