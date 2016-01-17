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

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

public class LiveInputStreamTest {

	@Test
	public void testConstructor() throws Exception {
		PipedInputStream refIs1 = new PipedInputStream();
		int refChannel1 = 0x13;
		
		LiveInputStream testIs = new LiveInputStream(refIs1, refChannel1);
		
		assertEquals(refIs1, testIs.is);
		assertEquals(refChannel1, testIs.channel);
	}

	@Test
	public void testReadHeader() throws Exception {
		byte[] refPacketBuffer1 = Hex.decodeHex("aa362335331034430d2a0004080c00671014181c00272024282c00673034383c00274044484c00675054585c00276064686c00677074787c00270004080c0f581014181c0f182024282c0f583034383c0f184044484c0f58".toCharArray());
		byte[] refDgramBuffer1 = Hex.decodeHex("aa362335332034433353300332630851".toCharArray());
		byte[] refTgramBuffer1 = Hex.decodeHex("aa2211443330772e000c1824303c48000354606c7804101c70472834404c5864707f6c".toCharArray());
		byte[] refZeroBuffer1 = Hex.decodeHex("00000000000000000000000000000000".toCharArray());
		byte[] refMsbBuffer1 = Hex.decodeHex("80808080808080808080808080808080".toCharArray());
		
		String refPacketId1 = "13_2336_3335_10_4334";
		String refDgramId1 = "13_2336_3335_20_4334_0000";
		String refTgramId1 = "13_1122_3344_30_77";
		
		PipedInputStream refIs1 = new PipedInputStream(2048);
		PipedOutputStream refOs1 = new PipedOutputStream(refIs1);
		int refChannel1 = 0x13;
		
		LiveInputStream testIs = new LiveInputStream(refIs1, refChannel1);
		
		refOs1.write(refPacketBuffer1);

		assertEquals(refPacketId1, testIs.readHeader().getId());
		
		refOs1.write(refDgramBuffer1);
		refOs1.write(refTgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());
		assertEquals(refTgramId1, testIs.readHeader().getId());

		// write a partial header (before protocol version)
		refOs1.write(refTgramBuffer1);
		refOs1.write(refDgramBuffer1, 0, 5);

		assertEquals(refTgramId1, testIs.readHeader().getId());

		refOs1.write(refDgramBuffer1, 5, 11);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write a broken header (without sync byte)
		refOs1.write(refDgramBuffer1, 1, 15);
		refOs1.write(refTgramBuffer1);

		assertEquals(refTgramId1, testIs.readHeader().getId());

		// write unknown version
		refOs1.write(refDgramBuffer1, 0, 5);
		refOs1.write(0x05);
		refOs1.write(refTgramBuffer1);
		
		assertEquals(refTgramId1, testIs.readHeader().getId());

		// write partial packet (incomplete header)
		refOs1.write(refDgramBuffer1);
		refOs1.write(refPacketBuffer1, 0, 9);
		
		assertEquals(refDgramId1, testIs.readHeader().getId());

		refOs1.write(refPacketBuffer1, 9, refPacketBuffer1.length - 9);
		
		assertEquals(refPacketId1, testIs.readHeader().getId());

		// write defect packet (header msb)
		refOs1.write(refPacketBuffer1, 0, 9);
		refOs1.write(refMsbBuffer1, 0, 1);
		refOs1.write(refDgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write defect packet (header checksum)
		refOs1.write(refPacketBuffer1, 0, 9);
		refOs1.write(refZeroBuffer1, 0, 1);
		refOs1.write(refDgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write partial packet (incomplete frame data)
		refOs1.write(refDgramBuffer1);
		refOs1.write(refPacketBuffer1, 0, 15);
		
		assertEquals(refDgramId1, testIs.readHeader().getId());

		refOs1.write(refPacketBuffer1, 15, refPacketBuffer1.length - 15);
		
		assertEquals(refPacketId1, testIs.readHeader().getId());

		// write defect packet (frame data msb)
		refOs1.write(refPacketBuffer1, 0, refPacketBuffer1.length - 1);
		refOs1.write(refMsbBuffer1, 0, 1);
		refOs1.write(refDgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write partial datagram
		refOs1.write(refTgramBuffer1);
		refOs1.write(refDgramBuffer1, 0, 15);
		
		assertEquals(refTgramId1, testIs.readHeader().getId());

		refOs1.write(refDgramBuffer1, 15, refDgramBuffer1.length - 15);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write defect datagram
		refOs1.write(refDgramBuffer1, 0, 15);
		refOs1.write(refMsbBuffer1, 0, 1);
		refOs1.write(refTgramBuffer1);

		assertEquals(refTgramId1, testIs.readHeader().getId());

		// write partial telegram (incomplete header)
		refOs1.write(refDgramBuffer1);
		refOs1.write(refTgramBuffer1, 0, 7);
		
		assertEquals(refDgramId1, testIs.readHeader().getId());

		refOs1.write(refTgramBuffer1, 7, refTgramBuffer1.length - 7);
		
		assertEquals(refTgramId1, testIs.readHeader().getId());

		// write defect telegram (header msb)
		refOs1.write(refTgramBuffer1, 0, 7);
		refOs1.write(refMsbBuffer1, 0, 1);
		refOs1.write(refDgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write defect telegram (header checksum)
		refOs1.write(refTgramBuffer1, 0, 7);
		refOs1.write(refZeroBuffer1, 0, 1);
		refOs1.write(refDgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// write partial telegram (incomplete frame data)
		refOs1.write(refDgramBuffer1);
		refOs1.write(refTgramBuffer1, 0, 15);
		
		assertEquals(refDgramId1, testIs.readHeader().getId());

		refOs1.write(refTgramBuffer1, 15, refTgramBuffer1.length - 15);
		
		assertEquals(refTgramId1, testIs.readHeader().getId());

		// write defect telegram (frame data msb)
		refOs1.write(refTgramBuffer1, 0, refTgramBuffer1.length - 1);
		refOs1.write(refMsbBuffer1, 0, 1);
		refOs1.write(refDgramBuffer1);

		assertEquals(refDgramId1, testIs.readHeader().getId());

		// close pipe
		refOs1.close();
		
		assertEquals(null, testIs.readHeader());
	}

}
