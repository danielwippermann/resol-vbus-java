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
 * The Packet sub-class provides access to all properties and methods applicable for VBus version 1 packets.
 * In addition to the packet header it may contain up to 508 bytes of payload data.
 * The structure of the payload depends on the combination of destination and source addresses as well as
 * the command of the packet. The different payloads are described in further detail
 * in Chapter H of the VBus Protocol Specification and can be decoded using a Specification instance.
 *
 * @see Specification
 */
public class Packet extends Header {

	protected int command;
	
	protected int frameCount;
	
	protected byte[] frameData;

	/**
	 * Creates a `Packet` object, initializing its members to the given values.
	 * 
	 * @param timestamp Timestamp of this packet, in milliseconds since UNIX epoch.
	 * @param channel VBus channel of this packet.
	 * @param destinationAddress Destination VBus address of this packet.
	 * @param sourceAddress Source VBus address of this packet.
	 * @param command VBus command of this packet.
	 * @param frameCount Payload frame count of this packet.
	 * @param frameData Payload frame data of this packet.
	 */
	public Packet(long timestamp, int channel, int destinationAddress, int sourceAddress, int command, int frameCount, byte[] frameData) {
		super(timestamp, channel, destinationAddress, sourceAddress);
		this.command = command;
		this.frameCount = frameCount;
		this.frameData = frameData;
	}

	/**
	 * Get the VBus command of this packet.
	 * 
	 * @return VBus command of this packet.
	 */
	public int getCommand() {
		return command;
	}
	
	/**
	 * Get the payload frame count of this packet.
	 * 
	 * @return Payload frame count of this packet.
	 */
	public int getFrameCount() {
		return frameCount;
	}
	
	/**
	 * Get the payload frame data of this packet.
	 * 
	 * @return Payload frame data of this packet.
	 */
	public byte[] getFrameData() {
		return frameData;
	}
	
	@Override
	public int getProtocolVersion() {
		return 0x10;
	}

	@Override
	public byte[] toLiveBuffer(byte[] _buffer, int _start, int _length) {
		int liveLength = 10 + frameCount * 6;
		byte[] buffer;
		int start;
		if (_buffer == null) {
			buffer = new byte [liveLength];
			start = 0;
		} else if (_length >= liveLength) {
			buffer = _buffer;
			start = _start;
		} else {
			buffer = null;
			start = 0;
		}
		
		if (buffer != null) {
			buffer [start + 0] = (byte) 0xAA;
			buffer [start + 1] = (byte) (destinationAddress & 0x7F);
			buffer [start + 2] = (byte) ((destinationAddress >> 8) & 0x7F);
			buffer [start + 3] = (byte) (sourceAddress & 0x7F);
			buffer [start + 4] = (byte) ((sourceAddress >> 8) & 0x7F);
			buffer [start + 5] = 0x10;
			buffer [start + 6] = (byte) (command & 0x7F);
			buffer [start + 7] = (byte) ((command >> 8) & 0x7F);
			buffer [start + 8] = (byte) (frameCount & 0x7F);
			calcAndSetChecksumV0(buffer, start + 1, 8);
			
			for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
				int srcStart = frameIndex * 4;
				int dstStart = start + 10 + frameIndex * 6;
				extractSeptett(frameData, srcStart, 4, buffer, dstStart);
				calcAndSetChecksumV0(buffer, dstStart, 5);
			}
		}
		
		return buffer;
	}

	@Override
	public String getId() {
		return String.format("%s_%04X", super.getId(), command);
	}
	
	@Override
	public int compareTo(Header _that) {
		int result = super.compareTo(_that);
		if (result == 0) {
			Packet that = (Packet) _that;
			result = this.command - that.command; 
		}
		return result;
	}
	
	/**
     * Creates a Packet instance from a representation that was
     * received over a VBus connection.
	 * 
	 * @param buffer Byte array containing the representation.
	 * @param start Start index in the byte array.
	 * @param length Length of data in the byte array.
	 * @param timestamp Timestamp of this packet.
	 * @param channel VBus channel of this packet.
	 * @return The Packet instance or `null` if an error occurred.
	 */
	public static Packet fromLiveBuffer(byte[] buffer, int start, int length, long timestamp, int channel) {
		boolean valid;
		if ((buffer [start] & 0xFF) != 0xAA) {
			valid = false;
		} else if (length < 10) {
			valid = false;
		} else if (!checkMsbs(buffer, start + 1, 9)) {
			valid = false;
		} else if (!calcAndCompareChecksumV0(buffer, start + 1, 8)) {
			valid = false;
		} else if (buffer [start + 5] != 0x10) {
			valid = false;
		} else {
			int frameCount = buffer [start + 8];
			int minLength = 10 + frameCount * 6; 
			if (length < minLength) {
				valid = false;
			} else if (!checkMsbs(buffer, start + 10, minLength - 10)) {
				valid = false;
			} else {
				valid = true;
				for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
					if (!calcAndCompareChecksumV0(buffer, start + 10 + frameIndex * 6, 5)) {
						valid = false;
						break;
					}
				}
			}
		}
		
		Packet packet;
		if (valid) {
			int destinationAddress = (buffer [start + 1] & 0x7F) | ((buffer [start + 2] & 0x7F) << 8);
			int sourceAddress = (buffer [start + 3] & 0x7F) | ((buffer [start + 4] & 0x7F) << 8);
			int command = (buffer [start + 6] & 0x7F) | ((buffer [start + 7] & 0x7F) << 8);
			int frameCount = (buffer [start + 8] & 0x7F);
			
			byte[] frameData = new byte [frameCount * 4];
			for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
				int srcStart = start + 10 + frameIndex * 6;
				int dstStart = frameIndex * 4;
				injectSeptett(buffer, srcStart, 4, frameData, dstStart);
			}
			
			packet = new Packet(timestamp, channel, destinationAddress, sourceAddress, command, frameCount, frameData);
		} else {
			packet = null;
		}
		
		return packet;
	}
	
}
