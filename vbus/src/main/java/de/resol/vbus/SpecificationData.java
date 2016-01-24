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

import de.resol.vbus.Specification.*;

public class SpecificationData {

	// public static final Unit Bars = new Unit("Bars", "Pressure", " bar");
	// public static final Unit Btus = new Unit("Btus", "Energy", " BTU");
	// public static final Unit CubicMeters = new Unit("CubicMeters", "Volume", " m³");
	// public static final Unit CubicMetersPerHour = new Unit("CubicMetersPerHour", "VolumeFlow", " m³/h");
	// public static final Unit Days = new Unit("Days", "Time", " d");
	// public static final Unit DegreesAngular = new Unit("DegreesAngular", null, " °");
	// public static final Unit DegreesCelsius = new Unit("DegreesCelsius", "Temperature", " °C");
	// public static final Unit DegreesFahrenheit = new Unit("DegreesFahrenheit", "Temperature", " °F");
	// public static final Unit DegreesKelvin = new Unit("DegreesKelvin", null, " K");
	// public static final Unit Hectopascals = new Unit("Hectopascals", null, " hPa");
	// public static final Unit Hertz = new Unit("Hertz", null, " Hz");
	// public static final Unit Hours = new Unit("Hours", "Time", " h");
	// public static final Unit KiloWattHoursPerSquareMeterPerDay = new Unit("KiloWattHoursPerSquareMeterPerDay", null, " kWh/(m²*d)");
	// public static final Unit KilogramsPerCubicMeter = new Unit("KilogramsPerCubicMeter", null, " kg/m³");
	// public static final Unit KilogramsPerHour = new Unit("KilogramsPerHour", null, " kg/h");
	// public static final Unit KilowattHours = new Unit("KilowattHours", "Energy", " kWh");
	// public static final Unit Kilowatts = new Unit("Kilowatts", null, " kW");
	// public static final Unit Liters = new Unit("Liters", "Volume", " l");
	// public static final Unit LitersPerHour = new Unit("LitersPerHour", "VolumeFlow", " l/h");
	// public static final Unit LitersPerMinute = new Unit("LitersPerMinute", "VolumeFlow", " l/min");
	// public static final Unit LitersPerSquareMeterPerDay = new Unit("LitersPerSquareMeterPerDay", null, " l/(m²*d)");
	// public static final Unit MegawattHours = new Unit("MegawattHours", "Energy", " MWh");
	// public static final Unit MetersPerSecond = new Unit("MetersPerSecond", null, " m/s");
	// public static final Unit Milliamperes = new Unit("Milliamperes", null, " mA");
	// public static final Unit Milliseconds = new Unit("Milliseconds", null, " ms");
	// public static final Unit Minutes = new Unit("Minutes", "Time", " min");
	// public static final Unit None = new Unit("None", null, "");
	// public static final Unit Ohms = new Unit("Ohms", null, " Ω");
	// public static final Unit Percent = new Unit("Percent", null, "%");
	// public static final Unit Seconds = new Unit("Seconds", "Time", " s");
	// public static final Unit SquareMeters = new Unit("SquareMeters", null, " m²");
	// public static final Unit Volts = new Unit("Volts", null, " V");
	// public static final Unit WattHours = new Unit("WattHours", "Energy", " Wh");
	// public static final Unit Watts = new Unit("Watts", null, " W");
	// public static final Unit WattsPerSquareMeter = new Unit("WattsPerSquareMeter", null, " W/m²");

	public static final PacketFieldType PacketFieldType_DateTime_1_None = new PacketFieldType(Type.DateTime, 0, Unit.None);
	public static final PacketFieldType PacketFieldType_Number_0_0001_KilogramsPerCubicMeter = new PacketFieldType(Type.Number, 4, Unit.KilogramsPerCubicMeter);
	public static final PacketFieldType PacketFieldType_Number_0_001_CubicMeters = new PacketFieldType(Type.Number, 3, Unit.CubicMeters);
	public static final PacketFieldType PacketFieldType_Number_0_001_Hertz = new PacketFieldType(Type.Number, 3, Unit.Hertz);
	public static final PacketFieldType PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay = new PacketFieldType(Type.Number, 3, Unit.KiloWattHoursPerSquareMeterPerDay);
	public static final PacketFieldType PacketFieldType_Number_0_001_Kilowatts = new PacketFieldType(Type.Number, 3, Unit.Kilowatts);
	public static final PacketFieldType PacketFieldType_Number_0_001_Milliamperes = new PacketFieldType(Type.Number, 3, Unit.Milliamperes);
	public static final PacketFieldType PacketFieldType_Number_0_001_None = new PacketFieldType(Type.Number, 3, Unit.None);
	public static final PacketFieldType PacketFieldType_Number_0_001_Ohms = new PacketFieldType(Type.Number, 3, Unit.Ohms);
	public static final PacketFieldType PacketFieldType_Number_0_001_Percent = new PacketFieldType(Type.Number, 3, Unit.Percent);
	public static final PacketFieldType PacketFieldType_Number_0_001_Volts = new PacketFieldType(Type.Number, 3, Unit.Volts);
	public static final PacketFieldType PacketFieldType_Number_0_01_Bars = new PacketFieldType(Type.Number, 2, Unit.Bars);
	public static final PacketFieldType PacketFieldType_Number_0_01_CubicMeters = new PacketFieldType(Type.Number, 2, Unit.CubicMeters);
	public static final PacketFieldType PacketFieldType_Number_0_01_CubicMetersPerHour = new PacketFieldType(Type.Number, 2, Unit.CubicMetersPerHour);
	public static final PacketFieldType PacketFieldType_Number_0_01_DegreesCelsius = new PacketFieldType(Type.Number, 2, Unit.DegreesCelsius);
	public static final PacketFieldType PacketFieldType_Number_0_01_Hours = new PacketFieldType(Type.Number, 2, Unit.Hours);
	public static final PacketFieldType PacketFieldType_Number_0_01_KiloWattHoursPerSquareMeterPerDay = new PacketFieldType(Type.Number, 2, Unit.KiloWattHoursPerSquareMeterPerDay);
	public static final PacketFieldType PacketFieldType_Number_0_01_KilowattHours = new PacketFieldType(Type.Number, 2, Unit.KilowattHours);
	public static final PacketFieldType PacketFieldType_Number_0_01_LitersPerHour = new PacketFieldType(Type.Number, 2, Unit.LitersPerHour);
	public static final PacketFieldType PacketFieldType_Number_0_01_LitersPerMinute = new PacketFieldType(Type.Number, 2, Unit.LitersPerMinute);
	public static final PacketFieldType PacketFieldType_Number_0_01_MetersPerSecond = new PacketFieldType(Type.Number, 2, Unit.MetersPerSecond);
	public static final PacketFieldType PacketFieldType_Number_0_01_Milliamperes = new PacketFieldType(Type.Number, 2, Unit.Milliamperes);
	public static final PacketFieldType PacketFieldType_Number_0_01_None = new PacketFieldType(Type.Number, 2, Unit.None);
	public static final PacketFieldType PacketFieldType_Number_0_01_SquareMeters = new PacketFieldType(Type.Number, 2, Unit.SquareMeters);
	public static final PacketFieldType PacketFieldType_Number_0_1_Bars = new PacketFieldType(Type.Number, 1, Unit.Bars);
	public static final PacketFieldType PacketFieldType_Number_0_1_CubicMeters = new PacketFieldType(Type.Number, 1, Unit.CubicMeters);
	public static final PacketFieldType PacketFieldType_Number_0_1_DegreesCelsius = new PacketFieldType(Type.Number, 1, Unit.DegreesCelsius);
	public static final PacketFieldType PacketFieldType_Number_0_1_DegreesFahrenheit = new PacketFieldType(Type.Number, 1, Unit.DegreesFahrenheit);
	public static final PacketFieldType PacketFieldType_Number_0_1_DegreesKelvin = new PacketFieldType(Type.Number, 1, Unit.DegreesKelvin);
	public static final PacketFieldType PacketFieldType_Number_0_1_KilowattHours = new PacketFieldType(Type.Number, 1, Unit.KilowattHours);
	public static final PacketFieldType PacketFieldType_Number_0_1_Kilowatts = new PacketFieldType(Type.Number, 1, Unit.Kilowatts);
	public static final PacketFieldType PacketFieldType_Number_0_1_Liters = new PacketFieldType(Type.Number, 1, Unit.Liters);
	public static final PacketFieldType PacketFieldType_Number_0_1_LitersPerMinute = new PacketFieldType(Type.Number, 1, Unit.LitersPerMinute);
	public static final PacketFieldType PacketFieldType_Number_0_1_LitersPerSquareMeterPerDay = new PacketFieldType(Type.Number, 1, Unit.LitersPerSquareMeterPerDay);
	public static final PacketFieldType PacketFieldType_Number_0_1_None = new PacketFieldType(Type.Number, 1, Unit.None);
	public static final PacketFieldType PacketFieldType_Number_0_1_Percent = new PacketFieldType(Type.Number, 1, Unit.Percent);
	public static final PacketFieldType PacketFieldType_Number_0_1_Volts = new PacketFieldType(Type.Number, 1, Unit.Volts);
	public static final PacketFieldType PacketFieldType_Number_0_1_WattsPerSquareMeter = new PacketFieldType(Type.Number, 1, Unit.WattsPerSquareMeter);
	public static final PacketFieldType PacketFieldType_Number_1_Btus = new PacketFieldType(Type.Number, 0, Unit.Btus);
	public static final PacketFieldType PacketFieldType_Number_1_CubicMeters = new PacketFieldType(Type.Number, 0, Unit.CubicMeters);
	public static final PacketFieldType PacketFieldType_Number_1_CubicMetersPerHour = new PacketFieldType(Type.Number, 0, Unit.CubicMetersPerHour);
	public static final PacketFieldType PacketFieldType_Number_1_Days = new PacketFieldType(Type.Number, 0, Unit.Days);
	public static final PacketFieldType PacketFieldType_Number_1_DegreesAngular = new PacketFieldType(Type.Number, 0, Unit.DegreesAngular);
	public static final PacketFieldType PacketFieldType_Number_1_DegreesCelsius = new PacketFieldType(Type.Number, 0, Unit.DegreesCelsius);
	public static final PacketFieldType PacketFieldType_Number_1_DegreesKelvin = new PacketFieldType(Type.Number, 0, Unit.DegreesKelvin);
	public static final PacketFieldType PacketFieldType_Number_1_Hectopascals = new PacketFieldType(Type.Number, 0, Unit.Hectopascals);
	public static final PacketFieldType PacketFieldType_Number_1_Hertz = new PacketFieldType(Type.Number, 0, Unit.Hertz);
	public static final PacketFieldType PacketFieldType_Number_1_Hours = new PacketFieldType(Type.Number, 0, Unit.Hours);
	public static final PacketFieldType PacketFieldType_Number_1_KilogramsPerHour = new PacketFieldType(Type.Number, 0, Unit.KilogramsPerHour);
	public static final PacketFieldType PacketFieldType_Number_1_KilowattHours = new PacketFieldType(Type.Number, 0, Unit.KilowattHours);
	public static final PacketFieldType PacketFieldType_Number_1_Liters = new PacketFieldType(Type.Number, 0, Unit.Liters);
	public static final PacketFieldType PacketFieldType_Number_1_LitersPerHour = new PacketFieldType(Type.Number, 0, Unit.LitersPerHour);
	public static final PacketFieldType PacketFieldType_Number_1_LitersPerMinute = new PacketFieldType(Type.Number, 0, Unit.LitersPerMinute);
	public static final PacketFieldType PacketFieldType_Number_1_MegawattHours = new PacketFieldType(Type.Number, 0, Unit.MegawattHours);
	public static final PacketFieldType PacketFieldType_Number_1_Milliseconds = new PacketFieldType(Type.Number, 0, Unit.Milliseconds);
	public static final PacketFieldType PacketFieldType_Number_1_Minutes = new PacketFieldType(Type.Number, 0, Unit.Minutes);
	public static final PacketFieldType PacketFieldType_Number_1_None = new PacketFieldType(Type.Number, 0, Unit.None);
	public static final PacketFieldType PacketFieldType_Number_1_Percent = new PacketFieldType(Type.Number, 0, Unit.Percent);
	public static final PacketFieldType PacketFieldType_Number_1_Seconds = new PacketFieldType(Type.Number, 0, Unit.Seconds);
	public static final PacketFieldType PacketFieldType_Number_1_Volts = new PacketFieldType(Type.Number, 0, Unit.Volts);
	public static final PacketFieldType PacketFieldType_Number_1_WattHours = new PacketFieldType(Type.Number, 0, Unit.WattHours);
	public static final PacketFieldType PacketFieldType_Number_1_Watts = new PacketFieldType(Type.Number, 0, Unit.Watts);
	public static final PacketFieldType PacketFieldType_Number_1_WattsPerSquareMeter = new PacketFieldType(Type.Number, 0, Unit.WattsPerSquareMeter);
	public static final PacketFieldType PacketFieldType_Time_1_None = new PacketFieldType(Type.Time, 0, Unit.None);
	public static final PacketFieldType PacketFieldType_Weektime_1_None = new PacketFieldType(Type.Weektime, 0, Unit.None);

