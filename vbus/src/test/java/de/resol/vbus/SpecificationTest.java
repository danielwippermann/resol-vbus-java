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
import de.resol.vbus.SpecificationFile.Language;
import de.resol.vbus.SpecificationFile.Type;

public class SpecificationTest {

	Specification spec = Specification.getDefaultSpecification();

	@Test
	public void testGetPowerOfTen() throws Exception {
		double epsilon = 1e-12;

		assertEquals(0.0000000001, Specification.getPowerOfTen(-10), epsilon);
		assertEquals(0.000000001, Specification.getPowerOfTen(-9), epsilon);
		assertEquals(0.00000001, Specification.getPowerOfTen(-8), epsilon);
		assertEquals(0.0000001, Specification.getPowerOfTen(-7), epsilon);
		assertEquals(0.000001, Specification.getPowerOfTen(-6), epsilon);
		assertEquals(0.00001, Specification.getPowerOfTen(-5), epsilon);
		assertEquals(0.0001, Specification.getPowerOfTen(-4), epsilon);
		assertEquals(0.001, Specification.getPowerOfTen(-3), epsilon);
		assertEquals(0.01, Specification.getPowerOfTen(-2), epsilon);
		assertEquals(0.1, Specification.getPowerOfTen(-1), epsilon);
		assertEquals(1.0, Specification.getPowerOfTen(0), epsilon);
		assertEquals(10.0, Specification.getPowerOfTen(1), epsilon);
		assertEquals(100.0, Specification.getPowerOfTen(2), epsilon);
		assertEquals(1000.0, Specification.getPowerOfTen(3), epsilon);
		assertEquals(10000.0, Specification.getPowerOfTen(4), epsilon);
		assertEquals(100000.0, Specification.getPowerOfTen(5), epsilon);
		assertEquals(1000000.0, Specification.getPowerOfTen(6), epsilon);
		assertEquals(10000000.0, Specification.getPowerOfTen(7), epsilon);
		assertEquals(100000000.0, Specification.getPowerOfTen(8), epsilon);
		assertEquals(1000000000.0, Specification.getPowerOfTen(9), epsilon);
		assertEquals(10000000000.0, Specification.getPowerOfTen(10), epsilon);
	}

