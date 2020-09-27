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
package de.resol.vbus.example.serialport;

import java.io.IOException;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortTimeoutException;

import de.resol.vbus.Connection;
import de.resol.vbus.ConnectionAdapter;
import de.resol.vbus.Datagram;
import de.resol.vbus.Header;
import de.resol.vbus.LiveInputStream;
import de.resol.vbus.LiveOutputStream;
import de.resol.vbus.Packet;
import de.resol.vbus.StreamConnection;
import de.resol.vbus.Telegram;

public class Main {

	public static void main(String[] args) throws Exception {
		SerialPort comPort = SerialPort.getCommPort("/dev/tty.SLAB_USBtoUART");
		comPort.openPort();
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 500, 0);
		
		LiveInputStream is = new LiveInputStream(comPort.getInputStream(), 0);
		LiveOutputStream os = new LiveOutputStream(comPort.getOutputStream());
		
		StreamConnection conn = new StreamConnection(0x0020, is, os) {
			
			@Override
			protected Header readHeader() throws IOException {
				try {
					Header header = is.readHeader();
					return header;
				} catch (SerialPortTimeoutException ex) {
					return null;
				}
			}

		};
		
		conn.addListener(new ConnectionAdapter() {
			
			public void connectionStateChanged(Connection connection) {
				System.out.printf("connectionStateChanged %s\n", connection.getConnectionState().toString());
			}
			
			public void packetReceived(Connection connection, Packet packet) {
				System.out.printf("packetReceived %s\n", packet.getId());
			}
			
			public void datagramReceived(Connection connection, Datagram dgram) {
				System.out.printf("datagramReceived %s\n", dgram.getId());
			}
			
			public void telegramReceived(Connection connection, Telegram tgram) {
				System.out.printf("telegramReceived %s\n", tgram.getId());
			}

		});

		conn.connect();
		
		Datagram dgram1 = conn.waitForFreeBus(10000);
		
		if (dgram1 != null) {
			int peerAddress = dgram1.getSourceAddress();

			Datagram dgram2 = conn.getValueById(peerAddress, 0, 500, 100, 3);
			if (dgram2 != null) {
				System.out.printf("Device 0x%04X: Changeset 0x%08X\n", peerAddress, dgram2.getValue());
			} else {
				System.out.printf("Device 0x%04X: No changeset\n");
			}
			
			conn.releaseBus(peerAddress, 2000, 500, 3);
		} else {
			System.out.printf("No device found\n");
		}
		
		conn.disconnect();
		
		Thread.sleep(1000);
	}

}
