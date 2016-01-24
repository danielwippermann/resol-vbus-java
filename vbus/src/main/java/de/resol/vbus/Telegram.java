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
 * The Telegram sub-class provides access to all properties and methods applicable for VBus version 3 telegrams.
 * In addition to the header it may contain a command and up to 27 bytes of payload data.
 * The structure of the payload depends on the combination of destination and source address as well as
 * the command of the telegram.
 */
public class Telegram extends Header {

	protected int command;
	
	protected byte[] frameData;
	
	/**
	 * Creates a `Telegram` object, initializing its members to the given values.
	 * 
	 * @param timestamp Timestamp of this telegram, in milliseconds since UNIX epoch.
	 * @param channel VBus channel of this telegram.
	 * @param destinationAddress Destination VBus address of this telegram.
	 * @param sourceAddress Source VBus address of this telegram.
	 * @param command VBus command of this telegram.
	 * @param frameData Payload frame data of this telegram.
	 */
	public Telegram(long timestamp, int channel, int destinationAddress, int sourceAddress, int command, byte[] frameData) {
		super(timestamp, channel, destinationAddress, sourceAddress);
		this.command = command;
		this.frameData = frameData;
	}
	
	/**
	 * Get the VBus command of this telegram.
	 * 
	 * @return VBus command of this telegram.
	 */
	public int getCommand() {
		return command;
	}
	
	/**
	 * Get the payload frame data of this telegram.
	 * 
	 * @return Payload frame data of this telegram.
	 */
	public byte[] getFrameData() {
		return frameData;
	}
	
	@Override
	public int getProtocolVersion() {
		return 0x30;
	}

	@Override
	public byte[] toLiveBuffer(byte[] _buffer, int _start, int _length) {
		int liveLength = 8 + getFrameCount() * 9;
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
			buffer [start + 5] = 0x30;
			buffer [start + 6] = (byte) (command & 0x7F);
			calcAndSetChecksumV0(buffer, start + 1, 6);
			
			int frameCount = getFrameCount();
			for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
				int srcStart = frameIndex * 7;
				int dstStart = start + 8 + frameIndex * 9;
				extractSeptett(frameData, srcStart, 7, buffer, dstStart);
				calcAndSetChecksumV0(buffer, dstStart, 8);
			}
		}
		
		return buffer;
	}

	@Override
	public String getId() {
		return String.format("%s_%02X", super.getId(), command);
	}
	
	@Override
	public int compareTo(Header _that) {
		int result = super.compareTo(_that);
		if (result == 0) {
			Telegram that = (Telegram) _that;
			result = this.command - that.command;
		}
		return result;
	}
	
	/**
	 * Get the payload frame count of this telegram.
	 * 
	 * @return Payload frame count of this telegram.
	 */
	public int getFrameCount() {
		return getFrameCountForCommand(command);
	}
	
	/**
	 * Get the payload frame count based on the command of a telegram.
	 * 
	 * @param command The command to extract the payload frame count from.
	 * @return Payload frame count based on the command of a telegram.
	 */
	public static int getFrameCountForCommand(int command) {
		return ((command >> 5) & 3);
	}

	/**
     * Creates a Telegram instance from a representation that was
     * received over a VBus connection.
	 * 
	 * @param buffer Byte array containing the representation.
	 * @param start Start index in the byte array.
	 * @param length Length of data in the byte array.
	 * @param timestamp Timestamp of this telegram.
	 * @param channel VBus channel of this telegram.
	 * @return The Telegram instance or `null` if an error occurred.
	 */
	public static Telegram fromLiveBuffer(byte[] buffer, int start, int length, long timestamp, int channel) {
		boolean valid;
		if ((buffer [start] & 0xFF) != 0xAA) {
			valid = false;
		} else if (length < 8) {
			valid = false;
		} else if (!checkMsbs(buffer, start + 1, 7)) {
			valid = false;
		} else if (!calcAndCompareChecksumV0(buffer, start + 1, 6)) {
			valid = false;
		} else if (buffer [start + 5] != 0x30) {
			valid = false;
		} else {
			int frameCount = getFrameCountForCommand(buffer [start + 6]);
			int minLength = 8 + frameCount * 9;
			if (length < minLength) {
				valid = false;
			} else if (!checkMsbs(buffer, start + 8, minLength - 8)) {
				valid = false;
			} else {
				valid = true;
				for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
					if (!calcAndCompareChecksumV0(buffer, start + 8 + frameIndex * 9, 8)) {
						valid = false;
						break;
					}
				}
			}
		}
		
		Telegram tgram;
		if (valid) {
			int destinationAddress = (buffer [start + 1] & 0x7F) | ((buffer [start + 2] & 0x7F) << 8);
			int sourceAddress = (buffer [start + 3] & 0x7F) | ((buffer [start + 4] & 0x7F) << 8);
			int command = (buffer [start + 6] & 0x7F);
			int frameCount = getFrameCountForCommand(command);
			
			byte[] frameData = new byte [frameCount * 7];
			for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
				int srcStart = start + 8 + frameIndex * 9;
				int dstStart = frameIndex * 7;
				injectSeptett(buffer, srcStart, 7, frameData, dstStart);
			}

			tgram = new Telegram(timestamp, channel, destinationAddress, sourceAddress, command, frameData);
		} else {
			tgram = null;
		}
		
		return tgram;
	}

}
