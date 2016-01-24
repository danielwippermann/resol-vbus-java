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

/**
 * All VBus models are sub-classes of this `Header` class. The Header class provides
 * a generic interface and the common properties that all (currently three)
 * different types of VBus models can use.
 *
 * Header instances can either be created by calling the constructor function or
 * by passing a byte array containing the binary VBus data to the class method
 * `HeaderSubClass.fromLiveBuffer`.
 * 
 * All `Header` subclasses are immutable. Their properties cannot be changed.
 * 
 * @see Packet
 * @see Datagram
 * @see Telegram
 */
public abstract class Header implements Comparable<Header>{

	protected long timestamp;
	
	protected int channel;
	
	protected int destinationAddress;
	
	protected int sourceAddress;
	
	/**
	 * Creates a `Header` object, initializing its members to the given values.
	 * 
	 * @param timestamp Timestamp of this header, in milliseconds since UNIX epoch.
	 * @param channel VBus channel of this header.
	 * @param destinationAddress Destination VBus address of this header.
	 * @param sourceAddress Source VBus address of this header.
	 */
	protected Header(long timestamp, int channel, int destinationAddress, int sourceAddress) {
		this.timestamp = timestamp;
		this.channel = channel;
		this.destinationAddress = destinationAddress;
		this.sourceAddress = sourceAddress;
	}
	
	/**
	 * Get the timestamp of this header.
	 * 
	 * @return Timestamp of this header, in milliseconds since UNIX epoch.
	 */
	public long getTimestamp() {
		return timestamp;
	}
	
	/**
	 * Get the VBus channel of this header.
	 * 
	 * @return VBus channel of this header.
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * Get the destination VBus address of this header.
	 * 
	 * @return Destination VBus address of this header.
	 */
	public int getDestinationAddress() {
		return destinationAddress;
	}
	
	/**
	 * Get the source VBus address of this header.
	 * 
	 * @return Source VBus address of this header.
	 */
	public int getSourceAddress() {
		return sourceAddress;
	}

	/**
     * Returns the protocol version of this Header instance as a 8-bit
     * number. The high nibble is used for the major version, the low
     * nibble for the minor version. For example: a header with protocol
     * version 2.0 would return `0x20`.
     * 
     * Must be implemented by sub-class.
	 *  
	 * @return VBus protocol version of this header.
	 */
	public abstract int getProtocolVersion();
	
	/**
	 * Creates a representation of this header that can be
	 * transmitted over a VBus connection. If no `buffer`
	 * is given, it creates a new one large enough to hold
	 * the representation.
	 * 
	 * @param buffer Byte array to store data in
	 * @param start Start index in the byte array.
	 * @param length Length of the space in the byte array.
	 * @return Byte array containing the data or null if an
	 * error occurred.
	 */
	public abstract byte[] toLiveBuffer(byte[] buffer, int start, int length);
	
	/**
     * Returns an info number about this Header instance. It can be used
     * for sorting purposes (to distinguish Header objects that would
     * otherwise compare as equal).
     * 
     * Currently only VBus 2.0 datagrams using command 0x0900 use this info.
	 * 
	 * @return Info number to distinguish Header objects.
	 */
	public int getInfo() {
		return 0;
	}
	
	/**
     * Returns a string identifier describing this Header instance.
     * It contains at least:
     *
     *   - channel
     *   - destination address
     *   - source address
     *   - protocol version
     *
     * Sub-classes can extend that information. The structure of this
     * identifier is implementation specific, do not rely on it!
	 * 
	 * @return Identifier for this header.
	 */
	public String getId() {
		return String.format("%02X_%04X_%04X_%02X", channel, destinationAddress, sourceAddress, getProtocolVersion());
	}

	/**
     * Compares this Header instance to another one.
     *
     * Sub-classes can extend the comparison to include specific
     * information.
     *
     * @param that Another Header instance to compare to.
     * @returns Returns a number
     *
     *   - less than 0 if `this < that`
     *   - greater than 0 if `this > that`
     *   - equal to to if `this == that`
	 */
	public int compareTo(Header that) {
		int result = this.channel - that.channel;
		if (result == 0) {
			result = this.destinationAddress - that.destinationAddress;
		}
		if (result == 0) {
			result = this.sourceAddress - that.sourceAddress;
		}
		if (result == 0) {
			result = this.getProtocolVersion() - that.getProtocolVersion();
		}
		return result;
	}

