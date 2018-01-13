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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

import de.resol.vbus.SpecificationFile.Enum;
import de.resol.vbus.SpecificationFile.EnumVariant;
import de.resol.vbus.SpecificationFile.Language;
import de.resol.vbus.SpecificationFile.PacketTemplateFieldPart;
import de.resol.vbus.SpecificationFile.Type;
import de.resol.vbus.SpecificationFile.Unit;

/**
 * The `Specification` class helps with decoding the payload frame data of
 * known VBus protocol version 1.0 packets. The structure of the payload
 * depends on the destination and source addresses as well as the
 * command in the header part of the `Packet`.
 * 
 * Although the `Specification` class offers several nested classes and
 * helper functions to decode the payload, it does not know any specific
 * payload structures by itself. The application developer has two
 * possibilities:
 * 
 * - Use the auto-generated payload structure information in the
 *   `SpecificationData` class by calling
 *   `Specification.getDefaultSpecification`, or
 * - Create its own set of `DeviceSpec` and `PacketSpec` array and
 *   provide them to the constructor of the `Specification` class.
 */
public class Specification {

	private static Specification defaultSpecification = null;
	
	/**
	 * Get the default specification data bundled with the library.
	 * 
	 * @return `Specification` instance containing all known device and
	 * packet specifications.
	 */
	public static synchronized Specification getDefaultSpecification() {
		if (defaultSpecification == null) {
			SpecificationFile specFile = SpecificationFile.getDefaultSpecificationFile();
			defaultSpecification = new Specification(specFile);
		}
		return defaultSpecification;
	}

	private static DateFormat createUtcDateFormat(String format, Locale locale) {
		SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		return sdf;
	}
	
	/**
	 * The `Formatter` class helps formatting raw values into readable text.
	 * The library supports four different `Formatter` instances out-of-the-box:
	 * 
	 * - `Formatter.Number`
	 * - `Formatter.Time`
	 * - `Formatter.Weektime`
	 * - `Formatter.DateTime`
	 */
	public static abstract class Formatter {
		
		private String formatterId;
		
		protected Formatter(String formatterId) {
			this.formatterId = formatterId;
		}

		public String getFormatterId() {
			return formatterId;
		}
		
		protected abstract String formatTextValue(double rawValue, Locale locale, int precision);
		
		protected abstract Date convertToDate(double rawValue);
		
		private static final String TIME_FORMAT_STRING = "HH:mm"; 
		private static final String WEEKTIME_FORMAT_STRING = "EEE,HH:mm"; 
		private static final String DATETIME_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss";

		public static final Formatter Number = new Formatter("Number") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				if (precision == 0) {
					textValue = String.format(locale, "%.0f", rawValue);
				} else if (precision == 1) {
					textValue = String.format(locale, "%.1f", rawValue);
				} else if (precision == 2) {
					textValue = String.format(locale, "%.2f", rawValue);
				} else if (precision == 3) {
					textValue = String.format(locale, "%.3f", rawValue);
				} else if (precision == 4) {
					textValue = String.format(locale, "%.4f", rawValue);
				} else {
					String format = String.format(locale, "%%.%df", precision);
					textValue = String.format(locale, format, rawValue);
				}
				return textValue;
			}
			
