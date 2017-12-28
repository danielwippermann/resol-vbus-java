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
package de.resol.vbus.example.livelogger;

import java.net.InetAddress;
import java.util.Date;

import de.resol.vbus.Connection;
import de.resol.vbus.ConnectionAdapter;
import de.resol.vbus.HeaderSet;
import de.resol.vbus.HeaderSetConsolidator;
import de.resol.vbus.HeaderSetConsolidatorListener;
import de.resol.vbus.Packet;
import de.resol.vbus.Specification;
import de.resol.vbus.Specification.PacketFieldValue;
import de.resol.vbus.TcpDataSource;
import de.resol.vbus.TcpDataSourceProvider;

/**
 * This example application establishes a connection to a VBus device
 * and starts a background timer that will print all received VBus
 * information when its interval elapses.
 * 
 * It would be easy to add functionality to store the VBus information
 * in a file or database then.
 */
public class Main {

	public static void main(String[] args) {
		try {
			Connection connection;
			
			// Create a connection to a LAN-enabled VBus device
			TcpDataSource dataSource = TcpDataSourceProvider.fetchInformation(InetAddress.getByName("192.168.13.1"), 500);
			dataSource.setLivePassword("vbus");
			connection = dataSource.connectLive(0, 0x0020);
			
			// Create a HeaderSetConsolidator that will hold all recently received packets
			final HeaderSetConsolidator<Packet> hsc = new HeaderSetConsolidator<Packet>(0, Long.MIN_VALUE, Long.MAX_VALUE, 0, 0);

			// Add a listener to the Connection to monitor state changes and
			// add incoming packets to the HeaderSetConsolidator
			connection.addListener(new ConnectionAdapter() {
				
				@Override
				public void connectionStateChanged(Connection connection) {
					System.out.println("connection@connectionStateChanged: " + connection.getConnectionState());
				}
				
				@Override
				public void packetReceived(Connection connection, Packet packet) {
//					System.out.println("connection@packetReceived: " + packet.getId());
					hsc.addHeader(packet);
				}
				
				
			});
			
			// Establish the connection
			connection.connect();
			
			// Add a listener to the HeaderSetConsolidator to get a
			// notification when the timer interval elapsed
			hsc.addListener(new HeaderSetConsolidatorListener<Packet>() {
				
				public void headerAdded(HeaderSet<Packet> headerSet, Packet header) {
//					System.out.println("hsc@headerReceived: " + header.getId());
					// nop
				}
				
				public void headerSetProcessed(HeaderSetConsolidator<Packet> hsc) {
					processHeaderSet(hsc);
				}

			});

			// Start the timer, causing the "headerSetProcessed" listener
			// callback to be called at the given interval
			hsc.startTimer(10000);
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * This function is called every time the timer started using
	 * `hsc.startTimer()` elapses. Currently it will only print the received
	 * information to stdout, but it should be easy to add a more permanent
	 * storage here.
	 * 
	 * @param hs Set of packets recently received.
	 */
	public static void processHeaderSet(HeaderSet<Packet> hs) {
		System.out.println("------ " + new Date(hs.getTimestamp()) + " ------");
		System.out.println("headerSet.getId() => " + hs.getId());
		System.out.println("headerSet.getIdHash() => " + hs.getIdHash());
		
		Packet[] packets = hs.getSortedHeaders(new Packet [hs.getHeaderCount()]);
		
		Specification spec = Specification.getDefaultSpecification();
		PacketFieldValue[] pfvs = spec.getPacketFieldValuesForHeaders(packets);
		System.out.println("packetFieldValues.length => " + pfvs.length);

		for (PacketFieldValue pfv : pfvs) {
			System.out.println("Id: " + pfv.getPacketFieldId() + ", Name: " + pfv.getName() + ", Raw: " + pfv.getRawValueDouble() + ", Text: " + pfv.formatTextValue(null, null));
		}
	}
	
}