	@Test
	public void testTypeClass() throws Exception {
		Formatter testFormatter1 = new Formatter("TestFormatter") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				// TODO Auto-generated method stub
				return null;
			}

		};
		
		assertEquals("TestFormatter", testFormatter1.getFormatterId());
	}
	
	@Test
	public void testDeviceSpecClass() throws Exception {
		SpecificationFile specFile = SpecificationFile.getDefaultSpecificationFile();
		SpecificationFile.DeviceTemplate deviceTemplate1 = specFile.findDeviceTemplate(0x0010, 0x0000);

		DeviceSpec testDeviceSpec1 = new DeviceSpec(0x13, 0x2336, 0x4334, deviceTemplate1);
		
		assertEquals(0x13, testDeviceSpec1.getChannel());
		assertEquals(0x2336, testDeviceSpec1.getSelfAddress());
		assertEquals(0x4334, testDeviceSpec1.getPeerAddress());
		assertEquals("DFA", testDeviceSpec1.getName(Language.En));
		assertEquals("DFA", testDeviceSpec1.getName());
	}
	
	@Test
	public void testPacketFieldSpecClass() throws Exception {
		SpecificationFile specFile = SpecificationFile.getDefaultSpecificationFile();
		SpecificationFile.PacketTemplate packetTemplate1 = specFile.findPacketTemplate(0x0010, 0x7E11, 0x0100);
		SpecificationFile.PacketTemplateField packetTemplateField1 = packetTemplate1.getFields() [0];
		
		PacketFieldSpec testSpec1 = new PacketFieldSpec(packetTemplateField1);
		
		assertEquals("000_2_0", testSpec1.getFieldId());
		assertEquals("Temperatur Sensor 1", testSpec1.getName(Language.De));
		assertEquals("Temperature sensor 1", testSpec1.getName());
		assertEquals("DegreesCelsius", testSpec1.getUnit().getUnitCodeText());
		assertEquals(1, testSpec1.getPrecision());
		assertEquals(0.1, testSpec1.getFactor(), 0.001);
		assertEquals(SpecificationFile.Type.Number, testSpec1.getType());
//		assertEquals(true, packetTemplateField1.getParts() == testSpec1.getParts());  // FIXME(daniel):
	}

	@Test
	public void testPacketSpecClass() throws Exception {
		SpecificationFile specFile = SpecificationFile.getDefaultSpecificationFile();
		SpecificationFile.PacketTemplate packetTemplate1 = specFile.findPacketTemplate(0x0010, 0x0053, 0x0100);
		
		PacketSpec testSpec1 = new PacketSpec(0x13, 0x2336, 0x4334, 0x6332, packetTemplate1);
		
		assertEquals(0x13, testSpec1.getChannel());
		assertEquals(0x2336, testSpec1.getDestinationAddress());
		assertEquals(0x4334, testSpec1.getSourceAddress());
		assertEquals(0x6332, testSpec1.getCommand());
//		assertEquals(true, refFields1 == testSpec1.getFieldSpecs());  // FIXME(daniel): check this
	}

	@Test
	public void testPacketFieldValueClass() throws Exception {
		byte[] refBuffer1 = new byte[] { 100, 0, 0, 0 };

		Packet refPacket1 = new Packet(0, 0, 0x0010, 0x7E11, 0x0100, 1, refBuffer1);

		PacketSpec refPacketSpec1 = spec.getPacketSpec(refPacket1);

		PacketFieldSpec refPacketFieldSpec1 = spec.getPacketFieldSpec(refPacketSpec1, "000_2_0");

		PacketFieldValue testPfv1 = spec.new PacketFieldValue(refPacket1, refPacketSpec1, refPacketFieldSpec1);
		
		assertEquals(refPacket1, testPfv1.getPacket());
		assertEquals(refPacketSpec1, testPfv1.getPacketSpec());
		assertEquals(refPacketFieldSpec1, testPfv1.getPacketFieldSpec());
		assertEquals("00_0010_7E11_10_0100_000_2_0", testPfv1.getPacketFieldId());
		assertEquals("Temperature sensor 1", testPfv1.getName(Language.En));
		assertEquals("Temperatur Sensor 1", testPfv1.getName(Language.De));
		assertEquals("Température sonde 1", testPfv1.getName(Language.Fr));
		assertEquals("Temperature sensor 1", testPfv1.getName());
		assertEquals(100, testPfv1.getRawValueLong().longValue());
		assertEquals(10.0, testPfv1.getRawValueDouble(), 0.001);
		assertEquals("10.0 °C", testPfv1.formatTextValue(null, Locale.ENGLISH));
	}
	
