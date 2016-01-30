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

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TcpDataSource extends DataSource {

	public static final Pattern VIA_VBUS_NET_PATTERN = Pattern.compile("^([^\\.]+)\\.via\\.vbus\\.net$");
	
	protected InetAddress address;
	
	protected int webPort;

	protected int livePort;
	
	protected String vendor;
	
	protected String product;
	
	protected String serial;
	
	protected String version;
	
	protected String build;
	
	protected String deviceName;
	
	protected String features;
	
	protected String viaTag;
	
	protected String livePassword;

	public TcpDataSource(TcpDataSourceProvider provider, InetAddress address, int webPort, int livePort, String vendor, String product, String serial, String version, String build, String name, String features) {
		super(provider, null, name + " (" + address.getHostName() + ")", null);

		this.webPort = webPort;
		this.livePort = livePort;
		this.address = address;
		this.vendor = vendor;
		this.product = product;
		this.serial = serial;
		this.version = version;
		this.build = build;
		this.deviceName = name;
		this.features = features;
		
		String hostName = address.getHostName();
		Matcher md = VIA_VBUS_NET_PATTERN.matcher(hostName);
		if (md.find()) {
			this.viaTag = md.group(1);
		}
		
		this.livePassword = "vbus";
	}
	
	public InetAddress getAddress() {
		return address;
	}
	
	public int getWebPort() {
		return webPort;
	}
	
	public int getLivePort() {
		return livePort;
	}
	
	public String getVendor() {
		return vendor;
	}
	
	public String getProduct() {
		return product;
	}
	
	public String getSerial() {
		return serial;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getBuild() {
		return build;
	}
	
	public String getDeviceName() {
		return deviceName;
	}

	public String getFeatures() {
		return features;
	}
	
	public String getViaTag() {
		return viaTag;
	}
	
	public void setViaTag(String viaTag) {
		this.viaTag = viaTag;
	}
	
	public String getLivePassword() {
		return livePassword;
	}
	
	public void setLivePassword(String password) {
		this.livePassword = password;
	}
	
	@Override
	public boolean isSupportingLiveData() {
		return (livePort > 0);
	}
	
	@Override
	public Connection connectLive(int channel, int selfAddress) throws Exception {
		return new TcpConnection(selfAddress, new InetSocketAddress(address, livePort), viaTag, livePassword, channel);
	}
	
}
