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

public class TelegramTest {

	@Test
	public void testGetFrameCountForCommand() throws Exception {
		for (int command = 0x00; command <= 0x1F; command++) {
			assertEquals(0, Telegram.getFrameCountForCommand(command));
		}
		for (int command = 0x20; command <= 0x3F; command++) {
			assertEquals(1, Telegram.getFrameCountForCommand(command));
		}
		for (int command = 0x40; command <= 0x5F; command++) {
			assertEquals(2, Telegram.getFrameCountForCommand(command));
		}
		for (int command = 0x60; command <= 0x7F; command++) {
			assertEquals(3, Telegram.getFrameCountForCommand(command));
		}
	}
	
	@Test
	public void testConstructor() {
		byte[] testData1 = new byte [3 * 7];
		Telegram testTgram1 = new Telegram(0, 0x13, 0x2336, 0x3335, 0x43, testData1);
		assertEquals(0, testTgram1.timestamp);
		assertEquals(0x13, testTgram1.channel);
		assertEquals(0x2336, testTgram1.destinationAddress);
		assertEquals(0x3335, testTgram1.sourceAddress);
		assertEquals(0x43, testTgram1.command);
		assertEquals(testData1, testTgram1.frameData);
	}

	@Test
	public void testGetCommand() throws Exception {
		int refValue1 = 0x43;
		Telegram testTgram1 = new Telegram(0, 0, 0, 0, refValue1, null);
		assertEquals(refValue1, testTgram1.getCommand());
	}
	
	@Test
	public void testGetFrameCount() throws Exception {
		int refValue1 = 2;
		Telegram testTgram1 = new Telegram(0, 0, 0, 0, (refValue1 << 5) | 0x1F, null);
		assertEquals(refValue1, testTgram1.getFrameCount());
	}
	
	@Test
	public void testGetFrameData() {
		byte[] testData1 = new byte [3 * 7];
		Telegram testTgram1 = new Telegram(0, 0, 0, 0, 0, testData1);
		assertEquals(testData1, testTgram1.getFrameData());
	}
	
	@Test
	public void testGetProtocolVersion() throws Exception {
		Telegram testTgram1 = new Telegram(0, 0, 0, 0, 0, null);
		assertEquals(0x30, testTgram1.getProtocolVersion());
	}
	
	@Test
	public void testToLiveBuffer() throws Exception {
		String refValue1 = "aa2211443330772e000c1824303c48000354606c7804101c70472834404c5864707f6c";

		byte[] testData1 = new byte [3 * 7];
		for (int i = 0; i < testData1.length; i++) {
			testData1 [i] = (byte) (i * 12);
		}
		
		Telegram testTgram1 = new Telegram(0, 0, 0x1122, 0x3344, 0x77, testData1);
		byte[] testBuffer1 = testTgram1.toLiveBuffer(null, 0, 0);
		assertEquals(refValue1, Hex.encodeHexString(testBuffer1));
		
		byte[] testBuffer2 = new byte [testBuffer1.length + 2];
		assertEquals(testBuffer2, testTgram1.toLiveBuffer(testBuffer2, 1, testBuffer2.length - 1));
		assertEquals("00" + refValue1 + "00", Hex.encodeHexString(testBuffer2));
		
		assertEquals(null, testTgram1.toLiveBuffer(testBuffer2,  3, testBuffer2.length - 3));
	}

	@Test
	public void testGetId() throws Exception {
		Telegram testTgram1 = new Telegram(0, 0x13, 0x1122, 0x3344, 0x77, null);
		assertEquals("13_1122_3344_30_77", testTgram1.getId());
	}

	@Test
	public void testCompareTo() throws Exception {
		Telegram testTgram1 = new Telegram(0, 0x13, 0x2336, 0x3335, 0x43, null);
		
		assertEquals(0, testTgram1.compareTo(new Telegram(0, 0x13, 0x2336, 0x3335, 0x43, null)));

		assertTrue(0 < testTgram1.compareTo(new TestableHeader(0, 0x00, 0x7F7F, 0x7F7F, 0x7F)));
		assertTrue(0 > testTgram1.compareTo(new TestableHeader(0, 0x7F, 0x0000, 0x0000, 0x00)));

		assertTrue(0 < testTgram1.compareTo(new TestableHeader(0, 0x13, 0x0000, 0x7F7F, 0x7F)));
		assertTrue(0 > testTgram1.compareTo(new TestableHeader(0, 0x13, 0x7F7F, 0x0000, 0x00)));

		assertTrue(0 < testTgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x0000, 0x7F)));
		assertTrue(0 > testTgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x7F7F, 0x00)));

		assertTrue(0 < testTgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3335, 0x00)));
		assertTrue(0 > testTgram1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3335, 0x7F)));

		assertTrue(0 < testTgram1.compareTo(new Telegram(0, 0x13, 0x2336, 0x3335, 0x00, null)));
		assertTrue(0 > testTgram1.compareTo(new Telegram(0, 0x13, 0x2336, 0x3335, 0x7F, null)));
	}
	
	@Test
	public void testFromLiveBuffer() throws Exception {
		byte[] refBuffer1 = Hex.decodeHex("00AA7177112030251160182B040000000454".toCharArray());
		int refStart1 = 1;

		long refTimestamp1 = System.currentTimeMillis();
		int refChannel1 = 0x13;
		int refDestinationAddress1 = 0x7771;
		int refSourceAddress1 = 0x2011;
		int refCommand1 = 0x25;
		byte[] refData1 = Hex.decodeHex("6018ab04000000".toCharArray());

		Telegram testTgram1 = Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, refTimestamp1, refChannel1);
		assertEquals(refTimestamp1, testTgram1.timestamp);
		assertEquals(refChannel1, testTgram1.channel);
		assertEquals(refDestinationAddress1, testTgram1.destinationAddress);
		assertEquals(refSourceAddress1, testTgram1.sourceAddress);
		assertEquals(refCommand1, testTgram1.command);
		assertArrayEquals(refData1, testTgram1.frameData);
		
		// fail on missing bytes in header
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, 7, 0, 0));
		
		// fail on missing bytes in frames
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1 - 1, 0, 0));

		// fail on missing sync byte in header
		refBuffer1 [refStart1] = (byte) 0xBB;
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
		refBuffer1 [refStart1] = (byte) 0xAA;

		// fail on MSB in frames
		refBuffer1 [refBuffer1.length - 1] = (byte) 0x80;
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
	
		// fail on checksum error in frames
		refBuffer1 [refBuffer1.length - 1] = (byte) 0x00;
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));

		// fail on checksum error in header
		refBuffer1 [refStart1 + 7]--;
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
		
		// fail on wrong protocol version in header
		refBuffer1 [refStart1 + 5]++;
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));

		// fail on MSB in header
		refBuffer1 [refStart1 + 7] = (byte) 0x80;
		assertEquals(null, Telegram.fromLiveBuffer(refBuffer1, refStart1, refBuffer1.length - refStart1, 0, 0));
	}

}
