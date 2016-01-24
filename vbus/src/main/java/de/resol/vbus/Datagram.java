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

public class Datagram extends Header {

	protected int command;
	
	protected int valueId;
	
	protected int value;
	
	public Datagram(long timestamp, int channel, int destinationAddress, int sourceAddress, int command, int valueId, int value) {
		super(timestamp, channel, destinationAddress, sourceAddress);
		this.command = command;
		this.valueId = valueId;
		this.value = value;
	}
	
	public int getCommand() {
		return command;
	}
	
	public int getValueId() {
		return valueId;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public int getProtocolVersion() {
		return 0x20;
	}

	@Override
	public byte[] toLiveBuffer(byte[] _buffer, int _start, int _length) {
		int liveLength = 16;
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
			buffer [start + 5] = 0x20;
			buffer [start + 6] = (byte) (command & 0x7F);
			buffer [start + 7] = (byte) ((command >> 8) & 0x7F);
			buffer [start + 8] = (byte) (valueId & 0xFF);
			buffer [start + 9] = (byte) ((valueId >> 8) & 0xFF);
			buffer [start + 10] = (byte) (value & 0xFF);
			buffer [start + 11] = (byte) ((value >> 8) & 0xFF);
			buffer [start + 12] = (byte) ((value >> 16) & 0xFF);
			buffer [start + 13] = (byte) ((value >> 24) & 0xFF);
			extractSeptett(buffer, start + 8, 6, buffer, start + 8);
			calcAndSetChecksumV0(buffer, start + 1, 14);
		}
		
		return buffer;
	}
	
	@Override
	public int getInfo() {
		int result;
		if (command == 0x0900) {
			result = valueId;
		} else {
			result = 0;
		}
		return result;
	}
	
	@Override
	public String getId() {
		return String.format("%s_%04X_%04X", super.getId(), command, getInfo());
	}

	@Override
	public int compareTo(Header _that) {
		int result = super.compareTo(_that);
		if (result == 0) {
			Datagram that = (Datagram) _that;
			result = this.command - that.command;
			if (result == 0) {
				result = this.getInfo() - that.getInfo();
			}
		}
		return result;
	}

	public static Datagram fromLiveBuffer(byte[] buffer, int start, int length, long timestamp, int channel) {
		boolean valid;
		if ((buffer [start] & 0xFF) != 0xAA) {
			valid = false;
		} else if (length < 16) {
			valid = false;
		} else if (!checkMsbs(buffer, start + 1, 15)) {
			valid = false;
		} else if (!calcAndCompareChecksumV0(buffer, start + 1, 14)) {
			valid = false;
		} else if (buffer [start + 5] != 0x20) {
			valid = false;
		} else {
			valid = true;
		}
		
		Datagram dgram;
		if (valid) {
			byte[] data = new byte [6];
			injectSeptett(buffer, start + 8, 6, data, 0);

			int destinationAddress = (buffer [start + 1] & 0x7F) | ((buffer [start + 2] & 0x7F) << 8);
			int sourceAddress = (buffer [start + 3] & 0x7F) | ((buffer [start + 4] & 0x7F) << 8);
			int command = (buffer [start + 6] & 0x7F) | ((buffer [start + 7] & 0x7F) << 8);
			int valueId = (data [0] & 0xFF) | ((data [1] & 0xFF) << 8);
			int value = (data [2] & 0xFF) | ((data [3] & 0xFF) << 8) | ((data [4] & 0xFF) << 16) | ((data [5] & 0xFF) << 24);
			
			dgram = new Datagram(timestamp, channel, destinationAddress, sourceAddress, command, valueId, value);
		} else {
			dgram = null;
		}
		
		return dgram;
	}
	
}
