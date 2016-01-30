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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

import org.junit.Test;

public class TcpDataSourceProviderTest {

	@Test
	public void tetGetId() throws Exception {
		TcpDataSourceProvider testProvider1 = TcpDataSourceProvider.getSharedProvider();
		
		assertEquals("de.resol.vbus.TcpDataSourceProvider", testProvider1.getId());
	}
	
	@Test
	public void testGetName() throws Exception {
		TcpDataSourceProvider testProvider1 = TcpDataSourceProvider.getSharedProvider();
		
		assertEquals("TCP Data Source Provider", testProvider1.getName());
	}
	
	@Test
	public void testGetDescription() throws Exception {
		TcpDataSourceProvider testProvider1 = TcpDataSourceProvider.getSharedProvider();
		
		assertEquals("A Data Source Provider supporting LAN-enabled VBus devices", testProvider1.getDescription());
	}
	
	@Test
	public void testDiscoverDataSources() throws Exception {
		TcpDataSourceProvider testProvider1 = TcpDataSourceProvider.getSharedProvider();
		
		long refTimeDiff1 = System.currentTimeMillis();
		
		DataSource[] testDataSources1 = testProvider1.discoverDataSources();

		refTimeDiff1 = System.currentTimeMillis() - refTimeDiff1;
		
		assertNotEquals(null, testDataSources1);
		assertEquals(true, refTimeDiff1 < 3000);
	}
	
	@Test
	public void testCreateDataSource() throws Exception {
		TcpDataSourceProvider testProvider1 = TcpDataSourceProvider.getSharedProvider();

		DataSource testDataSource1 = testProvider1.createDataSource(null);
		
		assertEquals(null, testDataSource1);
	}
	
	@Test
	public void testFetchInformation() {
		for (int i = 0; i < 1; i++) {
			int exceptionCount = 0;
			InetAddress address = null;
			TcpDataSource dataSource = null;
			try {
				address = Inet4Address.getByName("resol-demo-1.via.vbus.net");
				dataSource = TcpDataSourceProvider.fetchInformation(address, 80, 500);
			} catch (IOException ex) {
				exceptionCount++;
			}
			
			assertEquals(0, exceptionCount);
			assertNotEquals(null, address);
			assertNotEquals(null, dataSource);
			assertEquals(TcpDataSourceProvider.getSharedProvider(), dataSource.getProvider());
//			assertEquals(null, dataSource.getDataSourceString());
//			assertEquals("Peretzke_NRW (carstenp.via.vbus.net)", dataSource.getName());
//			assertEquals(null, dataSource.getDescription());
//			assertEquals(address, dataSource.getAddress());
//			assertEquals(80, dataSource.getWebPort());
//			assertEquals(7053, dataSource.getLivePort());
//			assertEquals("RESOL", dataSource.getVendor());
//			assertEquals("DL3", dataSource.getProduct());
//			assertEquals("001E660300F0", dataSource.getSerial());
//			assertEquals("2.1.0", dataSource.getVersion());
//			assertEquals("201311280853", dataSource.getBuild());
//			assertEquals("Peretzke_NRW", dataSource.getDeviceName());
//			assertEquals("vbus,dl2,dl3", dataSource.getFeatures());
//			assertEquals("carstenp", dataSource.getViaTag());
//			assertEquals("vbus", dataSource.getPassword());
//			assertEquals(true, dataSource.isSupportingLiveData());
		}

		for (int i = 0; i < 0; i++) {
			int exceptionCount = 0;
			InetAddress address = null;
			TcpDataSource dataSource = null;
			try {
				address = Inet4Address.getByName("192.168.178.64");
				dataSource = TcpDataSourceProvider.fetchInformation(address, 80, 500);
			} catch (IOException ex) {
				exceptionCount++;
			}
			
			assertEquals(0, exceptionCount);
			assertNotEquals(null, address);
			assertNotEquals(null, dataSource);
			assertEquals(TcpDataSourceProvider.getSharedProvider(), dataSource.getProvider());
		}
	}

}
