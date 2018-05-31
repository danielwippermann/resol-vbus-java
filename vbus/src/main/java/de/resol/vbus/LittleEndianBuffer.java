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

/**
 * The `LittleEndianBuffer` implements some convenience methods around
 * a byte array to make reading and write values stored in little-endian
 * format easier.
 */
public class LittleEndianBuffer {

	private byte[] buffer;
	private int start;
	private int length;

	/**
	 * Create a new `LittleEndianBuffer` with its own backing byte array
	 * of the given length.
	 * 
	 * @param length The length of the backing byte array.
	 */
	public LittleEndianBuffer(int length) {
		this(new byte [length]);
	}

	/**
	 * Create a new `LittleEndianBuffer` using the provided backing byte
	 * array.
	 * 
	 * @param buffer The backing byte array to use.
	 */
	public LittleEndianBuffer(byte[] buffer) {
		this(buffer, 0, buffer.length);
	}

	/**
	 * Create a new `LittleEndianBuffer` using a portion of the provided
	 * backing byte array.
	 * 
	 * @param buffer The backing byte array to use.
	 * @param start The start offset of the view into the byte array.
	 * @param length The length of the view into the byte array. 
	 */
	public LittleEndianBuffer(byte[] buffer, int start, int length) {
		if ((start + length) > buffer.length) {
			throw new Error("Buffer too small for provided offsets");
		}

		this.buffer = buffer;
		this.start = start;
		this.length = length;
	}
	
	/**
	 * Get the backing byte array.
	 * 
	 * @return The backing byte array.
	 */
	public byte[] getBuffer() {
		return buffer;
	}
	
	/**
	 * Get the start offset of the view into the backing byte array.
	 * 
	 * @return The start offset of the view into the backing byte array.
	 */
	public int getStart() {
		return start;
	}
	
	/**
	 * Get the length of the view into the backing byte array.
	 * 
	 * @return The length of the view into the backing byte array.
	 */
	public int getLength() {
		return length;
	}

	private void checkIndexRange(int index, int length) {
		if (index < 0) {
			throw new IndexOutOfBoundsException("Index must not be negative");
		} else if (index >= this.length) {
			throw new IndexOutOfBoundsException("Index must not be greater than buffer length");
		} else if ((index + length) > this.length) {
			throw new IndexOutOfBoundsException("Element must not exceed buffer length");
		}
	}

	private void checkValueRange(int value, int minimum, int maximum) {
		if (value < minimum) {
			throw new Error("Value must not be less than " + minimum);
		} else if (value > maximum) {
			throw new Error("Value must not be greater than " + maximum);
		}
	}

	/**
	 * Read a signed 8-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readI8(int index) {
		checkIndexRange(index, 1);
		
		int value = buffer [start + index];
		
		return value;
	}
	
	/**
	 * Write a signed 8-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeI8(int index, int value) {
		checkIndexRange(index, 1);
		checkValueRange(value, -128, 127);
		
		buffer [start + index] = (byte) value;
	}
	
	/**
	 * Read an unsigned 8-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readU8(int index) {
		checkIndexRange(index, 1);
		
		int value = buffer [start + index] & 0xFF;
		
		return value;
	}

	/**
	 * Write an unsigned 8-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeU8(int index, int value) {
		checkIndexRange(index, 1);
		checkValueRange(value, 0, 255);

		buffer [start + index] = (byte) value;
	}

	/**
	 * Read a signed 16-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readI16(int index) {
		checkIndexRange(index, 2);
		
		int value = (int) buffer [start + index] & 0xFF;
		value |= ((int) buffer [start + index + 1]) << 8;
		
		return value;
	}
	
	/**
	 * Write a signed 16-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeI16(int index, int value) {
		checkIndexRange(index, 2);
		checkValueRange(value, -32768, 32767);
		
		buffer [start + index] = (byte) value;
		buffer [start + index + 1] = (byte) (value >> 8);
	}

	/**
	 * Read an unsigned 16-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readU16(int index) {
		checkIndexRange(index, 2);
		
		int value = (int) buffer [start + index] & 0xFF;
		value |= ((int) buffer [start + index + 1] & 0xFF) << 8;
		
		return value;
	}
	
	/**
	 * Write an unsigned 16-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeU16(int index, int value) {
		checkIndexRange(index, 2);
		checkValueRange(value, 0, 65535);
		
		buffer [start + index] = (byte) value;
		buffer [start + index + 1] = (byte) (value >> 8);
	}
	
	/**
	 * Read a signed 24-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readI24(int index) {
		checkIndexRange(index, 3);
		
		int value = (int) buffer [start + index] & 0xFF;
		value |= ((int) buffer [start + index + 1] & 0xFF) << 8;
		value |= ((int) buffer [start + index + 2]) << 16;
		
		return value;
	}
	
	/**
	 * Write a signed 24-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeI24(int index, int value) {
		checkIndexRange(index, 3);
		checkValueRange(value, -8388608, 8388607);
		
		buffer [start + index] = (byte) value;
		buffer [start + index + 1] = (byte) (value >> 8);
		buffer [start + index + 2] = (byte) (value >> 16);
	}

	/**
	 * Read an unsigned 24-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readU24(int index) {
		checkIndexRange(index, 3);
		
		int value = (int) buffer [start + index] & 0xFF;
		value |= ((int) buffer [start + index + 1] & 0xFF) << 8;
		value |= ((int) buffer [start + index + 2] & 0xFF) << 16;
		
		return value;
	}
	
	/**
	 * Write an unsigned 24-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeU24(int index, int value) {
		checkIndexRange(index, 3);
		checkValueRange(value, 0, 16777215);
		
		buffer [start + index] = (byte) value;
		buffer [start + index + 1] = (byte) (value >> 8);
		buffer [start + index + 2] = (byte) (value >> 16);
	}
	
	/**
	 * Read a signed 32-bit integer from the given offset.
	 * 
	 * @param index The offset to read the value from
	 * @return The value read from the byte array.
	 */
	public int readI32(int index) {
		checkIndexRange(index, 4);
		
		int value = (int) buffer [start + index] & 0xFF;
		value |= ((int) buffer [start + index + 1] & 0xFF) << 8;
		value |= ((int) buffer [start + index + 2] & 0xFF) << 16;
		value |= ((int) buffer [start + index + 3] & 0xFF) << 24;
		
		return value;
	}
	
	/**
	 * Write a signed 32-bit integer to the given offset.
	 * 
	 * @param index The offset to write the value to
	 * @param value The value to write to the byte array.
	 */
	public void writeI32(int index, int value) {
		checkIndexRange(index, 4);
		
		buffer [start + index] = (byte) value;
		buffer [start + index + 1] = (byte) (value >> 8);
		buffer [start + index + 2] = (byte) (value >> 16);
		buffer [start + index + 3] = (byte) (value >> 24);
	}
	
}
