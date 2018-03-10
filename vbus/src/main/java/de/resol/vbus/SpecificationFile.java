/**
 * Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.
 * Copyright (C) 2016-2017, Daniel Wippermann.
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

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class SpecificationFile {

	static SpecificationFile defaultSpecificationFile = null;
	
	public static synchronized SpecificationFile getDefaultSpecificationFile() {
		if (defaultSpecificationFile == null) {
			InputStream is = SpecificationFile.class.getResourceAsStream("vbus_specification.vsf");
			defaultSpecificationFile = SpecificationFile.fromStream(is);
		}
		return defaultSpecificationFile;
	}
	
	public static enum Error {
	    /// The data is too small for a valid FILEHEADER.
	    InvalidFileHeader,

	    /// The data length does not match the "TotalLength" field of the FILEHEADER.
	    InvalidFileHeaderTotalLength,
	    /// The data does not match the "ChecksumA" field of the FILEHEADER.
	    InvalidFileHeaderChecksumA,
	    /// The data does not match the "ChecksumB" field of the FILEHEADER.
	    InvalidFileHeaderChecksumB,
	    /// The "DataVersion" field of the FILEHEADER is not supported.
	    InvalidFileHeaderDataVersion,
	    /// The "SpecificationOffset" of the FILEHEADER is out-of-bounds.
	    InvalidFileHeaderSpecificationOffset,

	    /// The "Text{Count,TableOffset}" fields of the SPECIFICATION block are out-of-bounds.
	    InvalidSpecificationTextTable,
	    /// The "LocalizedText{Count,TableOffset}" fields of the SPECIFICATION block are out-of-bounds.
	    InvalidSpecificationLocalizedTextTable,
	    /// The "Unit{Count,TableOffset}" fields of the SPECIFICATION block are out-of-bounds.
	    InvalidSpecificationUnitTable,
	    /// The "DeviceTemplate{Count,TableOffset}" fields of the SPECIFICATION block are out-of-bounds.
	    InvalidSpecificationDeviceTemplateTable,
	    /// The "PacketTemplate{Count,TableOffset}" fields of the SPECIFICATION block are out-of-bounds.
	    InvalidSpecificationPacketTemplateTable,

	    /// The "StringOffset" field of a TEXT block is out-of-bounds.
	    InvalidTextStringOffset,
	    /// The contents of a TEXT is out-of-bounds.
	    InvalidTextContent,

	    /// The "TextIndexEN" field of a LOCALIZEDTEXT block is out-of-bounds.
	    InvalidLocalizedTextTextIndexEn,
	    /// The "TextIndexDE" field of a LOCALIZEDTEXT block is out-of-bounds.
	    InvalidLocalizedTextTextIndexDe,
	    /// The "TextIndexFR" field of a LOCALIZEDTEXT block is out-of-bounds.
	    InvalidLocalizedTextTextIndexFr,

	    /// The "UnitFamilyId" field of a UNIT block is out-of-bounds.
	    InvalidUnitUnitFamilyId,
	    /// The "UnitCodeTextIndex" field of a UNIT block is out-of-bounds.
	    InvalidUnitUnitCodeTextIndex,
	    /// The "UnitTextTextIndex" field of a UNIT block is out-of-bounds.
	    InvalidUnitUnitTextTextIndex,

	    /// The "NameLocalizedTextIndex" field of a DEVICETEMPLATE block is out-of-bounds.
	    InvalidDeviceTemplateNameLocalizedTextIndex,

	    /// The "Field{Count,TableOffset}" fields of a PACKETTEMPLATE block are out-of-bounds.
	    InvalidPacketTemplateFieldTable,

	    /// The "IdTextIndex" of a PACKETTEMPLATEFIELD block is out-of-bounds.
	    InvalidPacketTemplateFieldIdTextIndex,
	    /// The "NameLocalizedTextIndex" of a PACKETTEMPLATEFIELD block is out-of-bounds.
	    InvalidPacketTemplateFieldNameLocalizedTextIndex,
	    /// The "UnitId" of a PACKETTEMPLATEFIELD block is out-of-bounds.
	    InvalidPacketTemplateFieldUnitId,
	    /// The "TypeId" of a PACKETTEMPLATEFIELD block is out-of-bounds.
	    InvalidPacketTemplateFieldTypeId,
	    /// The "Part{Count,TableOffset}" of a PACKETTEMPLATEFIELD is out-of-bounds.
	    InvalidPacketTemplateFieldPartTable,
	}

	public enum Language {
		En,
		De,
		Fr,
	}
	
	public class LocalizedText {
		int textIndexEn;
		int textIndexDe;
		int textIndexFr;
	}
	
	public enum UnitFamily {
		None,
		Temperature,
		Energy,
		VolumeFlow,
		Pressure,
		Volume,
		Time,
		Power,
	}
	
	public class Unit {
		int unitId;
		int unitFamilyId;
		int unitCodeTextIndex;
		int unitTextTextIndex;
		
		public int getUnitId() {
			return unitId;
		}
		
		public UnitFamily getUnitFamily() {
			return getUnitFamilyById(unitFamilyId);
		}
		
		public String getUnitCodeText() {
			return getTextByIndex(unitCodeTextIndex);
		}
		
		public String getUnitTextText() {
			return getTextByIndex(unitTextTextIndex);
		}

	}
	
	public class DeviceTemplate {
		int selfAddress;
		int selfMask;
		int peerAddress;
		int peerMask;
		int nameLocalizedTextIndex;
		
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
		
		public String getNameLocalizedText(Language language) {
			return getLocalizedTextByIndex(nameLocalizedTextIndex, language);
		}
		
	}
	
	public class EnumVariant {
		
		private int enumVariantId;
		
		private String enumVariantCode;

		private String textEn;
		
		private String textDe;
		
		private String textFr;
		
		public EnumVariant(int enumVariantId, String enumVariantCode, String textEn, String textDe, String textFr) {
			this.enumVariantId = enumVariantId;
			this.enumVariantCode = enumVariantCode;
			this.textEn = textEn;
			this.textDe = textDe;
			this.textFr = textFr;
		}
		
		public int getEnumVariantId() {
			return enumVariantId;
		}
		
		public String getEnumVariantCode() {
			return enumVariantCode;
		}
		
		public String getText(Language language) {
			String result;
			switch (language) {
			case En: result = textEn; break;
			case De: result = textDe; break;
			case Fr: result = textFr; break;
			default: result = textEn; break;
			}
			return result;
		}
		
		public String getText() {
			return textEn;
		}

	}
	
	public class Enum {
		
		private int enumId;
		
		private long[] values;
		
		private EnumVariant[] enumVariants;
		
		/**
		 * Creates a new Enum using the provided information.
		 * 
		 * @param enumId A numeric identifier. The identifier is NOT guaranteed to stay the same between VSF versions.
		 * @param values A sorted list of values matching the entries in the `enumVariants` array.
		 * @param enumVariants A list of EnumVariants matching the entries in the `values` array.
		 */
		protected Enum(int enumId, long[] values, EnumVariant[] enumVariants) {
			this.enumId = enumId;
			this.values = values;
			this.enumVariants = enumVariants;
		}
		
		/**
		 * Return the numeric identifier of the Enum.
		 * 
		 * @return The numeric identifier. The identifier is NOT guaranteed to stay the same between VSF versions.
		 */
		public int getEnumId() {
			return enumId;
		}
		
		public long[] getValues() {
			return values;
		}
		
		public EnumVariant[] getEnumVariants() {
			return enumVariants;
		}

		/**
		 * Return the EnumVariant matching the provided `value`.
		 * 
		 * @param value The value to get the `EnumVariant` for.
		 * @return The `EnumVariant` instance or `null` if the provided `value` is not associated with a enum variant.
		 */
		public EnumVariant getEnumVariantForValue(long value) {
			int index = Arrays.binarySearch(values, value);
			EnumVariant enumVariant;
			if (index >= 0) {
				enumVariant = enumVariants [index];
			} else {
				enumVariant = null;
			}
			return enumVariant;
		}

	}

	public class PacketTemplate {
		int destinationAddress;
		int destinationMask;
		int sourceAddress;
		int sourceMask;
		int command;
		ArrayList<PacketTemplateField> fields;
		
		public PacketTemplate() {
			fields = new ArrayList<PacketTemplateField>();
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
		
		public PacketTemplateField[] getFields() {
			return (PacketTemplateField[]) fields.toArray(new PacketTemplateField[fields.size()]);
		}

	}
	
	public enum Type {
		Number,
		Time,
		WeekTime,
		DateTime,
	}
	
	public class PacketTemplateField {
		int idTextIndex;
		int nameLocalizedTextIndex;
		int unitId;
		int precision;
		int typeId;
		ArrayList<PacketTemplateFieldPart> parts;
		int enumId;
		
		public PacketTemplateField() {
			parts = new ArrayList<PacketTemplateFieldPart>();
		}
		
		public String getIdText() {
			return getTextByIndex(idTextIndex);
		}
		
		public String getNameLocalizedText(Language language) {
			return getLocalizedTextByIndex(nameLocalizedTextIndex, language);
		}
		
		public Unit getUnit() {
			return getUnitById(unitId);
		}
		
		public int getPrecision() {
			return precision;
		}

		public Type getType() {
			return getTypeById(typeId);
		}

		public PacketTemplateFieldPart[] getParts() {
			return (PacketTemplateFieldPart[]) parts.toArray(new PacketTemplateFieldPart[parts.size()]);
		}
		
		public Enum getEnum() {
			return getEnumById(enumId);
		}

	}
	
	public class PacketTemplateFieldPart {

		int offset;
		int bitPos;
		int mask;
		boolean isSigned;
		long factor;
		
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
	
	static class ByteArrayView {
		
		byte[] bytes;
		int offset;
		int length;
		
		public ByteArrayView(byte[] bytes) {
			this(bytes, 0, bytes.length);
		}

		public ByteArrayView(byte[] bytes, int offset, int length) {
			this.bytes = bytes;
			this.offset = offset;
			this.length = length;
		}

		public boolean checkOffset(int offset, int length, int count) {
			int endOffset = offset + length * count;
			return (endOffset <= this.length);
		}
		
		public ByteArrayView sliceEntry(int offset, int length) {
			return new ByteArrayView(this.bytes, this.offset + offset, length);
		}

		public ByteArrayView sliceTableEntry(int offset, int length, int index) {
			int tableEntryOffset = offset + (index * length);
			return sliceEntry(tableEntryOffset, length);
		}

		public int readI8(int offset) {
			if (!checkOffset(offset, 1, 1)) {
				throw new IndexOutOfBoundsException();
			}

			int result = bytes [this.offset + offset];
			return result;
		}
		
		public int readU8(int offset) {
			int result = readI8(offset) & 0xFF;
			return result;
		}
		
		public int readI16(int offset) {
			int result = 0;
			result += readU8(offset);
			result += (readI8(offset + 1) << 8);
			return result;
		}

		public int readU16(int offset) {
			int result = 0;
			result += readU8(offset);
			result += (readU8(offset + 1) << 8);
			return result;
		}
		
		public int readI32(int offset) {
			int result = 0;
			result += readU8(offset);
			result += (readU8(offset + 1) << 8);
			result += (readU8(offset + 2) << 16);
			result += (readI8(offset + 3) << 24);
			return result;
		}

		public long readU32(int offset) {
			long result = 0;
			result += (long) readU8(offset);
			result += ((long) readU8(offset + 1) << 8);
			result += ((long) readU8(offset + 2) << 16);
			result += ((long) readI8(offset + 3) << 24);
			return result;
		}

		public long readI64(int offset) {
			long result = 0;
			result += (long) readU8(offset);
			result += ((long) readU8(offset + 1) << 8);
			result += ((long) readU8(offset + 2) << 16);
			result += ((long) readU8(offset + 3) << 24);
			result += ((long) readU8(offset + 4) << 32);
			result += ((long) readU8(offset + 5) << 40);
			result += ((long) readU8(offset + 6) << 48);
			result += ((long) readI8(offset + 7) << 56);
			return result;
		}

		final int[] crc16Table = new int[] {
			0x0000, 0x1189, 0x2312, 0x329B, 0x4624, 0x57AD, 0x6536, 0x74BF,
			0x8C48, 0x9DC1, 0xAF5A, 0xBED3, 0xCA6C, 0xDBE5, 0xE97E, 0xF8F7,
			0x1081, 0x0108, 0x3393, 0x221A, 0x56A5, 0x472C, 0x75B7, 0x643E,
			0x9CC9, 0x8D40, 0xBFDB, 0xAE52, 0xDAED, 0xCB64, 0xF9FF, 0xE876,
			0x2102, 0x308B, 0x0210, 0x1399, 0x6726, 0x76AF, 0x4434, 0x55BD,
			0xAD4A, 0xBCC3, 0x8E58, 0x9FD1, 0xEB6E, 0xFAE7, 0xC87C, 0xD9F5,
			0x3183, 0x200A, 0x1291, 0x0318, 0x77A7, 0x662E, 0x54B5, 0x453C,
			0xBDCB, 0xAC42, 0x9ED9, 0x8F50, 0xFBEF, 0xEA66, 0xD8FD, 0xC974,
			0x4204, 0x538D, 0x6116, 0x709F, 0x0420, 0x15A9, 0x2732, 0x36BB,
			0xCE4C, 0xDFC5, 0xED5E, 0xFCD7, 0x8868, 0x99E1, 0xAB7A, 0xBAF3,
			0x5285, 0x430C, 0x7197, 0x601E, 0x14A1, 0x0528, 0x37B3, 0x263A,
			0xDECD, 0xCF44, 0xFDDF, 0xEC56, 0x98E9, 0x8960, 0xBBFB, 0xAA72,
			0x6306, 0x728F, 0x4014, 0x519D, 0x2522, 0x34AB, 0x0630, 0x17B9,
			0xEF4E, 0xFEC7, 0xCC5C, 0xDDD5, 0xA96A, 0xB8E3, 0x8A78, 0x9BF1,
			0x7387, 0x620E, 0x5095, 0x411C, 0x35A3, 0x242A, 0x16B1, 0x0738,
			0xFFCF, 0xEE46, 0xDCDD, 0xCD54, 0xB9EB, 0xA862, 0x9AF9, 0x8B70,
			0x8408, 0x9581, 0xA71A, 0xB693, 0xC22C, 0xD3A5, 0xE13E, 0xF0B7,
			0x0840, 0x19C9, 0x2B52, 0x3ADB, 0x4E64, 0x5FED, 0x6D76, 0x7CFF,
			0x9489, 0x8500, 0xB79B, 0xA612, 0xD2AD, 0xC324, 0xF1BF, 0xE036,
			0x18C1, 0x0948, 0x3BD3, 0x2A5A, 0x5EE5, 0x4F6C, 0x7DF7, 0x6C7E,
			0xA50A, 0xB483, 0x8618, 0x9791, 0xE32E, 0xF2A7, 0xC03C, 0xD1B5,
			0x2942, 0x38CB, 0x0A50, 0x1BD9, 0x6F66, 0x7EEF, 0x4C74, 0x5DFD,
			0xB58B, 0xA402, 0x9699, 0x8710, 0xF3AF, 0xE226, 0xD0BD, 0xC134,
			0x39C3, 0x284A, 0x1AD1, 0x0B58, 0x7FE7, 0x6E6E, 0x5CF5, 0x4D7C,
			0xC60C, 0xD785, 0xE51E, 0xF497, 0x8028, 0x91A1, 0xA33A, 0xB2B3,
			0x4A44, 0x5BCD, 0x6956, 0x78DF, 0x0C60, 0x1DE9, 0x2F72, 0x3EFB,
			0xD68D, 0xC704, 0xF59F, 0xE416, 0x90A9, 0x8120, 0xB3BB, 0xA232,
			0x5AC5, 0x4B4C, 0x79D7, 0x685E, 0x1CE1, 0x0D68, 0x3FF3, 0x2E7A,
			0xE70E, 0xF687, 0xC41C, 0xD595, 0xA12A, 0xB0A3, 0x8238, 0x93B1,
			0x6B46, 0x7ACF, 0x4854, 0x59DD, 0x2D62, 0x3CEB, 0x0E70, 0x1FF9,
			0xF78F, 0xE606, 0xD49D, 0xC514, 0xB1AB, 0xA022, 0x92B9, 0x8330,
			0x7BC7, 0x6A4E, 0x58D5, 0x495C, 0x3DE3, 0x2C6A, 0x1EF1, 0x0F78
		};
		
		public int calcCrc16(int start, int length) {
			int crc = 0xFFFF;
			for (int offset = 0; offset < length; offset++) {
				int b = readU8(start + offset);
				crc = (crc >> 8) ^ crc16Table [(crc ^ b) & 0xFF];
			}
			return (crc ^ 0xFFFF);
		}

	}
	
	@SuppressWarnings("serial")
	public static class VBusSpecificationFileException extends Exception {
		
		public VBusSpecificationFileException(Error error) {
			super(error.toString());
		}
		
	}
	
	private int datecode;
	private ArrayList<String> texts;
	private ArrayList<LocalizedText> localizedTexts;
	private ArrayList<Unit> units;
	private ArrayList<DeviceTemplate> deviceTemplates;
	private ArrayList<PacketTemplate> packetTemplates;
	private ArrayList<EnumVariant> enumVariants;
	private ArrayList<Enum> enums;
	
	public SpecificationFile() {
		texts = new ArrayList<String>();
		localizedTexts = new ArrayList<LocalizedText>();
		units = new ArrayList<Unit>();
		deviceTemplates = new ArrayList<DeviceTemplate>();
		packetTemplates = new ArrayList<PacketTemplate>();
		enumVariants = new ArrayList<EnumVariant>();
		enums = new ArrayList<Enum>();
		
		forgeEnumVariantsAndEnums();
	}
	
	public int getDatecode() {
		return datecode;
	}
	
	public String[] getTexts() {
		return (String[]) texts.toArray(new String[texts.size()]);
	}
	
	public LocalizedText[] getLocalizedTexts() {
		return (LocalizedText[]) localizedTexts.toArray(new LocalizedText[localizedTexts.size()]);
	}
	
	public Unit[] getUnits() {
		return (Unit[]) units.toArray(new Unit[units.size()]);
	}
	
	public DeviceTemplate[] getDeviceTemplates() {
		return (DeviceTemplate[]) deviceTemplates.toArray(new DeviceTemplate[deviceTemplates.size()]);
	}
	
	public PacketTemplate[] getPacketTemplates() {
		return (PacketTemplate[]) packetTemplates.toArray(new PacketTemplate[packetTemplates.size()]);
	}
	
	public EnumVariant[] getEnumVariants() {
		return (EnumVariant[]) enumVariants.toArray(new EnumVariant[enumVariants.size()]);
	}
	
	public Enum[] getEnums() {
		return (Enum[]) enums.toArray(new Enum[enums.size()]);
	}

	public static SpecificationFile fromStream(InputStream is) {
		try {
			byte[] bytes = new byte [1000000];
			int offset = 0;
			while (offset < bytes.length) {
				int readLength = is.read(bytes, offset, bytes.length - offset);
				if (readLength < 0) {
					break;
				}
				offset += readLength;
			}

			return fromBytes(bytes, 0, offset);
		} catch (Throwable t) {
			t.printStackTrace();
			return null;
		}
	}
	
	public static SpecificationFile fromBytes(byte[] rawBytes, int offset, int length) throws VBusSpecificationFileException {
		ByteArrayView bytes = new ByteArrayView(rawBytes, offset, length);

		SpecificationFile specFile = new SpecificationFile();
		
		if (!bytes.checkOffset(0, 0x10, 1)) {
			throw new VBusSpecificationFileException(Error.InvalidFileHeader);
		}
		
		ByteArrayView fileHeader = bytes.sliceEntry(0, 0x10);
		int checksumA = fileHeader.readU16(0x00);
		int checksumB = fileHeader.readU16(0x02);
		int totalLength = fileHeader.readI32(0x04);
		int dataVersion = fileHeader.readI32(0x08);
		int specificationOffset = fileHeader.readI32(0x0C);
		
		if (totalLength != length) {
			throw new VBusSpecificationFileException(Error.InvalidFileHeaderTotalLength);
		} else if (bytes.calcCrc16(4, length - 4) != checksumA) {
			throw new VBusSpecificationFileException(Error.InvalidFileHeaderChecksumA);
		} else if (checksumA != checksumB) {
			throw new VBusSpecificationFileException(Error.InvalidFileHeaderChecksumB);
		} else if (dataVersion != 1) {
			throw new VBusSpecificationFileException(Error.InvalidFileHeaderDataVersion);
		} else if (!bytes.checkOffset(specificationOffset, 0x2C, 1)) {
			throw new VBusSpecificationFileException(Error.InvalidFileHeaderSpecificationOffset);
		} else {
			specFile.parseSpecificationBlock(bytes, specificationOffset);
		}

		return specFile;
	}

	String getTextByIndex(int index) {
		return texts.get(index);
	}
	
	String getLocalizedTextByIndex(int index, Language language) {
		LocalizedText localizedText = localizedTexts.get(index);
		int textIndex;
		switch (language) {
		case En: textIndex = localizedText.textIndexEn; break;
		case De: textIndex = localizedText.textIndexDe; break;
		case Fr: textIndex = localizedText.textIndexFr; break;
		default: textIndex = localizedText.textIndexEn; break;
		}
		return getTextByIndex(textIndex);
	}
	
	UnitFamily getUnitFamilyById(int id) {
		UnitFamily family;
		switch (id) {
		case -1: family = UnitFamily.None; break;
		case 0: family = UnitFamily.Temperature; break;
		case 1: family = UnitFamily.Energy; break;
		case 2: family = UnitFamily.VolumeFlow; break;
		case 3: family = UnitFamily.Pressure; break;
		case 4: family = UnitFamily.Volume; break;
		case 5: family = UnitFamily.Time; break;
		case 6: family = UnitFamily.Power; break;
		default:
			throw new java.lang.Error("Unsupported unit family ID");
		}
		return family;
	}

	Unit getUnitById(int id) {
		for (Unit unit : units) {
			if (unit.unitId == id) {
				return unit;
			}
		}
		throw new java.lang.Error("Unsupported unit ID");
	}
	
	Type getTypeById(int id) {
		Type type;
		switch (id) {
		case 1: type = Type.Number; break;
		case 3: type = Type.Time; break;
		case 4: type = Type.WeekTime; break;
		case 5: type = Type.DateTime; break;
		default:
			throw new java.lang.Error("Unsupported type ID");
		}
		return type;
	}
	
	DeviceTemplate findDeviceTemplate(int selfAddress, int peerAddress) {
		for (DeviceTemplate deviceTemplate : deviceTemplates) {
			if (((deviceTemplate.selfAddress ^ selfAddress) & deviceTemplate.selfMask) != 0) {
				// nop
			} else if (((deviceTemplate.peerAddress ^ peerAddress) & deviceTemplate.peerMask) != 0) {
				// nop
			} else {
				return deviceTemplate;
			}
		}
		return null;
	}
	
	PacketTemplate findPacketTemplate(int destinationAddress, int sourceAddress, int command) {
		for (PacketTemplate packetTemplate : packetTemplates) {
			if (((packetTemplate.destinationAddress ^ destinationAddress) & packetTemplate.destinationMask) != 0) {
				// nop
			} else if (((packetTemplate.sourceAddress ^ sourceAddress) & packetTemplate.sourceMask) != 0) {
				// nop
			} else if (packetTemplate.command != command) {
				// nop
			} else {
				return packetTemplate;
			}
		}
		return null;
	}
	
	Enum getEnumById(int id) {
		if (id == 0) {
			return null;
		}
		for (Enum e : enums) {
			if (e.enumId == id) {
				return e;
			}
		}
		throw new java.lang.Error("Unsupported enum ID");
	}
	
	private boolean checkTextIndex(int index) {
		return ((index >= 0) && (index < texts.size()));
	}
	
	private boolean checkLocalizedTextIndex(int index) {
		return ((index >= 0) && (index < localizedTexts.size()));
	}
	
	private boolean checkUnitFamilyId(int id) {
		return ((id >= -1) && (id <= 6));
	}

	private boolean checkUnitId(int id) {
		for (Unit unit : units) {
			if (unit.unitId == id) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkTypeId(int id) {
		switch (id) {
		case 1:
		case 3:
		case 4:
		case 5:
			return true;
		default:
			return false;
		}
	}
	
	private void parseSpecificationBlock(ByteArrayView bytes, int specificationOffset) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceEntry(specificationOffset, 0x2C);
		int datecode = block.readI32(0x00);
		int textCount = block.readI32(0x04);
		int textTableOffset = block.readI32(0x08);
		int localizedTextCount = block.readI32(0x0C);
		int localizedTextTableOffset = block.readI32(0x10);
		int unitCount = block.readI32(0x14);
		int unitTableOffset = block.readI32(0x18);
		int deviceTemplateCount = block.readI32(0x1C);
		int deviceTemplateTableOffset = block.readI32(0x20);
		int packetTemplateCount = block.readI32(0x24);
		int packetTemplateTableOffset = block.readI32(0x28);

		if (!bytes.checkOffset(textTableOffset, 0x04, textCount)) {
			throw new VBusSpecificationFileException(Error.InvalidSpecificationTextTable);
		} else if (!bytes.checkOffset(localizedTextTableOffset, 0x0C, localizedTextCount)) {
			throw new VBusSpecificationFileException(Error.InvalidSpecificationLocalizedTextTable);
		} else if (!bytes.checkOffset(unitTableOffset, 0x10, unitCount)) {
			throw new VBusSpecificationFileException(Error.InvalidSpecificationUnitTable);
		} else if (!bytes.checkOffset(deviceTemplateTableOffset, 0x0C, deviceTemplateCount)) {
			throw new VBusSpecificationFileException(Error.InvalidSpecificationDeviceTemplateTable);
		} else if (!bytes.checkOffset(packetTemplateTableOffset, 0x14, packetTemplateCount)) {
			throw new VBusSpecificationFileException(Error.InvalidSpecificationPacketTemplateTable);
		}

		this.datecode = datecode;
		
		for (int index = 0; index < textCount; index++) {
			String text = parseTextBlock(bytes, textTableOffset, index);
			texts.add(text);
		}
		
		for (int index = 0; index < localizedTextCount; index++) {
			LocalizedText localizedText = parseLocalizedTextBlock(bytes, localizedTextTableOffset, index);
			localizedTexts.add(localizedText);
		}

		for (int index = 0; index < unitCount; index++) {
			Unit unit = parseUnitBlock(bytes, unitTableOffset, index);
			units.add(unit);
		}

		for (int index = 0; index < deviceTemplateCount; index++) {
			DeviceTemplate deviceTemplate = parseDeviceTemplateBlock(bytes, deviceTemplateTableOffset, index);
			deviceTemplates.add(deviceTemplate);
		}

		for (int index = 0; index < packetTemplateCount; index++) {
			PacketTemplate packetTemplate = parsePacketTemplateBlock(bytes, packetTemplateTableOffset, index);
			packetTemplates.add(packetTemplate);
		}
	}
	
	private String parseTextBlock(ByteArrayView bytes, int offset, int index) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x04, index);
		int stringOffset = block.readI32(0);
		
		if (!bytes.checkOffset(stringOffset, 0x01, 1)) {
			throw new VBusSpecificationFileException(Error.InvalidTextStringOffset);
		}

		int stringEnd = stringOffset;
		while (bytes.checkOffset(stringEnd, 0x01, 1) && (bytes.readU8(stringEnd) != 0)) {
			stringEnd += 1;
		}
		
		try {
			return new String(bytes.bytes, stringOffset, stringEnd - stringOffset, "UTF-8");
		} catch (UnsupportedEncodingException ex) {
			throw new VBusSpecificationFileException(Error.InvalidTextContent);
		}
	}
	
	private LocalizedText parseLocalizedTextBlock(ByteArrayView bytes, int offset, int index) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x0C, index);
		int textIndexEn = block.readI32(0x00);
		int textIndexDe = block.readI32(0x04);
		int textIndexFr = block.readI32(0x08);
		
		if (!checkTextIndex(textIndexEn)) {
			throw new VBusSpecificationFileException(Error.InvalidLocalizedTextTextIndexEn);
		} else if (!checkTextIndex(textIndexDe)) {
			throw new VBusSpecificationFileException(Error.InvalidLocalizedTextTextIndexDe);
		} else if (!checkTextIndex(textIndexFr)) {
			throw new VBusSpecificationFileException(Error.InvalidLocalizedTextTextIndexFr);
		}

		LocalizedText localizedText = new LocalizedText();
		localizedText.textIndexEn = textIndexEn;
		localizedText.textIndexDe = textIndexDe;
		localizedText.textIndexFr = textIndexFr;
		return localizedText;
	}
	
	private Unit parseUnitBlock(ByteArrayView bytes, int offset, int index) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x10, index);
		int unitId = block.readI32(0x00);
		int unitFamilyId = block.readI32(0x04);
		int unitCodeTextIndex = block.readI32(0x08);
		int unitTextTextIndex = block.readI32(0x0C);
		
		if (!checkUnitFamilyId(unitFamilyId)) {
			throw new VBusSpecificationFileException(Error.InvalidUnitUnitFamilyId);
		} else if (!checkTextIndex(unitCodeTextIndex)) {
			throw new VBusSpecificationFileException(Error.InvalidUnitUnitCodeTextIndex);
		} else if (!checkTextIndex(unitTextTextIndex)) {
			throw new VBusSpecificationFileException(Error.InvalidUnitUnitTextTextIndex);
		}
		
		Unit unit = new Unit();
		unit.unitId = unitId;
		unit.unitFamilyId = unitFamilyId;
		unit.unitCodeTextIndex = unitCodeTextIndex;
		unit.unitTextTextIndex = unitTextTextIndex;
		return unit;
	}
	
	private DeviceTemplate parseDeviceTemplateBlock(ByteArrayView bytes, int offset, int index) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x0C, index);
		int selfAddress = block.readU16(0x00);
		int selfMask = block.readU16(0x02);
		int peerAddress = block.readU16(0x04);
		int peerMask = block.readU16(0x06);
		int nameLocalizedTextIndex = block.readI32(0x08);
		
		if (!checkLocalizedTextIndex(nameLocalizedTextIndex)) {
			throw new VBusSpecificationFileException(Error.InvalidDeviceTemplateNameLocalizedTextIndex);
		}
		
		DeviceTemplate deviceTemplate = new DeviceTemplate();
		deviceTemplate.selfAddress = selfAddress;
		deviceTemplate.selfMask = selfMask;
		deviceTemplate.peerAddress = peerAddress;
		deviceTemplate.peerMask = peerMask;
		deviceTemplate.nameLocalizedTextIndex = nameLocalizedTextIndex;
		return deviceTemplate;
	}
	
	private PacketTemplate parsePacketTemplateBlock(ByteArrayView bytes, int offset, int ptIndex) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x14, ptIndex);
		int destinationAddress = block.readU16(0x00);
		int destinationMask = block.readU16(0x02);
		int sourceAddress = block.readU16(0x04);
		int sourceMask = block.readU16(0x06);
		int command = block.readU16(0x08);
		int fieldCount = block.readI32(0x0C);
		int fieldTableOffset = block.readI32(0x10);
		
		if (!bytes.checkOffset(fieldTableOffset, 0x1C, fieldCount)) {
			throw new VBusSpecificationFileException(Error.InvalidPacketTemplateFieldTable);
		}

		PacketTemplate packetTemplate = new PacketTemplate();
		packetTemplate.destinationAddress = destinationAddress;
		packetTemplate.destinationMask = destinationMask;
		packetTemplate.sourceAddress = sourceAddress;
		packetTemplate.sourceMask = sourceMask;
		packetTemplate.command = command;

		for (int index = 0; index < fieldCount; index++) {
			PacketTemplateField field = parsePacketTemplateFieldBlock(bytes, fieldTableOffset, index);
			forgeEnumForPacketTemplateField(packetTemplate, field);
			packetTemplate.fields.add(field);
		}

		return packetTemplate;
	}
	
	private PacketTemplateField parsePacketTemplateFieldBlock(ByteArrayView bytes, int offset, int ptfIndex) throws VBusSpecificationFileException {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x1C, ptfIndex);
		int idTextIndex = block.readI32(0x00);
		int nameLocalizedTextIndex = block.readI32(0x04);
		int unitId = block.readI32(0x08);
		int precision = block.readI32(0x0C);
		int typeId = block.readI32(0x10);
		int partCount = block.readI32(0x14);
		int partTableOffset = block.readI32(0x18);
		
		if (!checkTextIndex(idTextIndex)) {
			throw new VBusSpecificationFileException(Error.InvalidPacketTemplateFieldIdTextIndex);
		} else if (!checkLocalizedTextIndex(nameLocalizedTextIndex)) {
			throw new VBusSpecificationFileException(Error.InvalidPacketTemplateFieldNameLocalizedTextIndex);
		} else if (!checkUnitId(unitId)) {
			throw new VBusSpecificationFileException(Error.InvalidPacketTemplateFieldUnitId);
		} else if (!checkTypeId(typeId)) {
			throw new VBusSpecificationFileException(Error.InvalidPacketTemplateFieldTypeId);
		} else if (!bytes.checkOffset(partTableOffset, 0x10, partCount)) {
			throw new VBusSpecificationFileException(Error.InvalidPacketTemplateFieldPartTable);
		}
		
		PacketTemplateField field = new PacketTemplateField();
		field.idTextIndex = idTextIndex;
		field.nameLocalizedTextIndex = nameLocalizedTextIndex;
		field.unitId = unitId;
		field.precision = precision;
		field.typeId = typeId;
		
		for (int index = 0; index < partCount; index++) {
			PacketTemplateFieldPart part = parsePacketTemplateFieldPartBlock(bytes, partTableOffset, index);
			field.parts.add(part);
		}
		
		return field;
	}
	
	private PacketTemplateFieldPart parsePacketTemplateFieldPartBlock(ByteArrayView bytes, int offset, int index) {
		ByteArrayView block = bytes.sliceTableEntry(offset, 0x10, index);
		int dataOffset = block.readI32(0x00);
		int bitPos = block.readU8(0x04);
		int mask = block.readU8(0x05);
		boolean isSigned = (block.readU8(0x06) != 0);
		long factor = block.readI64(0x08);
		
		PacketTemplateFieldPart part = new PacketTemplateFieldPart();
		part.offset = dataOffset;
		part.bitPos = bitPos;
		part.mask = mask;
		part.isSigned = isSigned;
		part.factor = factor;
		return part;
	}
	
	private EnumVariant forgeEnumVariant(String idCode, String textEn, String textDe) {
		EnumVariant enumVariant = new EnumVariant(enumVariants.size(), idCode, textEn, textDe, textEn);
		enumVariants.add(enumVariant);
		return enumVariant;
	}
	
	private Enum forgeEnum(int enumId, long[] values, EnumVariant[] variants) {
		if (values.length != variants.length) {
			throw new java.lang.Error("Enum values and variants must match");
		}

		for (int i = 1; i < values.length; i++) {
			if (values [i - 1] >= values [i]) {
				throw new java.lang.Error("Enum values must be sorted and unique");
			}
		}

		Enum enum_ = new Enum(enumId, values, variants);
		enums.add(enum_);
		return enum_;
	}
	
	private void forgeEnumVariantsAndEnums() {
		EnumVariant evFree = forgeEnumVariant("Free", "Free", "Frei");
		EnumVariant evRuntime = forgeEnumVariant("Runtime", "Runtime", "Laufzeit");
		EnumVariant evDeactivated = forgeEnumVariant("Deactivated", "Deactivated", "Deaktiviert");
		EnumVariant evDefective = forgeEnumVariant("Defective", "Defective", "Defekt");
		EnumVariant evAutoAdjustment = forgeEnumVariant("AutoAdjustment", "Auto adjust.", "Autojust.");
		EnumVariant evRthOff = forgeEnumVariant("RoomThermostatOff", "RTH off", "RTH aus");
		EnumVariant evChimneySweeper = forgeEnumVariant("ChimneySweeper", "Chimney sw.", "Schornsteinfeger");
		EnumVariant evDhwPriority = forgeEnumVariant("DhwPriority", "DHW priority", "BW-Vorrang");
		EnumVariant evAntifreeze = forgeEnumVariant("Antifreeze", "Antifreeze", "Frostschutz");
		EnumVariant evParty = forgeEnumVariant("Party", "Party", "Party");
		EnumVariant evSummer = forgeEnumVariant("Summer", "Summer", "Sommer");
		EnumVariant evRemoteControlOff = forgeEnumVariant("RemoteControlOff", "RC off", "FV aus");
		EnumVariant evHeatingCircuitOff = forgeEnumVariant("HeatingCircuitOff", "HC off", "HK aus");
		EnumVariant evNightOperation = forgeEnumVariant("NightOperation", "Night oper.", "Nachtbetr.");
		EnumVariant evDayOperation = forgeEnumVariant("DayOperation", "Day oper.", "Tagbetr.");
		EnumVariant evHoliday = forgeEnumVariant("Holiday", "Holiday", "Urlaub");
		EnumVariant evScreed = forgeEnumVariant("Screed", "Screed", "Estrich");
		EnumVariant evBlockingProtection = forgeEnumVariant("BlockingProtection", "Blocking protection", "Blockierschutz");
		EnumVariant evCooling = forgeEnumVariant("Cooling", "Cooling", "Kühlung");
		EnumVariant evHeatDump = forgeEnumVariant("HeatDump", "Heat dump", "Überwärmeabfuhr");
		EnumVariant evBreak = forgeEnumVariant("Break", "Break", "Pause");
		
		EnumVariant evOkay = forgeEnumVariant("Okay", "Okay", "Okay");
		EnumVariant evError = forgeEnumVariant("Error", "Error", "Error");
		
		// MxHeatingCircuitOperatingState
		forgeEnum(0xa00705bd, new long[] {
			0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
		}, new EnumVariant[] {
			evFree,  // 0
			evRuntime,  // 1
			evDeactivated,  // 2
			evDefective,  // 3
			evAutoAdjustment,  // 4
			evRthOff,  // 5
			evChimneySweeper,  // 6
			evDhwPriority,  // 7
			evAntifreeze,  // 8
			evParty,  // 9
			evSummer,  // 10
			evRemoteControlOff,  // 11
			evHeatingCircuitOff,  // 12
			evNightOperation,  // 13
			evDayOperation,  // 14
			evHoliday,  // 15
			evScreed,  // 16
			evBlockingProtection,  // 17
			evCooling,  // 18
			evHeatDump,  // 19
			evBreak,  // 20			
		});
		
		// ErrorBooleanLike
		forgeEnum(0x537e18fa, new long[] { 0, 1 }, new EnumVariant[] {
			evOkay,
			evError,
		});
	}

	private void forgeEnumForPacketTemplateField(PacketTemplate pt, PacketTemplateField ptf) {
		if ((pt.destinationAddress == 0x0010) && (pt.destinationMask == 0xFFFF) && (pt.sourceAddress == 0x7E11) && (pt.sourceMask == 0xFFFF) && (pt.command == 0x0100)) {
			if (ptf.parts.size() == 1) {
				PacketTemplateFieldPart part0 = ptf.parts.get(0);
				if ((part0.offset >= 96) && (part0.offset < 100)) {
					ptf.enumId = 0x537e18fa;  // ErrorBooleanLike
				}
			}
		} else if ((pt.destinationAddress == 0x0010) && (pt.destinationMask == 0xFFFF) && (pt.sourceAddress == 0x7E20) && (pt.sourceMask == 0xFFF0) && (pt.command == 0x0100)) {
			if (getTextByIndex(ptf.idTextIndex).equals("002_1_0")) {
				// 00_0010_7E20_10_0100_002_1_0: Operating state
				ptf.enumId = 0xa00705bd;  // MxHeatingCircuitOperatingState
			}
		}
	}
	
}
