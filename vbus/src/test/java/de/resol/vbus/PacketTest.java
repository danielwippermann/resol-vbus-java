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

import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

import de.resol.vbus.HeaderTest.TestableHeader;

public class PacketTest {

	@Test
	public void testConstructor() {
		byte[] testData1 = new byte [13 * 4];
		Packet testPacket1 = new Packet(0, 0x13, 0x2336, 0x3335, 0x4334, 13, testData1);
		assertEquals(0, testPacket1.timestamp);
		assertEquals(0x13, testPacket1.channel);
		assertEquals(0x2336, testPacket1.destinationAddress);
		assertEquals(0x3335, testPacket1.sourceAddress);
		assertEquals(0x4334, testPacket1.command);
		assertEquals(13, testPacket1.frameCount);
		assertEquals(testData1, testPacket1.frameData);
	}

	@Test
	public void testGetCommand() throws Exception {
		int refValue1 = 0x4334;
		Packet testPacket1 = new Packet(0, 0, 0, 0, refValue1, 0, null);
		assertEquals(refValue1, testPacket1.getCommand());
	}
	
	@Test
	public void testGetFrameCount() throws Exception {
		int refValue1 = 13;
		Packet testPacket1 = new Packet(0, 0, 0, 0, 0, refValue1, null);
		assertEquals(refValue1, testPacket1.getFrameCount());
	}

	@Test
	public void testGetFrameData() throws Exception {
		byte[] refValue1 = new byte [13 * 4];
		Packet testPacket1 = new Packet(0, 0, 0, 0, 0, 0, refValue1);
		assertEquals(refValue1, testPacket1.getFrameData());
	}
	
	@Test
	public void testGetProtocolVersion() throws Exception {
		Packet testPacket1 = new Packet(0, 0, 0, 0, 0, 0, null);
		assertEquals(0x10, testPacket1.getProtocolVersion());
	}
	
	@Test
	public void testToLiveBuffer() throws Exception {
		String refValue1 = "aa362335331034430d2a0004080c00671014181c00272024282c00673034383c00274044484c00675054585c00276064686c00677074787c00270004080c0f581014181c0f182024282c0f583034383c0f184044484c0f58";

		byte[] testData1 = new byte [13 * 4];
		for (int i = 0; i < testData1.length; i++) {
			testData1 [i] = (byte) (i * 4);
		}
		
		Packet testPacket1 = new Packet(0, 0, 0x2336, 0x3335, 0x4334, 13, testData1);
		byte[] testBuffer1 = testPacket1.toLiveBuffer(null, 0, 0);
		assertEquals(refValue1, Hex.encodeHexString(testBuffer1));
		
		byte[] testBuffer2 = new byte [testBuffer1.length + 2];
		assertEquals(testBuffer2, testPacket1.toLiveBuffer(testBuffer2, 1, testBuffer2.length - 1));
		assertEquals("00" + refValue1 + "00", Hex.encodeHexString(testBuffer2));
		
		assertEquals(null, testPacket1.toLiveBuffer(testBuffer2, 3, testBuffer2.length - 3));
	}

	@Test
	public void testGetId() throws Exception {
		Packet testPacket1 = new Packet(0, 0x13, 0x2336, 0x3335, 0x4334, 0, null);
		assertEquals("13_2336_3335_10_4334", testPacket1.getId());
	}
	
	@Test
	public void testCompareTo() throws Exception {
		Packet testPacket1 = new Packet(0, 0x13, 0x2336, 0x3335, 0x4334, 0, null);
		
		assertEquals(0, testPacket1.compareTo(new Packet(0, 0x13, 0x2336, 0x3335, 0x4334, 0, null)));

		assertTrue(0 < testPacket1.compareTo(new TestableHeader(0, 0x00, 0x7F7F, 0x7F7F, 0x7F)));
		assertTrue(0 > testPacket1.compareTo(new TestableHeader(0, 0x7F, 0x0000, 0x0000, 0x00)));

		assertTrue(0 < testPacket1.compareTo(new TestableHeader(0, 0x13, 0x0000, 0x7F7F, 0x7F)));
		assertTrue(0 > testPacket1.compareTo(new TestableHeader(0, 0x13, 0x7F7F, 0x0000, 0x00)));

		assertTrue(0 < testPacket1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x0000, 0x7F)));
		assertTrue(0 > testPacket1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x7F7F, 0x00)));

		assertTrue(0 < testPacket1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3335, 0x00)));
		assertTrue(0 > testPacket1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3335, 0x7F)));

		assertTrue(0 < testPacket1.compareTo(new Packet(0, 0x13, 0x2336, 0x3335, 0x0000, 0, null)));
		assertTrue(0 > testPacket1.compareTo(new Packet(0, 0x13, 0x2336, 0x3335, 0x7F7F, 0, null)));
	}
	
	@Test
	public void testFromLiveBuffer() throws Exception {
		byte[] refBuffer1 = Hex.decodeHex("00aa362335331034430d2a0004080c00671014181c00272024282c00673034383c00274044484c00675054585c00276064686c00677074787c00270004080c0f581014181c0f182024282c0f583034383c0f184044484c0f58".toCharArray());
		int refStart1 = 1;
	
		long refTimestamp1 = System.currentTimeMillis();
		int refChannel1 = 0x13;
		int refDestinationAddress1 = 0x2336;
		int refSourceAddress1 = 0x3335;
		int refCommand1 = 0x4334;
		int refFrameCount1 = 13;
		byte[] refData1 = Hex.decodeHex("0004080c1014181c2024282c3034383c4044484c5054585c6064686c7074787c8084888c9094989ca0a4a8acb0b4b8bcc0c4c8cc".toCharArray());

		Packet testPacket1 = Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, refTimestamp1, refChannel1);

		assertEquals(refTimestamp1, testPacket1.timestamp);
		assertEquals(refChannel1, testPacket1.channel);
		assertEquals(refDestinationAddress1, testPacket1.destinationAddress);
		assertEquals(refSourceAddress1, testPacket1.sourceAddress);
		assertEquals(refCommand1, testPacket1.command);
		assertEquals(refFrameCount1, testPacket1.frameCount);
		assertArrayEquals(refData1, testPacket1.frameData);

		// fail on missing bytes in header
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, 9, 0, 0));
		
		// fail on missing bytes in frames
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1 - 1, 0, 0));

		// fail on missing sync byte in header
		refBuffer1 [refStart1] = (byte) 0xBB;
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - 1, 0, 0));
		refBuffer1 [refStart1] = (byte) 0xAA;

		// fail on MSB in frames
		refBuffer1 [refBuffer1.length - 1] = (byte) 0x80;
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));

		// fail on checksum error in frames
		refBuffer1 [refBuffer1.length - 1] = (byte) 0x00;
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));

		// fail on checksum error in header
		refBuffer1 [refStart1 + 9]--;
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));

		// fail on wrong protocol version in header
		refBuffer1 [refStart1 + 5]++;
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
		
		// fail on MSB in header
		refBuffer1 [refStart1 + 9] = (byte) 0x80;
		assertEquals(null, Packet.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
	}
	
}
