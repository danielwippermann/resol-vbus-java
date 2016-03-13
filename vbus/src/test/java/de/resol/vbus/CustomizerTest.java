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

import java.io.IOException;

import org.junit.Test;

import de.resol.vbus.ConfigurationOptimizerTest.TestableConfigurationOptimizer;

public class CustomizerTest {

	public static class TestableCustomizer extends Customizer {
		
		int lcCallCount;
		ConfigurationValue[] lcValuesParam;
		boolean lcOptimizeParam;
		ConfigurationValue[] lcValuesResult;
		
		int scCallCount;
		ConfigurationValue[] scNewValuesParam;
		ConfigurationValue[] scOldValuesParam;
		boolean scOptimizeParam;
		ConfigurationValue[] scValuesResult;
		
		public TestableCustomizer(int deviceAddress, ConfigurationOptimizer optimizer) {
			super(deviceAddress, optimizer);
		}
	
		@Override
		protected ConfigurationValue[] loadConfigurationInternal(ConfigurationValue[] values, boolean optimize) throws java.io.IOException {
			lcCallCount++;
			lcValuesParam = values;
			lcOptimizeParam = optimize;
			return lcValuesResult;
		}
		
		@Override
		protected ConfigurationValue[] saveConfigurationInternal(ConfigurationValue[] newValues, ConfigurationValue[] oldValues, boolean optimize) throws IOException {
			scCallCount++;
			scNewValuesParam = newValues;
			scOldValuesParam = oldValues;
			scOptimizeParam = optimize;
			return scValuesResult;
		}
		
	}

	@Test
	public void testConstructor() {
		int deviceAddress = 0x4711;
		ConfigurationOptimizer optimizer = new TestableConfigurationOptimizer();
		
		Customizer customizer = new TestableCustomizer(deviceAddress, optimizer);

		assertEquals(deviceAddress, customizer.getDeviceAddress());
		assertEquals(optimizer, customizer.getOptimizer());
	}

	@Test
	public void testLoadConfiguration() throws Exception {
		// ---- CASE 1: without optimizer ----
		if (true) {
			int deviceAddress = 0x4711;

			TestableCustomizer customizer = new TestableCustomizer(deviceAddress, null);

			ConfigurationValue[] inputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, 0, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, 0, 0, false, false),
			};
	
