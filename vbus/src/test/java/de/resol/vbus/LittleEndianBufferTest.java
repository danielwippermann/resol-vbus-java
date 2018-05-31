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

import org.junit.Test;

public class LittleEndianBufferTest {

	static final byte[] TEST_BYTES = {
		0x00, 0x00,
		0x12,
		(byte) 0xEE,
		0x34, 0x12,
		(byte) 0xCC, (byte) 0xED,
		0x56, 0x34, 0x12,
		(byte) 0xAA, (byte) 0xCB, (byte) 0xED,
		0x78, 0x56, 0x34, 0x12,
		(byte) 0x88, (byte) 0xA9, (byte) 0xCB, (byte) 0xED,
	};

	@Test
	public void testLengthConstructor() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(15);
		
		assertNotNull(leb.getBuffer());
		assertEquals(15, leb.getBuffer().length);
		assertEquals(0, leb.getStart());
		assertEquals(15, leb.getLength());
	}

	@Test
	public void testFullBufferConstructor() {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES);
		
		assertEquals(TEST_BYTES, leb.getBuffer());
		assertEquals(0, leb.getStart());
		assertEquals(22, leb.getLength());
	}
	
	@Test
	public void testBufferConstructor() throws Exception {
		LittleEndianBuffer leb1 = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(TEST_BYTES, leb1.getBuffer());
		assertEquals(1, leb1.getStart());
		assertEquals(21, leb1.getLength());
		
		int checkpoints = 0;
		try {
			new LittleEndianBuffer(TEST_BYTES, 1, 22);
		} catch (Throwable t) {
			assertEquals("Buffer too small for provided offsets", t.getMessage());
			checkpoints += 1;
		}
		
		assertEquals(1, checkpoints);
	}

	@Test
	public void testCheckIndexRange() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);

		int checkpoints = 0;
		
		try {
			leb.readI32(-1);
		} catch (Throwable t) {
			assertEquals("Index must not be negative", t.getMessage());
			checkpoints += 1;
		}

		try {
			leb.readI32(21);
		} catch (Throwable t) {
			assertEquals("Index must not be greater than buffer length", t.getMessage());
			checkpoints += 1;
		}
		
		try {
			leb.readI32(20);
		} catch (Throwable t) {
			assertEquals("Element must not exceed buffer length", t.getMessage());
			checkpoints += 1;
		}
		
		assertEquals(3, checkpoints);
	}
	
	@Test
	public void testCheckValueRange() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(1);
		
		int checkpoints = 0;
		
		try {
			leb.writeU8(0, -1);
		} catch(Throwable t) {
			assertEquals("Value must not be less than 0", t.getMessage());
			checkpoints += 1;
		}
		
		try {
			leb.writeU8(0, 256);
		} catch(Throwable t) {
			assertEquals("Value must not be greater than 255", t.getMessage());
			checkpoints += 1;
		}
		
		assertEquals(2, checkpoints);
	}

	@Test
	public void testReadI8() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x12, leb.readI8(1));
		assertEquals(-0x12, leb.readI8(2));
	}
	
	@Test
	public void testWriteI8() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(3);
		leb.writeI8(1, 0x12);
		assertHexDumpEquals("00 12 00", leb);
		leb.writeI8(1, -0x12);
		assertHexDumpEquals("00 EE 00", leb);
	}
	
	@Test
	public void testReadU8() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x12, leb.readU8(1));
		assertEquals(0xEE, leb.readU8(2));
	}

	@Test
	public void testWriteU8() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(3);
		leb.writeU8(1, 0x12);
		assertHexDumpEquals("00 12 00", leb);
		leb.writeU8(1, 0xEE);
		assertHexDumpEquals("00 EE 00", leb);
	}
	
	@Test
	public void testReadI16() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x1234, leb.readI16(3));
		assertEquals(-0x1234, leb.readI16(5));
	}

	@Test
	public void testWriteI16() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(4);
		leb.writeI16(1, 0x1234);
		assertHexDumpEquals("00 34 12 00", leb);
		leb.writeI16(1, -0x1234);
		assertHexDumpEquals("00 CC ED 00", leb);
	}
	
	@Test
	public void testReadU16() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x1234, leb.readU16(3));
		assertEquals(0xEDCC, leb.readU16(5));
	}

	@Test
	public void testWriteU16() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(4);
		leb.writeU16(1, 0x1234);
		assertHexDumpEquals("00 34 12 00", leb);
		leb.writeU16(1, 0xEDCC);
		assertHexDumpEquals("00 CC ED 00", leb);
	}
	
	@Test
	public void testReadI24() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x123456, leb.readI24(7));
		assertEquals(-0x123456, leb.readI24(10));
	}

	@Test
	public void testWriteI24() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(5);
		leb.writeI24(1, 0x123456);
		assertHexDumpEquals("00 56 34 12 00", leb);
		leb.writeI24(1, -0x123456);
		assertHexDumpEquals("00 AA CB ED 00", leb);
	}
	
	@Test
	public void testReadU24() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x123456, leb.readU24(7));
		assertEquals(0xEDCBAA, leb.readU24(10));
	}

	@Test
	public void testWriteU24() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(5);
		leb.writeU24(1, 0x123456);
		assertHexDumpEquals("00 56 34 12 00", leb);
		leb.writeU24(1, 0xEDCBAA);
		assertHexDumpEquals("00 AA CB ED 00", leb);
	}
	
	@Test
	public void testReadI32() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(TEST_BYTES, 1, 21);
		
		assertEquals(0x12345678, leb.readI32(13));
		assertEquals(-0x12345678, leb.readI32(17));
	}

	@Test
	public void testWriteI32() throws Exception {
		LittleEndianBuffer leb = new LittleEndianBuffer(6);
		leb.writeI32(1, 0x12345678);
		assertHexDumpEquals("00 78 56 34 12 00", leb);
		leb.writeI32(1, -0x12345678);
		assertHexDumpEquals("00 88 A9 CB ED 00", leb);
	}
	
	private void assertHexDumpEquals(String expected, LittleEndianBuffer leb) {
		String actual = "";
		byte[] buffer = leb.getBuffer();
		for (int i = 0; i < buffer.length; i++) {
			if (actual.length() > 0) {
				actual = actual + " ";
			}

			String value = String.format("%02X", buffer [i] & 0xFF);
			actual = actual + value;
		}
		
		assertEquals(expected, actual);
	}

}