	/**
	 * Checks the `length` bytes in the array beginning at `start` index bytes
	 * with MSB set to 1 (which is not allowed in the regular VBus data stream).
	 * 
	 * @param buffer Byte array to check.
	 * @param start Start index to begin checking.
	 * @param length Length to check.
	 * @return `true` if the byte array range did not contain set MSBs, `false` otherwise.
	 */
	public static boolean checkMsbs(byte[] buffer, int start, int length) {
		boolean valid = true;
		for (int i = 0; i < length; i++) {
			if ((buffer [start + i] & 0x80) != 0) {
				valid = false;
				break;
			}
		}
		return valid;
	}
	
	/**
     * Calculates the VBus checksum (according to version x.0 specification)
     * over a part of a Buffer instance.
	 * 
	 * @param buffer Byte array to calculate checksum for.
	 * @param start Start index to begin calculation.
	 * @param length Length to calculate checksum for.
	 * @return Checksum value.
	 */
	public static byte calcChecksumV0(byte[] buffer, int start, int length) {
		byte checksum = 0;
		for (int i = 0; i < length; i++) {
			checksum = (byte) (checksum + buffer [start + i]);
		}
		checksum = (byte) ((0xFF - checksum) & 0x7F); 
		return checksum;
	}
	
	/**
     * Calculates the VBus checksum (according to version x.0 specification)
     * over a part of a byte array and compares it to the checksum byte
     * stored at the `(start + length)` position.
	 * 
	 * @param buffer Byte array to calculate checksum for.
	 * @param start Start index to begin calculation.
	 * @param length Length to calculate checksum for.
	 * @return `true` if checksum value matched, `false` otherwise.
	 */
	public static boolean calcAndCompareChecksumV0(byte[] buffer, int start, int length) {
		byte checksum = calcChecksumV0(buffer, start, length);
		return (buffer [start + length] == checksum);
	}
	
	/**
     * Calculates the VBus checksum (according to version x.0 specification)
     * over a part of the byte array and stores it at the `(start + length)`
     * position.
	 * 
	 * @param buffer Byte array to calculate checksum for.
	 * @param start Start index to begin calculation.
	 * @param length Length to calculate for.
	 * @return Checksum value.
	 */
	public static byte calcAndSetChecksumV0(byte[] buffer, int start, int length) {
		byte checksum = calcChecksumV0(buffer, start, length);
		buffer [start + length] = checksum;
		return checksum;
	}
	
	/**
     * Copies a part of the source byte array to the destination byte
     * array, injecting the MSBs stored in the septett byte during the process.
	 * 
	 * `srcBuffer` and `dstBuffer` may be the same buffer, but there is no guarantee
	 * to work correctly if partially overlapping areas in the same buffer are given.
	 *  
	 * @param srcBuffer Source byte array containing data incl. septett byte.
	 * @param srcStart Start index in the source byte array. 
	 * @param length Length to copy (0 <= length <= 7).
	 * @param dstBuffer Destination byte array to store data in.
	 * @param dstStart Start index in the destination byte array.
	 */
	public static void injectSeptett(byte[] srcBuffer, int srcStart, int length, byte[] dstBuffer, int dstStart) {
		int srcIndex = srcStart, dstIndex = dstStart, mask = 1, septett = srcBuffer [srcStart + length];
		for (int i = 0; i < length; i++) {
			byte b = srcBuffer [srcIndex];
			if ((septett & mask) != 0) {
				b |= 0x80;
			}
			dstBuffer [dstIndex] = b;
			
			srcIndex++;
			dstIndex++;
			mask = mask << 1;
		}
	}
	
	/**
     * Copies a part of the source byte array to the destination byte
     * array, extracting the MSBs during the process and storing the septett
     * byte to the destination array's `(start + length)` position.
	 * 
	 * `srcBuffer` and `dstBuffer` may be the same buffer, but there is no guarantee
	 * to work correctly if partially overlapping areas in the same buffer are given.
	 * 
	 * @param srcBuffer Source byte array containing data including MSBs set.
	 * @param srcStart Start index in the source byte array.
	 * @param length Length to copy (0 <= length <= 7).
	 * @param dstBuffer Destination byte array to store data and septett byte in.
	 * @param dstStart Start index in the destination byte array.
	 */
	public static void extractSeptett(byte[] srcBuffer, int srcStart, int length, byte[] dstBuffer, int dstStart) {
		int srcIndex = srcStart, dstIndex = dstStart, mask = 1, septett = 0;
		for (int i = 0; i < length; i++) {
			byte b = srcBuffer [srcIndex];
			if ((b & 0x80) != 0) {
				b &= 0x7F;
				septett |= mask;
			}
			dstBuffer [dstIndex] = b;

			srcIndex++;
			dstIndex++;
			mask = mask << 1;
		}
		
		dstBuffer [dstIndex] = (byte) septett;
	}
	
}
