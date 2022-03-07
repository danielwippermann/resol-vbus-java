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
package de.resol.vbus.configurationoptimizers;

import java.util.TimeZone;

import de.resol.vbus.BaseConfigurationOptimizer;
import de.resol.vbus.ConfigurationOptimizer;
import de.resol.vbus.ConfigurationOptimizerMatcher;
import de.resol.vbus.ConfigurationValue;
import de.resol.vbus.Customizer;

public class RegumaqX45ConfigurationOptimizer extends BaseConfigurationOptimizer {

	@Override
	public ConfigurationValue[] getAdjustableValues() {
		return new ConfigurationValue[] {
			createConfigurationValueDescriptor("WarmwasserTSoll", 0x0037, 0x5fc5f901, 0),
			createConfigurationValueDescriptor("Relais1Handbetrieb", 0x015c, 0xf7b94472, 0),
		};
	}

	private ConfigurationValue createConfigurationValueDescriptor(String valueId, int valueIndex, int valueIdHash, int priority) {
		return new ConfigurationValue(valueId, valueIndex, valueIdHash, 0, priority, false, false);
	}
	
	public ConfigurationValue[] setAdjustableValuesWater(int value) {
		return new ConfigurationValue[] {
				new ConfigurationValue("WarmwasserTSoll", 0x0037, 0x5fc5f901, value, 0, true, false),
		};
	}
	

	@Override
	public ConfigurationValue[] generateClockConfiguration(long time, TimeZone timezone) {
		time += timezone.getOffset(time);
		
		int value = (int) ((time / 60000) % 1440);

		return new ConfigurationValue[] {
			new ConfigurationValue("SysTime", 0x0002, 0x17B2C58E, value, 0, true, false),
		};
	}
	
	public static ConfigurationOptimizerMatcher getMatcher() {
		return new ConfigurationOptimizerMatcher() {
			
			public ConfigurationOptimizer matchOptimizer(int deviceAddress, String version, Customizer customizer, MatcherState state) {
				if (deviceAddress == 5682) {
					return new RegumaqX45ConfigurationOptimizer();
				} else {
					return null;
				}
			}
			
		};
	}

}