//	@Test
//	public void testSpecificationClass() throws Exception {
//		DeviceSpec[] refDeviceSpecs1 = new DeviceSpec[] {};
//		PacketSpec[] refPacketSpecs1 = new PacketSpec[] {};
//
//		Specification testSpec1 = new Specification(refDeviceSpecs1, refPacketSpecs1);
//		
//		assertEquals(true, refDeviceSpecs1 == testSpec1.getDeviceSpecTemplates());
//		assertEquals(true, refPacketSpecs1 == testSpec1.getPacketSpecTemplates());
//	}

	@Test
	public void testGetDeviceSpec() {
		DeviceSpec testDeviceSpec1 = spec.getDeviceSpec(0, 0x7E11, 0x0010);
		
		assertEquals(0, testDeviceSpec1.getChannel());
		assertEquals(0x7E11, testDeviceSpec1.getSelfAddress());
		assertEquals(0x0010, testDeviceSpec1.getPeerAddress());
		assertEquals("DeltaSol MX [Regler]", testDeviceSpec1.getName());
		
		DeviceSpec testDeviceSpec2 = spec.getDeviceSpec(0, 0x7E11, 0x0010);
		
		assertEquals(testDeviceSpec1, testDeviceSpec2);

		DeviceSpec testDeviceSpec3 = spec.getDeviceSpec(0, 0x0001, 0x0000);
		
		assertEquals("Unknown Device (0x0001)", testDeviceSpec3.getName(Language.En));
		assertEquals("Unbekanntes Gerät (0x0001)", testDeviceSpec3.getName(Language.De));
		assertEquals("Unknown Device (0x0001)", testDeviceSpec3.getName(Language.Fr));
		assertEquals("Unknown Device (0x0001)", testDeviceSpec3.getName());

		DeviceSpec testDeviceSpec4 = spec.getDeviceSpec(0, 0x6652, 0x0000);
		
		assertEquals("EM #2", testDeviceSpec4.getName());
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
	public void testGetPacketSpec() throws Exception {
		PacketSpec testPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		assertEquals(0, testPacketSpec1.getChannel());
		assertEquals(0x0010, testPacketSpec1.getDestinationAddress());
		assertEquals(0x7E11, testPacketSpec1.getSourceAddress());
		assertEquals(0x0100, testPacketSpec1.getCommand());
		assertNotEquals(null, testPacketSpec1.getFieldSpecs());
		assertEquals(true, testPacketSpec1.getFieldSpecs().length >= 51);

		PacketSpec testPacketSpec2 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);

		assertEquals(testPacketSpec1, testPacketSpec2);
		
		PacketSpec testPacketSpec3 = spec.getPacketSpec(0, 0x0015, 0x7E11, 0x0100);
		
		assertNotEquals(null, testPacketSpec3.getFieldSpecs());
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
		assertEquals("Temperature sensor 6", testPfs1.getName());
		assertEquals("Temperatur Sensor 6", testPfs1.getName(Language.De));
		assertEquals(0.1, testPfs1.getFactor(), 0.001);
		assertEquals(2, testPfs1.getParts().length);
	}
	
	@Test
	public void testGetRawValueLong() throws Exception {
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		PacketFieldSpec refPfs1 = spec.getPacketFieldSpec(refPacketSpec1, "010_2_0");
		
		byte[] refBuffer1 = new byte [16];
		int refStart1 = 4;
		int refLength1 = refBuffer1.length - refStart1;

		refBuffer1 [14] = (byte) 100;
		refBuffer1 [15] = (byte) 0;
		
		Long testRawValue1 = spec.getRawValueLong(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue1);
		assertEquals(100, testRawValue1.longValue());

		refBuffer1 [14] = (byte) 200;
		refBuffer1 [15] = (byte) 0;
		
		Long testRawValue2 = spec.getRawValueLong(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue2);
		assertEquals(200, testRawValue2.longValue());

		refBuffer1 [14] = (byte) 0xB8;
		refBuffer1 [15] = (byte) 0x22;
		
		Long testRawValue3 = spec.getRawValueLong(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue3);
		assertEquals(8888, testRawValue3.longValue());

		refBuffer1 [14] = (byte) 0x48;
		refBuffer1 [15] = (byte) 0xDD;
		
		Long testRawValue4 = spec.getRawValueLong(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue4);
		assertEquals(-8888, testRawValue4.longValue());
		
		Long testRawValue5 = spec.getRawValueLong(refPfs1, refBuffer1, refStart1, 11);
		
		assertNotEquals(null, testRawValue5);
		assertEquals(72, testRawValue5.longValue());
		
		Long testRawValue6 = spec.getRawValueLong(refPfs1, refBuffer1, refStart1, 10);
		
		assertEquals(null, testRawValue6);
	}
	
	@Test
	public void testGetRawValueDouble() throws Exception {
		PacketSpec refPacketSpec1 = spec.getPacketSpec(0, 0x0010, 0x7E11, 0x0100);
		
		PacketFieldSpec refPfs1 = spec.getPacketFieldSpec(refPacketSpec1, "010_2_0");
		
		byte[] refBuffer1 = new byte [16];
		int refStart1 = 4;
		int refLength1 = refBuffer1.length - refStart1;

		refBuffer1 [14] = (byte) 100;
		refBuffer1 [15] = (byte) 0;
		
		Double testRawValue1 = spec.getRawValueDouble(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue1);
		assertEquals(10.0, testRawValue1.doubleValue(), 0.001);

		refBuffer1 [14] = (byte) 200;
		refBuffer1 [15] = (byte) 0;
		
		Double testRawValue2 = spec.getRawValueDouble(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue2);
		assertEquals(20.0, testRawValue2.doubleValue(), 0.001);

		refBuffer1 [14] = (byte) 0xB8;
		refBuffer1 [15] = (byte) 0x22;
		
		Double testRawValue3 = spec.getRawValueDouble(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue3);
		assertEquals(888.8, testRawValue3.doubleValue(), 0.001);

		refBuffer1 [14] = (byte) 0x48;
		refBuffer1 [15] = (byte) 0xDD;
		
		Double testRawValue4 = spec.getRawValueDouble(refPfs1, refBuffer1, refStart1, refLength1);
		
		assertNotEquals(null, testRawValue4);
		assertEquals(-888.8, testRawValue4.doubleValue(), 0.001);
		
		Double testRawValue5 = spec.getRawValueDouble(refPfs1, refBuffer1, refStart1, 11);
		
		assertNotEquals(null, testRawValue5);
		assertEquals(7.2, testRawValue5.doubleValue(), 0.001);
		
		Double testRawValue6 = spec.getRawValueDouble(refPfs1, refBuffer1, refStart1, 10);
		
		assertEquals(null, testRawValue6);
	}
	
	@Test
	public void testFormatTextValueFromRawValueInternal() throws Exception {
		Locale locale = Locale.ENGLISH;

		SpecificationFile.Unit unitNone = spec.getUnitByCode("None");
		SpecificationFile.Unit unitDegreesCelsius = spec.getUnitByCode("DegreesCelsius");
		SpecificationFile.Unit unitDegreesFahrenheit = spec.getUnitByCode("DegreesFahrenheit");
		
		assertEquals("0", spec.formatTextValueFromRawValueInternal(0, null, locale, Type.Number, 0, null));
		assertEquals("0 °C", spec.formatTextValueFromRawValueInternal(0, null, locale, Type.Number, 0, unitDegreesCelsius));
		assertEquals("0 °F", spec.formatTextValueFromRawValueInternal(0, unitDegreesFahrenheit, locale, Type.Number, 0, unitDegreesCelsius));
		assertEquals("0", spec.formatTextValueFromRawValueInternal(0, unitNone, locale, Type.Number, 0, unitDegreesCelsius));

		assertEquals("1", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 0, null));
		assertEquals("0.6", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 1, null));
		assertEquals("0.57", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 2, null));
		assertEquals("0.568", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 3, null));
		assertEquals("0.5679", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 4, null));
		assertEquals("0.56789", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 5, null));
		assertEquals("0.567890", spec.formatTextValueFromRawValueInternal(0.56789, unitNone, locale, Type.Number, 6, null));

		assertEquals("00:00", spec.formatTextValueFromRawValueInternal(0, unitNone, locale, Type.Time, 0, null));
		assertEquals("23:59", spec.formatTextValueFromRawValueInternal(1439, unitNone, locale, Type.Time, 0, null));

		assertEquals("Mo,00:00", spec.formatTextValueFromRawValueInternal(0, unitNone, locale, Type.WeekTime, 0, null));
		assertEquals("So,23:59", spec.formatTextValueFromRawValueInternal(10079, unitNone, locale, Type.WeekTime, 0, null));

		assertEquals("2001-01-01 00:00:00", spec.formatTextValueFromRawValueInternal(0, unitNone, locale, Type.DateTime, 0, null));
		assertEquals("2015-01-01 12:01:00", spec.formatTextValueFromRawValueInternal(441806460, unitNone, locale, Type.DateTime, 0, null));
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

		PacketFieldValue[] testPfvs1 = spec.getPacketFieldValuesForHeaders(refHeaders1);
		
		assertEquals(true, testPfvs1.length >= 51);
		assertEquals("00_0010_7E11_10_0100_000_2_0", testPfvs1 [0].getPacketFieldId());
		assertEquals(513, testPfvs1 [0].getRawValueLong().longValue());
		assertEquals(51.3, testPfvs1 [0].getRawValueDouble().doubleValue(), 0.001);
		assertEquals("51.3 °C", testPfvs1 [0].formatTextValue(null, locale));
		
		Header[] refHeaders2 = new Header[] {
			new Packet(0, 0, 0x0015, 0x7E11, 0x0100, 0, null),
		};

		PacketFieldValue[] testPfvs2 = spec.getPacketFieldValuesForHeaders(refHeaders2);
		
		assertEquals(true, testPfvs2.length == 0);
	}

}
