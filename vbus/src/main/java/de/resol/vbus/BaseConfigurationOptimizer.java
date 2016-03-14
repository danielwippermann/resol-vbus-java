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

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TimeZone;

public abstract class BaseConfigurationOptimizer implements ConfigurationOptimizer {

	public ConfigurationValue[] completeConfiguration(ConfigurationValue[] values) {
		ConfigurationValue[] adjustableValues = getAdjustableValues();

		ConfigurationValue[] templateValues;
		boolean forcePending;
		if (values != null) {
			templateValues = values;
			forcePending = false;
		} else {
			templateValues = adjustableValues;
			forcePending = true;
		}
	
		HashMap<Integer, ConfigurationValue> valueByIndex = null;
		HashMap<Integer, ConfigurationValue> valueByIdHash = null;

		ConfigurationValue[] completedValues = new ConfigurationValue [templateValues.length];
		for (int i = 0; i < templateValues.length; i++) {
			ConfigurationValue value = templateValues [i];
			
			ConfigurationValue completedValue;
			if (value.getValueIndex() != 0) {
				if (valueByIndex == null) {
					valueByIndex = new HashMap<Integer, ConfigurationValue>();
					for (ConfigurationValue adjValue : adjustableValues) {
						valueByIndex.put(adjValue.getValueIndex(), adjValue);
					}
				}
				
				completedValue = valueByIndex.get(value.getValueIndex());
			} else if ((value.getValueIdHash() != 0) || (value.getValueId() != null)) {
				if (valueByIdHash == null) {
					valueByIdHash = new HashMap<Integer, ConfigurationValue>();
					for (ConfigurationValue adjValue : adjustableValues) {
						valueByIdHash.put(adjValue.getValueIdHash(), adjValue);
					}
				}
				
				int valueIdHash = value.getValueIdHash();
				if (valueIdHash == 0) {
					valueIdHash = ConfigurationValue.hashValueId(value.getValueId());
				}
				
				completedValue = valueByIdHash.get(valueIdHash);
			} else {
				completedValue = null;
			}
			
			if (completedValue == null) {
				completedValue = value;
			}

			completedValue = completedValue.clone();
			completedValue.setValue(value.getValue());
			completedValue.setPending(forcePending ? true : value.isPending());
			completedValue.setTransceived(forcePending ? false : value.isTransceived());

			completedValues [i] = completedValue;
		}

		Arrays.sort(completedValues, new Comparator<ConfigurationValue>() {
			
			public int compare(ConfigurationValue l, ConfigurationValue r) {
				int diff = r.getPriority() - l.getPriority();
				if (diff == 0) {
					diff = l.getValueIndex() - r.getValueIndex();
				}
				return diff;
			}
			
		});

		return completedValues;
	}
	
	public ConfigurationValue[] optimizeLoadConfiguration(ConfigurationValue[] values) {
		return values;
	}
	
	public ConfigurationValue[] optimizeSaveConfiguration(ConfigurationValue[] newValues, ConfigurationValue[] oldValues) {
		return newValues;
	}
	
	public ConfigurationValue[] generateClockConfiguration(long time, TimeZone timeZone) {
		return new ConfigurationValue [0];
	}

	public abstract ConfigurationValue[] getAdjustableValues();
	
}