	public static Specification createDefaultSpecification() {
		return new Specification(new DeviceSpec[] {
			new DeviceSpec(-1, 0x0000, 0xFFFF, 0x0000, 0x0000, new Text("Broadcast")),
			new DeviceSpec(-1, 0x0010, 0xFFFF, 0x0000, 0x0000, new Text("DFA")),
			new DeviceSpec(-1, 0x0015, 0xFFFF, 0x0000, 0x0000, new Text("Standard-Infos")),
			new DeviceSpec(-1, 0x0020, 0xFFFF, 0x0000, 0x0000, new Text("Computer")),
			new DeviceSpec(-1, 0x0040, 0xFFFF, 0x0000, 0x0000, new Text("SD3 / GAx")),
			new DeviceSpec(-1, 0x0050, 0xFFFF, 0x0000, 0x0000, new Text("DL2")),
			new DeviceSpec(-1, 0x0053, 0xFFFF, 0x0000, 0x0000, new Text("DL3")),
			new DeviceSpec(-1, 0x1001, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol SLT [Regler]")),
			new DeviceSpec(-1, 0x1010, 0xFFF0, 0x0000, 0x0000, new Text("DeltaSol SLT [WMZ #]")),
			new DeviceSpec(-1, 0x1020, 0xFFFF, 0x0000, 0x0000, new Text("Noventec Übergabestation [Regler]")),
			new DeviceSpec(-1, 0x1040, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E V2 HK 1 Estrichtrockung [Modul 1]")),
			new DeviceSpec(-1, 0x1041, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E V2 HK 2 Estrichtrockung [Modul 2]")),
			new DeviceSpec(-1, 0x1042, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E V2 HK 3 Estrichtrockung [Modul 3]")),
			new DeviceSpec(-1, 0x1043, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E V2 HK Estrichtrockung [Lokal]")),
			new DeviceSpec(-1, 0x1050, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E V2 [Regler]")),
			new DeviceSpec(-1, 0x1051, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E V2 [WMZ]")),
			new DeviceSpec(-1, 0x1052, 0xFFFF, 0x0000, 0x0000, new Text("Kioto BX Plus V2 [Regler]")),
			new DeviceSpec(-1, 0x1053, 0xFFFF, 0x0000, 0x0000, new Text("Kioto BX Plus V2 [Module]")),
			new DeviceSpec(-1, 0x1054, 0xFFFF, 0x0000, 0x0000, new Text("Kioto BX Plus V2 [Heizkreis 1]")),
			new DeviceSpec(-1, 0x1055, 0xFFFF, 0x0000, 0x0000, new Text("Kioto BX Plus V2 [Heizkreis 2]")),
			new DeviceSpec(-1, 0x1056, 0xFFFF, 0x0000, 0x0000, new Text("Kioto BX Plus V2 [WMZ 1]")),
			new DeviceSpec(-1, 0x1057, 0xFFFF, 0x0000, 0x0000, new Text("Kioto BX Plus V2 [WMZ 2]")),
			new DeviceSpec(-1, 0x1058, 0xFFFF, 0x0000, 0x0000, new Text("Caleffi Biomassa")),
			new DeviceSpec(-1, 0x1059, 0xFFFF, 0x0000, 0x0000, new Text("DeltaTherm HC mini [Regler]")),
			new DeviceSpec(-1, 0x105A, 0xFFFF, 0x0000, 0x0000, new Text("Remeha RemaCal")),
			new DeviceSpec(-1, 0x105B, 0xFFFF, 0x0000, 0x0000, new Text("Atlantic SOLERIO V3")),
			new DeviceSpec(-1, 0x105D, 0xFFFF, 0x0000, 0x0000, new Text("DeDietrich Sol Plus ER 709")),
			new DeviceSpec(-1, 0x105E, 0xFFFF, 0x0000, 0x0000, new Text("Caleffi WP")),
			new DeviceSpec(-1, 0x105F, 0xFFFF, 0x0000, 0x0000, new Text("Tuxhorn BHKW")),
			new DeviceSpec(-1, 0x1060, 0xFFFF, 0x0000, 0x0000, new Text("Vitosolic 200 [Regler]")),
			new DeviceSpec(-1, 0x1065, 0xFFFF, 0x0000, 0x0000, new Text("Vitosolic 200 [WMZ 1]")),
			new DeviceSpec(-1, 0x1066, 0xFFFF, 0x0000, 0x0000, new Text("Vitosolic 200 [WMZ 2]")),
			new DeviceSpec(-1, 0x1100, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol MX - SorTech - eCoo [Regler]")),
			new DeviceSpec(-1, 0x1111, 0xFFFF, 0x0000, 0x0000, new Text("EC1")),
			new DeviceSpec(-1, 0x1120, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol AL-E")),
			new DeviceSpec(-1, 0x1121, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol CS2")),
			new DeviceSpec(-1, 0x1122, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol CS4")),
			new DeviceSpec(-1, 0x1140, 0xFFFF, 0x0000, 0x0000, new Text("DeltaTherm HC mini [Heizkreis 1]")),
			new DeviceSpec(-1, 0x1150, 0xFFFF, 0x0000, 0x0000, new Text("Kioto FWS")),
			new DeviceSpec(-1, 0x1160, 0xFFFF, 0x0000, 0x0000, new Text("MFR [Regler]")),
			new DeviceSpec(-1, 0x1161, 0xFFFF, 0x0000, 0x0000, new Text("MFR [Module]")),
			new DeviceSpec(-1, 0x1162, 0xFFFF, 0x0000, 0x0000, new Text("MFR [Frischwasser]")),
			new DeviceSpec(-1, 0x1200, 0xFFF0, 0x0000, 0x0000, new Text("MFR [WMZ #]")),
			new DeviceSpec(-1, 0x1210, 0xFFF0, 0x0000, 0x0000, new Text("MFR [Heizkreis #]")),
			new DeviceSpec(-1, 0x2000, 0xFF00, 0x0000, 0x0000, new Text("Digital Sensor #")),
			new DeviceSpec(-1, 0x2111, 0xFFFF, 0x0000, 0x0000, new Text("TLR2")),
			new DeviceSpec(-1, 0x2211, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol CS Plus")),
			new DeviceSpec(-1, 0x2213, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol CS Plus 2.x")),
			new DeviceSpec(-1, 0x2231, 0xFFFF, 0x0000, 0x0000, new Text("Oranier HK [Regler]")),
			new DeviceSpec(-1, 0x2232, 0xFFFF, 0x0000, 0x0000, new Text("Oranier HK [WMZ1]")),
			new DeviceSpec(-1, 0x2241, 0xFFFF, 0x0000, 0x0000, new Text("Frischwasserregler")),
			new DeviceSpec(-1, 0x2251, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol SL [Regler]")),
			new DeviceSpec(-1, 0x2252, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol SL [WMZ1]")),
			new DeviceSpec(-1, 0x2261, 0xFFFF, 0x0000, 0x0000, new Text("HR Solar BASIC controller [Regler]")),
			new DeviceSpec(-1, 0x2262, 0xFFFF, 0x0000, 0x0000, new Text("HR Solar BASIC controller [WMZ 1]")),
			new DeviceSpec(-1, 0x2271, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol SLL [Regler]")),
			new DeviceSpec(-1, 0x2272, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol SLL [WMZ1]")),
			new DeviceSpec(-1, 0x2360, 0xFFFF, 0x0000, 0x0000, new Text("HR Solar ADVANCED controller [Regler]")),
			new DeviceSpec(-1, 0x2362, 0xFFFF, 0x0000, 0x0000, new Text("HR Solar ADVANCED controller [WMZ 1]")),
			new DeviceSpec(-1, 0x3011, 0xFFFF, 0x0000, 0x0000, new Text("WMZ-L10")),
			new DeviceSpec(-1, 0x3112, 0xFFFF, 0x0000, 0x0000, new Text("Remeha RemaSol A")),
			new DeviceSpec(-1, 0x3113, 0xFFFF, 0x0000, 0x0000, new Text("DeDietrich Diemasol Ai v2")),
			new DeviceSpec(-1, 0x3114, 0xFFFF, 0x0000, 0x0000, new Text("DeDietrich Sol Plus Trio")),
			new DeviceSpec(-1, 0x3211, 0xFFFF, 0x0000, 0x0000, new Text("EL1")),
			new DeviceSpec(-1, 0x3221, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol Pro")),
			new DeviceSpec(-1, 0x3231, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol B")),
			new DeviceSpec(-1, 0x3241, 0xFFFF, 0x0000, 0x0000, new Text("DT4 (B)")),
			new DeviceSpec(-1, 0x3251, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS")),
			new DeviceSpec(-1, 0x3261, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS (DT4)")),
			new DeviceSpec(-1, 0x3271, 0xFFFF, 0x0000, 0x0000, new Text("ConergyDT5")),
			new DeviceSpec(-1, 0x3311, 0xFFFF, 0x0000, 0x0000, new Text("Diemasol C")),
			new DeviceSpec(-1, 0x4010, 0xFFF0, 0x0000, 0x0000, new Text("WMZ #")),
			new DeviceSpec(-1, 0x4021, 0xFFFF, 0x0000, 0x0000, new Text("GF-Display")),
			new DeviceSpec(-1, 0x4111, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol AL")),
			new DeviceSpec(-1, 0x4211, 0xFFFF, 0x0000, 0x0000, new Text("SKSC1/2")),
			new DeviceSpec(-1, 0x4212, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol C")),
			new DeviceSpec(-1, 0x4213, 0xFFFF, 0x0000, 0x0000, new Text("SKSC2 HE [Regler]")),
			new DeviceSpec(-1, 0x4214, 0xFFFF, 0x0000, 0x0000, new Text("SKSC2 HE [Regler]")),
			new DeviceSpec(-1, 0x4221, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS Plus")),
			new DeviceSpec(-1, 0x4223, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS Plus BTU")),
			new DeviceSpec(-1, 0x4224, 0xFFFF, 0x0000, 0x0000, new Text("CS2.2")),
			new DeviceSpec(-1, 0x4225, 0xFFFF, 0x0000, 0x0000, new Text("CS1.2")),
			new DeviceSpec(-1, 0x4231, 0xFFFF, 0x0000, 0x0000, new Text("Frista")),
			new DeviceSpec(-1, 0x4241, 0xFFFF, 0x0000, 0x0000, new Text("Huber - REGLOfresh / Felix [Regler]")),
			new DeviceSpec(-1, 0x4251, 0xFFFF, 0x0000, 0x0000, new Text("DSPlus UMSYS [Regler]")),
			new DeviceSpec(-1, 0x4252, 0xFFFF, 0x0000, 0x0000, new Text("BS Solex US")),
			new DeviceSpec(-1, 0x4258, 0xFFFF, 0x0000, 0x0000, new Text("SolarNor Drainback")),
			new DeviceSpec(-1, 0x4261, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E SorTech [Regler]")),
			new DeviceSpec(-1, 0x4265, 0xFFFF, 0x0000, 0x0000, new Text("Aton DeltaSol BS")),
			new DeviceSpec(-1, 0x4278, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS/DrainBack")),
			new DeviceSpec(-1, 0x4279, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS/DrainBack (Fahrenheit)")),
			new DeviceSpec(-1, 0x427A, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS/DrainBack (Fahrenheit/BTU)")),
			new DeviceSpec(-1, 0x427B, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS 2009")),
			new DeviceSpec(-1, 0x4311, 0xFFFF, 0x0000, 0x0000, new Text("Drainback DeDietrich")),
			new DeviceSpec(-1, 0x4312, 0xFFFF, 0x0000, 0x0000, new Text("DeDietrich Drainback (Control)")),
			new DeviceSpec(-1, 0x4321, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol MiniPool")),
			new DeviceSpec(-1, 0x4410, 0xFFF0, 0x0000, 0x0000, new Text("MSR44 #")),
			new DeviceSpec(-1, 0x4420, 0xFFF0, 0x0000, 0x0000, new Text("HKM1 #")),
			new DeviceSpec(-1, 0x4730, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS/4 HE")),
			new DeviceSpec(-1, 0x4731, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BS/4 HE [WMZ]")),
			new DeviceSpec(-1, 0x4A00, 0xFFFF, 0x0000, 0x0000, new Text("Drainback DeDietrich")),
			new DeviceSpec(-1, 0x5111, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol D")),
			new DeviceSpec(-1, 0x5112, 0xFFFF, 0x0000, 0x0000, new Text("Speicherofenregler")),
			new DeviceSpec(-1, 0x5121, 0xFFFF, 0x0000, 0x0000, new Text("FriwaMini")),
			new DeviceSpec(-1, 0x5141, 0xFFFF, 0x0000, 0x0000, new Text("Tuxhorn PKE")),
			new DeviceSpec(-1, 0x5210, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol Plus")),
			new DeviceSpec(-1, 0x5221, 0xFFFF, 0x0000, 0x0000, new Text("DT4 (MS)")),
			new DeviceSpec(-1, 0x5231, 0xFFFF, 0x0000, 0x0000, new Text("nemux")),
			new DeviceSpec(-1, 0x5251, 0xFFFF, 0x0000, 0x0000, new Text("Frischwasserregler")),
			new DeviceSpec(-1, 0x5311, 0xFFFF, 0x0000, 0x0000, new Text("X-Control")),
			new DeviceSpec(-1, 0x5351, 0xFFFF, 0x0000, 0x0000, new Text("Frischwasserregler")),
			new DeviceSpec(-1, 0x5360, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade BasisAdr")),
			new DeviceSpec(-1, 0x5361, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Master")),
			new DeviceSpec(-1, 0x5362, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  1")),
			new DeviceSpec(-1, 0x5363, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  2")),
			new DeviceSpec(-1, 0x5364, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  3")),
			new DeviceSpec(-1, 0x5365, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  4")),
			new DeviceSpec(-1, 0x5366, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  5")),
			new DeviceSpec(-1, 0x5367, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  6")),
			new DeviceSpec(-1, 0x5368, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  7")),
			new DeviceSpec(-1, 0x5369, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  8")),
			new DeviceSpec(-1, 0x536A, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave  9")),
			new DeviceSpec(-1, 0x536B, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave 10")),
			new DeviceSpec(-1, 0x536C, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave 11")),
			new DeviceSpec(-1, 0x536D, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave 12")),
			new DeviceSpec(-1, 0x536E, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave 13")),
			new DeviceSpec(-1, 0x536F, 0xFFFF, 0x0000, 0x0000, new Text("PAW Kaskade Slave 14")),
			new DeviceSpec(-1, 0x5400, 0xFFFF, 0x0000, 0x0000, new Text("DeltaTherm HC [Regler]")),
			new DeviceSpec(-1, 0x5410, 0xFFF0, 0x0000, 0x0000, new Text("DeltaTherm HC [Heizkreis #]")),
			new DeviceSpec(-1, 0x5420, 0xFFF0, 0x0000, 0x0000, new Text("DeltaTherm HC [WMZ #]")),
			new DeviceSpec(-1, 0x5430, 0xFFF0, 0x0000, 0x0000, new Text("DeltaTherm HC [Modul #]")),
			new DeviceSpec(-1, 0x5510, 0xFFFF, 0x0000, 0x0000, new Text("EL2/3")),
			new DeviceSpec(-1, 0x5611, 0xFFFF, 0x0000, 0x0000, new Text("DeltaTherm FK")),
			new DeviceSpec(-1, 0x6510, 0xFFF0, 0x0000, 0x0000, new Text("HKM2 #")),
			new DeviceSpec(-1, 0x6520, 0xFFF0, 0x0000, 0x0000, new Text("MSR65 #")),
			new DeviceSpec(-1, 0x6610, 0xFFFF, 0x0000, 0x0000, new Text("Midi Pro")),
			new DeviceSpec(-1, 0x6620, 0xFFFF, 0x0000, 0x0000, new Text("SunGo XL")),
			new DeviceSpec(-1, 0x6650, 0xFFF0, 0x0000, 0x0000, new Text("EM #")),
			new DeviceSpec(-1, 0x7101, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX WMZ")),
			new DeviceSpec(-1, 0x7112, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus [Regler]")),
			new DeviceSpec(-1, 0x7113, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus [Module]")),
			new DeviceSpec(-1, 0x7120, 0xFFF0, 0x0000, 0x0000, new Text("DeltaSol BX Plus [Heizkreis #]")),
			new DeviceSpec(-1, 0x7130, 0xFFF0, 0x0000, 0x0000, new Text("DeltaSol BX Plus [WMZ #]")),
			new DeviceSpec(-1, 0x7140, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Pro[Regler]")),
			new DeviceSpec(-1, 0x7150, 0xFFF0, 0x0000, 0x0000, new Text("DeltaSol BX Pro[WMZ #]")),
			new DeviceSpec(-1, 0x7160, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3HE")),
			new DeviceSpec(-1, 0x7161, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3HE [HK1]")),
			new DeviceSpec(-1, 0x7162, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3HE [HK2]")),
			new DeviceSpec(-1, 0x7163, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3HE [HK3]")),
			new DeviceSpec(-1, 0x7176, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus V2A [Regler]")),
			new DeviceSpec(-1, 0x7177, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus V2A [Module]")),
			new DeviceSpec(-1, 0x7178, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus V2A [Heizkreis 1]")),
			new DeviceSpec(-1, 0x7179, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus V2A [Heizkreis 2]")),
			new DeviceSpec(-1, 0x717A, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus V2A [WMZ 1]")),
			new DeviceSpec(-1, 0x717B, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX Plus V2A [WMZ 2]")),
			new DeviceSpec(-1, 0x7210, 0xFFFF, 0x0000, 0x0000, new Text("SKSR 1/2/3")),
			new DeviceSpec(-1, 0x7211, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3 [HK1]")),
			new DeviceSpec(-1, 0x7212, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3 [HK2]")),
			new DeviceSpec(-1, 0x7213, 0xFFFF, 0x0000, 0x0000, new Text("SKSC3 [HK3]")),
			new DeviceSpec(-1, 0x7221, 0xFFFF, 0x0000, 0x0000, new Text("DrainBloC")),
			new DeviceSpec(-1, 0x7231, 0xFFFF, 0x0000, 0x0000, new Text("SC25")),
			new DeviceSpec(-1, 0x7311, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol M [Regler]")),
			new DeviceSpec(-1, 0x7312, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol M [HK1]")),
			new DeviceSpec(-1, 0x7313, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol M [HK2]")),
			new DeviceSpec(-1, 0x7315, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol M [Volumen]")),
			new DeviceSpec(-1, 0x7316, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol M [WMZ1]")),
			new DeviceSpec(-1, 0x7317, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol M [WMZ2]")),
			new DeviceSpec(-1, 0x7321, 0xFFFF, 0x0000, 0x0000, new Text("Vitosolic 200 [Regler]")),
			new DeviceSpec(-1, 0x7326, 0xFFFF, 0x0000, 0x0000, new Text("Vitosolic 200 [WMZ1]")),
			new DeviceSpec(-1, 0x7327, 0xFFFF, 0x0000, 0x0000, new Text("Vitosolic 200 [WMZ2]")),
			new DeviceSpec(-1, 0x7331, 0xFFFF, 0x0000, 0x0000, new Text("SLR")),
			new DeviceSpec(-1, 0x7332, 0xFFFF, 0x0000, 0x0000, new Text("SLR-Erweiterungsmodul #1")),
			new DeviceSpec(-1, 0x7333, 0xFFFF, 0x0000, 0x0000, new Text("SLR-Erweiterungsmodul #2")),
			new DeviceSpec(-1, 0x7334, 0xFFFF, 0x0000, 0x0000, new Text("SLR-Erweiterungsmodul #3")),
			new DeviceSpec(-1, 0x7335, 0xFFFF, 0x0000, 0x0000, new Text("SLR-Erweiterungsmodul #4")),
			new DeviceSpec(-1, 0x7341, 0xFFFF, 0x0000, 0x0000, new Text("SLR XT")),
			new DeviceSpec(-1, 0x7342, 0xFFFF, 0x0000, 0x0000, new Text("SLR XT-Erweiterungsmodul 1")),
			new DeviceSpec(-1, 0x7343, 0xFFFF, 0x0000, 0x0000, new Text("SLR XT-Erweiterungsmodul 2")),
			new DeviceSpec(-1, 0x7344, 0xFFFF, 0x0000, 0x0000, new Text("SLR XT-Erweiterungsmodul 3")),
			new DeviceSpec(-1, 0x7345, 0xFFFF, 0x0000, 0x0000, new Text("SLR XT-Erweiterungsmodul 4")),
			new DeviceSpec(-1, 0x7346, 0xFFFF, 0x0000, 0x0000, new Text("SLR XT-Erweiterungsmodul 5")),
			new DeviceSpec(-1, 0x7411, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol ES")),
			new DeviceSpec(-1, 0x7421, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BX")),
			new DeviceSpec(-1, 0x7422, 0xFFFF, 0x0000, 0x0000, new Text("IZEN DTi2")),
			new DeviceSpec(-1, 0x7428, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol BXL")),
			new DeviceSpec(-1, 0x7441, 0xFFFF, 0x0000, 0x0000, new Text("ZEN DT6 [Regler]")),
			new DeviceSpec(-1, 0x7442, 0xFFFF, 0x0000, 0x0000, new Text("ZEN DT6 [WMZ1]")),
			new DeviceSpec(-1, 0x7451, 0xFFFF, 0x0000, 0x0000, new Text("Kioto SLM")),
			new DeviceSpec(-1, 0x7511, 0xFFFF, 0x0000, 0x0000, new Text("SOLTEX-Regler [Teil 1]")),
			new DeviceSpec(-1, 0x7512, 0xFFFF, 0x0000, 0x0000, new Text("SOLTEX-Regler [Teil 2]")),
			new DeviceSpec(-1, 0x7521, 0xFFFF, 0x0000, 0x0000, new Text("Regtronic RQ-B")),
			new DeviceSpec(-1, 0x7522, 0xFFFF, 0x0000, 0x0000, new Text("Regtronic RX-B [Regler]")),
			new DeviceSpec(-1, 0x7523, 0xFFFF, 0x0000, 0x0000, new Text("Regtronic RX-B [Module]")),
			new DeviceSpec(-1, 0x7530, 0xFFF0, 0x0000, 0x0000, new Text("Regtronic RX-B [WMZ #]")),
			new DeviceSpec(-1, 0x7541, 0xFFFF, 0x0000, 0x0000, new Text("Oventrop RQ-B XXL")),
			new DeviceSpec(-1, 0x7611, 0xFFFF, 0x0000, 0x0000, new Text("Friwa")),
			new DeviceSpec(-1, 0x7621, 0xFFFF, 0x0000, 0x0000, new Text("SOLEX [Regler]")),
			new DeviceSpec(-1, 0x7622, 0xFFFF, 0x0000, 0x0000, new Text("SOLEX [WMZ]")),
			new DeviceSpec(-1, 0x7651, 0xFFFF, 0x0000, 0x0000, new Text("FriWa Kaskadenmaster Version 1")),
			new DeviceSpec(-1, 0x7711, 0xFFFF, 0x0000, 0x0000, new Text("Multitronic [Regler]")),
			new DeviceSpec(-1, 0x7712, 0xFFFF, 0x0000, 0x0000, new Text("Multitronic [WMZ]")),
			new DeviceSpec(-1, 0x7721, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E [Regler]")),
			new DeviceSpec(-1, 0x7722, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E [WMZ]")),
			new DeviceSpec(-1, 0x7729, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E Fahrenheit [Regler]")),
			new DeviceSpec(-1, 0x772A, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol E Fahrenheit [WMZ]")),
			new DeviceSpec(-1, 0x7731, 0xFFFF, 0x0000, 0x0000, new Text("SOLTOP DeltaSol S2/S3")),
			new DeviceSpec(-1, 0x7751, 0xFFFF, 0x0000, 0x0000, new Text("DeDietrich Diemasol C v2007")),
			new DeviceSpec(-1, 0x7761, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol Pool")),
			new DeviceSpec(-1, 0x7762, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol Pool [WMZ]")),
			new DeviceSpec(-1, 0x7771, 0xFFFF, 0x0000, 0x0000, new Text("DDS-Crawler")),
			new DeviceSpec(-1, 0x7772, 0xFFFF, 0x0000, 0x0000, new Text("RPT-Testsoftware")),
			new DeviceSpec(-1, 0x7773, 0xFFFF, 0x0000, 0x0000, new Text("RPT-Steuerbox")),
			new DeviceSpec(-1, 0x7774, 0xFFFF, 0x0000, 0x0000, new Text("EMZ/CME")),
			new DeviceSpec(-1, 0x7821, 0xFFFF, 0x0000, 0x0000, new Text("COSMO Multi [Regler]")),
			new DeviceSpec(-1, 0x7822, 0xFFFF, 0x0000, 0x0000, new Text("COSMO Multi [WMZ]")),
			new DeviceSpec(-1, 0x7831, 0xFFFF, 0x0000, 0x0000, new Text("COSMO Multi HK 1 Estrichtrockung [Modul 1]")),
			new DeviceSpec(-1, 0x7832, 0xFFFF, 0x0000, 0x0000, new Text("COSMO Multi HK 2 Estrichtrockung [Modul 2]")),
			new DeviceSpec(-1, 0x7833, 0xFFFF, 0x0000, 0x0000, new Text("COSMO Multi HK 3 Estrichtrockung [Modul 3]")),
			new DeviceSpec(-1, 0x7834, 0xFFFF, 0x0000, 0x0000, new Text("COSMO Multi HK Estrichtrockung [Lokal]")),
			new DeviceSpec(-1, 0x7840, 0xFFFF, 0x0000, 0x0000, new Text("COSMO UNO")),
			new DeviceSpec(-1, 0x7841, 0xFFFF, 0x0000, 0x0000, new Text("COSMO UNO [WMZ1]")),
			new DeviceSpec(-1, 0x7900, 0xFFFF, 0x0000, 0x0000, new Text("R-Wandler")),
			new DeviceSpec(-1, 0x7910, 0xFFFF, 0x0000, 0x0000, new Text("PAW SOLEX SC5.14 [Regler]")),
			new DeviceSpec(-1, 0x7911, 0xFFFF, 0x0000, 0x0000, new Text("PAW SOLEX SC5.14 [Module]")),
			new DeviceSpec(-1, 0x7920, 0xFFF0, 0x0000, 0x0000, new Text("PAW SOLEX SC5.14 [Heizkreis #]")),
			new DeviceSpec(-1, 0x7930, 0xFFF0, 0x0000, 0x0000, new Text("PAW SOLEX SC5.14 [WMZ #]")),
			new DeviceSpec(-1, 0x7D04, 0xFFFF, 0x0000, 0x0000, new Text("FRISTA-mix")),
			new DeviceSpec(-1, 0x7E11, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol MX [Regler]")),
			new DeviceSpec(-1, 0x7E12, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol MX [Module]")),
			new DeviceSpec(-1, 0x7E20, 0xFFF0, 0x0000, 0x0000, new Text("DeltaSol MX [Heizkreis #]")),
			new DeviceSpec(-1, 0x7E30, 0xFFF0, 0x0000, 0x0000, new Text("DeltaSol MX [WMZ #]")),
			new DeviceSpec(-1, 0x7E71, 0xFFFF, 0x0000, 0x0000, new Text("EMV-Software")),
			new DeviceSpec(-1, 0x7F61, 0xFFFF, 0x0000, 0x0000, new Text("IOC-Modul [Messwerte]")),
			new DeviceSpec(-1, 0x7F62, 0xFFFF, 0x0000, 0x0000, new Text("IOC-Modul [Tagesbilanz]")),
			new DeviceSpec(-1, 0x7F63, 0xFFFF, 0x0000, 0x0000, new Text("IOC-Modul [Entnahmekreis]")),
			new DeviceSpec(-1, 0x7F64, 0xFFFF, 0x0000, 0x0000, new Text("IOC-Modul [Debug-Werte]")),
			new DeviceSpec(-1, 0x7F65, 0xFFFF, 0x0000, 0x0000, new Text("IOC-Modul [Messwerte_1s]")),
			new DeviceSpec(-1, 0x7F71, 0xFFFF, 0x0000, 0x0000, new Text("DeltaSol FCS")),
	}, new PacketSpec[] {
			createPacketSpecTemplate_0000_0000_0302(),
			createPacketSpecTemplate_0000_4010_0100(),
			createPacketSpecTemplate_0000_4420_0100(),
			createPacketSpecTemplate_0000_5361_0201(),
			createPacketSpecTemplate_0000_5361_0202(),
			createPacketSpecTemplate_0000_6510_0100(),
			createPacketSpecTemplate_0000_6520_0100(),
			createPacketSpecTemplate_0000_6650_0100(),
			createPacketSpecTemplate_0010_0053_0100(),
			createPacketSpecTemplate_0010_1001_0100(),
			createPacketSpecTemplate_0010_1010_0100(),
			createPacketSpecTemplate_0010_1020_0100(),
			createPacketSpecTemplate_0010_1040_0100(),
			createPacketSpecTemplate_0010_1050_0100(),
			createPacketSpecTemplate_0010_1051_0100(),
			createPacketSpecTemplate_0010_1052_0100(),
			createPacketSpecTemplate_0010_1053_0100(),
			createPacketSpecTemplate_0010_1054_0100(),
			createPacketSpecTemplate_0010_1055_0100(),
			createPacketSpecTemplate_0010_1056_0100(),
			createPacketSpecTemplate_0010_1057_0100(),
			createPacketSpecTemplate_0010_1058_0100(),
			createPacketSpecTemplate_0010_1059_0100(),
			createPacketSpecTemplate_0010_105A_0100(),
			createPacketSpecTemplate_0010_105B_0100(),
			createPacketSpecTemplate_0010_105D_0100(),
			createPacketSpecTemplate_0010_105E_0100(),
			createPacketSpecTemplate_0010_105F_0100(),
			createPacketSpecTemplate_0010_1060_0100(),
			createPacketSpecTemplate_0010_1064_0100(),
			createPacketSpecTemplate_0010_1100_0100(),
			createPacketSpecTemplate_0010_1120_0100(),
			createPacketSpecTemplate_0010_1121_0100(),
			createPacketSpecTemplate_0010_1122_0100(),
			createPacketSpecTemplate_0010_1140_0100(),
			createPacketSpecTemplate_0010_1150_0100(),
			createPacketSpecTemplate_0010_1160_0100(),
			createPacketSpecTemplate_0010_1161_0100(),
			createPacketSpecTemplate_0010_1162_0100(),
			createPacketSpecTemplate_0010_1200_0100(),
			createPacketSpecTemplate_0010_1210_0100(),
			createPacketSpecTemplate_0010_2211_0100(),
			createPacketSpecTemplate_0010_2213_0100(),
			createPacketSpecTemplate_0010_2231_0100(),
			createPacketSpecTemplate_0010_2232_0100(),
			createPacketSpecTemplate_0010_2241_0100(),
			createPacketSpecTemplate_0010_2251_0100(),
			createPacketSpecTemplate_0010_2252_0100(),
			createPacketSpecTemplate_0010_2261_0100(),
			createPacketSpecTemplate_0010_2262_0100(),
			createPacketSpecTemplate_0010_2271_0100(),
			createPacketSpecTemplate_0010_2272_0100(),
			createPacketSpecTemplate_0010_2360_0100(),
			createPacketSpecTemplate_0010_2362_0100(),
			createPacketSpecTemplate_0010_3011_0100(),
			createPacketSpecTemplate_0010_3112_0100(),
			createPacketSpecTemplate_0010_3113_0100(),
			createPacketSpecTemplate_0010_3114_0100(),
			createPacketSpecTemplate_0010_3211_0100(),
			createPacketSpecTemplate_0010_3221_0100(),
			createPacketSpecTemplate_0010_3231_0100(),
			createPacketSpecTemplate_0010_3241_0100(),
			createPacketSpecTemplate_0010_3251_0100(),
			createPacketSpecTemplate_0010_3271_0100(),
			createPacketSpecTemplate_0010_3311_0100(),
			createPacketSpecTemplate_0010_4111_0100(),
			createPacketSpecTemplate_0010_4211_0100(),
			createPacketSpecTemplate_0010_4212_0100(),
			createPacketSpecTemplate_0010_4213_0100(),
			createPacketSpecTemplate_0010_4214_0100(),
			createPacketSpecTemplate_0010_4221_0100(),
			createPacketSpecTemplate_0010_4223_0100(),
			createPacketSpecTemplate_0010_4224_0100(),
			createPacketSpecTemplate_0010_4231_0100(),
			createPacketSpecTemplate_0010_4241_0100(),
			createPacketSpecTemplate_0010_4251_0100(),
			createPacketSpecTemplate_0010_4252_0100(),
			createPacketSpecTemplate_0010_4261_0100(),
			createPacketSpecTemplate_0010_4265_0100(),
			createPacketSpecTemplate_0010_4278_0100(),
			createPacketSpecTemplate_0010_4279_0100(),
			createPacketSpecTemplate_0010_427B_0100(),
			createPacketSpecTemplate_0010_4311_0100(),
			createPacketSpecTemplate_0010_4321_0100(),
			createPacketSpecTemplate_0010_4730_0100(),
			createPacketSpecTemplate_0010_4731_0100(),
			createPacketSpecTemplate_0010_4A00_0100(),
			createPacketSpecTemplate_0010_5111_0100(),
			createPacketSpecTemplate_0010_5112_0100(),
			createPacketSpecTemplate_0010_5121_0100(),
			createPacketSpecTemplate_0010_5141_0100(),
			createPacketSpecTemplate_0010_5210_0100(),
			createPacketSpecTemplate_0010_5221_0100(),
			createPacketSpecTemplate_0010_5231_0100(),
			createPacketSpecTemplate_0010_5251_0100(),
			createPacketSpecTemplate_0010_5311_0100(),
			createPacketSpecTemplate_0010_5351_0100(),
			createPacketSpecTemplate_0010_5400_0100(),
			createPacketSpecTemplate_0010_5410_0100(),
			createPacketSpecTemplate_0010_5420_0100(),
			createPacketSpecTemplate_0010_5430_0100(),
			createPacketSpecTemplate_0010_5510_0100(),
			createPacketSpecTemplate_0010_5611_0100(),
			createPacketSpecTemplate_0010_6610_0100(),
			createPacketSpecTemplate_0010_6620_0100(),
			createPacketSpecTemplate_0010_7101_0100(),
			createPacketSpecTemplate_0010_7112_0100(),
			createPacketSpecTemplate_0010_7113_0100(),
			createPacketSpecTemplate_0010_7120_0100(),
			createPacketSpecTemplate_0010_7130_0100(),
			createPacketSpecTemplate_0010_7140_0100(),
			createPacketSpecTemplate_0010_7150_0100(),
			createPacketSpecTemplate_0010_7160_0100(),
			createPacketSpecTemplate_0010_7161_0100(),
			createPacketSpecTemplate_0010_7162_0100(),
			createPacketSpecTemplate_0010_7163_0100(),
			createPacketSpecTemplate_0010_7176_0100(),
			createPacketSpecTemplate_0010_7177_0100(),
			createPacketSpecTemplate_0010_7178_0100(),
			createPacketSpecTemplate_0010_7179_0100(),
			createPacketSpecTemplate_0010_717A_0100(),
			createPacketSpecTemplate_0010_717B_0100(),
			createPacketSpecTemplate_0010_7210_0100(),
			createPacketSpecTemplate_0010_7211_0100(),
			createPacketSpecTemplate_0010_7212_0100(),
			createPacketSpecTemplate_0010_7213_0100(),
			createPacketSpecTemplate_0010_7221_0100(),
			createPacketSpecTemplate_0010_7231_0100(),
			createPacketSpecTemplate_0010_7311_0100(),
			createPacketSpecTemplate_0010_7312_0100(),
			createPacketSpecTemplate_0010_7315_0100(),
			createPacketSpecTemplate_0010_7316_0100(),
			createPacketSpecTemplate_0010_7321_0100(),
			createPacketSpecTemplate_0010_7326_0100(),
			createPacketSpecTemplate_0010_7331_0100(),
			createPacketSpecTemplate_0010_7332_0100(),
			createPacketSpecTemplate_0010_7333_0100(),
			createPacketSpecTemplate_0010_7334_0100(),
			createPacketSpecTemplate_0010_7335_0100(),
			createPacketSpecTemplate_0010_7341_0100(),
			createPacketSpecTemplate_0010_7342_0100(),
			createPacketSpecTemplate_0010_7343_0100(),
			createPacketSpecTemplate_0010_7344_0100(),
			createPacketSpecTemplate_0010_7345_0100(),
			createPacketSpecTemplate_0010_7346_0100(),
			createPacketSpecTemplate_0010_7411_0100(),
			createPacketSpecTemplate_0010_7421_0100(),
			createPacketSpecTemplate_0010_7428_0100(),
			createPacketSpecTemplate_0010_7441_0100(),
			createPacketSpecTemplate_0010_7442_0100(),
			createPacketSpecTemplate_0010_7511_0100(),
			createPacketSpecTemplate_0010_7512_0100(),
			createPacketSpecTemplate_0010_7521_0100(),
			createPacketSpecTemplate_0010_7522_0100(),
			createPacketSpecTemplate_0010_7523_0100(),
			createPacketSpecTemplate_0010_7530_0100(),
			createPacketSpecTemplate_0010_7541_0100(),
			createPacketSpecTemplate_0010_7611_0100(),
			createPacketSpecTemplate_0010_7621_0100(),
			createPacketSpecTemplate_0010_7622_0100(),
			createPacketSpecTemplate_0010_7651_0100(),
			createPacketSpecTemplate_0010_7711_0100(),
			createPacketSpecTemplate_0010_7712_0100(),
			createPacketSpecTemplate_0010_7721_0100(),
			createPacketSpecTemplate_0010_7722_0100(),
			createPacketSpecTemplate_0010_7729_0100(),
			createPacketSpecTemplate_0010_772A_0100(),
			createPacketSpecTemplate_0010_7731_0100(),
			createPacketSpecTemplate_0010_7751_0100(),
			createPacketSpecTemplate_0010_7761_0100(),
			createPacketSpecTemplate_0010_7762_0100(),
			createPacketSpecTemplate_0010_7774_0100(),
			createPacketSpecTemplate_0010_7821_0100(),
			createPacketSpecTemplate_0010_7822_0100(),
			createPacketSpecTemplate_0010_7830_0100(),
			createPacketSpecTemplate_0010_7840_0100(),
			createPacketSpecTemplate_0010_7841_0100(),
			createPacketSpecTemplate_0010_7910_0100(),
			createPacketSpecTemplate_0010_7911_0100(),
			createPacketSpecTemplate_0010_7920_0100(),
			createPacketSpecTemplate_0010_7930_0100(),
			createPacketSpecTemplate_0010_7D04_0100(),
			createPacketSpecTemplate_0010_7E11_0100(),
			createPacketSpecTemplate_0010_7E12_0100(),
			createPacketSpecTemplate_0010_7E20_0100(),
			createPacketSpecTemplate_0010_7E30_0100(),
			createPacketSpecTemplate_0010_7F61_0100(),
			createPacketSpecTemplate_0010_7F62_0100(),
			createPacketSpecTemplate_0010_7F63_0100(),
			createPacketSpecTemplate_0010_7F64_0100(),
			createPacketSpecTemplate_0010_7F65_0100(),
			createPacketSpecTemplate_0010_7F71_0100(),
			createPacketSpecTemplate_0015_105F_0100(),
			createPacketSpecTemplate_4420_0000_0200(),
			createPacketSpecTemplate_5360_5360_0102(),
			createPacketSpecTemplate_5361_5360_0301(),
			createPacketSpecTemplate_6510_0000_0200(),
			createPacketSpecTemplate_6520_0000_0200(),
			createPacketSpecTemplate_6650_0000_0200(),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_0000_0302() {
		return new PacketSpec(-1, 0x0000, 0xFFFF, 0x0000, 0xFFFF, 0x0302, new PacketFieldSpec[] {
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_4010_0100() {
		return new PacketSpec(-1, 0x0000, 0x0000, 0x4010, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("002_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, false, 256L),
				new PacketFieldPartSpec(0, 0, 255, false, 1000L),
				new PacketFieldPartSpec(1, 0, 255, false, 256000L),
				new PacketFieldPartSpec(12, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(13, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Leistung"), 10, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(14, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Volumenstrom"), 0.01, PacketFieldType_Number_0_01_CubicMetersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Glykol"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Druck"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_4420_0100() {
		return new PacketSpec(-1, 0x0000, 0x0000, 0x4420, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_1_0", new Text("Fehlerstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("001_2_0", new Text("Modulstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(1, 0, 255, false, 1L),
				new PacketFieldPartSpec(2, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Relaisstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Fehler-Info"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Fernversteller"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Aussentemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Modulversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_5361_0201() {
		return new PacketSpec(-1, 0x0000, 0xFFFF, 0x5361, 0xFFFF, 0x0201, new PacketFieldSpec[] {
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_5361_0202() {
		return new PacketSpec(-1, 0x0000, 0xFFFF, 0x5361, 0xFFFF, 0x0202, new PacketFieldSpec[] {
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_6510_0100() {
		return new PacketSpec(-1, 0x0000, 0x0000, 0x6510, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_1_0", new Text("Fehlerstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("001_2_0", new Text("Modulstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(1, 0, 255, false, 1L),
				new PacketFieldPartSpec(2, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Relaisstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_1", new Text("Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("003_1_2", new Text("Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("003_1_4", new Text("Relais 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("003_1_8", new Text("Relais 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("003_1_16", new Text("Relais 5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("003_1_32", new Text("Relais 6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Fehler-Info"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Fernversteller"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Aussentemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Speichertemperatur 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Modulversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Speichertemperatur 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_6520_0100() {
		return new PacketSpec(-1, 0x0000, 0x0000, 0x6520, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0000_6650_0100() {
		return new PacketSpec(-1, 0x0000, 0x0000, 0x6650, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Resistor 1"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Resistor 2"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Resistor 3"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Resistor 4"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Resistor 5"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Resistor 6"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_0053_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x0053, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Resistor Sensor 1"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Resistor Sensor 2"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Resistor Sensor 3"), 0.001, PacketFieldType_Number_0_001_Ohms, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Current Sensor 4"), 0.001, PacketFieldType_Number_0_001_Milliamperes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperature Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperature Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperature Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Impulse Counter Sensor 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Impulse Counter Sensor 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Impulse Counter Sensor 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Irradiation Sensor 4"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1001_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1001, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur VFS/RPS (S6)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Volumenstrom V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumenstrom VFS (S6)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom Flowrotor (S7)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Druck RPS (S6)"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("033_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("034_1_0", new Text("PWM A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("035_1_0", new Text("PWM B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(35, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Warnmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1010_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1010, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärme Gesamt"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Wärme Heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärme Gestern"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärme Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wärme Vorwoche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Wärme Monat"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Wärme Vormonat"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärme Jahr"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Wärme Vorjahr"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Volumen gesamt"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Volumen Heute"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Volumen Gestern"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Volumen Woche"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Volumen Vorwoche"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Volumen Monat"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Volumen Vormonat"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Volumen Jahr"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Volumen Vorjahr"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Leistung"), 0.001, PacketFieldType_Number_0_001_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1020_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1020, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Zustand Sensor 8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Drehzahl Relais pot_frei"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl Ausgang PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Drehzahl Ausgang PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1040_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1040, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlermeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Relais Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Relais Mischer Auf"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Relais Mischer Zu"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Handebetrieb Relais Pumpe"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Handebetrieb Relais Mischer Auf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Handebetrieb Relais Mischer Zu"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("NH-Anforderung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Parameter Start"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Parameter TStart"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Parameter TMax"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Parameter Anstieg"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Parameter Anstiegszeit"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Parameter Haltezeit"), 1, PacketFieldType_Number_1_Days, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1050_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1050, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung CS"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Impulse 1 V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Digital Input"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("068_1_0", new Text("PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("069_1_0", new Text("PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(69, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("070_1_0", new Text("PWM 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Vorlauf Soll HK1 Modul Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Status HK1 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Vorlauf Soll HK2 Modul Sensor 25"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Status HK2 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Vorlauf Soll HK3 Modul Sensor 32"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Status HK3 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Vorlauf Soll Heizkreis Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Status Heizkreis"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("060_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, true, 100L),
				new PacketFieldPartSpec(61, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1051_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1051, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Vorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Rücklauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1052_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1052, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Einstrahlung Sensor 10"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom Sensor 9"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Sensor 11"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Volumenstrom Sensor 12"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Druck Sensor 11"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Druck Sensor 12"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("041_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("042_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1053_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1053, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1054_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1054, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1055_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1055, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1056_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1056, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1057_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1057, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1058_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1058, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Sensor 3 Zustand (FS)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Sensor 4 Zustand (TA)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1059_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1059, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Regler Ausgang 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Regler Ausgang 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Warnungmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_105A_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x105A, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Außentemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Speicher Unten"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Speicher Oben"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Wärmepumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais FastOff"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Betriebssekunden Relais Pumpe"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Betriebssekunden Relais FastOff"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Fehler Außensensor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Fehler Speichersensor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Fehler Pumpe"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Fehler Wärmepumpe"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("020_1_16", new Text("Fehler Flußschalter"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_105B_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x105B, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("004_2_0", new Text("TCAP"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("TRH"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("000_2_0", new Text("TRB"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("h P1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("h P2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("kWh"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("MWh"), 1, PacketFieldType_Number_1_MegawattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_105D_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x105D, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur VFD1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Volumenstrom VFD1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("UnitType"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("ErrorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Statusmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_2_0", new Text("SW Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_105E_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x105E, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Sensor 3 Zustand (FS)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Sensor 4 Zustand (TA)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Waermepumpe Zustand"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("037_1_0", new Text("Waermepumpe Betriebsmodus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Waermepumpe TProjekt"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Mischer Befehl"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("041_2_0", new Text("Mischer dT"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, false, 1L),
				new PacketFieldPartSpec(42, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("TPlan Timer"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_105F_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x105F, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("PWM A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("PWM B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Mischer auf"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Mischer zu"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Systemmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1060_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1060, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("SZ Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("SZ Spannung"), 0.001, PacketFieldType_Number_0_001_Volts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Impulszähler 1"), 1, PacketFieldType_Number_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Impulszähler 2"), 1, PacketFieldType_Number_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Sensor Unterbrechung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_1_1", new Text("Sensor Unterbrechung S1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("036_1_2", new Text("Sensor Unterbrechung S2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("036_1_4", new Text("Sensor Unterbrechung S3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_8", new Text("Sensor Unterbrechung S4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("036_1_16", new Text("Sensor Unterbrechung S5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("036_1_32", new Text("Sensor Unterbrechung S6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("036_1_64", new Text("Sensor Unterbrechung S7"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("036_1_128", new Text("Sensor Unterbrechung S8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("036_1_256", new Text("Sensor Unterbrechung S9"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 8, 1, true, 1L),
			}),
			new PacketFieldSpec("036_1_512", new Text("Sensor Unterbrechung S10"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 9, 2, true, 1L),
			}),
			new PacketFieldSpec("036_1_1024", new Text("Sensor Unterbrechung S11"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 10, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_2048", new Text("Sensor Unterbrechung S12"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 11, 8, true, 1L),
			}),
			new PacketFieldSpec("038_1_1", new Text("Sensor Kurzschluss"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("038_1_1_1", new Text("Sensor Kurzschluss S1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("038_1_2", new Text("Sensor Kurzschluss S2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("038_1_4", new Text("Sensor Kurzschluss S3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("038_1_8", new Text("Sensor Kurzschluss S4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("038_1_16", new Text("Sensor Kurzschluss S5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("038_1_32", new Text("Sensor Kurzschluss S6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("038_1_64", new Text("Sensor Kurzschluss S7"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("038_1_128", new Text("Sensor Kurzschluss S8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("038_1_256", new Text("Sensor Kurzschluss S9"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 8, 1, true, 1L),
			}),
			new PacketFieldSpec("038_1_512", new Text("Sensor Kurzschluss S10"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 9, 2, true, 1L),
			}),
			new PacketFieldSpec("038_1_1024", new Text("Sensor Kurzschluss S11"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 10, 4, true, 1L),
			}),
			new PacketFieldSpec("038_1_2048", new Text("Sensor Kurzschluss S12"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 11, 8, true, 1L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Sensor benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("040_1_1", new Text("Sensor 1 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("040_1_2", new Text("Sensor 2 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("040_1_4", new Text("Sensor 3 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("040_1_8", new Text("Sensor 4 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("040_1_16", new Text("Sensor 5 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("040_1_32", new Text("Sensor 6 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("040_1_64", new Text("Sensor 7 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("040_1_128", new Text("Sensor 8 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("040_1_256", new Text("Sensor 9 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 8, 1, true, 1L),
			}),
			new PacketFieldSpec("040_1_512", new Text("Sensor 10 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 9, 2, true, 1L),
			}),
			new PacketFieldSpec("040_1_1024", new Text("Sensor 11 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 10, 4, true, 1L),
			}),
			new PacketFieldSpec("040_1_2048", new Text("Sensor 12 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 11, 8, true, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_1_0", new Text("Lasterkennung Relais"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_1_1", new Text("Lasterkennung R1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("056_1_2", new Text("Lasterkennung R2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("056_1_4", new Text("Lasterkennung R3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("056_1_8", new Text("Lasterkennung R4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("057_1_0", new Text("Fehler Lasterkennung Relais"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("057_1_1", new Text("Fehler Lasterkennung R1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("057_1_2", new Text("Fehler Lasterkennung R2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("057_1_4", new Text("Fehler Lasterkennung R3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("057_1_8", new Text("Fehler Lasterkennung R4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Relaisbenutzungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("058_1_1", new Text("Relais 1 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("058_1_2", new Text("Relais 2 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("058_1_4", new Text("Relais 3 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("058_1_8", new Text("Relais 4 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("058_1_16", new Text("Relais 5 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("058_1_32", new Text("Relais 6 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("058_1_64", new Text("Relais 7 benutzt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("060_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Warnmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("064_1_0", new Text("SW-Version"), 0.1, PacketFieldType_Number_0_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("065_1_0", new Text("Minorversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("066_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, false, 1L),
				new PacketFieldPartSpec(67, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("072_1_0", new Text("Fehler Solarzelle"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1064_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1064, 0xFFFC, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärme Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Wärme kWh"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Wärme MWh"), 1, PacketFieldType_Number_1_MegawattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0_1", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1100_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1100, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("010_2_0", new Text("T LT OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("T LT IN:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("T MT OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("T MT IN:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("000_2_0", new Text("T E1 OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("T E2 OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("T A1 OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("T A2 OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("T HT OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("T AMB:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("T HT Ext:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("T LT Ext:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_1_1", new Text("Anlage:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("026_1_2", new Text("Heizmodus:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("026_1_4", new Text("Strömungswächter LT-Kreis:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("026_1_16", new Text("M1_A_IN:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("026_1_32", new Text("M2_A_IN:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("026_1_64", new Text("M1_E_IN:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("026_1_128", new Text("M2_E_IN:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("025_1_1", new Text("M1_A_OUT:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("025_1_2", new Text("M2_A_OUT:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("025_1_4", new Text("M1_E_OUT:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("025_1_8", new Text("M2_E_OUT:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("025_1_32", new Text("Betriebsmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("025_1_16", new Text("Sammelstörmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("025_1_64", new Text("Betriebsart (Kühlen/Heizen)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("HT-Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("MT-Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("LT-Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("RCS %:"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("025_1_8_1", new Text("SPR Relais:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Phase:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Systemcode:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_2_0_1", new Text("EXT-Volt (T-SET):"), 1, PacketFieldType_Number_1_Volts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("T LTS OUT AVG"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("T LT OUT Cycle"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("T LT IN AVG"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("T LT IN Cycle"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("T MT OUT AVG"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("T MT OUT Cycle"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("060_2_0", new Text("Kälteleistung letzter Zyklus"), 0.1, PacketFieldType_Number_0_1_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Volumenstrom Kaltwasserkreis (dV_LT)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Aktuellen Sollwert (T-SET):"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Externe Solltemperatur (T-SET-EXT):"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Anzahl Zyklen (seit Start):"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Anzahl Zyklen (Summe):"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Aufsummierte Besprühungzeit:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Systemzeit:"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("066_2_0", new Text("Jahr:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, false, 1L),
				new PacketFieldPartSpec(67, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("068_1_0", new Text("Monat:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("069_1_0", new Text("Tag:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(69, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("070_1_0", new Text("Kern:"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 255, true, 100L),
				new PacketFieldPartSpec(71, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1120_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1120, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Anzeige-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1121_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1121, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Volumenstrom"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("UnitType"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("018_2_0", new Text("ErrorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("018_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("018_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("018_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Statusmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1122_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1122, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("UnitType"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("ErrorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Statusmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1140_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1140, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Heizung_Heizkreis1_TVorlaufSoll_C"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Heizung_Heizkreis1_Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Heizung_Heizkreis1_Betriebsart"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Heizung_Heizkreis1_Brennerstarts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1150_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1150, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Sensor S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Sensor S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Sensor S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Sensor S4 T"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Sensor S4 / dV"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Sensor S5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Poti"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_1_0", new Text("DipSwitch"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Primärpumpe"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Mischventil"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Zirkulationspumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_2_0", new Text("WW-Solltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
				new PacketFieldPartSpec(22, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Zirkulation Einschaltz_"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Zirkulation Sperrzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Therm_ Desinfektion"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebszeit Primärp_"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Betriebszeit Zirkulation"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_1_0", new Text("PWM A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("041_2_0", new Text("Kennlinie"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, false, 1L),
				new PacketFieldPartSpec(42, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("PID P-Anteil"), 0.001, PacketFieldType_Number_0_001_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("PID I-Anteil"), 0.001, PacketFieldType_Number_0_001_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("PID D-Anteil"), 0.001, PacketFieldType_Number_0_001_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1160_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1160, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Sensor 13"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Sensor 14"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Temperatur Sensor 15"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Einstrahlung Sensor 16"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur Sensor 17"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur Sensor 19"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur Sensor 20"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Volumenstrom Sensor 13"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Volumenstrom Sensor 14"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Volumenstrom Sensor 15"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Volumenstrom Sensor 17"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Volumenstrom Sensor 18"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Volumenstrom Sensor 19"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Volumenstrom Sensor 20"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("068_2_0", new Text("Druck Sensor 17"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("070_2_0", new Text("Druck Sensor 18"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 255, false, 1L),
				new PacketFieldPartSpec(71, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("072_2_0", new Text("Druck Sensor 19"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("074_2_0", new Text("Druck Sensor 20"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(74, 0, 255, false, 1L),
				new PacketFieldPartSpec(75, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("076_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("077_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(77, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("078_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(78, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("079_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(79, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("080_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("081_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(81, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("082_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(82, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("083_1_0", new Text("Drehzahl Relais 8"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(83, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("084_1_0", new Text("Drehzahl Relais 9"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("085_1_0", new Text("Drehzahl Relais 10"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(85, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("086_1_0", new Text("Drehzahl Relais 11"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(86, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("087_1_0", new Text("Drehzahl Relais 12"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(87, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("088_1_0", new Text("Drehzahl Relais 13"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("089_1_0", new Text("Drehzahl Relais 14"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(89, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("092_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(92, 0, 255, false, 1L),
				new PacketFieldPartSpec(93, 0, 255, false, 256L),
				new PacketFieldPartSpec(94, 0, 255, false, 65536L),
				new PacketFieldPartSpec(95, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1161_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1161, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Modul 3 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Modul 3 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Temperatur Modul 3 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Temperatur Modul 3 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur Modul 3 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur Modul 3 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur Modul 4 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur Modul 4 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Temperatur Modul 4 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Temperatur Modul 4 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Temperatur Modul 4 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Temperatur Modul 4 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Temperatur Modul 5 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Temperatur Modul 5 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Temperatur Modul 5 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Temperatur Modul 5 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Temperatur Modul 5 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Temperatur Modul 5 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1162_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1162, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Warmwassertemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Warmwassersoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Zapfvolumenstrom"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Speichervorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Zapfmenge gesamt"), 0.001, PacketFieldType_Number_0_001_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Primärpumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Drehzahl Zirkulation"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1200_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1200, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_1210_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x1210, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2211_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2211, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("UnitType"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("ErrorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Statusmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2213_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2213, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("022_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur GFD"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Volumenstrom 1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Volumenstrom 2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("PFB1 Duty"), 0.001, PacketFieldType_Number_0_001_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("PFB1 Freq_"), 0.001, PacketFieldType_Number_0_001_Hertz, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("PFB2 Duty"), 0.001, PacketFieldType_Number_0_001_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("PFB2 Freq_"), 0.001, PacketFieldType_Number_0_001_Hertz, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_1_0", new Text("UnitType"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Statusmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_2_0", new Text("ErrorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("020_1_16", new Text("GFD defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("020_1_32", new Text("PFB1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("020_1_64", new Text("PFB2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("032_2_0", new Text("SW Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2231_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2231, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Kollektor"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Speicher Solar"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Ofen Kesseltemp"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Speicher unten"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Rücklauf Heizkreis"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Speicher Entnahme"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Brauchwasserspeicher"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Zirkulation-Fühler"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Sensor 13"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Vorlauftemperatur HK1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Aussentemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Abgastemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_4_0", new Text("Impulseingang 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
				new PacketFieldPartSpec(40, 0, 255, false, 65536L),
				new PacketFieldPartSpec(41, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Impulseingang 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("088_2_0", new Text("Sensorbruch-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 255, false, 1L),
				new PacketFieldPartSpec(89, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("090_2_0", new Text("Sensorkurzschluss-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(90, 0, 255, false, 1L),
				new PacketFieldPartSpec(91, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("080_4_0", new Text("Sensorbenutzungs-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
				new PacketFieldPartSpec(81, 0, 255, false, 256L),
				new PacketFieldPartSpec(82, 0, 255, false, 65536L),
				new PacketFieldPartSpec(83, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("042_1_0", new Text("Pumpe Solar"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Pumpe Ofen"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Umschaltventil Kessel"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("BW Ladepumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Zirkulationspumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Relais 8"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Brennersperre 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Mischer Auf"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("Mischer Zu"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("053_1_0", new Text("HK - Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(53, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("054_1_0", new Text("Gas/ÖL/Pelletofen"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("084_4_0", new Text("Relaisbenutzungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 255, false, 1L),
				new PacketFieldPartSpec(85, 0, 255, false, 256L),
				new PacketFieldPartSpec(86, 0, 255, false, 65536L),
				new PacketFieldPartSpec(87, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Warnungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("072_2_0", new Text("Reglerversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("074_2_0", new Text("Systemzeit"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(74, 0, 255, false, 1L),
				new PacketFieldPartSpec(75, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2232_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2232, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_MegawattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2241_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2241, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("S4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("S5"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Primärpumpe"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Drehzahl Relais 1"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("errorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("warningMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("statusMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Bilanz Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Bilanz Dauer P1 an"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Bilanz Dauer P2 an"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Zapfmenge"), 0.1, PacketFieldType_Number_0_1_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Systemdatum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_1_0", new Text("Version"), 0.01, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 100L),
				new PacketFieldPartSpec(39, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2251_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2251, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur VFS/RPS (S6)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumenstrom V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom VFS (S6)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Flowrotor (S7)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Druck RPS (S6)"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("035_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(35, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("037_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("038_1_0", new Text("PWM A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("039_1_0", new Text("PWM B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_1_1", new Text("SW-Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_1_1", new Text("Urlaubsfunktion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("065_1_0", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Blockierschutz 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Blockierschutz 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Initalisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("076_4_0", new Text("Stabilisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, false, 256L),
				new PacketFieldPartSpec(78, 0, 255, false, 65536L),
				new PacketFieldPartSpec(79, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("080_1_0", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("081_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(81, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("082_1_0", new Text("Nachlauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(82, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("083_1_0", new Text("Thermische Desinfektion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(83, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("084_1_1", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("085_1_1", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(85, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("086_1_0", new Text("Spreizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(86, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("087_1_0", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(87, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("088_1_1", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("089_1_1", new Text("Einheit Temperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(89, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("090_1_1", new Text("Einheit Durchfluss"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(90, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("091_1_1", new Text("Einheit Druck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(91, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("093_1_1", new Text("Einheit Energie"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(93, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("094_1_1", new Text("Speichermaximaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(94, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("095_1_1", new Text("Neustarts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(95, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2252_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2252, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Wmz1_Leistung_W"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wmz1_WertHeute_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wmz1_WertWoche_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2261_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2261, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("TAGE"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Volumenstrom Sensor V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumenstrom Sensor VFS"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Sensor VFS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Regler Ausgang 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Betriebsstunden Relais1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Betriebsstunden Relais2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_1_1", new Text("Urlaubsfunktion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("049_1_1", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Initalisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Stabilisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_1_0", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("065_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Nachlauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_1", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("068_1_0", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("069_1_1", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(69, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("070_1_1", new Text("Einheit Temperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("071_1_1", new Text("Speichermaximaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(71, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("072_1_1", new Text("Neustarts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("076_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, false, 256L),
				new PacketFieldPartSpec(78, 0, 255, false, 65536L),
				new PacketFieldPartSpec(79, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2262_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2262, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Wmz1_Leistung_W"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wmz1_WertHeute_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wmz1_WertWoche_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2271_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2271, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("TAGE"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Volumenstrom V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Betriebsstunden Relais 3"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_1_1", new Text("Urlaubsfunktion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Blockierschutz 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Blockierschutz 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Initalisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("054_4_0", new Text("Stabilisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
				new PacketFieldPartSpec(56, 0, 255, false, 65536L),
				new PacketFieldPartSpec(57, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_1_0", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("061_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(61, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("062_1_0", new Text("Nachlauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("063_1_0", new Text("Thermische Desinfektion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(63, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("064_1_1", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("065_1_1", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Spreizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("068_1_1", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("069_1_1", new Text("Speichermaximaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(69, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("070_1_1", new Text("Neustarts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2272_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2272, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wert"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Leistung"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wert heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wert Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2360_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2360, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur VFS/RPS (S6)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("TAGE"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumenstrom V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom VFS (S6)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Flowrotor (S7)"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Druck RPS (S6)"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("035_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(35, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("037_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("038_1_0", new Text("PWM A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("039_1_0", new Text("PWM B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_1_1", new Text("Urlaubsfunktion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("065_1_0", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Blockierschutz 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Blockierschutz 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Initalisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("076_4_0", new Text("Stabilisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, false, 256L),
				new PacketFieldPartSpec(78, 0, 255, false, 65536L),
				new PacketFieldPartSpec(79, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("080_1_0", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("081_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(81, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("082_1_0", new Text("Nachlauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(82, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("083_1_0", new Text("Thermische Desinfektion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(83, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("084_1_1", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("085_1_1", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(85, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("086_1_0", new Text("Spreizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(86, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("087_1_0", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(87, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("088_1_1", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("089_1_1", new Text("Einheit Temperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(89, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("090_1_1", new Text("Einheit Durchfluss"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(90, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("091_1_1", new Text("Einheit Druck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(91, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("092_1_1", new Text("Eingeit Leistung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(92, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("093_1_1", new Text("Einheit Energie"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(93, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("094_1_1", new Text("Speichermaximaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(94, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("095_1_1", new Text("Neustarts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(95, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("100_4_0", new Text("WAMA (Counter)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(100, 0, 255, false, 1L),
				new PacketFieldPartSpec(101, 0, 255, false, 256L),
				new PacketFieldPartSpec(102, 0, 255, false, 65536L),
				new PacketFieldPartSpec(103, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("104_2_0", new Text("TWAMA"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(104, 0, 255, false, 1L),
				new PacketFieldPartSpec(105, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_2362_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x2362, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Wmz1_Leistung_W"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wmz1_WertHeute_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wmz1_WertWoche_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3011_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3011, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Strömungsgeschwindigkeit"), 0.01, PacketFieldType_Number_0_01_MetersPerSecond, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Luftstrom-Volumen"), 1, PacketFieldType_Number_1_CubicMetersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Luftstrom-Masse"), 1, PacketFieldType_Number_1_KilogramsPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Luftkanal-Querschnitt"), 0.01, PacketFieldType_Number_0_01_SquareMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Luftdichte"), 0.0001, PacketFieldType_Number_0_0001_KilogramsPerCubicMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Luftdruck"), 1, PacketFieldType_Number_1_Hectopascals, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Leistung"), 0.1, PacketFieldType_Number_0_1_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Wärmemenge kWh"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Wärmemenge MWh"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Betriebstage"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3112_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3112, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Kollektor-Temperatur (TC)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Speicher-Temperatur (TS)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Pumpendrehzahl (PC)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Steuerungszeit (tc)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Softwareversion"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Systemzeit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Timer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3113_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3113, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Kollektor-Temperatur (TC)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Speicher-Temperatur (TS)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Pumpendrehzahl (PC)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Steuerungszeit (tc)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Softwareversion"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3114_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3114, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Kollektor-Temperatur (TC)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Speicher-Temperatur (TS)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Heizungsrücklauf-Temperatur (TR)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Messfühler-Temperatur (TM)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Pumpendrehzahl (PC)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Ventil (R2)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Steuerungszeit (tc)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Softwareversion"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3211_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3211, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlercode"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Pumpenlaufzeit R1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Ladestatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Flags"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3221_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3221, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Regelflags"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3231_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3231, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_1", new Text("Relaisstatus Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("010_1_2", new Text("Relaisstatus Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 1, 2, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3241_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3241, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3251_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3251, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3271_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3271, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Pumpe 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Pumpe 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_1", new Text("Option PostPulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("015_1_2", new Text("Option Thermostat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("015_1_4", new Text("Option WMZ"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 1000L),
				new PacketFieldPartSpec(23, 0, 255, false, 256000L),
				new PacketFieldPartSpec(24, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(25, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_3311_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x3311, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4 (>= v1_02)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Drehzahl Relais 1 (<= v1_01)"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Drehzahl Relais 2 (<= v1_01)"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1 (>= v1_02)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2 (>= v1_02)"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Fehlermaske (>= v1_02)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Relaismaske (>= v1_02)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("006_2_0_1", new Text("Wärmemenge (<= v1_01)"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Wärmemenge (>= v1_02)"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4111_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4111, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Anzeige-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4211_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4211, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur S4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, true, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, true, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4212_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4212, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur S4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Variante"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden R1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden R2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, false, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4213_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4213, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur S4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur VFD1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Volumenstrom VFD1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Spannung 10V"), 0.1, PacketFieldType_Number_0_1_Volts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, true, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, true, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4214_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4214, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur S4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur VFD1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Volumenstrom VFD1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Spannung 10V"), 0.1, PacketFieldType_Number_0_1_Volts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, true, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, true, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4221_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4221, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Pumpe 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Pumpe 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_1", new Text("Option Kollektor Max_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("015_1_2", new Text("Option Kollektor Min_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("015_1_4", new Text("Option Kollektor Frost"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("015_1_8", new Text("Option Röhrenkollektor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("015_1_16", new Text("Option Rückkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("015_1_32", new Text("Option WMZ"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 1000L),
				new PacketFieldPartSpec(23, 0, 255, false, 256000L),
				new PacketFieldPartSpec(24, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(25, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4223_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4223, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Pumpe 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Pumpe 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_1", new Text("Option Kollektor Max_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("015_1_2", new Text("Option Kollektor Min_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("015_1_4", new Text("Option Kollektor Frost"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("015_1_8", new Text("Option Röhrenkollektor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("015_1_16", new Text("Option Rückkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("015_1_32", new Text("Option WMZ"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_Btus, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 1000L),
				new PacketFieldPartSpec(23, 0, 255, false, 256000L),
				new PacketFieldPartSpec(24, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(25, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4224_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4224, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Pumpe 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Pumpe 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_1", new Text("Option Kollektor Max_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("015_1_2", new Text("Option Kollektor Min_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("015_1_4", new Text("Option Kollektor Frost"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("015_1_8", new Text("Option Röhrenkollektor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("015_1_16", new Text("Option Rückkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("015_1_32", new Text("Option WMZ"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 1000L),
				new PacketFieldPartSpec(23, 0, 255, false, 256000L),
				new PacketFieldPartSpec(24, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(25, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4231_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4231, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Warmwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Zirkulation"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Volumenstrom"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Optionen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Relaisstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("SensorDefekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Temperatur WW-Soll"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Temperatur Quelle"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("verbl_ Zapfung"), 1, PacketFieldType_Number_1_Minutes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Schaltspiele"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 1000L),
				new PacketFieldPartSpec(27, 0, 255, false, 256000L),
				new PacketFieldPartSpec(28, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(29, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Version"), 0.01, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 100L),
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_2_0", new Text("max_ Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("min_ Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("max_ Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Zapfmenge"), 0.1, PacketFieldType_Number_0_1_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4241_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4241, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Warmwasser (Anzeige)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Puffer"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Volumenstrom"), 0.01, PacketFieldType_Number_0_01_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_1_1", new Text("Option Zirkulation aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("012_1_2", new Text("Option Notbetrieb aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("013_1_1", new Text("Zapfung aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("013_1_2", new Text("Frischwasserbereitung aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("013_1_4", new Text("Handbetrieb aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("013_1_8", new Text("Notbetrieb aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("013_1_16", new Text("Blockierschutz aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("013_1_32", new Text("Zirkulation aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("013_1_64", new Text("Überhitzung aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("013_1_128", new Text("Zapfungsimpuls aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("014_1_1", new Text("Relais 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("014_1_2", new Text("Relais 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("015_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("015_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("015_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("015_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Warmwassersolltemperatur"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Temperatur Mischer"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("dT Puffer"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Verbleibende Zirkulationsdauer"), 1, PacketFieldType_Number_1_Minutes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Anzahl Schaltspiele"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 1000L),
				new PacketFieldPartSpec(27, 0, 255, false, 256000L),
				new PacketFieldPartSpec(28, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(29, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Softwareversion major"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Softwareversion minor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur max_ Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur min_ Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Volumenstrom max_"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Zapfmenge max_"), 1, PacketFieldType_Number_1_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Temperatur Warmwasser (Regel)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Temperatur Quelle (Regel)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Interner Wert"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Interner Wert"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Interner Wert"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Interner Wert"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Interner Wert"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Interner Wert"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4251_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4251, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Absorbertemperatur (S1)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur hinter Wärmepumpe (S2)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur hinter Erdspeicher (S3)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Ann_ Temperatur Erdspeicher"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur hinter Pumpe 1 (S4)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Einschalttemperaturdifferenz"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Ausschalttemperaturdifferenz"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("dT Wärmepumpe an"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("dT Wärmepumpe aus"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Erdspeicher Maximaltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_1_1", new Text("S1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("022_1_2", new Text("S2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("022_1_4", new Text("S3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("022_1_8", new Text("S4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("022_1_16", new Text("dT ausreichend"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("022_1_32", new Text("Wärmepumpe an"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("022_1_64", new Text("Erdspeicher voll"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("022_1_128", new Text("Relais 1 an"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("022_1_256", new Text("Relais 2 an"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 8, 1, true, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4252_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4252, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Einheit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("022_1_1", new Text("Kollektor Nottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("022_1_2", new Text("Kollektor Minimaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("022_1_4", new Text("Wärmetauscher Nottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("022_1_8", new Text("Speichernottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("022_1_16", new Text("Speicher leer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("022_1_32", new Text("Speichermaximaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("022_1_64", new Text("Kollektor Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("022_1_128", new Text("Wärmetauscher Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("023_1_1", new Text("Röhrenkollektor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("023_1_2", new Text("Beladung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("023_1_4", new Text("R1 - Handbetrieb"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("023_1_8", new Text("R2 - Handbetrieb"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4261_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4261, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("T LT OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("T LT IN:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("T MT OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("T A1 OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("T A2 OUT:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("T HT Ext:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("T LT Ext:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_1_1", new Text("Anlage:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("014_1_2", new Text("Heizmodus:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("014_1_4", new Text("Strömungswächter LT-Kreis:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("014_1_8", new Text("HV_A1_IN:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("014_1_16", new Text("HV_A2_IN:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("014_1_32", new Text("HV_OUT:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("014_1_64", new Text("Melderelais"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("RCS %:"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Pumpenrelais:"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("SPR Relais:"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Phase:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Systemcode:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_2_0", new Text("W Soll:"), 1, PacketFieldType_Number_1_Hertz, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("T LTS OUT AVG"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("T LT OUT Cycle"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("T LT IN AVG"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("T LT IN Cycle"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("T MT OUT AVG"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("T MT OUT Cycle"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("dQ LT Cycle"), 0.1, PacketFieldType_Number_0_1_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("dV LT"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0_1", new Text("Aktuellen Sollwert:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Externe Solltemperatur:"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Anzahl Zyklen:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Aufsummierte Besprühungzeit:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Systemzeit:"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Jahr:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Monat:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Tag:"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Kern:"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, true, 100L),
				new PacketFieldPartSpec(47, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4265_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4265, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("010_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("010_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("010_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, false, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4278_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4278, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("010_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("010_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("010_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("010_1_16", new Text("Speichernottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("010_1_32", new Text("Kollektor Nottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("011_1_1", new Text("R1 - Handbetrieb"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("011_1_2", new Text("R2 - Handbetrieb"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, false, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Programm"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4279_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4279, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("010_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("010_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("010_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("010_1_16", new Text("Speichernottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("010_1_32", new Text("Kollektor Nottemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("011_1_1", new Text("R1 - Handbetrieb"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("011_1_2", new Text("R2 - Handbetrieb"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, false, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Programm"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_427B_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x427B, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("UnitType"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("ErrorMask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_1", new Text("Sensor 1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_1_2", new Text("Sensor 2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("020_1_4", new Text("Sensor 3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Sensor 4 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Statusmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Variante"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4311_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4311, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("TC"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("CD"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("CU"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("P1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("P1S"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("P2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("LS"), 0.1, PacketFieldType_Number_0_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Ph"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("KWH"), 0.1, PacketFieldType_Number_0_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4321_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4321, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemzeit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Status-Info 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Status-Info 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Status-Restlaufzeit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("016_3_0", new Text("Filterlaufzeit heute"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Regelstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4730_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4730, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4731_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4731, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wert"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Leistung"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wert (heute)"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wert (Woche)"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_4A00_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x4A00, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("TC"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("CD"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("CU"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("P1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("P1S"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("P2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("LS"), 0.1, PacketFieldType_Number_0_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Ph"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("KWH"), 0.1, PacketFieldType_Number_0_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5111_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5111, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemdruck"), 0.1, PacketFieldType_Number_0_1_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Systemmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5112_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5112, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Systemmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Leistung"), 0.001, PacketFieldType_Number_0_001_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5121_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5121, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Kaltwassertemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Sollwert"), 0.01, PacketFieldType_Number_0_01_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Ladetemperatur"), 0.01, PacketFieldType_Number_0_01_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Ladevolumenstrom"), 0.01, PacketFieldType_Number_0_01_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Warmwassertemperatur"), 0.01, PacketFieldType_Number_0_01_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Zapfvolumenstrom"), 0.01, PacketFieldType_Number_0_01_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("PWM1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Zapfung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Warnungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 1000L),
				new PacketFieldPartSpec(31, 0, 255, false, 256000L),
				new PacketFieldPartSpec(32, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(33, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Zapfmenge"), 0.1, PacketFieldType_Number_0_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5141_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5141, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Systemmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5210_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5210, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Frostschutzgehalt"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Frostschutzart"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000L),
				new PacketFieldPartSpec(19, 0, 255, false, 256000L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(21, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Hardware"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Software"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Fehler-Info 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Fehler-Info 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5221_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5221, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Volumenstrom"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
				new PacketFieldPartSpec(20, 0, 255, false, 1000L),
				new PacketFieldPartSpec(21, 0, 255, false, 256000L),
				new PacketFieldPartSpec(22, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(23, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5231_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5231, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Durchfluss Sensor 5"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Drehzahl 1"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Warnungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Statusmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Zapfmenge"), 0.001, PacketFieldType_Number_0_001_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5251_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5251, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor VFS/US"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Durchfluss Sensor VFS/US"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("Drehzahl Relais pot__frei"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_1_0", new Text("Drehzahl Ausgang PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("057_1_0", new Text("Drehzahl Ausgang PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("076_4_0", new Text("Betriebssekunden Relais pot__frei"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, false, 256L),
				new PacketFieldPartSpec(78, 0, 255, false, 65536L),
				new PacketFieldPartSpec(79, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("080_4_0", new Text("Betriebssekunden Ausgang PWM 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
				new PacketFieldPartSpec(81, 0, 255, false, 256L),
				new PacketFieldPartSpec(82, 0, 255, false, 65536L),
				new PacketFieldPartSpec(83, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("084_4_0", new Text("Betriebssekunden Ausgang PWM 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 255, false, 1L),
				new PacketFieldPartSpec(85, 0, 255, false, 256L),
				new PacketFieldPartSpec(86, 0, 255, false, 65536L),
				new PacketFieldPartSpec(87, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("100_4_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(100, 0, 255, false, 1L),
				new PacketFieldPartSpec(101, 0, 255, false, 256L),
				new PacketFieldPartSpec(102, 0, 255, false, 65536L),
				new PacketFieldPartSpec(103, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("108_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(108, 0, 255, false, 1L),
				new PacketFieldPartSpec(109, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("112_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(112, 0, 255, false, 1L),
				new PacketFieldPartSpec(113, 0, 255, false, 256L),
				new PacketFieldPartSpec(114, 0, 255, false, 65536L),
				new PacketFieldPartSpec(115, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5311_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5311, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Einstrahlung Sensor 5"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Relais-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, false, 256L),
				new PacketFieldPartSpec(16, 0, 255, false, 1000L),
				new PacketFieldPartSpec(17, 0, 255, false, 256000L),
				new PacketFieldPartSpec(18, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(19, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("021_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_1", new Text("Optionen: Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("022_1_4", new Text("Optionen: Röhrenkollektor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("022_1_8", new Text("Optionen: Rückkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("022_1_16", new Text("Optionen: Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("022_1_32", new Text("Optionen: Externer WT"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("022_1_64", new Text("Optionen: Nachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("022_1_128", new Text("Optionen: Rücklaufanhebung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("022_1_256", new Text("Optionen: Ventil"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 8, 1, true, 1L),
			}),
			new PacketFieldSpec("022_1_512", new Text("Optionen: Minimal"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 9, 2, true, 1L),
			}),
			new PacketFieldSpec("022_1_1024", new Text("Optionen: WMZ"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 10, 4, true, 1L),
			}),
			new PacketFieldSpec("022_1_2048", new Text("Optionen: Boilerladung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 11, 8, true, 1L),
			}),
			new PacketFieldSpec("022_1_4096", new Text("Optionen: Solarzelle"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 12, 16, true, 1L),
			}),
			new PacketFieldSpec("022_1_8192", new Text("Optionen: 2_ Kollektor-Ventil"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 13, 32, true, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Sensorbruch-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Sensorkurzschluss-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5351_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5351, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("110_1_0", new Text("Hydraulik"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(110, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("132_4_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(132, 0, 255, false, 1L),
				new PacketFieldPartSpec(133, 0, 255, false, 256L),
				new PacketFieldPartSpec(134, 0, 255, false, 65536L),
				new PacketFieldPartSpec(135, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("000_2_0", new Text("TSpVL (S1)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("116_2_0", new Text("TWW"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(116, 0, 255, false, 1L),
				new PacketFieldPartSpec(117, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("TKW (S4)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("S5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("S6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("S7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("S8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("S9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_1_0", new Text("Drehzahl Primaerpumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("118_1_0", new Text("Drehzahl Sekundaerpumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(118, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("119_1_0", new Text("Drehzahl Zirkulationspumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(119, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("108_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(108, 0, 255, false, 1L),
				new PacketFieldPartSpec(109, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("112_4_0", new Text("Datum/Uhrzeit"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(112, 0, 255, false, 1L),
				new PacketFieldPartSpec(113, 0, 255, false, 256L),
				new PacketFieldPartSpec(114, 0, 255, false, 65536L),
				new PacketFieldPartSpec(115, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("120_4_0", new Text("Volumenstrom US1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(120, 0, 255, false, 1L),
				new PacketFieldPartSpec(121, 0, 255, false, 256L),
				new PacketFieldPartSpec(122, 0, 255, false, 65536L),
				new PacketFieldPartSpec(123, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("124_4_0", new Text("Volumenstrom US2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(124, 0, 255, false, 1L),
				new PacketFieldPartSpec(125, 0, 255, false, 256L),
				new PacketFieldPartSpec(126, 0, 255, false, 65536L),
				new PacketFieldPartSpec(127, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("128_4_0", new Text("Volumenstrom US gesamt"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(128, 0, 255, false, 1L),
				new PacketFieldPartSpec(129, 0, 255, false, 256L),
				new PacketFieldPartSpec(130, 0, 255, false, 65536L),
				new PacketFieldPartSpec(131, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5400_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5400, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Einstrahlung Sensor"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom Sensor 1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Sensor 2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Volumenstrom Sensor 3"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Druck Sensor 11"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Druck Sensor 12"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("041_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("042_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Regler Ausgang 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Regler Ausgang 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Warnungmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5410_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5410, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("TVorlaufSoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Betriebsart"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Brennerstarts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5420_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5420, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wert"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Leistung"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wert (heute)"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wert (Woche)"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5430_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5430, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5510_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5510, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Betriebsstunden"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Regelstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_5611_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x5611, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Mischer auf"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Mischer zu"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Systemmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_6610_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x6610, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_1", new Text("Relaisstatus 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("012_1_2", new Text("Relaisstatus 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("012_1_4", new Text("Relaisstatus 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("012_1_8", new Text("Relaisstatus 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("012_1_16", new Text("Relaisstatus 5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("012_1_32", new Text("Relaisstatus 6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Fehlernummer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Fehler-Info 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Fehler-Info 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Fehler-Info 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Fehler-Info 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Anlagenoptionen 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Anlagenoptionen 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_2_0", new Text("Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
				new PacketFieldPartSpec(26, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Modulstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("033_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
				new PacketFieldPartSpec(34, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("035_1_0", new Text("Betriebsstunden-Flag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(35, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_6620_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x6620, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_1", new Text("Relaisstatus 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("012_1_2", new Text("Relaisstatus 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("012_1_4", new Text("Relaisstatus 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("012_1_8", new Text("Relaisstatus 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("012_1_16", new Text("Relaisstatus 5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("012_1_32", new Text("Relaisstatus 6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Fehlernummer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Fehler-Info 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Fehler-Info 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Fehler-Info 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Fehler-Info 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Anlagenoptionen 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_2_0", new Text("Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
				new PacketFieldPartSpec(26, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Modulstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7101_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7101, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur RPS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Druck RPS"), 0.1, PacketFieldType_Number_0_1_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur VFS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Durchfluss VFS"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0_1", new Text("Durchfluss VFS"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Durchfluss V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("060_2_0", new Text("Durchfluss FlowRotor"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("046_1_1", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("046_1_2", new Text("Blockierschutz 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("046_1_4", new Text("Blockierschutz 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("046_1_8", new Text("Blockierschutz 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("046_1_16", new Text("Initialisierung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("046_1_32", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("046_1_64", new Text("Stabilisierung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("046_1_128", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("047_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("047_1_2", new Text("Nachlauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("047_1_4", new Text("Thermische Desinfektion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("047_1_8", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("047_1_16", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("047_1_32", new Text("Spreizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("047_1_64", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("047_1_128", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Einheit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_1_1", new Text("Fehler S1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("044_1_2", new Text("Fehler S2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("044_1_4", new Text("Fehler S3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("044_1_8", new Text("Fehler S4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("044_1_16", new Text("Fehler S5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("044_1_32", new Text("Fehler S6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("044_1_64", new Text("Fehler S7"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("044_1_128", new Text("Fehler S8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("045_1_1", new Text("Fehler S9"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("045_1_2", new Text("Fehler V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("045_1_4", new Text("Leckage"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("045_1_8", new Text("Überdruck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("045_1_16", new Text("Durchflussfehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 4, 16, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7112_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7112, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Einstrahlung Sensor 10"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom Sensor 9"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Sensor 11"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Volumenstrom Sensor 12"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Druck Sensor 11"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Druck Sensor 12"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("041_1_0", new Text("Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("042_1_0", new Text("Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("064_1_0", new Text("PWM/0-10V A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("065_1_0", new Text("PWM/0-10V B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7113_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7113, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7120_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7120, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7130_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7130, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Gesamtvolumen"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7140_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7140, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Einstrahlung Sensor 10"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumenstrom Sensor 10"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7150_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7150, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7160_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7160, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur GFD1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur GFD2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Volumenstrom 2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Volumenstrom 3"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl A1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl A2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl A3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Drehzahl A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 1000L),
				new PacketFieldPartSpec(27, 0, 255, true, 256000L),
				new PacketFieldPartSpec(28, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(29, 0, 255, true, 256000000L),
				new PacketFieldPartSpec(30, 0, 255, false, 1000000000L),
				new PacketFieldPartSpec(31, 0, 255, true, 256000000000L),
			}),
			new PacketFieldSpec("060_2_0", new Text("Wärme 2"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, true, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 1000L),
				new PacketFieldPartSpec(63, 0, 255, true, 256000L),
				new PacketFieldPartSpec(64, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(65, 0, 255, true, 256000000L),
				new PacketFieldPartSpec(66, 0, 255, false, 1000000000L),
				new PacketFieldPartSpec(67, 0, 255, true, 256000000000L),
			}),
			new PacketFieldSpec("068_2_0", new Text("Wärme 3"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, true, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 1000L),
				new PacketFieldPartSpec(71, 0, 255, true, 256000L),
				new PacketFieldPartSpec(72, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(73, 0, 255, true, 256000000L),
				new PacketFieldPartSpec(74, 0, 255, false, 1000000000L),
				new PacketFieldPartSpec(75, 0, 255, true, 256000000000L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Leistung 2"), 0.001, PacketFieldType_Number_0_001_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Leistung 3"), 0.001, PacketFieldType_Number_0_001_Kilowatts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("033_1_0", new Text("Sensorbruch-Nummer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Sensorkurzschluss-Nummer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0_1", new Text("Systemzeit2"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7161_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7161, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Mischerpausenzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("HK-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7162_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7162, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Mischerpausenzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("HK-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7163_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7163, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Mischerpausenzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("HK-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7176_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7176, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung Sensor 11"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Sensor Ga1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Sensor Ga2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Sensor 9"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Volumenstrom Sensor 10"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Volumenstrom Sensor Ga1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Volumenstrom Sensor Ga2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Druck Sensor Ga1"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Druck Sensor Ga2"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("072_1_0", new Text("PWM/0-10V A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("073_1_0", new Text("PWM/0-10V B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(73, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("074_1_0", new Text("PWM/0-10V C"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(74, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("075_1_0", new Text("PWM/0-10V D"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(75, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7177_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7177, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7178_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7178, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7179_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7179, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_717A_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x717A, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Gesamtvolumen"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_717B_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x717B, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Gesamtvolumen"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7210_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7210, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl A1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl A2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl A3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Drehzahl A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 1000L),
				new PacketFieldPartSpec(27, 0, 255, true, 256000L),
				new PacketFieldPartSpec(28, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(29, 0, 255, true, 256000000L),
				new PacketFieldPartSpec(30, 0, 255, false, 1000000000L),
				new PacketFieldPartSpec(31, 0, 255, true, 256000000000L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("033_1_0", new Text("Sensorbruch-Nummer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Sensorkurzschluss-Nummer"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0_1", new Text("Systemzeit2"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7211_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7211, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Mischerpausenzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("HK-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7212_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7212, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Mischerpausenzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("HK-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7213_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7213, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Mischerpausenzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("HK-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7221_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7221, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Systemdruck"), 0.1, PacketFieldType_Number_0_1_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Ansteuerung 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Ansteuerung 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7231_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7231, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Systemdruck"), 0.1, PacketFieldType_Number_0_1_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Ansteuerung 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Ansteuerung 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_1", new Text("Handbetrieb 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("022_1_2", new Text("Handbetrieb 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_1_1", new Text("ΔT Kollektor-Speicher"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("028_1_2", new Text("ΔT Vorlauf-Rücklauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("028_1_4", new Text("Pendelpause"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("028_1_8", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("028_1_16", new Text("Rückkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("028_1_32", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("028_1_64", new Text("Röhrenkollektor"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("028_1_128", new Text("ΔT3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("029_1_1", new Text("Thermostat 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("029_1_2", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("029_1_4", new Text("Blockierschutz 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("029_1_8", new Text("Stabilisierung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("032_1_1", new Text("Überdruck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("032_1_2", new Text("Nachtumwälzung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("032_1_4", new Text("ΔT zu hoch"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_1", new Text("S1 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("036_1_2", new Text("S2 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("036_1_4", new Text("S3 defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_8", new Text("S-Vorlauf defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("036_1_16", new Text("S-Rücklauf defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("036_1_32", new Text("Druck(S6) defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("036_1_64", new Text("Volumenstrom(S7) defekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("036_1_128", new Text("Durchfluss"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("037_1_1", new Text("Leckage"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7311_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7311, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Impulseingang 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Impulseingang 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Sensorbruch-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Sensorkurzschluss-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Sensorbenutzungs-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Drehzahl Relais 8"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("Drehzahl Relais 9"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Relaisbenutzungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("060_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Warnungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Reglerversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("066_2_0", new Text("Systemzeit"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, false, 1L),
				new PacketFieldPartSpec(67, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7312_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7312, 0xFFFE, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Fernversteller"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Aussentemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Speichertemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Vorlaufsolltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7315_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7315, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Betriebssekunden R1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Betriebssekunden R2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Betriebssekunden R3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Betriebssekunden R4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Betriebssekunden R5"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Betriebssekunden R6"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Betriebssekunden R7"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebssekunden R8"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebssekunden R9"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Volumen 1"), 0.1, PacketFieldType_Number_0_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Volumen 2"), 0.1, PacketFieldType_Number_0_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7316_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7316, 0xFFFE, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7321_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7321, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Impulseingang 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Impulseingang 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Sensorbruch-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Sensorkurzschluss-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Sensorbenutzungs-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Drehzahl Relais 8"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("Drehzahl Relais 9"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Relaisbenutzungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("060_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Warnungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Reglerversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("066_2_0", new Text("Systemzeit"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, false, 1L),
				new PacketFieldPartSpec(67, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7326_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7326, 0xFFFE, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7331_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7331, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Sensor 13"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Sensor 14"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Temperatur Sensor 15"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Temperatur Sensor 16"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur Sensor 17"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur Sensor 19"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur Sensor 20"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Temperatur Sensor 21"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Temperatur Sensor 22"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Drehzahl R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Drehzahl R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("049_1_0", new Text("Drehzahl R6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Drehzahl R7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Drehzahl R8"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_1_0", new Text("Drehzahl R9"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("053_1_0", new Text("Drehzahl R10"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(53, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("054_1_0", new Text("Drehzahl R11"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("055_1_0", new Text("Drehzahl R12"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(55, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_1_0", new Text("Drehzahl R13"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("057_1_0", new Text("Drehzahl R14"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("058_1_0", new Text("Drehzahl R15"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("059_1_0", new Text("Drehzahl R16"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(59, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("060_1_0", new Text("Drehzahl R17"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("061_1_0", new Text("Drehzahl R18"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(61, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Sensorbenutzungs-Maske #1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Sensorbenutzungs-Maske #2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("072_2_0", new Text("Fehler-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("074_2_0", new Text("Warnungen-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(74, 0, 255, false, 1L),
				new PacketFieldPartSpec(75, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("076_2_0", new Text("Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("078_2_0", new Text("Systemzeit"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(78, 0, 255, false, 1L),
				new PacketFieldPartSpec(79, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("080_1_0", new Text("Variante"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7332_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7332, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 17"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 19"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 20"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 21"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 22"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R14"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R15"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R16"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R17"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R18"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7333_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7333, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 23"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 24"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 25"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 26"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 27"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 28"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R19"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R20"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R21"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R22"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R23"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7334_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7334, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 29"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 30"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 31"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 32"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 33"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 34"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R24"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R25"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R26"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R27"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R28"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7335_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7335, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 35"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 36"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 37"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 38"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 39"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 40"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R29"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R30"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R31"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R32"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R33"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7341_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7341, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("S1-SF-K"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("S2-SF-1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("S3-SF-2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("S4-SF-3/WT/F-RLA1/RLU1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("S5-FN-HK/F-RLA2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("S6-FN-WW/BF/SF-WT"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("S7-FN-K2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("S8-FZ"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("S9-AF"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("S10-VL-F1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("S11-FV-1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("S12-VL-F2/WA-1/SF-4/F-RLU1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("S13-FV-2/WA-2/SF-WT"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("S14-KF-1/KF-NH"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("S15-KF-2/SF-K2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("S16-BF/BF-1/F-RLU2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_4_0", new Text("SensorVolumenstrom_Regler_GAS1_TotalWert_L"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("SensorVolumenstrom_Regler_GAS2_TotalWert_L"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("SensorVolumenstrom_Regler_GDS1_TotalWert_L"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("SensorVolumenstrom_Regler_GDS2_TotalWert_L"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Sensor_Regler_Druck_GAS1_Wert_Bar"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Sensor_Regler_Druck_GAS2_Wert_Bar"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Sensor_Regler_Druck_GDS1_Wert_Bar"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Sensor_Regler_Druck_GDS2_Wert_Bar"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_1_0", new Text("R1-SP-1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("057_1_0", new Text("R2-SP-2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(57, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("058_1_0", new Text("R3-BLP/1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("059_1_0", new Text("R4-SV1/V-RLU"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(59, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("060_1_0", new Text("R5-HKP1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("061_1_0", new Text("R6-MV-1 auf"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(61, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("062_1_0", new Text("R7-MV-1 zu"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("063_1_0", new Text("R8-KLP-1/HKP-2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(63, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("064_1_0", new Text("R9-KLP-2/SP-3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("065_1_0", new Text("R10-SV-2/HKP-2/V-RL"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("066_1_0", new Text("R11-MV-2 auf/BLP-2/SV-3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("R12-MV-2 zu/SV-3/V-RLU"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("068_1_0", new Text("R13-ZP"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("069_1_0", new Text("R14-RP"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(69, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("072_2_0", new Text("Hk1_T_VorlSoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("074_2_0", new Text("Hk2_T_VorlSoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(74, 0, 255, false, 1L),
				new PacketFieldPartSpec(75, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("076_2_0", new Text("Hk3_T_VorlSoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("078_2_0", new Text("Hk4_T_VorlSoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(78, 0, 255, false, 1L),
				new PacketFieldPartSpec(79, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("080_2_0", new Text("Hk5_T_VorlSoll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
				new PacketFieldPartSpec(81, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("082_2_0", new Text("SW_VL_Soll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(82, 0, 255, false, 1L),
				new PacketFieldPartSpec(83, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("084_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 255, false, 1L),
				new PacketFieldPartSpec(85, 0, 255, false, 256L),
				new PacketFieldPartSpec(86, 0, 255, false, 65536L),
				new PacketFieldPartSpec(87, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("088_4_0", new Text("Wmz2_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 255, false, 1L),
				new PacketFieldPartSpec(89, 0, 255, false, 256L),
				new PacketFieldPartSpec(90, 0, 255, false, 65536L),
				new PacketFieldPartSpec(91, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("092_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(92, 0, 255, false, 1L),
				new PacketFieldPartSpec(93, 0, 255, false, 256L),
				new PacketFieldPartSpec(94, 0, 255, false, 65536L),
				new PacketFieldPartSpec(95, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("096_4_0", new Text("SensorBenutzt bit 0__31"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("100_4_0", new Text("SensorBenutzt bit 31__63"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(100, 0, 255, false, 1L),
				new PacketFieldPartSpec(101, 0, 255, false, 256L),
				new PacketFieldPartSpec(102, 0, 255, false, 65536L),
				new PacketFieldPartSpec(103, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("104_4_0", new Text("Error SensorBruch bit 0__31"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(104, 0, 255, false, 1L),
				new PacketFieldPartSpec(105, 0, 255, false, 256L),
				new PacketFieldPartSpec(106, 0, 255, false, 65536L),
				new PacketFieldPartSpec(107, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("108_4_0", new Text("Error SensorBruch bit 31__63"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(108, 0, 255, false, 1L),
				new PacketFieldPartSpec(109, 0, 255, false, 256L),
				new PacketFieldPartSpec(110, 0, 255, false, 65536L),
				new PacketFieldPartSpec(111, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("112_4_0", new Text("Error SensorKurzschluss bit 0__31"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(112, 0, 255, false, 1L),
				new PacketFieldPartSpec(113, 0, 255, false, 256L),
				new PacketFieldPartSpec(114, 0, 255, false, 65536L),
				new PacketFieldPartSpec(115, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("116_4_0", new Text("Error SensorKurzschluss bit 31__63"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(116, 0, 255, false, 1L),
				new PacketFieldPartSpec(117, 0, 255, false, 256L),
				new PacketFieldPartSpec(118, 0, 255, false, 65536L),
				new PacketFieldPartSpec(119, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("120_2_0", new Text("Errormask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(120, 0, 255, false, 1L),
				new PacketFieldPartSpec(121, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("122_2_0", new Text("Warningmask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(122, 0, 255, false, 1L),
				new PacketFieldPartSpec(123, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("124_2_0", new Text("Systemflow_Parameteraenderungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(124, 0, 255, false, 1L),
				new PacketFieldPartSpec(125, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7342_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7342, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7343_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7343, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7344_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7344, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7345_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7345, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7346_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7346, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Drehzahl R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7411_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7411, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Volumenstrom"), 0.01, PacketFieldType_Number_0_01_CubicMetersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Drehzahl 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_1_8", new Text("Relais 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("020_1_16", new Text("Relais 5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("020_1_32", new Text("Relais 6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_1", new Text("Option: Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("027_1_2", new Text("Option: Kollektorminimalbegrenzung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("027_1_4", new Text("Option: Frostschutzfunktion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("027_1_8", new Text("Option: Röhrenkollektorfunktion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("027_1_16", new Text("Option: Rückkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("027_1_32", new Text("Option: Wärmemengenzählung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Betriebsstunden 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Betriebsstunden 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Betriebsstunden 3"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Betriebsstunden 4"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Betriebsstunden 5"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Betriebsstunden 6"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 1000L),
				new PacketFieldPartSpec(43, 0, 255, false, 256000L),
				new PacketFieldPartSpec(44, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(45, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7421_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7421, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur RPS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Druck RPS"), 0.1, PacketFieldType_Number_0_1_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur VFS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Durchfluss VFS"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("PWM 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("PWM 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0_1", new Text("Durchfluss VFS"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Durchfluss V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("046_1_1", new Text("Blockierschutz 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("046_1_2", new Text("Blockierschutz 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("046_1_4", new Text("Blockierschutz 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("046_1_8", new Text("Blockierschutz 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("046_1_16", new Text("Initialisierung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("046_1_32", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("046_1_64", new Text("Stabilisierung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("046_1_128", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("047_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("047_1_2", new Text("Nachlauf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("047_1_4", new Text("Thermische Desinfektion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("047_1_8", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("047_1_16", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("047_1_32", new Text("Spreizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("047_1_64", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("047_1_128", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Einheit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_1_1", new Text("Fehler S1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("044_1_2", new Text("Fehler S2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("044_1_4", new Text("Fehler S3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("044_1_8", new Text("Fehler S4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("044_1_16", new Text("Fehler S5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("044_1_32", new Text("Fehler S6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("044_1_64", new Text("Fehler S7"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("044_1_128", new Text("Fehler S8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("045_1_1", new Text("Fehler S9"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("045_1_2", new Text("Fehler V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("045_1_4", new Text("Leckage"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("045_1_8", new Text("Überdruck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("045_1_16", new Text("Durchflussfehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 4, 16, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7428_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7428, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("S3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("S4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("S5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_1_0", new Text("DR 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("DR 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("DR 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("DR 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Flow V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Zeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("BSR 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("BSR 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("BSR 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("BSR 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Regelstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("046_1_1", new Text("BLSC 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("046_1_2", new Text("BLSC 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("046_1_4", new Text("BLSC 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("046_1_8", new Text("BLSC 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("046_1_32", new Text("DeltaT-FKT"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("046_1_64", new Text("Thermostat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("046_1_128", new Text("Pumpenverzögerung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("047_1_1", new Text("Überwärmeabfuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("047_1_4", new Text("Thermische Desinfektion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("047_1_8", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("047_1_16", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("047_1_32", new Text("Spreizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("047_1_64", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("047_1_128", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Einheit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_1_1", new Text("Fehler S1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("044_1_2", new Text("Fehler S2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("044_1_4", new Text("Fehler S3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("044_1_8", new Text("Fehler S4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("044_1_16", new Text("Fehler S5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("045_1_2", new Text("Fehler V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 1, 2, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7441_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7441, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Regler Ausgang 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("SW-Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Initalisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Befüllung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Stabilisieren"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("045_1_1", new Text("Einheit Temperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("046_1_1", new Text("Einheit Durchfluss"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("047_1_1", new Text("Einheit Druck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("048_1_1", new Text("Einheit Leistung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("049_1_1", new Text("Einheit Energie"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("050_1_1", new Text("VDI dT zu hoch"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7442_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7442, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wmz1_Wert_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Wmz1_Leistung_W"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wmz1_WertHeute_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wmz1_WertWoche_Wh"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7511_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7511, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Kollektoren"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur S,p"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur S,s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur WP-VL"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur WP-RL"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Verdampf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Erde"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Volumenstrom Ko"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Leistung P,Ko"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Leistung P,S"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_4", new Text("Relais P,H"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("016_1_8", new Text("Relais WP"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("016_1_16", new Text("Ventil WP"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("016_1_32", new Text("Ventil SW"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("016_1_64", new Text("Ventil Ko"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("016_1_128", new Text("Ventil So"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("017_1_1", new Text("Ventil SP"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("025_1_0", new Text("P,Ko Nennleistung"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_2_0", new Text("T_Wabs"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge S,p"), 0.1, PacketFieldType_Number_0_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Wärmemenge S,s"), 0.1, PacketFieldType_Number_0_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Diff_ TUmg/24h"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Diff_ TSs/8h"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Diff_ TSs/1h"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Betriebssekunden WP"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Zeitraum WP / 24h"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Laufzeit WP / 24h"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Temperatur T,H"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7512_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7512, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("t-Sp"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("t-Ss"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Laufzeit WP"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Anzahl WP-Starts"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("t-WP-Ss"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("t-Ps"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur T-x"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur T-xx"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("C1"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7521_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7521, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Durchfluss Sensor 10"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Drehzahl Relais 4"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_1", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Desinf_ Phase"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Betriebssekunden Relais 5"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Funktionen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("048_1_1", new Text("WW-Bereitung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("048_1_2", new Text("Blockierschutz R4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("048_1_4", new Text("Blockierschutz R2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("048_1_8", new Text("Kaltwasser"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("048_1_16", new Text("Zirkulationserfassung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("048_1_32", new Text("Warmstart"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("048_1_64", new Text("Dauerzirkulation"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("048_1_128", new Text("Thermische Zirkulation"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("049_1_1", new Text("Anforderungszirkulation"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("049_1_2", new Text("Nachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("049_1_4", new Text("Desinfektionsnachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("049_1_8", new Text("Desinfektionszirkulation"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("049_1_16", new Text("Desinfektionsspülung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("049_1_32", new Text("Fehlerrelais"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("049_1_64", new Text("Rücklaufeinschichtung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("049_1_128", new Text("Funktionsblock 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(49, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("050_1_1", new Text("Funktionsblock 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("051_1_1", new Text("Kaltstart"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("051_1_2", new Text("Wärmepumpe"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("051_1_4", new Text("Sollwertanpassung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7522_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7522, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor Gds1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor Gds2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Einstrahlung Sensor"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Volumenstrom Sensor V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Sensor Gds1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Volumenstrom Sensor Gds2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Druck Sensor Gds1"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Druck Sensor Gds2"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("041_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("042_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7523_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7523, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Modul 3 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Modul 3 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Temperatur Modul 3 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Temperatur Modul 3 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur Modul 3 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur Modul 3 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur Modul 4 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur Modul 4 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Temperatur Modul 4 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Temperatur Modul 4 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Temperatur Modul 4 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Temperatur Modul 4 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Temperatur Modul 5 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Temperatur Modul 5 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Temperatur Modul 5 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Temperatur Modul 5 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Temperatur Modul 5 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Temperatur Modul 5 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7530_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7530, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7541_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7541, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor DDS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Durchfluss Sensor DDS"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Betriebssekunden Relais 1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Betriebssekunden Relais 2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Betriebssekunden Relais 3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Betriebssekunden Relais 4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Betriebssekunden Relais 5"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("092_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(92, 0, 255, false, 1L),
				new PacketFieldPartSpec(93, 0, 255, false, 256L),
				new PacketFieldPartSpec(94, 0, 255, false, 65536L),
				new PacketFieldPartSpec(95, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("096_1_1", new Text("Sensorfehler S1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("096_1_2", new Text("Sensorfehler S2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("096_1_4", new Text("Sensorfehler S3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("096_1_8", new Text("Sensorfehler S4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("096_1_16", new Text("Sensorfehler S5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("096_1_32", new Text("Sensorfehler S6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("096_1_64", new Text("Sensorfehler S7"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("096_1_128", new Text("Sensorfehler S8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("096_1_2048", new Text("Sensorfehler S12 VFD"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(97, 11, 8, true, 1L),
			}),
			new PacketFieldSpec("096_1_65536", new Text("Desinfektion: Vorlauf zu niedrig"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(98, 16, 1, true, 1L),
			}),
			new PacketFieldSpec("096_1_131072", new Text("Desinfektion: Fehlgeschlagen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(98, 17, 2, true, 1L),
			}),
			new PacketFieldSpec("096_1_262144", new Text("Uebertemperaturschutz aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(98, 18, 4, true, 1L),
			}),
			new PacketFieldSpec("104_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(104, 0, 255, false, 1L),
				new PacketFieldPartSpec(105, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("108_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(108, 0, 255, false, 1L),
				new PacketFieldPartSpec(109, 0, 255, false, 256L),
				new PacketFieldPartSpec(110, 0, 255, false, 65536L),
				new PacketFieldPartSpec(111, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7611_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7611, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("022_1_4", new Text("Status Relais 3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("022_1_8", new Text("Status Relais 4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Sensordefekt-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Warmwassersolltemperatur"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Optionen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 1000L),
				new PacketFieldPartSpec(31, 0, 255, false, 256000L),
				new PacketFieldPartSpec(32, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(33, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Version"), 0.01, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, true, 100L),
				new PacketFieldPartSpec(35, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7621_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7621, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Einstrahlung Sensor 9"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("022_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("023_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(23, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("025_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
				new PacketFieldPartSpec(26, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 100L),
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7622_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7622, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Vorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Rücklauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7651_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7651, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Volumenstrom Sensor 8"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Digitaler Eingang 9"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Status Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Status Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Status Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Status Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Status Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("022_1_1", new Text("T-Sensor Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("022_1_2", new Text("V-Sensor Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("022_1_4", new Text("EEPROM Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("022_1_8", new Text("S1 Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("022_1_16", new Text("S2 Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7711_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7711, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Impulseingang 1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Impulseingang 2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Systemzeit"), 1, PacketFieldType_Weektime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Warnungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Reglerversion"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("042_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_2_0", new Text("HK1-VL-Soll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_1_0", new Text("HK1-Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("HK1-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("048_2_0", new Text("HK2-VL-Soll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_1_0", new Text("HK2-Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("HK2-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("052_2_0", new Text("HK3-VL-Soll"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_1_0", new Text("HK3-Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("055_1_0", new Text("HK3-Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(55, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Sensorbenutzungs-Maske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Relaisbenutzungsmaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7712_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7712, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Rücklauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7721_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7721, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung CS"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Impulse 1 V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Digital Input"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Vorlauf Soll HK1 Modul Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Status HK1 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Vorlauf Soll HK2 Modul Sensor 25"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Status HK2 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Vorlauf Soll HK3 Modul Sensor 32"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Status HK3 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Vorlauf Soll Heizkreis Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Status Heizkreis"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("060_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, true, 100L),
				new PacketFieldPartSpec(61, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7722_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7722, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Vorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Rücklauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7729_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7729, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung CS"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Impulse 1 V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Digital Input"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Vorlauf Soll HK1 Modul Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Status HK1 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Vorlauf Soll HK2 Modul Sensor 25"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Status HK2 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Vorlauf Soll HK3 Modul Sensor 32"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Status HK3 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Vorlauf Soll Heizkreis Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Status Heizkreis"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("060_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, true, 100L),
				new PacketFieldPartSpec(61, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_772A_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x772A, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Vorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Rücklauf"), 0.1, PacketFieldType_Number_0_1_DegreesFahrenheit, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7731_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7731, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Relaisbyte"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 1000L),
				new PacketFieldPartSpec(23, 0, 255, false, 256000L),
				new PacketFieldPartSpec(24, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(25, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7751_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7751, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Volumenstrom"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Drehzahl R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_1", new Text("Relaisstatus R4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("027_1_2", new Text("Relaisstatus R5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("027_1_4", new Text("Relaisstatus R6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("027_1_8", new Text("Relaisstatus R7"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("027_1_16", new Text("Relaisstatus R8"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("027_1_32", new Text("Relaisstatus R9"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Systemdatum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("039_1_0", new Text("Variante"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7761_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7761, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung CS"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Impulse 1 V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Digital Input"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("033_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
				new PacketFieldPartSpec(34, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Filterlaufzeit"), 1, PacketFieldType_Number_1_Minutes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("051_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(51, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, true, 100L),
				new PacketFieldPartSpec(45, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Umwaelzzeitzähler"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Extra-Filterzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Pumpenüberwachung"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Solar Min_ Ein/Aus"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Sim5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Dauer Regelungsblock"), 1, PacketFieldType_Number_1_Milliseconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("044_1_0_1", new Text("Solarphase"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("036_1_1", new Text("Solar dTein"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("036_1_67108864", new Text("Solar dTaus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 26, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_2", new Text("CS ein"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 1, 2, true, 1L),
			}),
			new PacketFieldSpec("036_1_4", new Text("Solar Mindestein"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 2, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_8", new Text("Solar Mindestaus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 3, 8, true, 1L),
			}),
			new PacketFieldSpec("036_1_16", new Text("Beckenmax_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 4, 16, true, 1L),
			}),
			new PacketFieldSpec("036_1_32", new Text("Filtermin_"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 5, 32, true, 1L),
			}),
			new PacketFieldSpec("036_1_64", new Text("Nachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 6, 64, true, 1L),
			}),
			new PacketFieldSpec("036_1_128", new Text("Solar Nachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 7, 128, true, 1L),
			}),
			new PacketFieldSpec("036_1_256", new Text("dT Solar Nachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 8, 1, true, 1L),
			}),
			new PacketFieldSpec("036_1_512", new Text("Umwälzung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 9, 2, true, 1L),
			}),
			new PacketFieldSpec("036_1_1024", new Text("Kollektorabschaltung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 10, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_2048", new Text("Kollektorminimal"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 11, 8, true, 1L),
			}),
			new PacketFieldSpec("036_1_262144", new Text("T Beckenkühlfkt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 18, 4, true, 1L),
			}),
			new PacketFieldSpec("036_1_524288", new Text("dT Beckenkühlfkt ein"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 19, 8, true, 1L),
			}),
			new PacketFieldSpec("036_1_4096", new Text("dT Beckenkühlfkt aus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 12, 16, true, 1L),
			}),
			new PacketFieldSpec("036_1_8192", new Text("Vorlaufbegrenzung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 13, 32, true, 1L),
			}),
			new PacketFieldSpec("036_1_16384", new Text("Extra Filterlaufzeit"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 14, 64, true, 1L),
			}),
			new PacketFieldSpec("036_1_32768", new Text("Externe Reglerfreigabe"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 15, 128, true, 1L),
			}),
			new PacketFieldSpec("036_1_65536", new Text("Fehlerrelais"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 16, 1, true, 1L),
			}),
			new PacketFieldSpec("036_1_524288_1", new Text("Solarkreis ein"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 19, 8, true, 1L),
			}),
			new PacketFieldSpec("036_1_1048576", new Text("Filter eingeschaltet"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 20, 16, true, 1L),
			}),
			new PacketFieldSpec("036_1_2097152", new Text("Nachhzg normal"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 21, 32, true, 1L),
			}),
			new PacketFieldSpec("036_1_4194304", new Text("Solarkreis aktiv"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 22, 64, true, 1L),
			}),
			new PacketFieldSpec("036_1_8388608", new Text("Betriebsrelais ein"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 23, 128, true, 1L),
			}),
			new PacketFieldSpec("036_1_16777216", new Text("Pumpencheck"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(39, 24, 1, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7762_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7762, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Vorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Rücklauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7774_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7774, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("TSS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("TEF"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Wärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 1000L),
				new PacketFieldPartSpec(15, 0, 255, false, 256000L),
				new PacketFieldPartSpec(16, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(17, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumen"), 0.01, PacketFieldType_Number_0_01_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("TSS"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("TSA"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Wärme2"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 1000L),
				new PacketFieldPartSpec(31, 0, 255, false, 256000L),
				new PacketFieldPartSpec(32, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(33, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Volumenstrom2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("096_4_0_1", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("036_2_0", new Text("TAC"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("TAF"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Wärme3"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 1000L),
				new PacketFieldPartSpec(43, 0, 255, false, 256000L),
				new PacketFieldPartSpec(44, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(45, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Volumenstrom3"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("100_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(100, 0, 255, false, 1L),
				new PacketFieldPartSpec(101, 0, 255, false, 256L),
				new PacketFieldPartSpec(102, 0, 255, false, 65536L),
				new PacketFieldPartSpec(103, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("048_2_0", new Text("TBC"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("TBF"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Wärme4"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 1000L),
				new PacketFieldPartSpec(55, 0, 255, false, 256000L),
				new PacketFieldPartSpec(56, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(57, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Volumenstrom4"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("104_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(104, 0, 255, false, 1L),
				new PacketFieldPartSpec(105, 0, 255, false, 256L),
				new PacketFieldPartSpec(106, 0, 255, false, 65536L),
				new PacketFieldPartSpec(107, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("060_2_0", new Text("TSC"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("TSF"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Wärme5"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 1000L),
				new PacketFieldPartSpec(67, 0, 255, false, 256000L),
				new PacketFieldPartSpec(68, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(69, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("070_2_0", new Text("Volumenstrom5"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 255, false, 1L),
				new PacketFieldPartSpec(71, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("108_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(108, 0, 255, false, 1L),
				new PacketFieldPartSpec(109, 0, 255, false, 256L),
				new PacketFieldPartSpec(110, 0, 255, false, 65536L),
				new PacketFieldPartSpec(111, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Strom1"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("076_4_0", new Text("Strom1"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
				new PacketFieldPartSpec(77, 0, 255, false, 256L),
				new PacketFieldPartSpec(78, 0, 255, false, 65536L),
				new PacketFieldPartSpec(79, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("112_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(112, 0, 255, false, 1L),
				new PacketFieldPartSpec(113, 0, 255, false, 256L),
				new PacketFieldPartSpec(114, 0, 255, false, 65536L),
				new PacketFieldPartSpec(115, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("080_4_0", new Text("Strom2"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
				new PacketFieldPartSpec(81, 0, 255, false, 256L),
				new PacketFieldPartSpec(82, 0, 255, false, 65536L),
				new PacketFieldPartSpec(83, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("116_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(116, 0, 255, false, 1L),
				new PacketFieldPartSpec(117, 0, 255, false, 256L),
				new PacketFieldPartSpec(118, 0, 255, false, 65536L),
				new PacketFieldPartSpec(119, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("084_4_0", new Text("Gas1"), 0.01, PacketFieldType_Number_0_01_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 255, false, 1L),
				new PacketFieldPartSpec(85, 0, 255, false, 256L),
				new PacketFieldPartSpec(86, 0, 255, false, 65536L),
				new PacketFieldPartSpec(87, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("128_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(128, 0, 255, false, 1L),
				new PacketFieldPartSpec(129, 0, 255, false, 256L),
				new PacketFieldPartSpec(130, 0, 255, false, 65536L),
				new PacketFieldPartSpec(131, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("088_4_0", new Text("Therm_ Energie1"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 255, false, 1L),
				new PacketFieldPartSpec(89, 0, 255, false, 256L),
				new PacketFieldPartSpec(90, 0, 255, false, 65536L),
				new PacketFieldPartSpec(91, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("120_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(120, 0, 255, false, 1L),
				new PacketFieldPartSpec(121, 0, 255, false, 256L),
				new PacketFieldPartSpec(122, 0, 255, false, 65536L),
				new PacketFieldPartSpec(123, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("092_4_0", new Text("Therm_ Energie2"), 1, PacketFieldType_Number_1_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(92, 0, 255, false, 1L),
				new PacketFieldPartSpec(93, 0, 255, false, 256L),
				new PacketFieldPartSpec(94, 0, 255, false, 65536L),
				new PacketFieldPartSpec(95, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("124_4_0", new Text("Impulse"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(124, 0, 255, false, 1L),
				new PacketFieldPartSpec(125, 0, 255, false, 256L),
				new PacketFieldPartSpec(126, 0, 255, false, 65536L),
				new PacketFieldPartSpec(127, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("096_4_0_2", new Text("Impulszähler 1 (Volumen 1/2)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("100_4_0_1", new Text("Impulszähler 2 (Volumen 3)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(100, 0, 255, false, 1L),
				new PacketFieldPartSpec(101, 0, 255, false, 256L),
				new PacketFieldPartSpec(102, 0, 255, false, 65536L),
				new PacketFieldPartSpec(103, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("104_4_0_1", new Text("Impulszähler 3 (Volumen 4)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(104, 0, 255, false, 1L),
				new PacketFieldPartSpec(105, 0, 255, false, 256L),
				new PacketFieldPartSpec(106, 0, 255, false, 65536L),
				new PacketFieldPartSpec(107, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("108_4_0_1", new Text("Impulszähler 4 (Volumen 5)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(108, 0, 255, false, 1L),
				new PacketFieldPartSpec(109, 0, 255, false, 256L),
				new PacketFieldPartSpec(110, 0, 255, false, 65536L),
				new PacketFieldPartSpec(111, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("112_4_0_1", new Text("Impulszähler 5 (Strom 1)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(112, 0, 255, false, 1L),
				new PacketFieldPartSpec(113, 0, 255, false, 256L),
				new PacketFieldPartSpec(114, 0, 255, false, 65536L),
				new PacketFieldPartSpec(115, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("116_4_0_1", new Text("Impulszähler 6 (Strom 2)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(116, 0, 255, false, 1L),
				new PacketFieldPartSpec(117, 0, 255, false, 256L),
				new PacketFieldPartSpec(118, 0, 255, false, 65536L),
				new PacketFieldPartSpec(119, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("120_4_0_1", new Text("Impulszähler 7 (th_ Energie 1)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(120, 0, 255, false, 1L),
				new PacketFieldPartSpec(121, 0, 255, false, 256L),
				new PacketFieldPartSpec(122, 0, 255, false, 65536L),
				new PacketFieldPartSpec(123, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("124_4_0_1", new Text("Impulszähler 8 (th_ Energie 2)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(124, 0, 255, false, 1L),
				new PacketFieldPartSpec(125, 0, 255, false, 256L),
				new PacketFieldPartSpec(126, 0, 255, false, 65536L),
				new PacketFieldPartSpec(127, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("128_4_0_1", new Text("Impulszähler 9 (Gas 1)"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(128, 0, 255, false, 1L),
				new PacketFieldPartSpec(129, 0, 255, false, 256L),
				new PacketFieldPartSpec(130, 0, 255, false, 65536L),
				new PacketFieldPartSpec(131, 0, 255, false, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7821_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7821, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Einstrahlung CS"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Impulse 1 V40"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Digital Input"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("031_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(31, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Meldungen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("040_1_0", new Text("System"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Schema"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Vorlauf Soll HK1 Modul Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Status HK1 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Vorlauf Soll HK2 Modul Sensor 25"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Status HK2 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Vorlauf Soll HK3 Modul Sensor 32"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Status HK3 Modul"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Vorlauf Soll Heizkreis Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Status Heizkreis"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("062_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(62, 0, 255, false, 1L),
				new PacketFieldPartSpec(63, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("064_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("066_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(66, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("060_1_0", new Text("Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, true, 100L),
				new PacketFieldPartSpec(61, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7822_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7822, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Vorlauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Rücklauf"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Durchfluss Sensor 8"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
				new PacketFieldPartSpec(8, 0, 255, false, 1000L),
				new PacketFieldPartSpec(9, 0, 255, false, 256000L),
				new PacketFieldPartSpec(10, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(11, 0, 255, false, 256000000L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7830_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7830, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Jahr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Monat"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("003_1_0", new Text("Tag"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(3, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("007_1_0", new Text("Fehlermeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(7, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Vorlauftemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Relais Pumpe"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Relais Mischer Auf"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Relais Mischer Zu"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Handebetrieb Relais Pumpe"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Handebetrieb Relais Mischer Auf"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Handebetrieb Relais Mischer Zu"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("018_1_0", new Text("NH-Anforderung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("Parameter Start"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Parameter TStart"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Parameter TMax"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Parameter Anstieg"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Parameter Anstiegszeit"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Parameter Haltezeit"), 1, PacketFieldType_Number_1_Days, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7840_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7840, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("028_2_0", new Text("SW-Version"), 0.01, PacketFieldType_Number_0_01_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_1_1", new Text("Speicherkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("065_1_1", new Text("Systemkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(65, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("067_1_0", new Text("Frostschutz"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(67, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("068_1_1", new Text("Kollektorkühlung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("069_1_1", new Text("Speichermaximaltemperatur"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(69, 0, 1, true, 1L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7841_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7841, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Leistung"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7910_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7910, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Volumenstrom Sensor S10/V40"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Einstrahlung Sensor CS10"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Druck Sensor RPS"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstrom Sensor FlowRotor"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("033_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("035_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(35, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7911_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7911, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7920_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7920, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7930_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7930, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7D04_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7D04, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Warmwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Zirkulation"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Volumenstrom"), 0.1, PacketFieldType_Number_0_1_LitersPerMinute, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Optionen"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Relaisstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("SensorDefekt"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Temperatur WW-Soll"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("Temperatur Quelle"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("019_1_0", new Text("verbl_ Zapfung"), 1, PacketFieldType_Number_1_Minutes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(19, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Schaltspiele"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 1000L),
				new PacketFieldPartSpec(27, 0, 255, false, 256000L),
				new PacketFieldPartSpec(28, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(29, 0, 255, false, 256000000L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Version"), 0.01, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 100L),
				new PacketFieldPartSpec(31, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_2_0", new Text("max_ Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("min_ Temperatur Kaltwasser"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("max_ Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Zapfmenge"), 0.1, PacketFieldType_Number_0_1_CubicMeters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7E11_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7E11, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Sensor 7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Sensor 8"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Sensor 9"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Sensor 10"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Sensor 11"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Sensor 12"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Sensor 13"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Sensor 14"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Temperatur Sensor 15"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Einstrahlung Sensor 16"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur Sensor 17"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur Sensor 18"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur Sensor 19"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur Sensor 20"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Volumenstrom Sensor 13"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Volumenstrom Sensor 14"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Volumenstrom Sensor 15"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Volumenstrom Sensor 17"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Volumenstrom Sensor 18"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Volumenstrom Sensor 19"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Volumenstrom Sensor 20"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("068_2_0", new Text("Druck Sensor 17"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("070_2_0", new Text("Druck Sensor 18"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(70, 0, 255, false, 1L),
				new PacketFieldPartSpec(71, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("072_2_0", new Text("Druck Sensor 19"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("074_2_0", new Text("Druck Sensor 20"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(74, 0, 255, false, 1L),
				new PacketFieldPartSpec(75, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("076_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(76, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("077_1_0", new Text("Drehzahl Relais 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(77, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("078_1_0", new Text("Drehzahl Relais 3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(78, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("079_1_0", new Text("Drehzahl Relais 4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(79, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("080_1_0", new Text("Drehzahl Relais 5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(80, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("081_1_0", new Text("Drehzahl Relais 6"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(81, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("082_1_0", new Text("Drehzahl Relais 7"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(82, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("083_1_0", new Text("Drehzahl Relais 8"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(83, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("084_1_0", new Text("Drehzahl Relais 9"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(84, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("085_1_0", new Text("Drehzahl Relais 10"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(85, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("086_1_0", new Text("Drehzahl Relais 11"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(86, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("087_1_0", new Text("Drehzahl Relais 12"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(87, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("088_1_0", new Text("Drehzahl Relais 13"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(88, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("089_1_0", new Text("Drehzahl Relais 14"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(89, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("100_1_0", new Text("Ausgang A"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(100, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("101_1_0", new Text("Ausgang B"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(101, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("102_1_0", new Text("Ausgang C"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(102, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("103_1_0", new Text("Ausgang D"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(103, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("092_4_0", new Text("Systemdatum"), 1, PacketFieldType_DateTime_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(92, 0, 255, false, 1L),
				new PacketFieldPartSpec(93, 0, 255, false, 256L),
				new PacketFieldPartSpec(94, 0, 255, false, 65536L),
				new PacketFieldPartSpec(95, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("096_4_0", new Text("Fehlermaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(96, 0, 255, false, 1L),
				new PacketFieldPartSpec(97, 0, 255, false, 256L),
				new PacketFieldPartSpec(98, 0, 255, false, 65536L),
				new PacketFieldPartSpec(99, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7E12_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7E12, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Modul 1 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Modul 1 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Modul 1 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Modul 1 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Modul 1 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Temperatur Modul 1 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Temperatur Modul 2 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Temperatur Modul 2 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Temperatur Modul 2 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Temperatur Modul 2 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("Temperatur Modul 2 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("Temperatur Modul 2 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Temperatur Modul 3 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Temperatur Modul 3 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Temperatur Modul 3 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Temperatur Modul 3 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("032_2_0", new Text("Temperatur Modul 3 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("Temperatur Modul 3 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("Temperatur Modul 4 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("Temperatur Modul 4 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("040_2_0", new Text("Temperatur Modul 4 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("042_2_0", new Text("Temperatur Modul 4 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
				new PacketFieldPartSpec(43, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_2_0", new Text("Temperatur Modul 4 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("046_2_0", new Text("Temperatur Modul 4 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, false, 1L),
				new PacketFieldPartSpec(47, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("048_2_0", new Text("Temperatur Modul 5 Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("050_2_0", new Text("Temperatur Modul 5 Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(50, 0, 255, false, 1L),
				new PacketFieldPartSpec(51, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Temperatur Modul 5 Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Temperatur Modul 5 Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("056_2_0", new Text("Temperatur Modul 5 Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("058_2_0", new Text("Temperatur Modul 5 Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(58, 0, 255, false, 1L),
				new PacketFieldPartSpec(59, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7E20_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7E20, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Vorlauf-Soll-Temperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_1_0", new Text("Betriebsstatus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7E30_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7E30, 0xFFF0, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Wärmemenge heute"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Wärmemenge Woche"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Gesamtvolumen"), 1, PacketFieldType_Number_1_Liters, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7F61_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7F61, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("SekNr"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("T-Umgebung"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("T-Vorlauf/S1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("T-Rücklauf/S2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("TSL"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Tmax-Temp_/S5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Einstrahlung"), 0.1, PacketFieldType_Number_0_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Volumenstr_1"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Volumenstr_2"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("S6"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("S7"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Stromstärke 1"), 0.01, PacketFieldType_Number_0_01_Milliamperes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Stromstärke 2"), 0.01, PacketFieldType_Number_0_01_Milliamperes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Datum_Messdaten"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Wärmemenge 1"), 0.01, PacketFieldType_Number_0_01_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Wärmemenge 2"), 0.01, PacketFieldType_Number_0_01_KilowattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("068_2_0", new Text("Solarwärme"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, true, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 1000L),
				new PacketFieldPartSpec(71, 0, 255, true, 256000L),
				new PacketFieldPartSpec(72, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(73, 0, 255, true, 256000000L),
				new PacketFieldPartSpec(74, 0, 255, false, 1000000000L),
				new PacketFieldPartSpec(75, 0, 255, true, 256000000000L),
			}),
			new PacketFieldSpec("064_4_0", new Text("5-Min-Fehlercode"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7F62_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7F62, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("H-Day"), 0.01, PacketFieldType_Number_0_01_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Q-mess"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Q-erw2"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Q-erw"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Meldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("dt-mess"), 0.01, PacketFieldType_Number_0_01_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("dt-erw2"), 0.01, PacketFieldType_Number_0_01_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("032_4_0", new Text("dt-erw"), 0.01, PacketFieldType_Number_0_01_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Qutil-m"), 0.01, PacketFieldType_Number_0_01_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Qutil-e2"), 0.01, PacketFieldType_Number_0_01_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Qutil-e"), 0.01, PacketFieldType_Number_0_01_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Qtv-e2"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("Qtv-e"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("Qkv-e2"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("060_4_0", new Text("Qkv-e"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(60, 0, 255, false, 1L),
				new PacketFieldPartSpec(61, 0, 255, false, 256L),
				new PacketFieldPartSpec(62, 0, 255, false, 65536L),
				new PacketFieldPartSpec(63, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("064_4_0", new Text("Qskv-e2"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(64, 0, 255, false, 1L),
				new PacketFieldPartSpec(65, 0, 255, false, 256L),
				new PacketFieldPartSpec(66, 0, 255, false, 65536L),
				new PacketFieldPartSpec(67, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("068_4_0", new Text("Qskv-e"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(68, 0, 255, false, 1L),
				new PacketFieldPartSpec(69, 0, 255, false, 256L),
				new PacketFieldPartSpec(70, 0, 255, false, 65536L),
				new PacketFieldPartSpec(71, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("072_4_0", new Text("Tsoll-Day"), 0.01, PacketFieldType_Number_0_01_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(72, 0, 255, false, 1L),
				new PacketFieldPartSpec(73, 0, 255, false, 256L),
				new PacketFieldPartSpec(74, 0, 255, false, 65536L),
				new PacketFieldPartSpec(75, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7F63_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7F63, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Vlast-Day/Vol2"), 0.1, PacketFieldType_Number_0_1_LitersPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Qmess2"), 0.001, PacketFieldType_Number_0_001_KiloWattHoursPerSquareMeterPerDay, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("Tagesfehlercode"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7F64_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7F64, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_4_0", new Text("Tkol-erw"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
				new PacketFieldPartSpec(2, 0, 255, false, 65536L),
				new PacketFieldPartSpec(3, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Volumenstrom-erw"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("008_4_0", new Text("IAM"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Diffusstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Einfallswinkel"), 1, PacketFieldType_Number_1_DegreesAngular, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7F65_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7F65, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("T-Umgebung_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("T-Vorlauf/S1_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("T-Rücklauf/S2_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("TSL_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Tmax-Temp_/S5_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Einstrahlung_1s"), 0.1, PacketFieldType_Number_0_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_4_0", new Text("Volumenstrom1_1s"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
				new PacketFieldPartSpec(14, 0, 255, false, 65536L),
				new PacketFieldPartSpec(15, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Volumenstrom2_1s"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_2_0", new Text("S6_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("S7_1s"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_2_0", new Text("Stromstärke1_1s"), 0.01, PacketFieldType_Number_0_01_Milliamperes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("026_2_0", new Text("Stromstärke2_1s"), 0.01, PacketFieldType_Number_0_01_Milliamperes, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
				new PacketFieldPartSpec(27, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Solarwärme_1s"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 1000L),
				new PacketFieldPartSpec(31, 0, 255, true, 256000L),
				new PacketFieldPartSpec(32, 0, 255, false, 1000000L),
				new PacketFieldPartSpec(33, 0, 255, true, 256000000L),
				new PacketFieldPartSpec(34, 0, 255, false, 1000000000L),
				new PacketFieldPartSpec(35, 0, 255, true, 256000000000L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Statusflag_1s"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0010_7F71_0100() {
		return new PacketSpec(-1, 0x0010, 0xFFFF, 0x7F71, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("004_2_0", new Text("Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("Temperatur Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("Systemdruck"), 0.01, PacketFieldType_Number_0_01_Bars, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Drehzahl Relais 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Systemmeldung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Leistung"), 1, PacketFieldType_Number_1_Watts, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Datum"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("028_2_0", new Text("Uhrzeit"), 1, PacketFieldType_Time_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("030_1_0", new Text("Eff_Min-Drehzahl"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_4_0", new Text("Debug1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, false, 256L),
				new PacketFieldPartSpec(34, 0, 255, false, 65536L),
				new PacketFieldPartSpec(35, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("036_4_0", new Text("Debug2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, false, 256L),
				new PacketFieldPartSpec(38, 0, 255, false, 65536L),
				new PacketFieldPartSpec(39, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("040_4_0", new Text("Debug3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
				new PacketFieldPartSpec(41, 0, 255, false, 256L),
				new PacketFieldPartSpec(42, 0, 255, false, 65536L),
				new PacketFieldPartSpec(43, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("044_4_0", new Text("Debug4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("048_4_0", new Text("Debug5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(48, 0, 255, false, 1L),
				new PacketFieldPartSpec(49, 0, 255, false, 256L),
				new PacketFieldPartSpec(50, 0, 255, false, 65536L),
				new PacketFieldPartSpec(51, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_2_0", new Text("Einstrahlung"), 1, PacketFieldType_Number_1_WattsPerSquareMeter, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("054_2_0", new Text("Zelltemperatur"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(54, 0, 255, false, 1L),
				new PacketFieldPartSpec(55, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_0015_105F_0100() {
		return new PacketSpec(-1, 0x0015, 0xFFFF, 0x105F, 0xFFFF, 0x0100, new PacketFieldSpec[] {
			new PacketFieldSpec("004_2_0", new Text("SD3: Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("SD3: Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("008_4_0", new Text("SD3: Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
				new PacketFieldPartSpec(10, 0, 255, false, 65536L),
				new PacketFieldPartSpec(11, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("016_1_0", new Text("DZ: Drehzahl 1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_1_0", new Text("DZ: Drehzahl 2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("024_1_0", new Text("ERR: Errormask"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("032_2_0", new Text("TW: Temperatur Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
				new PacketFieldPartSpec(33, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("034_2_0", new Text("TW: Temperatur Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
				new PacketFieldPartSpec(35, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("036_2_0", new Text("TW: Temperatur Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
				new PacketFieldPartSpec(37, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("038_2_0", new Text("TW: Temperatur Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(38, 0, 255, false, 1L),
				new PacketFieldPartSpec(39, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("044_4_0", new Text("WM: Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
				new PacketFieldPartSpec(45, 0, 255, false, 256L),
				new PacketFieldPartSpec(46, 0, 255, false, 65536L),
				new PacketFieldPartSpec(47, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("052_4_0", new Text("BS: Betriebsstunden Relais 1"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(52, 0, 255, false, 1L),
				new PacketFieldPartSpec(53, 0, 255, false, 256L),
				new PacketFieldPartSpec(54, 0, 255, false, 65536L),
				new PacketFieldPartSpec(55, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("056_4_0", new Text("BS: Betriebsstunden Relais 2"), 1, PacketFieldType_Number_1_Hours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(56, 0, 255, false, 1L),
				new PacketFieldPartSpec(57, 0, 255, false, 256L),
				new PacketFieldPartSpec(58, 0, 255, false, 65536L),
				new PacketFieldPartSpec(59, 0, 255, true, 16777216L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_4420_0000_0200() {
		return new PacketSpec(-1, 0x4420, 0xFFF0, 0x0000, 0x0000, 0x0200, new PacketFieldSpec[] {
			new PacketFieldSpec("008_1_0", new Text("Vorlaufmaximaltemperatur"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("HK-Kennlinie"), 0.1, PacketFieldType_Number_0_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Nachtabsenkung"), 1, PacketFieldType_Number_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Tageskorrektur"), 1, PacketFieldType_Number_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Sommerbetrieb"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Info Schaltuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_5360_5360_0102() {
		return new PacketSpec(-1, 0x5360, 0xFFFF, 0x5360, 0xFFF0, 0x0102, new PacketFieldSpec[] {
			new PacketFieldSpec("004_2_0", new Text("mStationEin"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("006_2_0", new Text("mStationAus"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(6, 0, 255, false, 1L),
				new PacketFieldPartSpec(7, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_2_0", new Text("mStationAlive"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("mStationFehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Reglervariante"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Durchfluss erwartet"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("DurchschnittsDrehzahl"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_5361_5360_0301() {
		return new PacketSpec(-1, 0x5361, 0xFFFF, 0x5360, 0xFFF0, 0x0301, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Version"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("002_2_0", new Text("Status"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(2, 0, 255, false, 1L),
				new PacketFieldPartSpec(3, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("004_4_0", new Text("Fehler"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
				new PacketFieldPartSpec(5, 0, 255, false, 256L),
				new PacketFieldPartSpec(6, 0, 255, false, 65536L),
				new PacketFieldPartSpec(7, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("008_2_0", new Text("TWW"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
				new PacketFieldPartSpec(9, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("010_2_0", new Text("TKW"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, false, 1L),
				new PacketFieldPartSpec(11, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("012_2_0", new Text("TSpVL"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
				new PacketFieldPartSpec(13, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("014_2_0", new Text("Volumenstrom"), 1, PacketFieldType_Number_1_LitersPerHour, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
				new PacketFieldPartSpec(15, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("016_4_0", new Text("Wärmemenge"), 1, PacketFieldType_Number_1_WattHours, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, false, 256L),
				new PacketFieldPartSpec(18, 0, 255, false, 65536L),
				new PacketFieldPartSpec(19, 0, 255, true, 16777216L),
			}),
			new PacketFieldSpec("020_4_0", new Text("Betriebssekunden"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, false, 256L),
				new PacketFieldPartSpec(22, 0, 255, false, 65536L),
				new PacketFieldPartSpec(23, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("024_4_0", new Text("Stationsbetriebssekunden"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
				new PacketFieldPartSpec(25, 0, 255, false, 256L),
				new PacketFieldPartSpec(26, 0, 255, false, 65536L),
				new PacketFieldPartSpec(27, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("028_4_0", new Text("Gesamtbetriebsstunden"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
				new PacketFieldPartSpec(29, 0, 255, false, 256L),
				new PacketFieldPartSpec(30, 0, 255, false, 65536L),
				new PacketFieldPartSpec(31, 0, 255, false, 16777216L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Reglervariante"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("033_1_0", new Text("Drehzahl"), 0.1, PacketFieldType_Number_0_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("034_1_0", new Text("Handbetrieb Relais Kaskade"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(34, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("035_1_0", new Text("Handbetrieb PWM1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(35, 0, 255, false, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_6510_0000_0200() {
		return new PacketSpec(-1, 0x6510, 0xFFF0, 0x0000, 0x0000, 0x0200, new PacketFieldSpec[] {
			new PacketFieldSpec("000_2_0", new Text("Steuerregister"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
				new PacketFieldPartSpec(1, 0, 255, false, 256L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Vorlaufmaximaltemperatur"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_1_0", new Text("HK-Kennlinie"), 0.1, PacketFieldType_Number_0_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("010_1_0", new Text("Nachtabsenkung"), 1, PacketFieldType_Number_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(10, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("011_1_0", new Text("Tageskorrektur"), 1, PacketFieldType_Number_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(11, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Mischerlaufzeit"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_1_0", new Text("Sommerbetrieb"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("014_1_0", new Text("Info Schaltuhr"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(14, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("015_1_0", new Text("Option Nachheizung"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(15, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("016_2_0", new Text("Speichertemperatur 1 (Bus)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
				new PacketFieldPartSpec(17, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("018_2_0", new Text("Aussentemperatur Bus"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(18, 0, 255, false, 1L),
				new PacketFieldPartSpec(19, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("020_2_0", new Text("dT-NH-ein"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
				new PacketFieldPartSpec(21, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("022_2_0", new Text("dT-NH-aus"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(22, 0, 255, false, 1L),
				new PacketFieldPartSpec(23, 0, 255, true, 256L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Speicherminimaltemperatur"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_1_0", new Text("Speicherkühltemperatur"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("026_1_0", new Text("Speicheranforderungstemperatur (ein)"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(26, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("027_1_0", new Text("Speicheranforderungstemperatur (aus)"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(27, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("028_1_0", new Text("WW-Anforderungstemperatur (ein)"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("029_1_0", new Text("WW-Anforderungstemperatur (aus)"), 1, PacketFieldType_Number_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("030_2_0", new Text("Speichertemperatur 2 (Bus)"), 0.1, PacketFieldType_Number_0_1_DegreesCelsius, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(30, 0, 255, false, 1L),
				new PacketFieldPartSpec(31, 0, 255, true, 256L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_6520_0000_0200() {
		return new PacketSpec(-1, 0x6520, 0xFFF0, 0x0000, 0x0000, 0x0200, new PacketFieldSpec[] {
			new PacketFieldSpec("000_1_0", new Text("Drehzahl 1 R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("001_3_0", new Text("Laufzeit 1 R1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(1, 0, 255, false, 1L),
				new PacketFieldPartSpec(2, 0, 255, false, 256L),
				new PacketFieldPartSpec(3, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("004_1_0", new Text("Drehzahl 2 R1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("005_3_0", new Text("Laufzeit 2 R1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(5, 0, 255, false, 1L),
				new PacketFieldPartSpec(6, 0, 255, false, 256L),
				new PacketFieldPartSpec(7, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl 1 R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("009_3_0", new Text("Laufzeit 1 R2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
				new PacketFieldPartSpec(10, 0, 255, false, 256L),
				new PacketFieldPartSpec(11, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl 2 R2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("013_3_0", new Text("Laufzeit 2 R2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
				new PacketFieldPartSpec(14, 0, 255, false, 256L),
				new PacketFieldPartSpec(15, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl 1 R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("017_3_0", new Text("Laufzeit 1 R3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
				new PacketFieldPartSpec(18, 0, 255, false, 256L),
				new PacketFieldPartSpec(19, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl 2 R3"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("021_3_0", new Text("Laufzeit 2 R3"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
				new PacketFieldPartSpec(22, 0, 255, false, 256L),
				new PacketFieldPartSpec(23, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl 1 R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("025_3_0", new Text("Laufzeit 1 R4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
				new PacketFieldPartSpec(26, 0, 255, false, 256L),
				new PacketFieldPartSpec(27, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl 2 R4"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("029_3_0", new Text("Laufzeit 2 R4"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, false, 1L),
				new PacketFieldPartSpec(30, 0, 255, false, 256L),
				new PacketFieldPartSpec(31, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl 1 R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("033_3_0", new Text("Laufzeit 1 R5"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
				new PacketFieldPartSpec(34, 0, 255, false, 256L),
				new PacketFieldPartSpec(35, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Drehzahl 2 R5"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("037_3_0", new Text("Laufzeit 2 R5"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 0, 255, false, 1L),
				new PacketFieldPartSpec(38, 0, 255, false, 256L),
				new PacketFieldPartSpec(39, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("040_1_0", new Text("Offset Sensor 1"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("041_1_0", new Text("Offset Sensor 2"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("042_1_0", new Text("Offset Sensor 3"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("Offset Sensor 4"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("Offset Sensor 5"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("Offset Sensor 6"), 0.1, PacketFieldType_Number_0_1_DegreesKelvin, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("046_1_0", new Text("Sensormaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(46, 0, 255, true, 1L),
			}),
			new PacketFieldSpec("047_1_0", new Text("Relaismaske"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(47, 0, 255, true, 1L),
			}),
		});
	}

	private static PacketSpec createPacketSpecTemplate_6650_0000_0200() {
		return new PacketSpec(-1, 0x6650, 0xFFF0, 0x0000, 0x0000, 0x0200, new PacketFieldSpec[] {
			new PacketFieldSpec("000_1_0", new Text("Drehzahl Relais 1_1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(0, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("001_3_0", new Text("Timer 1_1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(1, 0, 255, false, 1L),
				new PacketFieldPartSpec(2, 0, 255, false, 256L),
				new PacketFieldPartSpec(3, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("004_1_0", new Text("Drehzahl Relais 1_2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(4, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("005_3_0", new Text("Timer 1_2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(5, 0, 255, false, 1L),
				new PacketFieldPartSpec(6, 0, 255, false, 256L),
				new PacketFieldPartSpec(7, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("008_1_0", new Text("Drehzahl Relais 2_1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(8, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("009_3_0", new Text("Timer 2_1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(9, 0, 255, false, 1L),
				new PacketFieldPartSpec(10, 0, 255, false, 256L),
				new PacketFieldPartSpec(11, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("012_1_0", new Text("Drehzahl Relais 2_2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(12, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("013_3_0", new Text("Timer 2_2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(13, 0, 255, false, 1L),
				new PacketFieldPartSpec(14, 0, 255, false, 256L),
				new PacketFieldPartSpec(15, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("016_1_0", new Text("Drehzahl Relais 3_1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(16, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("017_3_0", new Text("Timer 3_1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(17, 0, 255, false, 1L),
				new PacketFieldPartSpec(18, 0, 255, false, 256L),
				new PacketFieldPartSpec(19, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("020_1_0", new Text("Drehzahl Relais 3_2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(20, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("021_3_0", new Text("Timer 3_2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(21, 0, 255, false, 1L),
				new PacketFieldPartSpec(22, 0, 255, false, 256L),
				new PacketFieldPartSpec(23, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("024_1_0", new Text("Drehzahl Relais 4_1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(24, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("025_3_0", new Text("Timer 4_1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(25, 0, 255, false, 1L),
				new PacketFieldPartSpec(26, 0, 255, false, 256L),
				new PacketFieldPartSpec(27, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("028_1_0", new Text("Drehzahl Relais 4_2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(28, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("029_3_0", new Text("Timer 4_2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(29, 0, 255, false, 1L),
				new PacketFieldPartSpec(30, 0, 255, false, 256L),
				new PacketFieldPartSpec(31, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("032_1_0", new Text("Drehzahl Relais 5_1"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(32, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("033_3_0", new Text("Timer 5_1"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(33, 0, 255, false, 1L),
				new PacketFieldPartSpec(34, 0, 255, false, 256L),
				new PacketFieldPartSpec(35, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("036_1_0", new Text("Drehzahl Relais 5_2"), 1, PacketFieldType_Number_1_Percent, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(36, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("037_3_0", new Text("Timer 5_2"), 1, PacketFieldType_Number_1_Seconds, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(37, 0, 255, false, 1L),
				new PacketFieldPartSpec(38, 0, 255, false, 256L),
				new PacketFieldPartSpec(39, 0, 255, true, 65536L),
			}),
			new PacketFieldSpec("040_1_0", new Text("SensorOutputType1"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(40, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("041_1_0", new Text("SensorOutputType2"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(41, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("042_1_0", new Text("SensorOutputType3"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(42, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("043_1_0", new Text("SensorOutputType4"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(43, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("044_1_0", new Text("SensorOutputType5"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(44, 0, 255, false, 1L),
			}),
			new PacketFieldSpec("045_1_0", new Text("SensorOutputType6"), 1, PacketFieldType_Number_1_None, new PacketFieldPartSpec[] {
				new PacketFieldPartSpec(45, 0, 255, false, 1L),
			}),
		});
	}

}