			@Override
			protected Date convertToDate(double rawValue) {
				return null;
			}

		};
		
		public static final Formatter Time = new Formatter("Time") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				textValue = createUtcDateFormat(TIME_FORMAT_STRING, locale).format(new Date(Math.round(rawValue) * 60000));
				return textValue;
			}

			@Override
			protected Date convertToDate(double rawValue) {
				return new Date(Math.round(rawValue + 16305120) * 60000);
			}

		};
		
		public static final Formatter WeekTime = new Formatter("WeekTime") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				textValue = createUtcDateFormat(WEEKTIME_FORMAT_STRING, locale).format(new Date(Math.round(rawValue + 5760) * 60000));
				return textValue;
			}

			@Override
			protected Date convertToDate(double rawValue) {
				return new Date(Math.round(rawValue + 16305120) * 60000);
			}

		};

		public static final Formatter DateTime = new Formatter("DateTime") {

			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				textValue = createUtcDateFormat(DATETIME_FORMAT_STRING, locale).format(new Date(Math.round(rawValue + 978307200) * 1000));
				return textValue;
			}
			
			@Override
			protected Date convertToDate(double rawValue) {
				return new Date(Math.round(rawValue + 978307200) * 1000);
			}

		};
		
		public static Formatter getFormatterForType(Type type) {
			Formatter formatter;
			switch (type) {
			case Number:
				formatter = Formatter.Number;
				break;
			case Time:
				formatter = Formatter.Time;
				break;
			case WeekTime:
				formatter = Formatter.WeekTime;
				break;
			case DateTime:
				formatter = Formatter.DateTime;
				break;
			default:
				formatter = Formatter.Number;
				break;
			}
			return formatter;
		}
		
	}
	
	/**
	 * The `DeviceSpec` class combines all information about a device given
	 * its own address and the address of its optional peer device.
	 */
	public static class DeviceSpec {
		
		private int channel;
		
		private int selfAddress;
		
		private int peerAddress;

		private String nameEn;
		
		private String nameDe;
		
		private String nameFr;

		public DeviceSpec(int channel, int selfAddress, int peerAddress, SpecificationFile.DeviceTemplate deviceTemplate) {
			this.channel = channel;
			this.selfAddress = selfAddress;
			this.peerAddress = peerAddress;
			
			if (deviceTemplate != null) {
				nameEn = deviceTemplate.getNameLocalizedText(Language.En);
				nameDe = deviceTemplate.getNameLocalizedText(Language.De);
				nameFr = deviceTemplate.getNameLocalizedText(Language.Fr);
			} else {
				nameEn = String.format("Unknown Device (0x%04X)", selfAddress);
				nameDe = String.format("Unbekanntes Gerät (0x%04X)", selfAddress);
				nameFr = nameEn;  // FIXME(daniel): localize this
			}
		}
		
		public int getChannel() {
			return channel;
		}
		
		public int getSelfAddress() {
			return selfAddress;
		}
		
		public int getPeerAddress() {
			return peerAddress;
		}

		public String getName(Language language) {
			String name;
			switch (language) {
			case En:
				name = nameEn;
				break;
			case De:
				name = nameDe;
				break;
			case Fr:
				name = nameFr;
				break;
			default:
				name = nameEn;
				break;
			}
			return name;
		}

		public String getName() {
			return nameEn;
		}

	}

	/**
	 * The `PacketFieldSpec` class contains all information about a single
	 * data point contained in the payload frame data of a `Packet` VBus
	 * model.
	 */
	public static class PacketFieldSpec {
	
		private SpecificationFile.PacketTemplateField packetTemplateField;
		
		protected PacketFieldSpec(SpecificationFile.PacketTemplateField packetTemplateField) {
			this.packetTemplateField = packetTemplateField;
		}

//		public SpecificationFile.PacketTemplateField getPacketTemplateField() {
//			return packetTemplateField;
//		}
		
		public String getFieldId() {
			return packetTemplateField.getIdText();
		}

		public String getName(Language language) {
			return packetTemplateField.getNameLocalizedText(language);
		}

		public String getName() {
			return getName(Language.En);
		}

		public Unit getUnit() {
			return packetTemplateField.getUnit();
		}
		
		public int getPrecision() {
			return packetTemplateField.getPrecision();
		}
		
		public double getFactor() {
			return getPowerOfTen(- getPrecision());
		}

		public Type getType() {
			return packetTemplateField.getType();
		}

		public PacketTemplateFieldPart[] getParts() {
			return packetTemplateField.getParts();
		}
		
		public Enum getEnum() {
			return packetTemplateField.getEnum();
		}
		
		public EnumVariant getEnumVariantForRawValue(long rawValue) {
			Enum enum_ = packetTemplateField.getEnum();
			EnumVariant enumVariant;
			if (enum_ != null) {
				enumVariant = enum_.getEnumVariantForValue(rawValue);
			} else {
				enumVariant = null;
			}
			return enumVariant;
		}

	}

	/**
	 * The `PacketSpec` class contains all information about the data points
	 * that are contained in a VBus `Packet` model.
	 */
	public static class PacketSpec {
		
		private int channel;
		
		private int destinationAddress;
		
		private int sourceAddress;
		
		private int command;

		private PacketFieldSpec[] fieldSpecs;
		
		public PacketSpec(int channel, int destinationAddress, int sourceAddress, int command, SpecificationFile.PacketTemplate packetTemplate) {
			this.channel = channel;
			this.destinationAddress = destinationAddress;
			this.sourceAddress = sourceAddress;
			this.command = command;
			
			PacketFieldSpec[] fieldSpecs;
			if (packetTemplate != null) {
				SpecificationFile.PacketTemplateField[] packetTemplateFields = packetTemplate.getFields();
				fieldSpecs = new PacketFieldSpec [packetTemplateFields.length];
				for (int index = 0; index < packetTemplateFields.length; index++) {
					fieldSpecs [index] = new PacketFieldSpec(packetTemplateFields [index]);
				}
			} else {
				fieldSpecs = new PacketFieldSpec [0];
			}
			this.fieldSpecs = fieldSpecs;
		}
		
		public int getChannel() {
			return channel;
		}
		
		public int getDestinationAddress() {
			return destinationAddress;
		}
		
		public int getSourceAddress() {
			return sourceAddress;
		}
		
		public int getCommand() {
			return command;
		}

		public PacketFieldSpec[] getFieldSpecs() {
			return fieldSpecs;
		}

	}

	/**
	 * Instances of the `PacketFieldValue` class join information about the
	 * VBus `Packet` model instance described by a `PacketSpec` instance
	 * that in turn contains a data point described by a `PacketFieldSpec`.
	 * 
	 * The `PacketFieldValue` instance can be used to query both the raw
	 * value and its formatted textual representation and name.
	 */
	public class PacketFieldValue {
		
		private Packet packet;
		
		private PacketSpec packetSpec;
		
		private PacketFieldSpec packetFieldSpec;
		
		private String packetFieldId;
		
		public PacketFieldValue(Packet packet, PacketSpec packetSpec, PacketFieldSpec packetFieldSpec) {
			this.packet = packet;
			this.packetSpec = packetSpec;
			this.packetFieldSpec = packetFieldSpec;
		}
		
		public Packet getPacket() {
			return packet;
		}
		
		public PacketSpec getPacketSpec() {
			return packetSpec;
		}

		public PacketFieldSpec getPacketFieldSpec() {
			return packetFieldSpec;
		}
		
		public String getPacketFieldId() {
			if (packetFieldId == null) {
				packetFieldId = String.format("%s_%s", packet.getId(), packetFieldSpec.getFieldId());
			}
			return packetFieldId;
		}
		
		public String getName(Language language) {
			return packetFieldSpec.getName(language);
		}

		public String getName() {
			return getName(Language.En);
		}

		public Long getRawValueLong() {
			return Specification.this.getRawValueLong(packetFieldSpec, packet.frameData, 0, packet.frameCount * 4);
		}
		
		public Double getRawValueDouble() {
			return Specification.this.getRawValueDouble(packetFieldSpec, packet.frameData, 0, packet.frameCount * 4);
		}
		
		/**
		 * If the field repesents a date value, this method returns the corresponding Java `Date` instance.
		 * If the field represents a time value, this method returns the corresponding Java `Date` instance around the date of 2001-01-01.
		 * If the field does not represent a date/time-like value, this method returns `null`.
		 * 
		 * @return A `Date` instance representing the (possibly partial) date or `null` if the field is not a date/time-like value.
		 */
		public Date getRawValueDate() {
			Double rawValue = getRawValueDouble();
			Date date;
			if (rawValue != null) {
				Formatter formatter = Formatter.getFormatterForType(packetFieldSpec.getType());
				date = formatter.convertToDate(rawValue);
			} else {
				date = null;
			}
			return date;
		}
		
		public String formatTextValue(Unit unit, Locale locale) {
			return Specification.this.formatTextValueFromRawValue(packetFieldSpec, getRawValueDouble(), unit, locale);
		}
		
		public EnumVariant getEnumVariant() {
			Long rawValue = getRawValueLong();
			EnumVariant enumVariant;
			if (rawValue != null) {
				enumVariant = packetFieldSpec.getEnumVariantForRawValue(rawValue.longValue());
			} else {
				enumVariant = null;
			}
			return enumVariant;
		}
		
		public String formatText(Unit unit, Locale locale, Language language) {
			EnumVariant enumVariant = getEnumVariant();
			String result;
			if (enumVariant != null) {
				result = enumVariant.getText(language);
			} else {
				result = formatTextValue(unit, locale);
			}
			return result;
		}
		
		public String formatText() {
			return formatText(null, null, Language.En);
		}
		
		public boolean isBooleanLikeEnum() {
			PacketFieldSpec pfs = this.getPacketFieldSpec();
			PacketTemplateFieldPart[] parts = pfs.getParts();
			Enum enum_ = pfs.getEnum(); 
			boolean isBitField = ((parts.length == 1) && (Integer.bitCount(parts [0].getMask()) == 1));
			boolean isTwoVariantEnum = (enum_ != null) && (enum_.getEnumVariants().length == 2);
			return (isBitField && isTwoVariantEnum);			
		}
		
	}
	
	private SpecificationFile specificationFile;

	private HashMap<String, Unit> unitByCode;
	
	private HashMap<String, DeviceSpec> deviceSpecById;

	private HashMap<String, PacketSpec> packetSpecById;

	/**
	 * Creates a `Specification` instances, initializing its members to the given values.
	 * 
	 * @param specificationFile The `SpecificationFile` instance to use.
	 */
	public Specification(SpecificationFile specFile) {
		this.specificationFile = specFile;
		unitByCode = new HashMap<String, Unit>();
		deviceSpecById = new HashMap<String, Specification.DeviceSpec>();
		packetSpecById = new HashMap<String, Specification.PacketSpec>();
		
		for (Unit unit : specFile.getUnits()) {
			unitByCode.put(unit.getUnitCodeText(), unit);
		}
	}
	
	public Unit getUnitByCode(String unitCode) {
		return unitByCode.get(unitCode);
	}
	
	/**
	 * Get a `DeviceSpec` instance for the given VBus channel and addresses.
	 * 
	 * @param channel VBus channel.
	 * @param selfAddress VBus address of the device itself.
	 * @param peerAddress VBus address of its peer device.
	 * @return `DeviceSpec` instance.
	 */
	public DeviceSpec getDeviceSpec(int channel, int selfAddress, int peerAddress) {
		String id = String.format("%02X_%04X_%04X", channel, selfAddress, peerAddress);
		DeviceSpec deviceSpec;
		if (!deviceSpecById.containsKey(id)) {
			SpecificationFile.DeviceTemplate deviceTemplate = specificationFile.findDeviceTemplate(selfAddress, peerAddress);
			
			deviceSpec = new DeviceSpec(channel, selfAddress, peerAddress, deviceTemplate);
			deviceSpecById.put(id, deviceSpec);
		} else {
			deviceSpec = deviceSpecById.get(id);
		}
		return deviceSpec;
	}
	
	/**
	 * Get a `DeviceSpec` instance for the source device of a given `Header`.
	 * 
	 * @param header `Header` instance to get source `DeviceSpec` for.
	 * @return `DeviceSpec`instance.
	 */
	public DeviceSpec getSourceDeviceSpec(Header header) {
		return getDeviceSpec(header.getChannel(), header.getSourceAddress(), header.getDestinationAddress());
	}
	
	/**
	 * Get a `DeviceSpec` instance for the destination device of a given `Header`.
	 * 
	 * @param header `Header` instance to get destination `DeviceSpec` for.
	 * @return `DeviceSpec`instance.
	 */
	public DeviceSpec getDestinationDeviceSpec(Header header) {
		return getDeviceSpec(header.getChannel(), header.getDestinationAddress(), header.getSourceAddress());
	}

	/**
	 * Get a `PacketSpec` instance for the given information.
	 * 
	 * @param channel VBus channel.
	 * @param destinationAddress VBus destination address.
	 * @param sourceAddress VBus source address.
	 * @param command VBus command.
	 * @return `PacketSpec` instance or `null` if packet structure is unknown.
	 */
	public PacketSpec getPacketSpec(int channel, int destinationAddress, int sourceAddress, int command) {
		String id = String.format("%02X_%04X_%04X_10_%04X", channel, destinationAddress, sourceAddress, command);
		PacketSpec packetSpec;
		if (!packetSpecById.containsKey(id)) {
			SpecificationFile.PacketTemplate packetTemplate = specificationFile.findPacketTemplate(destinationAddress, sourceAddress, command);

			packetSpec = new PacketSpec(channel, destinationAddress, sourceAddress, command, packetTemplate);
			packetSpecById.put(id,  packetSpec);
		} else {
			packetSpec = packetSpecById.get(id);
		}
		return packetSpec;
	}
	
	/**
	 * Get a `PacketSpec` instance for the given `Packet`.
	 * 
	 * @param packet `Packet` instance to get `PacketSpec` for.
	 * @return `PacketSpec`instance or `null` if packet structure is unknown.
	 */
	public PacketSpec getPacketSpec(Packet packet) {
		return getPacketSpec(packet.getChannel(), packet.getDestinationAddress(), packet.getSourceAddress(), packet.getCommand());
	}
	
	/**
	 * Get a `PacketFieldSpec` instance for a given set of `PacketSpec` and field ID.
	 * 
	 * @param packetSpec `PacketSpec` instance to search `PacketFieldSpec` in.
	 * @param fieldId Field ID to search.
	 * @return `PacketFieldSpec` instance or `null` if field ID does not exist.
	 */
	public PacketFieldSpec getPacketFieldSpec(PacketSpec packetSpec, String fieldId) {
		PacketFieldSpec result = null;
		
		for (PacketFieldSpec pfs : packetSpec.fieldSpecs) {
			if (pfs.getFieldId().equals(fieldId)) {
				result = pfs;
				break;
			}
		}
		
		return result;
	}

	/**
	 * Get the list of known units.
	 *
	 * @return array of known Units.
	 */
	public Unit[] getUnits() {
		return specificationFile.getUnits();
	}

	/**
	 * Get optional raw value from `Packet` payload data as a Long.
	 * 
	 * @param pfs `PacketFieldSpec` instance of field to get value for.
	 * @param buffer Byte array containing `Packet` payload data.
	 * @param start Start index into the buffer.
	 * @param length Length of the buffer.
	 * @return The boxed raw value or `null` if the buffer was too small for a value. 
	 */
	public Long getRawValueLong(PacketFieldSpec pfs, byte[] buffer, int start, int length) {
		long rawValue = 0;
		int partCount = 0;
		
		for (PacketTemplateFieldPart ptfp : pfs.getParts()) {
			int offset = ptfp.getOffset();
			if ((offset >= 0) && (offset < length)) {
				long partRawValue = buffer [start + offset];
				if (!ptfp.isSigned()) {
					partRawValue &= 255;
				}
				if (ptfp.getMask() != 0xFF) {
					partRawValue &= ptfp.getMask();
				}
				if (ptfp.getBitPos() > 0) {
					partRawValue >>= ptfp.getBitPos();
				}
				rawValue += partRawValue * ptfp.getFactor();
				partCount++;
			}
		}
		
		return (partCount > 0) ? new Long(rawValue) : null;
	}

	/**
	 * Get optional raw value from `Packet` payload data as a Double.
	 * 
	 * @param pfs `PacketFieldSpec` instance of field to get value for.
	 * @param buffer Byte array containing `Packet` payload data.
	 * @param start Start index into the buffer.
	 * @param length Length of the buffer.
	 * @return The boxed raw value or `null` if the buffer was too small for a value. 
	 */
	public Double getRawValueDouble(PacketFieldSpec pfs, byte[] buffer, int start, int length) {
		Long rawValueLong = getRawValueLong(pfs, buffer, start, length);
		Double rawValueDouble;
		if (rawValueLong != null) {
			rawValueDouble = new Double(rawValueLong.doubleValue() * pfs.getFactor());
		} else {
			rawValueDouble = null;
		}
		return rawValueDouble;
	}

	protected String formatTextValueFromRawValueInternal(double rawValue, Unit unit, Locale locale, Type rootType, int precision, Unit defaultUnit) {
		String unitText;
		if (unit != null) {
			unitText = unit.getUnitTextText();
		} else if (defaultUnit != null) {
			unitText = defaultUnit.getUnitTextText();
		} else {
			unitText = "";
		}
		
		Formatter formatter = Formatter.getFormatterForType(rootType);

		String textValue = formatter.formatTextValue(rawValue, locale, precision);
		
		return textValue + unitText;
	}
	
	/**
	 * Format a raw value into its textual representation.
	 * 
	 * @param pfs `PacketFieldSpec` instance describing the field.
	 * @param rawValue Raw value.
	 * @param unit `Unit` instance to append unit text for.
	 * @param locale Locale to use for number formatting.
	 * @return Textual representation of the raw value.
	 */
	public String formatTextValueFromRawValue(PacketFieldSpec pfs, double rawValue, Unit unit, Locale locale) {
		String textValue = formatTextValueFromRawValueInternal(rawValue, unit, locale, pfs.getType(), pfs.getPrecision(), pfs.getUnit());
		return textValue;
	}
	
	/**
	 * Format an optional raw value into its textual representation.
	 * 
	 * @param pfs `PacketFieldSpec` instance describing the field.
	 * @param rawValue Optional raw value.
	 * @param unit `Unit` instance to append unit text for.
	 * @param locale Locale to use for number formatting.
	 * @return Textual representation of the raw value or `null` if `rawValue` was `null`.
	 */
	public String formatTextValueFromRawValue(PacketFieldSpec pfs, Double rawValue, Unit unit, Locale locale) {
		String textValue;
		if (rawValue != null) {
			textValue = formatTextValueFromRawValue(pfs, rawValue.doubleValue(), unit, locale);
		} else {
			textValue = "";
		}
		return textValue;
	}

	/**
	 * Get an array of `PacketFieldValue` instances known for the given list
	 * of `Header` instances.
	 * 
	 * Only `Packet` instances within the `headers` array are regarded.
	 * 
	 * @param headers Array of `Header` instances to collect `PacketFieldValue`
	 * instances for.
	 * @return Array of `PacketFieldValue` instances collected from the
	 * `headers`.
	 */
	public PacketFieldValue[] getPacketFieldValuesForHeaders(Header[] headers) {
		ArrayList<PacketFieldValue> pfvList = new ArrayList<PacketFieldValue>();
		
		for (Header header : headers) {
			if (header instanceof Packet) {
				Packet packet = (Packet) header;

				PacketSpec packetSpec = getPacketSpec(packet);
				if (packetSpec != null) {
					for (PacketFieldSpec pfs : packetSpec.fieldSpecs) {
						PacketFieldValue pfv = new PacketFieldValue(packet, packetSpec, pfs);
						pfvList.add(pfv);
					}
				}
			}
		}
		
		return pfvList.toArray(new PacketFieldValue [pfvList.size()]);
	}
	
	public static double getPowerOfTen(int exponent) {
		double result;
		switch (exponent) {
		case -9: result = 0.000000001; break;
		case -8: result = 0.00000001; break;
		case -7: result = 0.0000001; break;
		case -6: result = 0.000001; break;
		case -5: result = 0.00001; break;
		case -4: result = 0.0001; break;
		case -3: result = 0.001; break;
		case -2: result = 0.01; break;
		case -1: result = 0.1; break;
		case  0: result = 1; break;
		case  1: result = 10; break;
		case  2: result = 100; break;
		case  3: result = 1000; break;
		case  4: result = 10000; break;
		case  5: result = 100000; break;
		case  6: result = 1000000; break;
		case  7: result = 10000000; break;
		case  8: result = 100000000; break;
		case  9: result = 1000000000; break;
		default: result = Math.pow(10, exponent); break;
		}
		return result;
	}
	
}
