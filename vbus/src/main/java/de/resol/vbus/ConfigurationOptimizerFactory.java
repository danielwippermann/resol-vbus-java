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

import de.resol.vbus.ConfigurationOptimizerMatcher.MatcherState;
import de.resol.vbus.configurationoptimizers.ResolDeltaSolCsPlusXxxConfigurationOptimizer;

public final class ConfigurationOptimizerFactory {

	private ConfigurationOptimizerFactory() {
		// NOTE(daniel): not constructible
	}
	
	private static ConfigurationOptimizerMatcher[] matchers = null;

	private synchronized static ConfigurationOptimizerMatcher[] getMatchers() {
		if (matchers == null) {
			matchers = new ConfigurationOptimizerMatcher[] {
				ResolDeltaSolCsPlusXxxConfigurationOptimizer.getMatcher(),
				// NOTE(daniel): add more here...
			};
		}
		return matchers;
	}
	
	public static ConfigurationOptimizer matchOptimizer(int deviceAddress, String version, Customizer customizer) {
		ConfigurationOptimizerMatcher[] matchers = getMatchers();

		MatcherState state = new MatcherState();

		ConfigurationOptimizer optimizer = null;
		for (int i = 0; i < matchers.length; i++) {
			optimizer = matchers [i].matchOptimizer(deviceAddress, version, customizer, state);
			if (optimizer != null) {
				break;
			}
		}

		return optimizer;
	}
	
}
