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
