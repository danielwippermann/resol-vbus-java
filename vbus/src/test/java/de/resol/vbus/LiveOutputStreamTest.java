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

public class LiveOutputStreamTest {

	@Test
	public void testConstructor() throws Exception {
		PipedOutputStream refOs1 = new PipedOutputStream();
		
		LiveOutputStream testOs1 = new LiveOutputStream(refOs1);
		
		assertEquals(refOs1, testOs1.os);
	}

	@Test
	public void testWriteHeader() throws Exception {
		Datagram refDgram1 = new Datagram(0, 0, 0x2336, 0x3335, 0x4334, 0x5333, 0x63328330);
		
		PipedInputStream refIs1 = new PipedInputStream(2048);
		PipedOutputStream refOs1 = new PipedOutputStream(refIs1);
		
		LiveOutputStream testOs1 = new LiveOutputStream(refOs1);
		
		testOs1.writeHeader(refDgram1);
		
		byte[] testBuffer1 = new byte [32];
		int testLength1 = refIs1.read(testBuffer1);
		
		assertEquals(16, testLength1);
		assertEquals("aa362335332034433353300332630851", Hex.encodeHexString(testBuffer1).substring(0, 32));
	}
	
}
