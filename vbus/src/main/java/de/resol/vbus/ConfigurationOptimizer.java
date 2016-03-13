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

public interface ConfigurationOptimizer {

	/**
	 * Completes the given configuration, which can either be an array of
	 * partially initialized `ConfigurationValue` objects or `null` to
	 * generate a complete set of known `ConfigurationValue` objects for the
	 * given device.
	 * 
	 * @param values An array of partially initialized `ConfigurationValue` objects or `null`.
	 * @return An array of completed `ConfigurationValue` objects.
	 */
	public abstract ConfigurationValue[] completeConfiguration(ConfigurationValue[] values);
	
	/**
	 * Get an optimized array of `ConfigurationValue` objects based on what
	 * values have already been loaded before.
	 * 
	 * @param values An array of already loaded `ConfigurationValue` objects.
	 * @return An array of `ConfigurationValue` objects to load next.
	 */
	public abstract ConfigurationValue[] optimizeLoadConfiguration(ConfigurationValue[] values);

	/**
	 * Gets an optimized array of `ConfigurationValue` objects based on what
	 * values were set in the device befor.
	 * 
	 * @param newValues An array of new `ConfigurationValue` objects to set.
	 * @param oldValues An array of already set `ConfigurationValue` object.
	 * @return An array of `ConfigurationValue` objects to set next.
	 */
	public abstract ConfigurationValue[] optimizeSaveConfiguration(ConfigurationValue[] newValues, ConfigurationValue[] oldValues);

	/**
	 * Gets an array of `ConfigurationValue` objects to set the device to
	 * the specified date / time within the specified timezone.
	 * 
	 * @param time The time in milliseconds since start of the era.
	 * @param timeZone the timezone of the device. 
	 * @return An array of `ConfigurationValue` objects to set the date and time.
	 */
	public abstract ConfigurationValue[] generateClockConfiguration(long time, TimeZone timeZone);

}
