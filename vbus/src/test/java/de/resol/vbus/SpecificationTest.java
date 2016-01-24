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

import java.util.Locale;

import org.junit.Test;

import de.resol.vbus.Specification.*;

public class SpecificationTest {

	Specification spec = Specification.getDefaultSpecification();

	@Test
	public void testTypeClass() throws Exception {
		Type testType1 = new Type("TestType") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				// TODO Auto-generated method stub
				return null;
			}

		};
		
		assertEquals("TestType", testType1.getTypeId());
	}
	
	@Test
	public void testUnitClass() throws Exception {
		Unit testUnit1 = new Unit("unitCode", "unitFamily", "unitText");
		
		assertEquals("unitCode", testUnit1.getUnitCode());
		assertEquals("unitFamily", testUnit1.getUnitFamily());
		assertEquals("unitText", testUnit1.getUnitText());
	}

	@Test
	public void testTextClass() throws Exception {
		Text testText1 = new Text("de", "German Text");
		
		assertEquals("de", testText1.getLang());
		assertEquals("German Text", testText1.getText());
		
		Text testText2 = new Text("Reference Text");
		
		assertEquals("ref", testText2.getLang());
		assertEquals("Reference Text", testText2.getText());
		
		Text testText3 = new Text("en", "English Text");
		
		Text testText4 = new Text("fr", "French Text");
		
		Text testText5 = new Text("all", "Fallback Text");

		Text[] testTexts1 = new Text[] { testText1, testText2, testText3, testText4 };
		
		assertEquals("German Text", Text.getLocalizedText(testTexts1, "de"));
		assertEquals("English Text", Text.getLocalizedText(testTexts1, "en"));
		assertEquals("French Text", Text.getLocalizedText(testTexts1, "fr"));
		assertEquals("Reference Text", Text.getLocalizedText(testTexts1, "it"));

		Text[] testTexts2 = new Text[] { testText1, testText2, testText3, testText4, testText5 };
		
		assertEquals("German Text", Text.getLocalizedText(testTexts2, "de"));
		assertEquals("English Text", Text.getLocalizedText(testTexts2, "en"));
		assertEquals("French Text", Text.getLocalizedText(testTexts2, "fr"));
		assertEquals("Fallback Text", Text.getLocalizedText(testTexts2, "it"));
	}
	
	@Test
	public void testDeviceSpecClass() throws Exception {
		Text[] refTexts1 = new Text [] {};
		
		DeviceSpec testDeviceSpec1 = new DeviceSpec(0x13, 0x2336, 0x3335, 0x4334, 0x5333, refTexts1);
		
		assertEquals(0x13, testDeviceSpec1.getChannel());
		assertEquals(0x2336, testDeviceSpec1.getSelfAddress());
		assertEquals(0x3335, testDeviceSpec1.getSelfMask());
		assertEquals(0x4334, testDeviceSpec1.getPeerAddress());
		assertEquals(0x5333, testDeviceSpec1.getPeerMask());
		assertEquals(true, refTexts1 == testDeviceSpec1.getNameTexts());
	}
	
	@Test
	public void testPacketFieldPartSpecClass() throws Exception {
		PacketFieldPartSpec testSpec1 = new PacketFieldPartSpec(0x13, 0x23, 0x33, true, 0x123412341234L);
		
		assertEquals(0x13, testSpec1.getOffset());
		assertEquals(0x23, testSpec1.getBitPos());
		assertEquals(0x33, testSpec1.getMask());
		assertEquals(true, testSpec1.isSigned());
		assertEquals(0x123412341234L, testSpec1.getFactor());
	}
	
	@Test
	public void testPacketFieldTypeClass() throws Exception {
		Type refType1 = Type.Number;
		Unit refUnit1 = Unit.DegreesCelsius;
		
		PacketFieldType testType1 = new PacketFieldType(refType1, 3, refUnit1);
		
		assertEquals(refType1, testType1.getType());
		assertEquals(3, testType1.getPrecision());
		assertEquals(refUnit1, testType1.getUnit());
	}
	
	@Test
	public void testPacketFieldSpecClass() throws Exception {
		Text[] refTexts1 = new Text[] {};
		
		PacketFieldType refType1 = new PacketFieldType(Type.Number, 3, Unit.Ohms);

		PacketFieldPartSpec[] refParts1 = new PacketFieldPartSpec[] {};
		
		PacketFieldSpec testSpec1 = new PacketFieldSpec("012_0_1", refTexts1, 0.1, refType1, refParts1);
		
		assertEquals("012_0_1", testSpec1.getFieldId());
		assertEquals(true, refTexts1 == testSpec1.getNameTexts());
		assertEquals(0.1, testSpec1.getFactor(), 0.001);
		assertEquals(refType1, testSpec1.getType());
		assertEquals(true, refParts1 == testSpec1.getPartSpecs());
	}

	@Test
	public void testPacketSpecClass() throws Exception {
		PacketFieldSpec[] refFields1 = new PacketFieldSpec[] {};
		
		PacketSpec testSpec1 = new PacketSpec(0x13, 0x2336, 0x3335, 0x4334, 0x5333, 0x6332, refFields1);
		
		assertEquals(0x13, testSpec1.getChannel());
		assertEquals(0x2336, testSpec1.getDestinationAddress());
		assertEquals(0x3335, testSpec1.getDestinationMask());
		assertEquals(0x4334, testSpec1.getSourceAddress());
		assertEquals(0x5333, testSpec1.getSourceMask());
		assertEquals(0x6332, testSpec1.getCommand());
		assertEquals(true, refFields1 == testSpec1.getFieldSpecs());
	}

	@Test
	public void testPacketFieldValueClass() throws Exception {
		byte[] refBuffer1 = new byte[] { 100, 2, 3, 4 };

		Packet refPacket1 = new Packet(0, 0, 0, 0, 0, 1, refBuffer1);

		Text refText1 = new Text("RefText");

		PacketFieldType refPacketFieldType1 = new PacketFieldType(Type.Number, 1, Unit.Percent);
		
		PacketFieldSpec refPacketFieldSpec1 = new PacketFieldSpec("000_1_0", refText1, 0.1, refPacketFieldType1, new PacketFieldPartSpec[] {
			new PacketFieldPartSpec(0, 0, 255, true, 1),
		});

		PacketSpec refPacketSpec1 = new PacketSpec(0, 0, 0, 0, 0, 0, new PacketFieldSpec[] {
			refPacketFieldSpec1,
		});
		
		PacketFieldValue testPfv1 = spec.new PacketFieldValue(refPacket1, refPacketSpec1, refPacketFieldSpec1);
		
		assertEquals(refPacket1, testPfv1.getPacket());
		assertEquals(refPacketSpec1, testPfv1.getPacketSpec());
		assertEquals(refPacketFieldSpec1, testPfv1.getPacketFieldSpec());
		assertEquals("00_0000_0000_10_0000_000_1_0", testPfv1.getPacketFieldId());
		assertEquals("RefText", testPfv1.getName());
		assertEquals(10.0, testPfv1.getRawValue(), 0.001);
		assertEquals("10.0%", testPfv1.formatTextValue(null, Locale.ENGLISH));
	}
	
	@Test
	public void testSpecificationClass() throws Exception {
		DeviceSpec[] refDeviceSpecs1 = new DeviceSpec[] {};
		PacketSpec[] refPacketSpecs1 = new PacketSpec[] {};

		Specification testSpec1 = new Specification(refDeviceSpecs1, refPacketSpecs1);
		
		assertEquals(true, refDeviceSpecs1 == testSpec1.getDeviceSpecTemplates());
		assertEquals(true, refPacketSpecs1 == testSpec1.getPacketSpecTemplates());
	}

	@Test
	public void testGetDeviceSpec() {
		DeviceSpec testDeviceSpec1 = spec.getDeviceSpec(0, 0x7E11, 0x0010);
		
		assertEquals(0, testDeviceSpec1.getChannel());
		assertEquals(0x7E11, testDeviceSpec1.getSelfAddress());
		assertEquals(0xFFFF, testDeviceSpec1.getSelfMask());
		assertEquals(0x0010, testDeviceSpec1.getPeerAddress());
		assertEquals(0xFFFF, testDeviceSpec1.getPeerMask());
		assertEquals("DeltaSol MX [Regler]", Text.getLocalizedText(testDeviceSpec1.getNameTexts(), "ref"));
		
		DeviceSpec testDeviceSpec2 = spec.getDeviceSpec(0, 0x7E11, 0x0010);
		
		assertEquals(testDeviceSpec1, testDeviceSpec2);
	}

	@Test
	public void testGetSourceDeviceSpec() throws Exception {
		DeviceSpec refDeviceSpec1 = spec.getDeviceSpec(0, 0x7E11, 0x0010);

		Datagram refDatagram1 = new Datagram(0, 0, 0x0010, 0x7E11, 0x0100, 0, 0);
		
		DeviceSpec testDeviceSpec1 = spec.getSourceDeviceSpec(refDatagram1);
		
		assertEquals(refDeviceSpec1, testDeviceSpec1);
	}

	@Test
	public void testGetDestinationDeviceSpec() throws Exception {
		DeviceSpec refDeviceSpec1 = spec.getDeviceSpec(0, 0x7E11, 0x0010);

		Datagram refDatagram1 = new Datagram(0, 0, 0x7E11, 0x0010, 0x0300, 0, 0);
		
		DeviceSpec testDeviceSpec1 = spec.getDestinationDeviceSpec(refDatagram1);
		
		assertEquals(refDeviceSpec1, testDeviceSpec1);
	}
	
	@Test
	public void getPacketSpec() throws Exception {
		PacketSpec testPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		assertEquals(0, testPacketSpec1.getChannel());
		assertEquals(0x0010, testPacketSpec1.getDestinationAddress());
		assertEquals(0xFFFF, testPacketSpec1.getDestinationMask());
		assertEquals(0x7E11, testPacketSpec1.getSourceAddress());
		assertEquals(0xFFFF, testPacketSpec1.getSourceMask());
		assertEquals(0x0100, testPacketSpec1.getCommand());

		PacketSpec testPacketSpec2 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);

		assertEquals(testPacketSpec1, testPacketSpec2);
	}

	@Test
	public void testPacketSpecWithPacket() throws Exception {
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);

		Packet refPacket1 = new Packet(0, 0, 0x0010, 0x7E11, 0x0100, 0, null);
		
		PacketSpec testPacketSpec1 = spec.getPacketSpec(refPacket1);
		
		assertEquals(refPacketSpec1, testPacketSpec1);
	}
	
	@Test
	public void testGetPacketFieldSpec() throws Exception {
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		PacketFieldSpec testPfs1 = spec.getPacketFieldSpec(refPacketSpec1, "010_2_0");
		
		assertEquals("010_2_0", testPfs1.getFieldId());
		assertEquals("Temperatur Sensor 6", Text.getLocalizedText(testPfs1.getNameTexts(), "ref"));
		assertEquals(0.1, testPfs1.getFactor(), 0.001);
		assertEquals(2, testPfs1.getPartSpecs().length);
	}
	
	@Test
	public void testGetRawValue() throws Exception {
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		PacketFieldSpec refPfs1 = spec.getPacketFieldSpec(refPacketSpec1, "010_2_0");
		
		byte[] refBuffer1 = new byte [16];
		int refStart1 = 4;
		int refLength1 = refBuffer1.length - refStart1;

		refBuffer1 [14] = (byte) 100;
		refBuffer1 [15] = (byte) 0;
		
		Double testRawValue1 = spec.getRawValue(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue1);
		assertEquals(10.0, testRawValue1.doubleValue(), 0.001);

		refBuffer1 [14] = (byte) 200;
		refBuffer1 [15] = (byte) 0;
		
		Double testRawValue2 = spec.getRawValue(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue2);
		assertEquals(20.0, testRawValue2.doubleValue(), 0.001);

		refBuffer1 [14] = (byte) 0xB8;
		refBuffer1 [15] = (byte) 0x22;
		
		Double testRawValue3 = spec.getRawValue(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue3);
		assertEquals(888.8, testRawValue3.doubleValue(), 0.001);

		refBuffer1 [14] = (byte) 0x48;
		refBuffer1 [15] = (byte) 0xDD;
		
		Double testRawValue4 = spec.getRawValue(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue4);
		assertEquals(-888.8, testRawValue4.doubleValue(), 0.001);
		
		Double testRawValue5 = spec.getRawValue(refPfs1, refBuffer1, refStart1, 11);
		
		assertNotEquals(null, testRawValue5);
		assertEquals(7.2, testRawValue5.doubleValue(), 0.001);
		
		Double testRawValue6 = spec.getRawValue(refPfs1, refBuffer1, refStart1, 10);
		
		assertEquals(null, testRawValue6);
	}
	
	@Test
	public void testFormatTextValueFromRawValueInternal() throws Exception {
		Locale locale = Locale.ENGLISH;
		
		assertEquals("0", spec.formatTextValueFromRawValueInternal(0, null, locale, Type.Number, 0, null));
		assertEquals("0 °C", spec.formatTextValueFromRawValueInternal(0, null, locale, Type.Number, 0, Unit.DegreesCelsius));
		assertEquals("0 °F", spec.formatTextValueFromRawValueInternal(0, Unit.DegreesFahrenheit, locale, Type.Number, 0, Unit.DegreesCelsius));
		assertEquals("0", spec.formatTextValueFromRawValueInternal(0, Unit.None, locale, Type.Number, 0, Unit.DegreesCelsius));

		assertEquals("1", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 0, null));
		assertEquals("0.6", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 1, null));
		assertEquals("0.57", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 2, null));
		assertEquals("0.568", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 3, null));
		assertEquals("0.5679", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 4, null));
		assertEquals("0.56789", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 5, null));
		assertEquals("0.567890", spec.formatTextValueFromRawValueInternal(0.56789, Unit.None, locale, Type.Number, 6, null));

		assertEquals("00:00", spec.formatTextValueFromRawValueInternal(0, Unit.None, locale, Type.Time, 0, null));
		assertEquals("23:59", spec.formatTextValueFromRawValueInternal(1439, Unit.None, locale, Type.Time, 0, null));

		assertEquals("Mo,00:00", spec.formatTextValueFromRawValueInternal(0, Unit.None, locale, Type.Weektime, 0, null));
		assertEquals("So,23:59", spec.formatTextValueFromRawValueInternal(10079, Unit.None, locale, Type.Weektime, 0, null));

		assertEquals("2001-01-01 00:00:00", spec.formatTextValueFromRawValueInternal(0, Unit.None, locale, Type.DateTime, 0, null));
		assertEquals("2015-01-01 12:01:00", spec.formatTextValueFromRawValueInternal(441806460, Unit.None, locale, Type.DateTime, 0, null));
	}
	
	@Test
	public void testFormatTextValueFromRawValueWithBasicType() throws Exception {
		Locale locale = Locale.ENGLISH;
		
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		PacketFieldSpec refPfs1 = spec.getPacketFieldSpec(refPacketSpec1, "010_2_0");
		
		assertEquals("123.4 °C", spec.formatTextValueFromRawValue(refPfs1, 123.41, null, locale));
	}
	
	@Test
	public void testFormatTextValueFromRawValueWithObjectType() throws Exception {
		Locale locale = Locale.ENGLISH;
		
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		PacketFieldSpec refPfs1 = spec.getPacketFieldSpec(refPacketSpec1, "010_2_0");
		
		assertEquals("123.4 °C", spec.formatTextValueFromRawValue(refPfs1, new Double(123.41), null, locale));
		assertEquals("", spec.formatTextValueFromRawValue(refPfs1, null, null, locale));
	}
	
	@Test
	public void testGetPacketFieldValuesForHeaders() throws Exception {
		Locale locale = Locale.ENGLISH;
		
		byte[] refBuffer1 = new byte[] { 1, 2, 3, 4 };
		
		Header[] refHeaders1 = new Header[] {
			new Packet(0, 0, 0x0010, 0x7E11, 0x0100, 1, refBuffer1),
			new Datagram(0, 0, 0x0010, 0x7E11, 0x0500, 0, 0),
		};

		PacketFieldValue[] pfvs = spec.getPacketFieldValuesForHeaders(refHeaders1);
		
		assertEquals(true, pfvs.length >= 51);
		assertEquals("00_0010_7E11_10_0100_000_2_0", pfvs [0].getPacketFieldId());
		assertEquals(51.3, pfvs [0].getRawValue().doubleValue(), 0.001);
		assertEquals("51.3 °C", pfvs [0].formatTextValue(null, locale));
	}

}
