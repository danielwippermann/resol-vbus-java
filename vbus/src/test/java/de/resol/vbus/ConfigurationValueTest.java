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

import org.junit.Test;

public class ConfigurationValueTest {

	@Test
	public void testHashValueId() throws Exception {
		assertEquals(0, ConfigurationValue.hashValueId(null));

		assertEquals(0x567D5BA4, ConfigurationValue.hashValueId("Language"));

		// NOTE(daniel): possible hash collision...
		assertEquals(968271287, ConfigurationValue.hashValueId("Anlage_Wf16_Waermeaustausch_Status_dTIst_R"));
		assertEquals(968271287, ConfigurationValue.hashValueId("Solar_Wf5_Relais1_MinDrehzahl"));
	}

	@Test
	public void testConstructor() {
		String valueId = "valueId";
		int valueIndex = 0x1234;
		int valueIdHash = 0x12345678;
		int value = 0x12;
		int priority = -5;
		boolean isPending = true;
		boolean isTransceived = false;

		ConfigurationValue cv = new ConfigurationValue(valueId, valueIndex, valueIdHash, value, priority, isPending, isTransceived);
		
		assertEquals(valueId, cv.getValueId());
		assertEquals(valueIndex, cv.getValueIndex());
		assertEquals(valueIdHash, cv.getValueIdHash());
		assertEquals(value, cv.getValue());
		assertEquals(priority, cv.getPriority());
		assertEquals(isPending, cv.isPending());
		assertEquals(isTransceived, cv.isTransceived());
	}

	@Test
	public void testSetValueId() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(null, cv.getValueId());

		cv.setValueId("valueId");
		
		assertEquals("valueId", cv.getValueId());
	}
	
	@Test
	public void testSetValueIndex() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(0, cv.getValueIndex());

		cv.setValueIndex(0x1234);
		
		assertEquals(0x1234, cv.getValueIndex());
	}
	
	@Test
	public void testSetValueIdHash() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(0, cv.getValueIdHash());

		cv.setValueIdHash(0x1234);
		
		assertEquals(0x1234, cv.getValueIdHash());
	}
	
	@Test
	public void testSetValue() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(0, cv.getValue());

		cv.setValue(0x1234);
		
		assertEquals(0x1234, cv.getValue());
	}
	
	@Test
	public void testSetPriority() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(0, cv.getPriority());

		cv.setPriority(0x1234);
		
		assertEquals(0x1234, cv.getPriority());
	}
	
	@Test
	public void testSetPending() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(false, cv.isPending());

		cv.setPending(true);
		
		assertEquals(true, cv.isPending());
	}
	
	@Test
	public void testSetTransceived() throws Exception {
		ConfigurationValue cv = new ConfigurationValue(null, 0, 0, 0, 0, false, false);
		
		assertEquals(false, cv.isTransceived());

		cv.setTransceived(true);
		
		assertEquals(true, cv.isTransceived());
	}

}
