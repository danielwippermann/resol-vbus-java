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
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

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
			defaultSpecification = SpecificationData.createDefaultSpecification();
		}
		return defaultSpecification;
	}

	private static DateFormat createUtcDateFormat(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		return sdf;
	}
	
	/**
	 * The `Type` class helps formatting raw values into readable text.
	 * The library supports four different `Type` instances out-of-the-box:
	 * 
	 * - `Type.Number`
	 * - `Type.Time`
	 * - `Type.Weektime`
	 * - `Type.DateTime`
	 */
	public static abstract class Type {
		
		private String typeId;
		
		protected Type(String typeId) {
			this.typeId = typeId;
		}

		public String getTypeId() {
			return typeId;
		}
		
		protected abstract String formatTextValue(double rawValue, Locale locale, int precision);
		
		private static final DateFormat TIME_FORMATTER = createUtcDateFormat("HH:mm"); 
		private static final DateFormat WEEKTIME_FORMATTER = createUtcDateFormat("EEE,HH:mm"); 
		private static final DateFormat DATETIME_FORMATTER = createUtcDateFormat("yyyy-MM-dd HH:mm:ss");

		public static final Type Number = new Type("Number") {
			
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
			
		};
		
		public static final Type Time = new Type("Time") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				textValue = TIME_FORMATTER.format(new Date(Math.round(rawValue) * 60000));
				return textValue;
			}

		};
		
		public static final Type Weektime = new Type("Weektime") {
			
			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				textValue = WEEKTIME_FORMATTER.format(new Date(Math.round(rawValue + 5760) * 60000));
				return textValue;
			}

		};

		public static final Type DateTime = new Type("DateTime") {

			@Override
			protected String formatTextValue(double rawValue, Locale locale, int precision) {
				String textValue;
				textValue = DATETIME_FORMATTER.format(new Date(Math.round(rawValue + 978307200) * 1000));
				return textValue;
			}

		};
		
	}
	
	/**
	 * The `Unit` class expresses a physical unit including its optional
	 * membership in a unit family.
	 * 
	 * Several `Unit` constants are provided by the library out-of-the-box.
	 */
	public static class Unit {
		
		 public static final Unit Bars = new Unit("Bars", "Pressure", " bar");
		 public static final Unit Btus = new Unit("Btus", "Energy", " BTU");
		 public static final Unit CubicMeters = new Unit("CubicMeters", "Volume", " m³");
		 public static final Unit CubicMetersPerHour = new Unit("CubicMetersPerHour", "VolumeFlow", " m³/h");
		 public static final Unit Days = new Unit("Days", "Time", " d");
		 public static final Unit DegreesAngular = new Unit("DegreesAngular", null, " °");
		 public static final Unit DegreesCelsius = new Unit("DegreesCelsius", "Temperature", " °C");
		 public static final Unit DegreesFahrenheit = new Unit("DegreesFahrenheit", "Temperature", " °F");
		 public static final Unit DegreesKelvin = new Unit("DegreesKelvin", null, " K");
		 public static final Unit Hectopascals = new Unit("Hectopascals", null, " hPa");
		 public static final Unit Hertz = new Unit("Hertz", null, " Hz");
		 public static final Unit Hours = new Unit("Hours", "Time", " h");
		 public static final Unit KiloWattHoursPerSquareMeterPerDay = new Unit("KiloWattHoursPerSquareMeterPerDay", null, " kWh/(m²*d)");
		 public static final Unit KilogramsPerCubicMeter = new Unit("KilogramsPerCubicMeter", null, " kg/m³");
		 public static final Unit KilogramsPerHour = new Unit("KilogramsPerHour", null, " kg/h");
		 public static final Unit KilowattHours = new Unit("KilowattHours", "Energy", " kWh");
		 public static final Unit Kilowatts = new Unit("Kilowatts", null, " kW");
		 public static final Unit Liters = new Unit("Liters", "Volume", " l");
		 public static final Unit LitersPerHour = new Unit("LitersPerHour", "VolumeFlow", " l/h");
		 public static final Unit LitersPerMinute = new Unit("LitersPerMinute", "VolumeFlow", " l/min");
		 public static final Unit LitersPerSquareMeterPerDay = new Unit("LitersPerSquareMeterPerDay", null, " l/(m²*d)");
		 public static final Unit MegawattHours = new Unit("MegawattHours", "Energy", " MWh");
		 public static final Unit MetersPerSecond = new Unit("MetersPerSecond", null, " m/s");
		 public static final Unit Milliamperes = new Unit("Milliamperes", null, " mA");
		 public static final Unit Milliseconds = new Unit("Milliseconds", null, " ms");
		 public static final Unit Minutes = new Unit("Minutes", "Time", " min");
		 public static final Unit None = new Unit("None", null, "");
		 public static final Unit Ohms = new Unit("Ohms", null, " Ω");
		 public static final Unit Percent = new Unit("Percent", null, "%");
		 public static final Unit Seconds = new Unit("Seconds", "Time", " s");
		 public static final Unit SquareMeters = new Unit("SquareMeters", null, " m²");
		 public static final Unit Volts = new Unit("Volts", null, " V");
		 public static final Unit WattHours = new Unit("WattHours", "Energy", " Wh");
		 public static final Unit Watts = new Unit("Watts", null, " W");
		 public static final Unit WattsPerSquareMeter = new Unit("WattsPerSquareMeter", null, " W/m²");
		
		private String unitCode;
		
		private String unitFamily;
		
		private String unitText;
		
		public Unit(String unitCode, String unitFamily, String unitText) {
			this.unitCode = unitCode;
			this.unitFamily = unitFamily;
			this.unitText = unitText;
		}
		
		public String getUnitCode() {
			return unitCode;
		}
		
		public String getUnitFamily() {
			return unitFamily;
		}
		
		public String getUnitText() {
			return unitText;
		}
		
	}
	
	/**
	 * Instances of the `Text` class can be used for a minimalistic support
	 * for internationalization (I18N) of field names. 
	 */
	public static class Text {
		
		private String lang;
		
		private String text;
		
		public Text(String lang, String text) {
			this.lang = lang;
			this.text = text;
		}
		
		public Text(String text) {
			this("ref", text);
		}
		
		public String getLang() {
			return lang;
		}
		
		public String getText() {
			return text;
		}
		
		/**
		 * Get the text from a list of possible translations that matches the
		 * given language best.
		 * 
		 * @param texts Array of `Text` instances to search in.
		 * @param lang Language to search for.
		 * @return Text that matched best or `null` if no text was found.
		 */
		public static String getLocalizedText(Text[] texts, String lang) {
			String result = null;
			int priority = 0;
			for (Text text : texts) {
				int currentPriority;
				if ((priority < 3) && (lang.equals(text.lang))) {
					currentPriority = 3;
				} else if ((priority < 2) && ("all".equals(text.lang))) {
					currentPriority = 2;
				} else if ((priority < 1) && ("ref".equals(text.lang))) {
					currentPriority = 1;
				} else {
					currentPriority = -1;
				}
				if (priority <= currentPriority) {
					priority = currentPriority;
					result = text.text;
				}
			}
			return result;
		}

	}
	
	/**
	 * The `DeviceSpec` class combines all information about a device given
	 * its own address and the address of its optional peer device.
	 */
	public static class DeviceSpec {
		
		private int channel;
		
		private int selfAddress;
		
		private int selfMask;
		
		private int peerAddress;
		
		private int peerMask;
		
		private Text[] nameTexts;
		
		public DeviceSpec(int channel, int selfAddress, int selfMask, int peerAddress, int peerMask, Text[] nameTexts) {
			this.channel = channel;
			this.selfAddress = selfAddress;
			this.selfMask = selfMask;
			this.peerAddress = peerAddress;
			this.peerMask = peerMask;
			this.nameTexts = nameTexts;
		}
		
		public DeviceSpec(int channel, int selfAddress, int selfMask, int peerAddress, int peerMask, Text nameRefText) {
			this(channel, selfAddress, selfMask, peerAddress, peerMask, new Text[] { nameRefText });
		}
		
		public int getChannel() {
			return channel;
		}
		
		public int getSelfAddress() {
			return selfAddress;
		}
		
		public int getSelfMask() {
			return selfMask;
		}
		
		public int getPeerAddress() {
			return peerAddress;
		}
		
		public int getPeerMask() {
			return peerMask;
		}
		
		public Text[] getNameTexts() {
			return nameTexts;
		}
		
	}
	
	/**
	 * Since the raw value that belongs to a `PacketFieldSpec` can be
	 * distributed over any number of bytes within the payload data, each
	 * of the `PacketFieldPartSpec` instances contains information about
	 * one of these byte positions.
	 */
	public static class PacketFieldPartSpec {
	
		private int offset;
		
		private int bitPos;

		private int mask;
		
		private boolean isSigned;

		private long factor;
		
		public PacketFieldPartSpec(int offset, int bitPos, int mask, boolean isSigned, long factor) {
			this.offset = offset;
			this.bitPos = bitPos;
			this.mask = mask;
			this.isSigned = isSigned;
			this.factor = factor;
		}
		
		public int getOffset() {
			return offset;
		}
		
		public int getBitPos() {
			return bitPos;
		}

		public int getMask() {
			return mask;
		}
		
		public boolean isSigned() {
			return isSigned;
		}
		
		public long getFactor() {
			return factor;
		}
		
	}
	
	/**
	 * Instances of the `PacketFieldType` class combine the information of a
	 * `Type` (e.g. `Type.Number`) with a displaying precision and a physical
	 * unit.
	 */
	public static class PacketFieldType {
		
		private Type type;
		
		private int precision;
		
		private Unit unit;
		
		public PacketFieldType(Type type, int precision, Unit unit) {
			this.type = type;
			this.precision = precision;
			this.unit = unit;
		}
		
		public Type getType() {
			return type;
		}
		
		public int getPrecision() {
			return precision;
		}
		
		public Unit getUnit() {
			return unit;
		}
		
	}
	
	/**
	 * The `PacketFieldSpec` class contains all information about a single
	 * data point contained in the payload frame data of a `Packet` VBus
	 * model.
	 */
	public static class PacketFieldSpec {
	
		private String fieldId;
		
		private Text[] nameTexts;
		
		private double factor;
		
		private PacketFieldType type;
		
		private PacketFieldPartSpec[] partSpecs;
		
		public PacketFieldSpec(String fieldId, Text[] nameTexts, double factor, PacketFieldType type, PacketFieldPartSpec[] partSpecs) {
			this.fieldId = fieldId;
			this.nameTexts = nameTexts;
			this.factor = factor;
			this.type = type;
			this.partSpecs = partSpecs;
		}
		
		public PacketFieldSpec(String fieldId, Text nameRefText, double factor, PacketFieldType type, PacketFieldPartSpec[] partSpecs) {
			this(fieldId, new Text[] { nameRefText }, factor, type, partSpecs);
		}
		
		public String getFieldId() {
			return fieldId;
		}
		
		public Text[] getNameTexts() {
			return nameTexts;
		}
		
		public double getFactor() {
			return factor;
		}
		
		public PacketFieldType getType() {
			return type;
		}
		
		public PacketFieldPartSpec[] getPartSpecs() {
			return partSpecs;
		}
		
	}
	
	/**
	 * The `PacketSpec` class contains all information about the data points
	 * that are contained in a VBus `Packet` model.
	 */
	public static class PacketSpec {
		
		private int channel;
		
		private int destinationAddress;
		
		private int destinationMask;
		
		private int sourceAddress;
		
		private int sourceMask;
		
		private int command;
		
		private PacketFieldSpec[] fieldSpecs;
		
		public PacketSpec(int channel, int destinationAddress, int destinationMask, int sourceAddress, int sourceMask, int command, PacketFieldSpec[] fieldSpecs) {
			this.channel = channel;
			this.destinationAddress = destinationAddress;
			this.destinationMask = destinationMask;
			this.sourceAddress = sourceAddress;
			this.sourceMask = sourceMask;
			this.command = command;
			this.fieldSpecs = fieldSpecs;
		}
		
		public int getChannel() {
			return channel;
		}
		
		public int getDestinationAddress() {
			return destinationAddress;
		}
		
		public int getDestinationMask() {
			return destinationMask;
		}
		
		public int getSourceAddress() {
			return sourceAddress;
		}
		
		public int getSourceMask() {
			return sourceMask;
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
				packetFieldId = String.format("%s_%s", packet.getId(), packetFieldSpec.fieldId);
			}
			return packetFieldId;
		}
		
		public String getName() {
			return Text.getLocalizedText(packetFieldSpec.nameTexts, "ref");
		}

		public Double getRawValue() {
			return Specification.this.getRawValue(packetFieldSpec, packet.frameData, 0, packet.frameCount * 4);
		}
		
		public String formatTextValue(Unit unit, Locale locale) {
			return Specification.this.formatTextValueFromRawValue(packetFieldSpec, getRawValue(), unit, locale);
		}
		
	}
	
	private DeviceSpec[] deviceSpecTemplates;
	
	private PacketSpec[] packetSpecTemplates;
	
	private HashMap<String, DeviceSpec> deviceSpecById;

	private HashMap<String, PacketSpec> packetSpecById;
	
	/**
	 * Creates a `Specification` instances, initializing its members to the given values.
	 * 
	 * @param deviceSpecTemplates Array of `DeviceSpec` instances describing known device templates.
	 * @param packetSpecTemplates Array of `PacketSpec` instances describing known packet templates.
	 */
	public Specification(DeviceSpec[] deviceSpecTemplates, PacketSpec[] packetSpecTemplates) {
		this.deviceSpecTemplates = deviceSpecTemplates;
		this.packetSpecTemplates = packetSpecTemplates;
		deviceSpecById = new HashMap<String, Specification.DeviceSpec>();
		packetSpecById = new HashMap<String, Specification.PacketSpec>();
	}
	
	/**
	 * Get the array of `DeviceSpec` templates.
	 * 
	 * @return Array of `DeviceSpec` templates.
	 */
	public DeviceSpec[] getDeviceSpecTemplates() {
		return deviceSpecTemplates;
	}
	
	/**
	 * Get the array of `PacketSpec` templates.
	 * 
	 * @return Array of `PacketSpec` templates.
	 */
	public PacketSpec[] getPacketSpecTemplates() {
		return packetSpecTemplates;
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
			Text[] nameTexts = null;
			int bestMatch = 0;
			
			for (DeviceSpec template : deviceSpecTemplates) {
				if ((template.channel >= 0) && (channel != template.channel)) {
					// skip
				} else if (((selfAddress ^ template.selfAddress) & template.selfMask) != 0) {
					// skip
				} else if (((peerAddress ^ template.peerAddress) & template.peerMask) != 0) {
					// skip
				} else {
					int currentMatch = Integer.bitCount(template.selfMask) + Integer.bitCount(template.peerMask);
					if (bestMatch < currentMatch) {
						bestMatch = currentMatch;
						nameTexts = template.nameTexts;
					}
				}
			}
			
			if (nameTexts != null) {
				nameTexts = Arrays.copyOf(nameTexts, nameTexts.length);
			} else {
				nameTexts = new Text[] {
					new Text("ref", String.format("Unknown device 0x%04X", selfAddress)),
				};
			}
			
			for (int i = 0; i < nameTexts.length; i++) {
				Text text = nameTexts [i];
				if (text.getText().contains("#")) {
					nameTexts [i] = new Text(text.getLang(), text.getText().replaceAll("#", "#" + (selfAddress & 15)));
				}
			}
			
			deviceSpec = new DeviceSpec(channel, selfAddress, 0xFFFF, peerAddress, 0xFFFF, nameTexts);
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
			PacketFieldSpec[] fieldSpecs = null;
			int bestMatch = 0;
			
			for (PacketSpec template : packetSpecTemplates) {
				if ((template.channel >= 0) && (channel != template.channel)) {
					// skip
				} else if (((destinationAddress ^ template.destinationAddress) & template.destinationMask) != 0) {
					// skip
				} else if (((sourceAddress ^ template.sourceAddress) & template.sourceMask) != 0) {
					// skip
				} else {
					int currentMatch = Integer.bitCount(template.destinationMask) + Integer.bitCount(template.sourceMask);
					if (bestMatch < currentMatch) {
						bestMatch = currentMatch;
						fieldSpecs = template.fieldSpecs;
					}
				}
			}

			if (fieldSpecs == null) {
				fieldSpecs = new PacketFieldSpec[0];
			}

			packetSpec = new PacketSpec(channel, destinationAddress, 0xFFFF, sourceAddress, 0xFFFF, command, fieldSpecs);
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
			if (pfs.fieldId.equals(fieldId)) {
				result = pfs;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * Get optional raw value from `Packet` payload data.
	 * 
	 * @param pfs `PacketFieldSpec` instance of field to get value for.
	 * @param buffer Byte array containing `Packet` payload data.
	 * @param start Start index into the buffer.
	 * @param length Length of the buffer.
	 * @return The boxed raw value or `null` if the buffer was too small for a value. 
	 */
	public Double getRawValue(PacketFieldSpec pfs, byte[] buffer, int start, int length) {
		long rawValue = 0;
		int partCount = 0;
		
		for (PacketFieldPartSpec pfps : pfs.partSpecs) {
			if ((pfps.offset >= 0) && (pfps.offset < length)) {
				long partRawValue = buffer [start + pfps.offset];
				if (!pfps.isSigned) {
					partRawValue &= 255;
				}
				rawValue += partRawValue * pfps.factor;
				partCount++;
			}
		}
		
		return (partCount > 0) ? new Double(rawValue * pfs.factor) : null;
	}

	protected String formatTextValueFromRawValueInternal(double rawValue, Unit unit, Locale locale, Type rootType, int precision, Unit defaultUnit) {
		String unitText;
		if (unit != null) {
			unitText = unit.unitText;
		} else if (defaultUnit != null) {
			unitText = defaultUnit.unitText;
		} else {
			unitText = "";
		}
		
		String textValue = rootType.formatTextValue(rawValue, locale, precision);
		
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
		String textValue = formatTextValueFromRawValueInternal(rawValue, unit, locale, pfs.type.type, pfs.type.precision, pfs.type.unit);
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
	
}
