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

import java.util.TimeZone;

public class ConfigurationOptimizerTest {

	public static class TestableConfigurationOptimizer implements ConfigurationOptimizer {
		
		int ccCallCount;
		ConfigurationValue[] ccValuesParam;
		ConfigurationValue[] ccValuesResult;
		
		int olcCallCount;
		ConfigurationValue[] olcValuesParam;
		ConfigurationValue[] olcValuesResult;
		
		int oscCallCount;
		ConfigurationValue[] oscNewValuesParam;
		ConfigurationValue[] oscOldValuesParam;
		ConfigurationValue[] oscValuesResult;
		
		int gccCallCount;
		long gccTimeParam;
		TimeZone gccTimeZoneParam;
		ConfigurationValue[] gccValuesResult;
		
		public ConfigurationValue[] completeConfiguration(ConfigurationValue[] values) {
			ccCallCount++;
			ccValuesParam = values;
			return ccValuesResult;
		}
		
		public ConfigurationValue[] optimizeLoadConfiguration(ConfigurationValue[] values) {
			olcCallCount++;
			olcValuesParam = values;
			return olcValuesResult;
		}
		
		public ConfigurationValue[] optimizeSaveConfiguration(ConfigurationValue[] newValues, ConfigurationValue[] oldValues) {
			oscCallCount++;
			oscNewValuesParam = newValues;
			oscOldValuesParam = oldValues;
			return oscValuesResult;
		}
		
		public ConfigurationValue[] generateClockConfiguration(long time, TimeZone timeZone) {
			gccCallCount++;
			gccTimeParam = time;
			gccTimeZoneParam = timeZone;
			return gccValuesResult;
		}
		
	}
	
}
