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

import java.io.IOException;
import java.io.InputStream;

/**
 * The `LiveInputStream` class wraps another `InputStream` instance and tries
 * to decode the data received using that other stream into VBus `Packet`,
 * `Datagram` or `Telegram` instances. 
 */
public class LiveInputStream {

	protected InputStream is;
	
	protected int channel;
	
	protected byte[] rxBuffer;
	
	protected int rxBufferLength;
	
	protected long rxTimestamp;
	
	/**
	 * Creates a `LiveInputStream` instance, initializing its members to the given values.
	 * 
	 * @param is InputStream to receive raw VBus data from.
	 * @param channel VBus channel to associate received VBus headers with.
	 */
	public LiveInputStream(InputStream is, int channel) {
		this.is = is;
		this.channel = channel;
		rxBuffer = new byte [1024];
		rxBufferLength = 0;
		rxTimestamp = 0;
	}
	
	/**
	 * Try to decode the received data in VBus `Header` instances, optionally
	 * reading additional data from the wrapped `InputStream`.
	 *  
	 * @return A `Header` instance or `null` on eof of stream.
	 * @throws IOException
	 */
	public Header readHeader() throws IOException {
		Header header = null;
		while (true) {
			if (rxBufferLength > 0) {
				header = readHeaderInternal();
				if (header != null) {
					break;
				}
			}
			if (rxBufferLength < rxBuffer.length) { 
				int readLength = is.read(rxBuffer, rxBufferLength, rxBuffer.length - rxBufferLength);
				if (readLength < 0) {
					break;
				}
				rxBufferLength += readLength;
				rxTimestamp = System.currentTimeMillis();
			}
		}
		return header;
	}
	
	private Header readHeaderInternal() {
		Header header = null;

		int index = 0;
		while ((header == null) && (index < rxBufferLength)) {
			if ((rxBuffer [index] & 0xFF) != 0xAA) {
				index++;
			} else if ((index + 6) > rxBufferLength) {
				break;
			} else if (rxBuffer [index + 5] == 0x10) {
				if ((index + 10) > rxBufferLength) {
					break;
				} else if (!Header.checkMsbs(rxBuffer, index + 1, 9)) {
					index++;
				} else if (!Header.calcAndCompareChecksumV0(rxBuffer, index + 1, 8)) {
					index++;
				} else {
					int frameCount = rxBuffer [index + 8];
					int minLength = 10 + frameCount * 6;
					if ((index + minLength) > rxBufferLength) {
						break;
					} else {
						header = Packet.fromLiveBuffer(rxBuffer, index, minLength, rxTimestamp, channel);
						if (header != null) {
							index += minLength;
						} else {
							index++;
						}
					}
				}
			} else if (rxBuffer [index + 5] == 0x20) {
				int minLength = 16;
				if ((index + minLength) > rxBufferLength) {
					break;
				} else {
					header = Datagram.fromLiveBuffer(rxBuffer, index, minLength, rxTimestamp, channel);
					if (header != null) {
						index += minLength;
					} else {
						index++;
					}
				}
			} else if (rxBuffer [index + 5] == 0x30) {
				if ((index + 8) > rxBufferLength) {
					break;
				} else if (!Header.checkMsbs(rxBuffer, index + 1, 7)) {
					index++;
				} else if (!Header.calcAndCompareChecksumV0(rxBuffer, index + 1, 6)) {
					index++;
				} else {
					int frameCount = Telegram.getFrameCountForCommand(rxBuffer [index + 6]);
					int minLength = 8 + frameCount * 9;
					if ((index + minLength) > rxBufferLength) {
						break;
					} else {
						header = Telegram.fromLiveBuffer(rxBuffer, index, minLength, rxTimestamp, channel);
						if (header != null) {
							index += minLength;
						} else {
							index++;
						}
					}
				}
			} else {
				index++;
			}
		}
		
		if (index > 0) {
			int count = rxBufferLength - index;
			if (count > 0) {
				for (int i = 0; i < count; i++) {
					rxBuffer [i] = rxBuffer [i + index];
				}
			}
			rxBufferLength = count;
		}

		return header;
	}

}
