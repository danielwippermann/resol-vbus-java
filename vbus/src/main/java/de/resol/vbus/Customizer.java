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

public abstract class Customizer {

	private int deviceAddress;
	
	private ConfigurationOptimizer optimizer;
	
	public Customizer(int deviceAddress, ConfigurationOptimizer optimizer) {
		this.deviceAddress = deviceAddress;
		this.optimizer = optimizer;
	}
	
	public int getDeviceAddress() {
		return deviceAddress;
	}
	
	public ConfigurationOptimizer getOptimizer() {
		return optimizer;
	}
	
	public ConfigurationValue[] loadConfiguration(ConfigurationValue[] values, boolean optimize) throws IOException {
		if (optimizer != null) {
			values = optimizer.completeConfiguration(values);
		}
		
		return loadConfigurationInternal(values, optimize);
	}

	protected abstract ConfigurationValue[] loadConfigurationInternal(ConfigurationValue[] values, boolean optimize) throws IOException;
	
	public ConfigurationValue[] saveConfiguration(ConfigurationValue[] newValues, ConfigurationValue[] oldValues, boolean optimize) throws IOException {
		if (optimizer != null) {
			newValues = optimizer.completeConfiguration(newValues);
		
			if (oldValues != null) {
				oldValues = optimizer.completeConfiguration(oldValues);
			}
		}
		
		return saveConfigurationInternal(newValues, oldValues, optimize);
	}
	
	protected abstract ConfigurationValue[] saveConfigurationInternal(ConfigurationValue[] newValues, ConfigurationValue[] oldValues, boolean optimize) throws IOException;

}
