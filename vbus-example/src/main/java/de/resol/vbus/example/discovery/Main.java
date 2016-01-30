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
package de.resol.vbus.example.discovery;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;

import de.resol.vbus.TcpDataSource;
import de.resol.vbus.TcpDataSourceProvider;

public class Main {

	public static void main(String[] args) {
		HashMap<String, TcpDataSource> knownDataSourceById = new HashMap<String, TcpDataSource>();

		while (true) {
			System.out.println("------ " + new Date() + " ------");
			try {
				InetAddress broadcastAddress = InetAddress.getByName("255.255.255.255");
			
				TcpDataSource[] dataSources = TcpDataSourceProvider.discoverDataSources(broadcastAddress, 3, 500, false);
				
				HashMap<String, TcpDataSource> currentDataSourceById = new HashMap<String, TcpDataSource>();
				for (TcpDataSource ds : dataSources) {
					InetAddress address = ds.getAddress();
					String addressId = address.getHostAddress();
					
					TcpDataSource dsWithInfo = knownDataSourceById.get(addressId);
					if (dsWithInfo == null) {
						try {
							dsWithInfo = TcpDataSourceProvider.fetchInformation(address, 1500);
							System.out.println("ADDED:   " + addressId + " " + dsWithInfo.getDeviceName() + " (" + dsWithInfo.getSerial() + ")");
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
					
					currentDataSourceById.put(addressId, dsWithInfo);
				}
				
				for (String addressId : knownDataSourceById.keySet()) {
					if (!currentDataSourceById.containsKey(addressId)) {
						TcpDataSource dsWithInfo = knownDataSourceById.get(addressId);
						
						System.out.println("REMOVED: " + addressId + " " + dsWithInfo.getDeviceName() + " (" + dsWithInfo.getSerial() + ")");
					}
				}
				
				knownDataSourceById = currentDataSourceById;
				
				Thread.sleep(10000);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

}
