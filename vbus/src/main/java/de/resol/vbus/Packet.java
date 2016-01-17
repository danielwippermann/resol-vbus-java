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

public class Packet extends Header {

	protected int command;
	
	protected int frameCount;
	
	protected byte[] frameData;
	
	public Packet(long timestamp, int channel, int destinationAddress, int sourceAddress, int command, int frameCount, byte[] frameData) {
		this.timestamp = timestamp;
		this.channel = channel;
		this.destinationAddress = destinationAddress;
		this.sourceAddress = sourceAddress;
		this.command = command;
		this.frameCount = frameCount;
		this.frameData = frameData;
	}

	public int getCommand() {
		return command;
	}
	
	public int getFrameCount() {
		return frameCount;
	}
	
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