			customizer.lcValuesResult = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -1, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -2, 0, false, false),
			};
			 
			ConfigurationValue[] outputValues = customizer.loadConfiguration(inputValues, true);
			
			assertEquals(1, customizer.lcCallCount);
			assertArrayEquals(inputValues, customizer.lcValuesParam);
			assertEquals(true, customizer.lcOptimizeParam);
			assertArrayEquals(customizer.lcValuesResult, outputValues);
		}
		
		// ---- CASE 2: with optimizer ----
		if (true) {
			int deviceAddress = 0x4711;

			TestableConfigurationOptimizer optimizer = new TestableConfigurationOptimizer();

			TestableCustomizer customizer = new TestableCustomizer(deviceAddress, optimizer);
	
			ConfigurationValue[] inputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, 0, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, 0, 0, false, false),
			};
	
			optimizer.ccValuesResult = new ConfigurationValue [] {
				new ConfigurationValue(null, 0x1111, 0x0001, 0, 0, false, false),
				new ConfigurationValue(null, 0x2222, 0x0002, 0, 0, false, false),
			};
			 
			customizer.lcValuesResult = new ConfigurationValue [] {
				new ConfigurationValue(null, 0x1111, 0x0001, -1, 0, false, false),
				new ConfigurationValue(null, 0x2222, 0x0002, -2, 0, false, false),
			};
			 
			ConfigurationValue[] outputValues = customizer.loadConfiguration(inputValues, true);
			
			assertEquals(1, optimizer.ccCallCount);
			assertArrayEquals(inputValues, optimizer.ccValuesParam);
			
			// optimizeLoadConfiguration must be called by the actual implementation
			assertEquals(0, optimizer.olcCallCount);
			
			assertEquals(1, customizer.lcCallCount);
			assertArrayEquals(optimizer.ccValuesResult, customizer.lcValuesParam);
			assertEquals(true, customizer.lcOptimizeParam);
			assertArrayEquals(customizer.lcValuesResult, outputValues);
		}
	}

	@Test
	public void testSaveConfiguration() throws Exception {
		// ---- CASE 1: without optimizer ----
		if (true) {
			int deviceAddress = 0x4711;

			TestableCustomizer customizer = new TestableCustomizer(deviceAddress, null);

			ConfigurationValue[] newInputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -11, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -22, 0, false, false),
			};
	
			ConfigurationValue[] oldInputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -10, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -20, 0, false, false),
			};
	
			customizer.scValuesResult = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -1, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -2, 0, false, false),
			};
			 
			ConfigurationValue[] outputValues = customizer.saveConfiguration(newInputValues, oldInputValues, true);
			
			assertEquals(1, customizer.scCallCount);
			assertArrayEquals(newInputValues, customizer.scNewValuesParam);
			assertArrayEquals(oldInputValues, customizer.scOldValuesParam);
			assertEquals(true, customizer.scOptimizeParam);
			assertArrayEquals(customizer.scValuesResult, outputValues);
		}
		
		// ---- CASE 2: with optimizer, but without oldValues ----
		if (true) {
			int deviceAddress = 0x4711;

			final ConfigurationValue[] newInputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -11, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -22, 0, false, false),
			};
	
			TestableConfigurationOptimizer optimizer = new TestableConfigurationOptimizer() {
				
				@Override
				public ConfigurationValue[] completeConfiguration(ConfigurationValue[] values) {
					super.completeConfiguration(values);
					
					return values;
				}
				
			};

			TestableCustomizer customizer = new TestableCustomizer(deviceAddress, optimizer);

			customizer.scValuesResult = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -1, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -2, 0, false, false),
			};
			 
			ConfigurationValue[] outputValues = customizer.saveConfiguration(newInputValues, null, true);
			
			assertEquals(1, optimizer.ccCallCount);
			
			assertEquals(1, customizer.scCallCount);
			assertArrayEquals(newInputValues, customizer.scNewValuesParam);
			assertArrayEquals(null, customizer.scOldValuesParam);
			assertEquals(true, customizer.scOptimizeParam);
			assertArrayEquals(customizer.scValuesResult, outputValues);
		}

		// ---- CASE 3: with optimizer and oldValues ----
		if (true) {
			int deviceAddress = 0x4711;

			final ConfigurationValue[] newInputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -11, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -22, 0, false, false),
			};
	
			final ConfigurationValue[] oldInputValues = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -10, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -20, 0, false, false),
			};
	
			TestableConfigurationOptimizer optimizer = new TestableConfigurationOptimizer() {
				
				@Override
				public ConfigurationValue[] completeConfiguration(ConfigurationValue[] values) {
					super.completeConfiguration(values);
					
					return values;
				}
				
			};

			TestableCustomizer customizer = new TestableCustomizer(deviceAddress, optimizer);

			customizer.scValuesResult = new ConfigurationValue [] {
				new ConfigurationValue(null, 0, 0x0001, -1, 0, false, false),
				new ConfigurationValue(null, 0, 0x0002, -2, 0, false, false),
			};
			 
			ConfigurationValue[] outputValues = customizer.saveConfiguration(newInputValues, oldInputValues, true);
			
			assertEquals(2, optimizer.ccCallCount);
			
			assertEquals(1, customizer.scCallCount);
			assertArrayEquals(newInputValues, customizer.scNewValuesParam);
			assertArrayEquals(oldInputValues, customizer.scOldValuesParam);
			assertEquals(true, customizer.scOptimizeParam);
			assertArrayEquals(customizer.scValuesResult, outputValues);
		}
	}
	
}
