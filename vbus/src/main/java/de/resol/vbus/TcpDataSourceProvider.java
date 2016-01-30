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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TcpDataSourceProvider extends DataSourceProvider {

	private static final TcpDataSourceProvider theInstance = new TcpDataSourceProvider();

	public static TcpDataSourceProvider getSharedProvider() {
		return theInstance;
	}
	
	private TcpDataSourceProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getId() {
		return "de.resol.vbus.TcpDataSourceProvider";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "TCP Data Source Provider";
	}
	
	@Override
	public String getDescription() {
		return "A Data Source Provider supporting LAN-enabled VBus devices";
	}
	
	@Override
	public DataSource[] discoverDataSources() {
		try {
			InetAddress address = Inet4Address.getByName("255.255.255.255");
			return discoverDataSources(address, 3, 500, true);
		} catch (UnknownHostException ex) {
			return new DataSource[] {};
		}
	}
	
	@Override
	public DataSource createDataSource(String dsString) {
		return null;
	}
	
	private static class Discovery {
		
		ScheduledExecutorService scheduler;

		HashMap<String, TcpDataSource> dataSourceById;
		ArrayList<TcpDataSource> dataSourceList;
		
		TcpDataSource[] discoverDataSources(InetAddress address, int tries, int timeout, boolean fetchInformation) {
			dataSourceById = new HashMap<String, TcpDataSource>();
			dataSourceList = new ArrayList<TcpDataSource>();
			
			if (fetchInformation) {
				scheduler = Executors.newScheduledThreadPool(4);
			}

			DatagramSocket socket = null;

			try {
				socket = new DatagramSocket();

				socket.setBroadcast(true);
				socket.setSoTimeout(timeout);
				
				String queryString = "---RESOL-BROADCAST-QUERY---";
				byte[] queryBuffer = queryString.getBytes();
				DatagramPacket queryPacket = new DatagramPacket(queryBuffer, queryBuffer.length, new InetSocketAddress(address, 7053));
				
				String replyString = "---RESOL-BROADCAST-REPLY---";
				byte[] replyBuffer = replyString.getBytes();
				DatagramPacket replyPacket = new DatagramPacket(replyBuffer, replyBuffer.length);

				for (int i = 0; i < tries; i++) {
					long cancelTimestamp = System.currentTimeMillis() + timeout;

					socket.send(queryPacket);
					
					while (System.currentTimeMillis() < cancelTimestamp) {
						replyPacket.setLength(replyBuffer.length);

						try {
							socket.receive(replyPacket);
						} catch (SocketTimeoutException ex) {
							break;
						}
						
						InetAddress replyAddress = replyPacket.getAddress();
						if (replyPacket.getLength() != replyBuffer.length) {
							// skip
						} else {
							String receivedReplyString = new String(replyBuffer);
							if (replyString.equals(receivedReplyString)) {
								processReply(replyAddress, 1500, fetchInformation);
							}
						}
					}
				}
				
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (socket != null) {
					socket.close();
					socket = null;
				}
			}

			scheduler.shutdown();
			try {
				scheduler.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException ex) {
				// nop
			}

			return dataSourceList.toArray(new TcpDataSource [dataSourceList.size()]);
		}
		
		void processReply(final InetAddress address, final int timeout, final boolean fetchInformation) {
			final String addressId = address.getHostAddress();
			if (dataSourceById.containsKey(addressId)) {
				// skip
			} else {
				dataSourceById.put(addressId, null);
				
				scheduler.execute(new Runnable() {
					
					public void run() {
						TcpDataSource dataSource = null;
						if (fetchInformation) {
							try {
								dataSource = fetchInformation(address, 80, timeout);
							} catch (IOException ex) {
								try {
									dataSource = fetchInformation(address, 3000, timeout);
								} catch (IOException ex2) {
									// nop
									System.out.println("Did not get information from " + address);
									ex.printStackTrace();
									ex2.printStackTrace();
								}
							}
						} else {
							dataSource = new TcpDataSource(getSharedProvider(), address, 80, 7053, null, null, null, null, null, null, null);
						}
						
						if (dataSource != null) {
							dataSourceById.put(addressId, dataSource);
							dataSourceList.add(dataSource);
						} else {
							dataSourceById.remove(addressId);
						}
					}

				});
			}
		}
		
	}
	
	public static TcpDataSource[] discoverDataSources(InetAddress address, int tries, int timeout, boolean fetchInformation) {
		Discovery discovery = new Discovery();
		return discovery.discoverDataSources(address, tries, timeout, fetchInformation);
	}
	
	public static TcpDataSource fetchInformation(InetAddress address, int port, int timeout) throws IOException {
		URL url = new URL("http://" + address.getHostName() + ":" + port + "/cgi-bin/get_resol_device_information");
		
		URLConnection connection = url.openConnection();
		connection.setConnectTimeout(timeout);
		connection.setReadTimeout(timeout);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		String vendor = null, product = null, serial = null, version = null, build = null, name = null, features = null;

		Pattern re = Pattern.compile("^([^ =]+)\\s*=\\s*\"(.*)\"$");

		String line;
		while ((line = in.readLine()) != null) {
			Matcher md = re.matcher(line);
			if (md.find()) {
				String key = md.group(1);
				String value = md.group(2);
				
				if ("vendor".equals(key)) {
					vendor = value;
				} else if ("product".equals(key)) {
					product = value;
				} else if ("serial".equals(key)) {
					serial = value;
				} else if ("version".equals(key)) {
					version = value;
				} else if ("build".equals(key)) {
					build = value;
				} else if ("name".equals(key)) {
					name = value;
				} else if ("features".equals(key)) {
					features = value;
				}
			}
		}
		in.close();
		
		TcpDataSource dataSource = new TcpDataSource(getSharedProvider(), address, port, 7053, vendor, product, serial, version, build, name, features);
		return dataSource;
	}

}
