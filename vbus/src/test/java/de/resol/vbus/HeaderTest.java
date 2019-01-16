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


public class HeaderTest {

	protected static class TestableHeader extends Header {
	
		private int protocolVersion;

		public TestableHeader(long timestamp, int channel, int destinationAddress, int sourceAddress, int protocolVersion) {
			super(timestamp, channel, destinationAddress, sourceAddress);
			this.protocolVersion = protocolVersion;
		}
		
		@Override
		public int getProtocolVersion() {
			return protocolVersion;
		}
		
		@Override
		public byte[] toLiveBuffer(byte[] buffer, int start, int length) {
			// NOTE(daniel): empty stub
			return buffer;
		}
		
	}
	
	@Test
	public void testGetTimestamp() throws Exception {
		long refValue1 = System.currentTimeMillis();
		Header header1 = new TestableHeader(refValue1, 0, 0, 0, 0);
		assertEquals(refValue1, header1.getTimestamp());
	}
	
	@Test
	public void testGetChannel() throws Exception {
		int refValue1 = 0x12;
		Header header1 = new TestableHeader(0, refValue1, 0, 0, 0);
		assertEquals(refValue1, header1.getChannel());
	}
	
	@Test
	public void testGetDestinationAddress() throws Exception {
		int refValue1 = 0x2336;
		Header header1 = new TestableHeader(0, 0, refValue1, 0, 0);
		assertEquals(refValue1, header1.getDestinationAddress());
	}
	
	@Test
	public void testGetSourceAddress() throws Exception {
		int refValue1 = 0x3335;
		Header header1 = new TestableHeader(0, 0, 0, refValue1, 0);
		assertEquals(refValue1, header1.getSourceAddress());
	}
	
	@Test
	public void testGetInfo() throws Exception {
		Header header1 = new TestableHeader(0, 0, 0, 0, 0);
		assertEquals(0, header1.getInfo());
	}
	
	@Test
	public void testGetId() throws Exception {
		Header header1 = new TestableHeader(0, 0x13, 0x2336, 0x3334, 0x37);
		assertEquals("13_2336_3334_37", header1.getId());
	}
	
	@Test
	public void testCompareTo() throws Exception {
		Header header1 = new TestableHeader(0, 0x13, 0x2336, 0x3334, 0x37);
		assertEquals(0, header1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3334, 0x37)));

		// channel
		assertTrue(0 < header1.compareTo(new TestableHeader(0, 0x00, 0x7F7F, 0x7F7F, 0x7F)));
		assertTrue(0 > header1.compareTo(new TestableHeader(0, 0x7F, 0x0000, 0x0000, 0x00)));
		
		// destinationAddress
		assertTrue(0 < header1.compareTo(new TestableHeader(0, 0x13, 0x0000, 0x7F7F, 0x7F)));
		assertTrue(0 > header1.compareTo(new TestableHeader(0, 0x13, 0x7F7F, 0x0000, 0x00)));
		
		// sourceAddress
		assertTrue(0 < header1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x0000, 0x7F)));
		assertTrue(0 > header1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x7F7F, 0x00)));

		// protocolVersion
		assertTrue(0 < header1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3334, 0x00)));
		assertTrue(0 > header1.compareTo(new TestableHeader(0, 0x13, 0x2336, 0x3334, 0x7F)));
	}
	
	@Test
	public void testCheckMsbs() throws Exception {
		byte[] testBuffer1 = Hex.decodeHex("0123456789".toCharArray());
		assertEquals(true, Header.checkMsbs(testBuffer1, 0, testBuffer1.length - 1));
		assertEquals(false, Header.checkMsbs(testBuffer1, 0, testBuffer1.length));
	}

	@Test
	public void testCalcChecksumV0() throws Exception {
		byte[] testBuffer1 = Hex.decodeHex("aa000021772000050000000000000042".toCharArray());
		assertEquals(0x42, Header.calcChecksumV0(testBuffer1, 1, 14));
	}

	@Test
	public void testCalcAndCompareChecksumV0() throws Exception {
		byte[] testBuffer1 = Hex.decodeHex("aa000021772000050000000000000042".toCharArray());
		assertEquals(true, Header.calcAndCompareChecksumV0(testBuffer1, 1, 14));
		
		testBuffer1 [15] = 0x41;
		assertEquals(false, Header.calcAndCompareChecksumV0(testBuffer1, 1, 14));
	}

	@Test
	public void testCalcAndSetChecksumV0() throws Exception {
		byte[] testBuffer1 = Hex.decodeHex("aa000021772000050000000000000000".toCharArray());
		assertEquals(0x42, Header.calcAndSetChecksumV0(testBuffer1, 1, 14));
		assertEquals(0x42, testBuffer1 [15]);
	}
	
	@Test
	public void testInjectSeptett() throws Exception {
		byte[] testBuffer1 = Hex.decodeHex("aa21772165100001044c07014c00002b02017f00057838227600052a00000000007f".toCharArray());
		byte[] testBuffer2 = new byte [16];
		Header.injectSeptett(testBuffer1, 10, 4, testBuffer2, 0);
		Header.injectSeptett(testBuffer1, 16, 4, testBuffer2, 4);
		Header.injectSeptett(testBuffer1, 22, 4, testBuffer2, 8);
		Header.injectSeptett(testBuffer1, 28, 4, testBuffer2, 12);
		assertEquals("07014c008201ff00b822f60000000000", Hex.encodeHexString(testBuffer2));
	}

	@Test
	public void testExtractSeptett() throws Exception {
		byte[] testBuffer1 = Hex.decodeHex("07014c008201ff00b822f60000000000".toCharArray());
		byte[] testBuffer2 = new byte [34];
		Header.extractSeptett(testBuffer1, 0, 4, testBuffer2, 10);
		Header.extractSeptett(testBuffer1, 4, 4, testBuffer2, 16);
		Header.extractSeptett(testBuffer1, 8, 4, testBuffer2, 22);
		Header.extractSeptett(testBuffer1, 12, 4, testBuffer2, 28);
		assertEquals("07014c00000002017f000500382276000500000000000000", Hex.encodeHexString(testBuffer2).substring(20));
	}
	
}
