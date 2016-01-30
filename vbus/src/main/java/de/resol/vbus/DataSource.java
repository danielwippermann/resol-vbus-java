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

public abstract class DataSource {

	protected DataSourceProvider provider;
	
	protected String dsString;
	
	protected String name;
	
	protected String description;

	protected DataSource(DataSourceProvider provider, String dsString, String name, String description) {
		this.provider = provider;
		this.dsString = dsString;
		this.name = name;
		this.description = description;
	}
	
	public DataSourceProvider getProvider() {
		return provider;
	}
	
	public String getDataSourceString() {
		return dsString;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isSupportingLiveData() {
		return false;
	}
	
	public boolean isSupportingRecordedData() {
		return false;
	}
	
	public boolean isSupportingCustomization() {
		return false;
	}
	
	public Connection connectLive(int channel, int selfAddress) throws Exception {
		throw new NoSuchMethodException("This DataSource does not support the connectLive() method");
	}
	
//	public Recorder openRecorder() throws Exception {
//		throw new NoSuchMethodException("This DataSource does not support the openRecorder() method");
//	}
	
//	public Customizer createCustomizer() throws Exception {
//		throw new NoSuchMethodException("This DataSource does not support the createCustomizer() method");
//	}
	
}
