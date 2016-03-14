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

import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class ConfigurationOptimizerFactoryTest {

	@Test
	public void testUnknownDevice() throws Exception {
		ConfigurationOptimizer optimizer = ConfigurationOptimizerFactory.matchOptimizer(0x0000, null, null);
		
		assertEquals(null, optimizer);
	}

	@Test
	public void testMatchResolDeltaSolCsPlusXxx() throws Exception {
		ConfigurationOptimizer optimizer = ConfigurationOptimizerFactory.matchOptimizer(0x2211, null, null);
		
		assertNotEquals(null, optimizer);
		
		ConfigurationValue[] values = optimizer.completeConfiguration(null);
		
		assertEquals(175, values.length);
		
		long time = 1457892858150L;  // Sun Mar 13 19:14:18 CET 2016
		TimeZone timeZone = TimeZone.getTimeZone("Europe/Berlin");
		
		values = optimizer.generateClockConfiguration(time, timeZone);
		
		assertEquals(1, values.length);
		assertEquals(19 * 60 + 14, values [0].getValue());
	}

}
