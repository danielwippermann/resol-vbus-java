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

import static org.junit.Assert.*;

import java.net.InetAddress;

import org.junit.Test;

public class TcpDataSourceTest {

	@Test
	public void testConstructor() throws Exception {
		TcpDataSourceProvider refProvider1 = TcpDataSourceProvider.getSharedProvider();
		InetAddress refAddress1 = InetAddress.getByName("resol-demo-1.via.vbus.net");
		int refWebPort1 = 80;
		int refLivePort1 = 7053;
		String refVendor1 = "RESOL";
		String refProduct1 = "DL2";
		String refSerial1 = "001E660000F0";
		String refVersion1 = "2.1.5";
		String refBuild1 = "201601010000";
		String refName1 = "RESOL Demo #1";
		String refFeatures1 = "vbus,dl2";

		String refDsName1 = refName1 + " (" + refAddress1.getHostName() + ")";
		String refDsDescription1 = null;
		
		TcpDataSource testDataSource1 = new TcpDataSource(refProvider1, refAddress1, refWebPort1, refLivePort1, refVendor1, refProduct1, refSerial1, refVersion1, refBuild1, refName1, refFeatures1);
		assertEquals(refProvider1, testDataSource1.getProvider());
		assertEquals(null, testDataSource1.getDataSourceString());
		assertEquals(refDsName1, testDataSource1.getName());
		assertEquals(refDsDescription1, testDataSource1.getDescription());
		assertEquals(refAddress1, testDataSource1.getAddress());
		assertEquals(refWebPort1, testDataSource1.getWebPort());
		assertEquals(refLivePort1, testDataSource1.getLivePort());
		assertEquals(refVendor1, testDataSource1.getVendor());
		assertEquals(refProduct1, testDataSource1.getProduct());
		assertEquals(refSerial1, testDataSource1.getSerial());
		assertEquals(refVersion1, testDataSource1.getVersion());
		assertEquals(refBuild1, testDataSource1.getBuild());
		assertEquals(refName1, testDataSource1.getDeviceName());
		assertEquals(refFeatures1, testDataSource1.getFeatures());
	}
	
	@Test
	public void testGetAndSetViaTag() throws Exception {
		InetAddress refAddress1 = InetAddress.getByName("resol-demo-1.via.vbus.net");

		TcpDataSource testDataSource1 = new TcpDataSource(null, refAddress1, 0, 0, null, null, null, null, null, null, null);

		assertEquals("resol-demo-1", testDataSource1.getViaTag());

		InetAddress refAddress2 = InetAddress.getByName("127.0.0.1");

		TcpDataSource testDataSource2 = new TcpDataSource(null, refAddress2, 0, 0, null, null, null, null, null, null, null);

		assertEquals(null, testDataSource2.getViaTag());
		
		testDataSource2.setViaTag("test");
		
		assertEquals("test", testDataSource2.getViaTag());
	}

	@Test
	public void testGetAndSetLivePassword() throws Exception {
		InetAddress refAddress1 = InetAddress.getByName("127.0.0.1");

		TcpDataSource testDataSource1 = new TcpDataSource(null, refAddress1, 0, 0, null, null, null, null, null, null, null);

		assertEquals("vbus", testDataSource1.getLivePassword());
		
		testDataSource1.setLivePassword("secret");

		assertEquals("secret", testDataSource1.getLivePassword());
	}

	@Test
	public void testIsSupportingLiveData() throws Exception {
		InetAddress refAddress1 = InetAddress.getByName("127.0.0.1");

		TcpDataSource testDataSource1 = new TcpDataSource(null, refAddress1, 0, 0, null, null, null, null, null, null, null);

		assertEquals(false, testDataSource1.isSupportingLiveData());
		
		TcpDataSource testDataSource2 = new TcpDataSource(null, refAddress1, 0, 7053, null, null, null, null, null, null, null);

		assertEquals(true, testDataSource2.isSupportingLiveData());
	}
	
	
}
