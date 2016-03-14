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
package de.resol.vbus.configurationoptimizers;

import java.util.TimeZone;

import de.resol.vbus.BaseConfigurationOptimizer;
import de.resol.vbus.ConfigurationOptimizer;
import de.resol.vbus.ConfigurationOptimizerMatcher;
import de.resol.vbus.ConfigurationValue;
import de.resol.vbus.Customizer;

public class ResolDeltaSolCsPlusXxxConfigurationOptimizer extends BaseConfigurationOptimizer {

	@Override
	public ConfigurationValue[] getAdjustableValues() {
		return new ConfigurationValue[] {
			// {
			//     "type": {
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "1",
			//         "maximums": "10",
			//         "defaults": "1"
			//     },
			//     "valueTexts": [],
			//     "id": "Schema",
			//     "idHash": 1222011281,
			//     "index": 1,
			//     "priority": 10,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("Schema", 0x0001, 0x48D66991, 10),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TemperatureSelector",
			//     "idHash": 335728719,
			//     "index": 10,
			//     "storage": "persistent",
			//     "allowParameterization": true
			// }
			createConfigurationValueDescriptor("TemperatureSelector", 0x000A, 0x1402D04F, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             },
			//             {
			//                 "value": 2
			//             },
			//             {
			//                 "value": 3
			//             },
			//             {
			//                 "value": 4
			//             },
			//             {
			//                 "value": 5
			//             },
			//             {
			//                 "value": 6
			//             }
			//         ],
			//         "rootTypeId": "Prio",
			//         "defaults": "5"
			//     },
			//     "valueTexts": [],
			//     "id": "Vorrang",
			//     "idHash": 1733041791,
			//     "index": 21,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("Vorrang", 0x0015, 0x674C1E7F, 0),

			// {
			//     "type": {
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "0",
			//         "maximums": "30",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "t_st",
			//     "idHash": 4276058,
			//     "index": 22,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("t_st", 0x0016, 0x00413F5A, 0),

			// {
			//     "type": {
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "1",
			//         "maximums": "30",
			//         "defaults": "15"
			//     },
			//     "valueTexts": [],
			//     "id": "t_umw",
			//     "idHash": 141111980,
			//     "index": 23
			// }
			createConfigurationValueDescriptor("t_umw", 0x0017, 0x086932AC, 0),

			// {
			//     "type": {
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "0",
			//         "maximums": "9999"
			//     },
			//     "valueTexts": [],
			//     "id": "Variantenummer",
			//     "idHash": 85862254,
			//     "index": 41,
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("Variantenummer", 0x0029, 0x051E276E, 0),

			// {
			//     "type": {
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "0",
			//         "maximums": "255"
			//     },
			//     "valueTexts": [],
			//     "id": "UnitSensor",
			//     "idHash": 1985787610,
			//     "index": 45,
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("UnitSensor", 0x002D, 0x765CB6DA, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "10",
			//         "maximums": "100",
			//         "defaults": "30"
			//     },
			//     "valueTexts": [],
			//     "id": "MinDrehzahl1",
			//     "idHash": 692828871,
			//     "index": 48,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("MinDrehzahl1", 0x0030, 0x294BBAC7, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "10",
			//         "maximums": "100",
			//         "defaults": "30"
			//     },
			//     "valueTexts": [],
			//     "id": "MinDrehzahl2",
			//     "idHash": 692828872,
			//     "index": 49,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("MinDrehzahl2", 0x0031, 0x294BBAC8, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "10",
			//         "maximums": "100",
			//         "defaults": "100"
			//     },
			//     "valueTexts": [],
			//     "id": "MaxDrehzahl1",
			//     "idHash": 651148297,
			//     "index": 50,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("MaxDrehzahl1", 0x0032, 0x26CFBC09, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "10",
			//         "maximums": "100",
			//         "defaults": "100"
			//     },
			//     "valueTexts": [],
			//     "id": "MaxDrehzahl2",
			//     "idHash": 651148298,
			//     "index": 51,
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("MaxDrehzahl2", 0x0033, 0x26CFBC0A, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dtSystemCoolOn",
			//     "idHash": 1038613223,
			//     "index": 58,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dtSystemCoolOn", 0x003A, 0x3DE7FAE7, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,0",
			//         "maximums": "30,0",
			//         "defaults": "20,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dtSystemCoolOn_K",
			//     "idHash": 1473404209,
			//     "index": 59,
			//     "compoundValueRef": "dtSystemCoolOn"
			// }
			createConfigurationValueDescriptor("dtSystemCoolOn_K", 0x003B, 0x57D25D31, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "2,0",
			//         "maximums": "60,0",
			//         "defaults": "40,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dtSystemCoolOn_R",
			//     "idHash": 1473404216,
			//     "index": 60,
			//     "compoundValueRef": "dtSystemCoolOn"
			// }
			createConfigurationValueDescriptor("dtSystemCoolOn_R", 0x003C, 0x57D25D38, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dtSystemCoolOff",
			//     "idHash": 2061981477,
			//     "index": 61,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dtSystemCoolOff", 0x003D, 0x7AE75725, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,5",
			//         "maximums": "29,5",
			//         "defaults": "15,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dtSystemCoolOff_K",
			//     "idHash": 1377419503,
			//     "index": 62,
			//     "compoundValueRef": "dtSystemCoolOff"
			// }
			createConfigurationValueDescriptor("dtSystemCoolOff_K", 0x003E, 0x5219C0EF, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,0",
			//         "maximums": "59,0",
			//         "defaults": "30,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dtSystemCoolOff_R",
			//     "idHash": 1377419510,
			//     "index": 63,
			//     "compoundValueRef": "dtSystemCoolOff"
			// }
			createConfigurationValueDescriptor("dtSystemCoolOff_R", 0x003F, 0x5219C0F6, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "OHolyCool",
			//     "idHash": 1242329976,
			//     "index": 64
			// }
			createConfigurationValueDescriptor("OHolyCool", 0x0040, 0x4A0C7378, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "THolyCool",
			//     "idHash": 276473981,
			//     "index": 65,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("THolyCool", 0x0041, 0x107AA87D, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "20,0",
			//         "maximums": "80,0",
			//         "defaults": "40,0"
			//     },
			//     "valueTexts": [],
			//     "id": "THolyCool_C",
			//     "idHash": 432457791,
			//     "index": 66,
			//     "compoundValueRef": "THolyCool"
			// }
			createConfigurationValueDescriptor("THolyCool_C", 0x0042, 0x19C6C83F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "70,0",
			//         "maximums": "175,0",
			//         "defaults": "110,0"
			//     },
			//     "valueTexts": [],
			//     "id": "THolyCool_F",
			//     "idHash": 432457794,
			//     "index": 67,
			//     "compoundValueRef": "THolyCool"
			// }
			createConfigurationValueDescriptor("THolyCool_F", 0x0043, 0x19C6C842, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dTSpread",
			//     "idHash": 1436170647,
			//     "index": 68,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dTSpread", 0x0044, 0x559A3997, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "20,0",
			//         "maximums": "90,0",
			//         "defaults": "40,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dTSpread_K",
			//     "idHash": 621742049,
			//     "index": 69,
			//     "compoundValueRef": "dTSpread"
			// }
			createConfigurationValueDescriptor("dTSpread_K", 0x0045, 0x250F07E1, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "40,0",
			//         "maximums": "160,0",
			//         "defaults": "70,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dTSpread_R",
			//     "idHash": 621742056,
			//     "index": 70,
			//     "compoundValueRef": "dTSpread"
			// }
			createConfigurationValueDescriptor("dTSpread_R", 0x0046, 0x250F07E8, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "ORueckkuehlung",
			//     "idHash": 1396396684,
			//     "index": 71
			// }
			createConfigurationValueDescriptor("ORueckkuehlung", 0x0047, 0x533B528C, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0,
			//                 "id": "Off"
			//             },
			//             {
			//                 "value": 1,
			//                 "id": "1to12"
			//             },
			//             {
			//                 "value": 2,
			//                 "id": "2to40"
			//             },
			//             {
			//                 "value": 3,
			//                 "id": "2to40fast"
			//             }
			//         ],
			//         "rootTypeId": "SensorGrundfosDigital_Vt{0}_FlowRange",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "Sensor_Regler_GdS1_FlowRange",
			//     "idHash": 1838702956,
			//     "index": 74,
			//     "structValueRef": "Sensor_Regler_GdS1"
			// }
			createConfigurationValueDescriptor("Sensor_Regler_GdS1_FlowRange", 0x004A, 0x6D98616C, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_Aktiviert",
			//     "idHash": 2062559073,
			//     "index": 81,
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_Aktiviert", 0x0051, 0x7AF02761, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": "0",
			//                 "id": "OFF"
			//             },
			//             {
			//                 "value": "1",
			//                 "id": "Vorlauf"
			//             },
			//             {
			//                 "value": "2",
			//                 "id": "Ruecklauf"
			//             }
			//         ],
			//         "rootTypeId": "WmzX_Struct_Vt{0}_VolumenstromSensor",
			//         "defaults": "2"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_VolumenstromSensor",
			//     "idHash": 1352777507,
			//     "index": 85,
			//     "externalDescriptorFunc": true,
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_VolumenstromSensor", 0x0055, 0x50A1BF23, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.5"
			//         ],
			//         "valueTexts": [
			//             {
			//                 "value": "-99.9"
			//             }
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0,1",
			//         "displayFactors": "0,1",
			//         "minimums": "0.5",
			//         "maximums": "100,0",
			//         "defaults": "6.0"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_VolumenstromMax",
			//     "idHash": 830890895,
			//     "index": 89,
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_VolumenstromMax", 0x0059, 0x3186638F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "0",
			//         "maximums": "3",
			//         "defaults": "1"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_Frostschutzart",
			//     "idHash": 1986503652,
			//     "index": 90,
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_Frostschutzart", 0x005A, 0x7667A3E4, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "20",
			//         "maximums": "70",
			//         "defaults": "45"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_Frostschutzgehalt",
			//     "idHash": 401904914,
			//     "index": 91,
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_Frostschutzgehalt", 0x005B, 0x17F49512, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_TemperatureSensor1",
			//     "idHash": 1833289575,
			//     "index": 92,
			//     "storage": "abstract",
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_TemperatureSensor1", 0x005C, 0x6D45C767, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "260"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_TemperatureSensor1_C",
			//     "idHash": 1440041385,
			//     "index": 93,
			//     "compoundValueRef": "Wmz1_TemperatureSensor1",
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_TemperatureSensor1_C", 0x005D, 0x55D549A9, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "500"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_TemperatureSensor1_F",
			//     "idHash": 1440041388,
			//     "index": 94,
			//     "compoundValueRef": "Wmz1_TemperatureSensor1",
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_TemperatureSensor1_F", 0x005E, 0x55D549AC, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_TemperatureSensor2",
			//     "idHash": 1833289576,
			//     "index": 95,
			//     "storage": "abstract",
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_TemperatureSensor2", 0x005F, 0x6D45C768, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "260"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_TemperatureSensor2_C",
			//     "idHash": 1440042474,
			//     "index": 96,
			//     "compoundValueRef": "Wmz1_TemperatureSensor2",
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_TemperatureSensor2_C", 0x0060, 0x55D54DEA, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "500"
			//     },
			//     "valueTexts": [],
			//     "id": "Wmz1_TemperatureSensor2_F",
			//     "idHash": 1440042477,
			//     "index": 97,
			//     "compoundValueRef": "Wmz1_TemperatureSensor2",
			//     "structValueRef": "Wmz1"
			// }
			createConfigurationValueDescriptor("Wmz1_TemperatureSensor2_F", 0x0061, 0x55D54DED, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Min_ein",
			//     "idHash": 37845290,
			//     "index": 192,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3Min_ein", 0x00C0, 0x0241792A, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,0",
			//         "maximums": "90,0",
			//         "defaults": "5,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Min_ein_C",
			//     "idHash": 411334700,
			//     "index": 193,
			//     "compoundValueRef": "dT3Min_ein"
			// }
			createConfigurationValueDescriptor("dT3Min_ein_C", 0x00C1, 0x1884782C, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "30,0",
			//         "maximums": "190,0",
			//         "defaults": "40,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Min_ein_F",
			//     "idHash": 411334703,
			//     "index": 194,
			//     "compoundValueRef": "dT3Min_ein"
			// }
			createConfigurationValueDescriptor("dT3Min_ein_F", 0x00C2, 0x1884782F, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Min_aus",
			//     "idHash": 37841335,
			//     "index": 195,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3Min_aus", 0x00C3, 0x024169B7, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,0",
			//         "maximums": "90,0",
			//         "defaults": "10,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Min_aus_C",
			//     "idHash": 407027705,
			//     "index": 196,
			//     "compoundValueRef": "dT3Min_aus"
			// }
			createConfigurationValueDescriptor("dT3Min_aus_C", 0x00C4, 0x1842BFF9, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "30,0",
			//         "maximums": "190,0",
			//         "defaults": "50,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Min_aus_F",
			//     "idHash": 407027708,
			//     "index": 197,
			//     "compoundValueRef": "dT3Min_aus"
			// }
			createConfigurationValueDescriptor("dT3Min_aus_F", 0x00C5, 0x1842BFFC, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Max_ein",
			//     "idHash": 1884105004,
			//     "index": 198,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3Max_ein", 0x00C6, 0x704D292C, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,0",
			//         "maximums": "95,0",
			//         "defaults": "60,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Max_ein_C",
			//     "idHash": 943468718,
			//     "index": 199,
			//     "compoundValueRef": "dT3Max_ein"
			// }
			createConfigurationValueDescriptor("dT3Max_ein_C", 0x00C7, 0x383C30AE, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "30,0",
			//         "maximums": "200,0",
			//         "defaults": "140,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Max_ein_F",
			//     "idHash": 943468721,
			//     "index": 200,
			//     "compoundValueRef": "dT3Max_ein"
			// }
			createConfigurationValueDescriptor("dT3Max_ein_F", 0x00C8, 0x383C30B1, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Max_aus",
			//     "idHash": 1884101049,
			//     "index": 201,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3Max_aus", 0x00C9, 0x704D19B9, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,0",
			//         "maximums": "95,0",
			//         "defaults": "58,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Max_aus_C",
			//     "idHash": 939161723,
			//     "index": 202,
			//     "compoundValueRef": "dT3Max_aus"
			// }
			createConfigurationValueDescriptor("dT3Max_aus_C", 0x00CA, 0x37FA787B, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "30,0",
			//         "maximums": "200,0",
			//         "defaults": "136,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Max_aus_F",
			//     "idHash": 939161726,
			//     "index": 203,
			//     "compoundValueRef": "dT3Max_aus"
			// }
			createConfigurationValueDescriptor("dT3Max_aus_F", 0x00CB, 0x37FA787E, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "S1",
			//     "idHash": 2788,
			//     "index": 256,
			//     "storage": "abstract",
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("S1", 0x0100, 0x00000AE4, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S1_C",
			//     "idHash": 3039334,
			//     "index": 257,
			//     "forceUse": true,
			//     "compoundValueRef": "S1"
			// }
			createConfigurationValueDescriptor("S1_C", 0x0101, 0x002E6066, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S1_F",
			//     "idHash": 3039337,
			//     "index": 258,
			//     "forceUse": true,
			//     "compoundValueRef": "S1"
			// }
			createConfigurationValueDescriptor("S1_F", 0x0102, 0x002E6069, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "S2",
			//     "idHash": 2789,
			//     "index": 259,
			//     "storage": "abstract",
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("S2", 0x0103, 0x00000AE5, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S2_C",
			//     "idHash": 3040423,
			//     "index": 260,
			//     "forceUse": true,
			//     "compoundValueRef": "S2"
			// }
			createConfigurationValueDescriptor("S2_C", 0x0104, 0x002E64A7, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S2_F",
			//     "idHash": 3040426,
			//     "index": 261,
			//     "forceUse": true,
			//     "compoundValueRef": "S2"
			// }
			createConfigurationValueDescriptor("S2_F", 0x0105, 0x002E64AA, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "S3",
			//     "idHash": 2790,
			//     "index": 262,
			//     "storage": "abstract",
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("S3", 0x0106, 0x00000AE6, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S3_C",
			//     "idHash": 3041512,
			//     "index": 263,
			//     "forceUse": true,
			//     "compoundValueRef": "S3"
			// }
			createConfigurationValueDescriptor("S3_C", 0x0107, 0x002E68E8, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S3_F",
			//     "idHash": 3041515,
			//     "index": 264,
			//     "forceUse": true,
			//     "compoundValueRef": "S3"
			// }
			createConfigurationValueDescriptor("S3_F", 0x0108, 0x002E68EB, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "S4",
			//     "idHash": 2791,
			//     "index": 265,
			//     "storage": "abstract",
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("S4", 0x0109, 0x00000AE7, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S4_C",
			//     "idHash": 3042601,
			//     "index": 266,
			//     "forceUse": true,
			//     "compoundValueRef": "S4"
			// }
			createConfigurationValueDescriptor("S4_C", 0x010A, 0x002E6D29, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S4_F",
			//     "idHash": 3042604,
			//     "index": 267,
			//     "forceUse": true,
			//     "compoundValueRef": "S4"
			// }
			createConfigurationValueDescriptor("S4_F", 0x010B, 0x002E6D2C, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "S5",
			//     "idHash": 2792,
			//     "index": 268,
			//     "storage": "abstract",
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("S5", 0x010C, 0x00000AE8, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S5_C",
			//     "idHash": 3043690,
			//     "index": 269,
			//     "forceUse": true,
			//     "compoundValueRef": "S5"
			// }
			createConfigurationValueDescriptor("S5_C", 0x010D, 0x002E716A, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-888.8",
			//         "maximums": "888.8"
			//     },
			//     "valueTexts": [],
			//     "id": "S5_F",
			//     "idHash": 3043693,
			//     "index": 270,
			//     "forceUse": true,
			//     "compoundValueRef": "S5"
			// }
			createConfigurationValueDescriptor("S5_F", 0x010E, 0x002E716D, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1ein",
			//     "idHash": 1867547493,
			//     "index": 384,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT1ein", 0x0180, 0x6F508365, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,0",
			//         "maximums": "20,0",
			//         "defaults": "6,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1ein_K",
			//     "idHash": 92208431,
			//     "index": 385,
			//     "compoundValueRef": "dT1ein"
			// }
			createConfigurationValueDescriptor("dT1ein_K", 0x0181, 0x057EFD2F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "2,0",
			//         "maximums": "40,0",
			//         "defaults": "12,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1ein_R",
			//     "idHash": 92208438,
			//     "index": 386,
			//     "compoundValueRef": "dT1ein"
			// }
			createConfigurationValueDescriptor("dT1ein_R", 0x0182, 0x057EFD36, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2ein",
			//     "idHash": 1867583430,
			//     "index": 387,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT2ein", 0x0183, 0x6F510FC6, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,0",
			//         "maximums": "20,0",
			//         "defaults": "6,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2ein_K",
			//     "idHash": 131343824,
			//     "index": 388,
			//     "compoundValueRef": "dT2ein"
			// }
			createConfigurationValueDescriptor("dT2ein_K", 0x0184, 0x07D425D0, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "2,0",
			//         "maximums": "40,0",
			//         "defaults": "12,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2ein_R",
			//     "idHash": 131343831,
			//     "index": 389,
			//     "compoundValueRef": "dT2ein"
			// }
			createConfigurationValueDescriptor("dT2ein_R", 0x0185, 0x07D425D7, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3ein",
			//     "idHash": 1867619367,
			//     "index": 390,
			//     "storage": "abstract",
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("dT3ein", 0x0186, 0x6F519C27, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,0",
			//         "maximums": "20,0",
			//         "defaults": "6,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3ein_K",
			//     "idHash": 170479217,
			//     "index": 391,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "dT3ein"
			// }
			createConfigurationValueDescriptor("dT3ein_K", 0x0187, 0x0A294E71, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "2,0",
			//         "maximums": "40,0",
			//         "defaults": "12,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3ein_R",
			//     "idHash": 170479224,
			//     "index": 392,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "dT3ein"
			// }
			createConfigurationValueDescriptor("dT3ein_R", 0x0188, 0x0A294E78, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1aus",
			//     "idHash": 1867543538,
			//     "index": 400,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT1aus", 0x0190, 0x6F5073F2, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,5",
			//         "maximums": "19,5",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1aus_K",
			//     "idHash": 87901436,
			//     "index": 401,
			//     "compoundValueRef": "dT1aus"
			// }
			createConfigurationValueDescriptor("dT1aus_K", 0x0191, 0x053D44FC, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1",
			//         "maximums": "39",
			//         "defaults": "8,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1aus_R",
			//     "idHash": 87901443,
			//     "index": 402,
			//     "compoundValueRef": "dT1aus"
			// }
			createConfigurationValueDescriptor("dT1aus_R", 0x0192, 0x053D4503, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2aus",
			//     "idHash": 1867579475,
			//     "index": 403,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT2aus", 0x0193, 0x6F510053, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,5",
			//         "maximums": "19,5",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2aus_K",
			//     "idHash": 127036829,
			//     "index": 404,
			//     "compoundValueRef": "dT2aus"
			// }
			createConfigurationValueDescriptor("dT2aus_K", 0x0194, 0x07926D9D, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1",
			//         "maximums": "39",
			//         "defaults": "8,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2aus_R",
			//     "idHash": 127036836,
			//     "index": 405,
			//     "compoundValueRef": "dT2aus"
			// }
			createConfigurationValueDescriptor("dT2aus_R", 0x0195, 0x07926DA4, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3aus",
			//     "idHash": 1867615412,
			//     "index": 406,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3aus", 0x0196, 0x6F518CB4, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,5",
			//         "maximums": "19,5",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3aus_K",
			//     "idHash": 166172222,
			//     "index": 407,
			//     "compoundValueRef": "dT3aus"
			// }
			createConfigurationValueDescriptor("dT3aus_K", 0x0197, 0x09E7963E, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1",
			//         "maximums": "39",
			//         "defaults": "8,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3aus_R",
			//     "idHash": 166172229,
			//     "index": 408,
			//     "compoundValueRef": "dT3aus"
			// }
			createConfigurationValueDescriptor("dT3aus_R", 0x0198, 0x09E79645, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1soll",
			//     "idHash": 1500034819,
			//     "index": 410,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT1soll", 0x019A, 0x5968B703, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,5",
			//         "maximums": "30,0",
			//         "defaults": "10,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1soll_K",
			//     "idHash": 1450348621,
			//     "index": 411,
			//     "compoundValueRef": "dT1soll"
			// }
			createConfigurationValueDescriptor("dT1soll_K", 0x019B, 0x5672904D, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "3",
			//         "maximums": "60,0",
			//         "defaults": "20,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1soll_R",
			//     "idHash": 1450348628,
			//     "index": 412,
			//     "compoundValueRef": "dT1soll"
			// }
			createConfigurationValueDescriptor("dT1soll_R", 0x019C, 0x56729054, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2soll",
			//     "idHash": 1501220740,
			//     "index": 413,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT2soll", 0x019D, 0x597ACF84, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,5",
			//         "maximums": "30,0",
			//         "defaults": "10,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2soll_K",
			//     "idHash": 594332942,
			//     "index": 414,
			//     "compoundValueRef": "dT2soll"
			// }
			createConfigurationValueDescriptor("dT2soll_K", 0x019E, 0x236CCD0E, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "3",
			//         "maximums": "60,0",
			//         "defaults": "20,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2soll_R",
			//     "idHash": 594332949,
			//     "index": 415,
			//     "compoundValueRef": "dT2soll"
			// }
			createConfigurationValueDescriptor("dT2soll_R", 0x019F, 0x236CCD15, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3soll",
			//     "idHash": 1502406661,
			//     "index": 416,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3soll", 0x01A0, 0x598CE805, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1,5",
			//         "maximums": "30,0",
			//         "defaults": "10,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3soll_K",
			//     "idHash": 1885800911,
			//     "index": 417,
			//     "compoundValueRef": "dT3soll"
			// }
			createConfigurationValueDescriptor("dT3soll_K", 0x01A1, 0x706709CF, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "3",
			//         "maximums": "60,0",
			//         "defaults": "20,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3soll_R",
			//     "idHash": 1885800918,
			//     "index": 418,
			//     "compoundValueRef": "dT3soll"
			// }
			createConfigurationValueDescriptor("dT3soll_R", 0x01A2, 0x706709D6, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1Anstieg",
			//     "idHash": 437440628,
			//     "index": 420,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT1Anstieg", 0x01A4, 0x1A12D074, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "1,0",
			//         "maximums": "20,0",
			//         "defaults": "2,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1Anstieg_K",
			//     "idHash": 1778960894,
			//     "index": 421,
			//     "compoundValueRef": "dT1Anstieg"
			// }
			createConfigurationValueDescriptor("dT1Anstieg_K", 0x01A5, 0x6A08C9FE, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "2,0",
			//         "maximums": "40,0",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT1Anstieg_R",
			//     "idHash": 1778960901,
			//     "index": 422,
			//     "compoundValueRef": "dT1Anstieg"
			// }
			createConfigurationValueDescriptor("dT1Anstieg_R", 0x01A6, 0x6A08CA05, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2Anstieg",
			//     "idHash": 106210645,
			//     "index": 423,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT2Anstieg", 0x01A7, 0x0654A555, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "1,0",
			//         "maximums": "20,0",
			//         "defaults": "2,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2Anstieg_K",
			//     "idHash": 1846762271,
			//     "index": 424,
			//     "compoundValueRef": "dT2Anstieg"
			// }
			createConfigurationValueDescriptor("dT2Anstieg_K", 0x01A8, 0x6E135B1F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "2,0",
			//         "maximums": "40,0",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT2Anstieg_R",
			//     "idHash": 1846762278,
			//     "index": 425,
			//     "compoundValueRef": "dT2Anstieg"
			// }
			createConfigurationValueDescriptor("dT2Anstieg_R", 0x01A9, 0x6E135B26, 0),

			// {
			//     "type": {
			//         "rootTypeId": "HysteresisProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Anstieg",
			//     "idHash": 1922464310,
			//     "index": 426,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("dT3Anstieg", 0x01AA, 0x72967A36, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "1,0",
			//         "maximums": "20,0",
			//         "defaults": "2,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Anstieg_K",
			//     "idHash": 1914563648,
			//     "index": 427,
			//     "compoundValueRef": "dT3Anstieg"
			// }
			createConfigurationValueDescriptor("dT3Anstieg_K", 0x01AB, 0x721DEC40, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2,0"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1",
			//         "minimums": "2,0",
			//         "maximums": "40,0",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "dT3Anstieg_R",
			//     "idHash": 1914563655,
			//     "index": 428,
			//     "compoundValueRef": "dT3Anstieg"
			// }
			createConfigurationValueDescriptor("dT3Anstieg_R", 0x01AC, 0x721DEC47, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TSp2Max",
			//     "idHash": 197104495,
			//     "index": 437,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TSp2Max", 0x01B5, 0x0BBF936F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "4",
			//         "maximums": "95",
			//         "defaults": "60"
			//     },
			//     "valueTexts": [],
			//     "id": "TSp2Max_C",
			//     "idHash": 2045917105,
			//     "index": 438,
			//     "compoundValueRef": "TSp2Max"
			// }
			createConfigurationValueDescriptor("TSp2Max_C", 0x01B6, 0x79F237B1, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "40",
			//         "maximums": "200",
			//         "defaults": "140"
			//     },
			//     "valueTexts": [],
			//     "id": "TSp2Max_F",
			//     "idHash": 2045917108,
			//     "index": 439,
			//     "compoundValueRef": "TSp2Max"
			// }
			createConfigurationValueDescriptor("TSp2Max_F", 0x01B7, 0x79F237B4, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TSp1Max",
			//     "idHash": 197068558,
			//     "index": 443,
			//     "storage": "abstract",
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("TSp1Max", 0x01BB, 0x0BBF070E, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "4",
			//         "maximums": "95",
			//         "defaults": "60"
			//     },
			//     "valueTexts": [],
			//     "id": "TSp1Max_C",
			//     "idHash": 2006781712,
			//     "index": 444,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "TSp1Max"
			// }
			createConfigurationValueDescriptor("TSp1Max_C", 0x01BC, 0x779D0F10, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "40",
			//         "maximums": "200",
			//         "defaults": "140"
			//     },
			//     "valueTexts": [],
			//     "id": "TSp1Max_F",
			//     "idHash": 2006781715,
			//     "index": 445,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "TSp1Max"
			// }
			createConfigurationValueDescriptor("TSp1Max_F", 0x01BD, 0x779D0F13, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Not",
			//     "idHash": 496292796,
			//     "index": 447,
			//     "storage": "abstract",
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("TKol1Not", 0x01BF, 0x1D94D3BC, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "80",
			//         "maximums": "200",
			//         "defaults": "130"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Not_C",
			//     "idHash": 1444462398,
			//     "index": 448,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "TKol1Not"
			// }
			createConfigurationValueDescriptor("TKol1Not_C", 0x01C0, 0x5618BF3E, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "170",
			//         "maximums": "390",
			//         "defaults": "270"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Not_F",
			//     "idHash": 1444462401,
			//     "index": 449,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "TKol1Not"
			// }
			createConfigurationValueDescriptor("TKol1Not_F", 0x01C1, 0x5618BF41, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Not",
			//     "idHash": 496328733,
			//     "index": 450,
			//     "storage": "abstract",
			//     "externalDescriptorFunc": true
			// }
			createConfigurationValueDescriptor("TKol2Not", 0x01C2, 0x1D95601D, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "80",
			//         "maximums": "200",
			//         "defaults": "130"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Not_C",
			//     "idHash": 1483597791,
			//     "index": 451,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "TKol2Not"
			// }
			createConfigurationValueDescriptor("TKol2Not_C", 0x01C3, 0x586DE7DF, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "170",
			//         "maximums": "390",
			//         "defaults": "270"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Not_F",
			//     "idHash": 1483597794,
			//     "index": 452,
			//     "externalDescriptorFunc": true,
			//     "compoundValueRef": "TKol2Not"
			// }
			createConfigurationValueDescriptor("TKol2Not_F", 0x01C4, 0x586DE7E2, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Max",
			//     "idHash": 496291249,
			//     "index": 454,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TKol1Max", 0x01C6, 0x1D94CDB1, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "70",
			//         "maximums": "160",
			//         "defaults": "110"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Max_C",
			//     "idHash": 1442777715,
			//     "index": 455,
			//     "compoundValueRef": "TKol1Max"
			// }
			createConfigurationValueDescriptor("TKol1Max_C", 0x01C7, 0x55FF0A73, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "150",
			//         "maximums": "320",
			//         "defaults": "230"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Max_F",
			//     "idHash": 1442777718,
			//     "index": 456,
			//     "compoundValueRef": "TKol1Max"
			// }
			createConfigurationValueDescriptor("TKol1Max_F", 0x01C8, 0x55FF0A76, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Max",
			//     "idHash": 496327186,
			//     "index": 457,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TKol2Max", 0x01C9, 0x1D955A12, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "70",
			//         "maximums": "160",
			//         "defaults": "110"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Max_C",
			//     "idHash": 1481913108,
			//     "index": 458,
			//     "compoundValueRef": "TKol2Max"
			// }
			createConfigurationValueDescriptor("TKol2Max_C", 0x01CA, 0x58543314, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "150",
			//         "maximums": "320",
			//         "defaults": "230"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Max_F",
			//     "idHash": 1481913111,
			//     "index": 459,
			//     "compoundValueRef": "TKol2Max"
			// }
			createConfigurationValueDescriptor("TKol2Max_F", 0x01CB, 0x58543317, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "OKol1Max",
			//     "idHash": 4957516,
			//     "index": 461
			// }
			createConfigurationValueDescriptor("OKol1Max", 0x01CD, 0x004BA54C, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "OKol2Max",
			//     "idHash": 4993453,
			//     "index": 462
			// }
			createConfigurationValueDescriptor("OKol2Max", 0x01CE, 0x004C31AD, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Min",
			//     "idHash": 496291503,
			//     "index": 496,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TKol1Min", 0x01F0, 0x1D94CEAF, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "10,0",
			//         "maximums": "90,0",
			//         "defaults": "10,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Min_C",
			//     "idHash": 1443054321,
			//     "index": 497,
			//     "compoundValueRef": "TKol1Min"
			// }
			createConfigurationValueDescriptor("TKol1Min_C", 0x01F1, 0x560342F1, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "50",
			//         "maximums": "190",
			//         "defaults": "50"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Min_F",
			//     "idHash": 1443054324,
			//     "index": 498,
			//     "compoundValueRef": "TKol1Min"
			// }
			createConfigurationValueDescriptor("TKol1Min_F", 0x01F2, 0x560342F4, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Min",
			//     "idHash": 496327440,
			//     "index": 499,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TKol2Min", 0x01F3, 0x1D955B10, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "10,0",
			//         "maximums": "90,0",
			//         "defaults": "10,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Min_C",
			//     "idHash": 1482189714,
			//     "index": 500,
			//     "compoundValueRef": "TKol2Min"
			// }
			createConfigurationValueDescriptor("TKol2Min_C", 0x01F4, 0x58586B92, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "50",
			//         "maximums": "190",
			//         "defaults": "50"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Min_F",
			//     "idHash": 1482189717,
			//     "index": 501,
			//     "compoundValueRef": "TKol2Min"
			// }
			createConfigurationValueDescriptor("TKol2Min_F", 0x01F5, 0x58586B95, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "OKol1Min",
			//     "idHash": 4957770,
			//     "index": 512
			// }
			createConfigurationValueDescriptor("OKol1Min", 0x0200, 0x004BA64A, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "OKol2Min",
			//     "idHash": 4993707,
			//     "index": 513
			// }
			createConfigurationValueDescriptor("OKol2Min", 0x0201, 0x004C32AB, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Frost",
			//     "idHash": 1435078105,
			//     "index": 528,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TKol1Frost", 0x0210, 0x55898DD9, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40,0",
			//         "maximums": "10,0",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Frost_C",
			//     "idHash": 1579447451,
			//     "index": 529,
			//     "compoundValueRef": "TKol1Frost"
			// }
			createConfigurationValueDescriptor("TKol1Frost_C", 0x0211, 0x5E24749B, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "50",
			//         "defaults": "40"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol1Frost_F",
			//     "idHash": 1579447454,
			//     "index": 530,
			//     "compoundValueRef": "TKol1Frost"
			// }
			createConfigurationValueDescriptor("TKol1Frost_F", 0x0212, 0x5E24749E, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Frost",
			//     "idHash": 1474213498,
			//     "index": 531,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TKol2Frost", 0x0213, 0x57DEB67A, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40,0",
			//         "maximums": "10,0",
			//         "defaults": "4,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Frost_C",
			//     "idHash": 1248217468,
			//     "index": 532,
			//     "compoundValueRef": "TKol2Frost"
			// }
			createConfigurationValueDescriptor("TKol2Frost_C", 0x0214, 0x4A66497C, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "50",
			//         "defaults": "40"
			//     },
			//     "valueTexts": [],
			//     "id": "TKol2Frost_F",
			//     "idHash": 1248217471,
			//     "index": 533,
			//     "compoundValueRef": "TKol2Frost"
			// }
			createConfigurationValueDescriptor("TKol2Frost_F", 0x0215, 0x4A66497F, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "OKol1Frost",
			//     "idHash": 1096071220,
			//     "index": 544
			// }
			createConfigurationValueDescriptor("OKol1Frost", 0x0220, 0x4154B834, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "OKol2Frost",
			//     "idHash": 1135206613,
			//     "index": 545
			// }
			createConfigurationValueDescriptor("OKol2Frost", 0x0221, 0x43A9E0D5, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0,
			//                 "id": "Off"
			//             },
			//             {
			//                 "value": 1,
			//                 "id": "Auto"
			//             },
			//             {
			//                 "value": 2,
			//                 "id": "On"
			//             }
			//         ],
			//         "rootTypeId": "Tristate",
			//         "defaults": "1"
			//     },
			//     "valueTexts": [],
			//     "id": "Handbetrieb1",
			//     "idHash": 1887930473,
			//     "index": 552
			// }
			createConfigurationValueDescriptor("Handbetrieb1", 0x0228, 0x70878869, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0,
			//                 "id": "Off"
			//             },
			//             {
			//                 "value": 1,
			//                 "id": "Auto"
			//             },
			//             {
			//                 "value": 2,
			//                 "id": "On"
			//             }
			//         ],
			//         "rootTypeId": "Tristate",
			//         "defaults": "1"
			//     },
			//     "valueTexts": [],
			//     "id": "Handbetrieb2",
			//     "idHash": 1887930474,
			//     "index": 553
			// }
			createConfigurationValueDescriptor("Handbetrieb2", 0x0229, 0x7087886A, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "OSNO",
			//     "idHash": 2932063,
			//     "index": 560
			// }
			createConfigurationValueDescriptor("OSNO", 0x0230, 0x002CBD5F, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "ODesinfektion",
			//     "idHash": 1472079570,
			//     "index": 2560
			// }
			createConfigurationValueDescriptor("ODesinfektion", 0x0A00, 0x57BE26D2, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "24",
			//             "1",
			//             "0"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "720",
			//         "defaults": "00:24"
			//     },
			//     "valueTexts": [],
			//     "id": "periodeDesinfektion",
			//     "idHash": 1343451819,
			//     "index": 2561
			// }
			createConfigurationValueDescriptor("periodeDesinfektion", 0x0A01, 0x501372AB, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "temperaturDesinfektion",
			//     "idHash": 1925586124,
			//     "index": 2562,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("temperaturDesinfektion", 0x0A02, 0x72C61CCC, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "0,0",
			//         "maximums": "95,0",
			//         "defaults": "60,0"
			//     },
			//     "valueTexts": [],
			//     "id": "temperaturDesinfektion_C",
			//     "idHash": 1019251790,
			//     "index": 2563,
			//     "compoundValueRef": "temperaturDesinfektion"
			// }
			createConfigurationValueDescriptor("temperaturDesinfektion_C", 0x0A03, 0x3CC08C4E, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "2"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "1.0",
			//         "minimums": "30,0",
			//         "maximums": "200,0",
			//         "defaults": "140,0"
			//     },
			//     "valueTexts": [],
			//     "id": "temperaturDesinfektion_F",
			//     "idHash": 1019251793,
			//     "index": 2564,
			//     "compoundValueRef": "temperaturDesinfektion"
			// }
			createConfigurationValueDescriptor("temperaturDesinfektion_F", 0x0A04, 0x3CC08C51, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "01:00",
			//             "00:01"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59",
			//         "defaults": "1:00"
			//     },
			//     "valueTexts": [],
			//     "id": "dauerTemperaturDesinfektion",
			//     "idHash": 97142205,
			//     "index": 2565
			// }
			createConfigurationValueDescriptor("dauerTemperaturDesinfektion", 0x0A05, 0x05CA45BD, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "01:00",
			//             "00:01"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "24:00",
			//         "defaults": "00:00"
			//     },
			//     "valueTexts": [],
			//     "id": "startDesinfektion",
			//     "idHash": 286946993,
			//     "index": 2566
			// }
			createConfigurationValueDescriptor("startDesinfektion", 0x0A06, 0x111A76B1, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "OSystCol",
			//     "idHash": 1335744,
			//     "index": 2569
			// }
			createConfigurationValueDescriptor("OSystCol", 0x0A09, 0x001461C0, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "ODrainBack",
			//     "idHash": 223128334,
			//     "index": 2768
			// }
			createConfigurationValueDescriptor("ODrainBack", 0x0AD0, 0x0D4CAB0E, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "1",
			//         "maximums": "100",
			//         "defaults": "60"
			//     },
			//     "valueTexts": [],
			//     "id": "tdT_ein",
			//     "idHash": 1355629639,
			//     "index": 2769
			// }
			createConfigurationValueDescriptor("tdT_ein", 0x0AD1, 0x50CD4447, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1.0",
			//         "maximums": "30.0",
			//         "defaults": "5.0"
			//     },
			//     "valueTexts": [],
			//     "id": "t_fuell",
			//     "idHash": 1182089963,
			//     "index": 2771
			// }
			createConfigurationValueDescriptor("t_fuell", 0x0AD3, 0x467542EB, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0.5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "1.0",
			//         "maximums": "15.0",
			//         "defaults": "2.0"
			//     },
			//     "valueTexts": [],
			//     "id": "t_stab",
			//     "idHash": 361663165,
			//     "index": 2773
			// }
			createConfigurationValueDescriptor("t_stab", 0x0AD5, 0x158E8ABD, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State"
			//     },
			//     "valueTexts": [],
			//     "id": "OBooster",
			//     "idHash": 1272619885,
			//     "index": 2775,
			//     "forceUse": true
			// }
			createConfigurationValueDescriptor("OBooster", 0x0AD7, 0x4BDAA36D, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TTh1ein",
			//     "idHash": 226742973,
			//     "index": 3584,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TTh1ein", 0x0E00, 0x0D83D2BD, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,0",
			//         "maximums": "95,0",
			//         "defaults": "40,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TTh1ein_C",
			//     "idHash": 2109964927,
			//     "index": 3585,
			//     "compoundValueRef": "TTh1ein"
			// }
			createConfigurationValueDescriptor("TTh1ein_C", 0x0E01, 0x7DC3827F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "30,0",
			//         "maximums": "200,0",
			//         "defaults": "110,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TTh1ein_F",
			//     "idHash": 2109964930,
			//     "index": 3586,
			//     "compoundValueRef": "TTh1ein"
			// }
			createConfigurationValueDescriptor("TTh1ein_F", 0x0E02, 0x7DC38282, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59"
			//     },
			//     "valueTexts": [],
			//     "id": "t1Th1ein",
			//     "idHash": 354548302,
			//     "index": 3587
			// }
			createConfigurationValueDescriptor("t1Th1ein", 0x0E03, 0x1521FA4E, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "TTh1aus",
			//     "idHash": 226739018,
			//     "index": 3588,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("TTh1aus", 0x0E04, 0x0D83C34A, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "0,5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "0,0",
			//         "maximums": "95,0",
			//         "defaults": "45,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TTh1aus_C",
			//     "idHash": 2105657932,
			//     "index": 3589,
			//     "compoundValueRef": "TTh1aus"
			// }
			createConfigurationValueDescriptor("TTh1aus_C", 0x0E05, 0x7D81CA4C, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "30,0",
			//         "maximums": "200,0",
			//         "defaults": "120,0"
			//     },
			//     "valueTexts": [],
			//     "id": "TTh1aus_F",
			//     "idHash": 2105657935,
			//     "index": 3590,
			//     "compoundValueRef": "TTh1aus"
			// }
			createConfigurationValueDescriptor("TTh1aus_F", 0x0E06, 0x7D81CA4F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59"
			//     },
			//     "valueTexts": [],
			//     "id": "t1Th1aus",
			//     "idHash": 354544347,
			//     "index": 3592
			// }
			createConfigurationValueDescriptor("t1Th1aus", 0x0E08, 0x1521EADB, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59"
			//     },
			//     "valueTexts": [],
			//     "id": "t2Th1ein",
			//     "idHash": 1646016271,
			//     "index": 3593
			// }
			createConfigurationValueDescriptor("t2Th1ein", 0x0E09, 0x621C370F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59"
			//     },
			//     "valueTexts": [],
			//     "id": "t2Th1aus",
			//     "idHash": 1646012316,
			//     "index": 3594
			// }
			createConfigurationValueDescriptor("t2Th1aus", 0x0E0A, 0x621C279C, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59"
			//     },
			//     "valueTexts": [],
			//     "id": "t3Th1ein",
			//     "idHash": 790000592,
			//     "index": 3595
			// }
			createConfigurationValueDescriptor("t3Th1ein", 0x0E0B, 0x2F1673D0, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59"
			//     },
			//     "valueTexts": [],
			//     "id": "t3Th1aus",
			//     "idHash": 789996637,
			//     "index": 3596
			// }
			createConfigurationValueDescriptor("t3Th1aus", 0x0E0C, 0x2F16645D, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": 0
			//             },
			//             {
			//                 "value": 1
			//             }
			//         ],
			//         "rootTypeId": "State",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "ORoehrenkollektor",
			//     "idHash": 1763255801,
			//     "index": 3897
			// }
			createConfigurationValueDescriptor("ORoehrenkollektor", 0x0F39, 0x691925F9, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59",
			//         "defaults": "07:00"
			//     },
			//     "valueTexts": [],
			//     "id": "tRKstart",
			//     "idHash": 1834032287,
			//     "index": 3904
			// }
			createConfigurationValueDescriptor("tRKstart", 0x0F40, 0x6D511C9F, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "00:15"
			//         ],
			//         "rootTypeId": "Time",
			//         "storeFactors": "00:01",
			//         "displayFactors": "00:01",
			//         "minimums": "00:00",
			//         "maximums": "23:59",
			//         "defaults": "19:00"
			//     },
			//     "valueTexts": [],
			//     "id": "tRKend",
			//     "idHash": 344792808,
			//     "index": 3905
			// }
			createConfigurationValueDescriptor("tRKend", 0x0F41, 0x148D1EE8, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "5"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "5",
			//         "maximums": "500",
			//         "defaults": "30"
			//     },
			//     "valueTexts": [],
			//     "id": "tRKrun",
			//     "idHash": 344807206,
			//     "index": 3906
			// }
			createConfigurationValueDescriptor("tRKrun", 0x0F42, 0x148D5726, 0),

			// {
			//     "type": {
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "1",
			//         "maximums": "60",
			//         "defaults": "30"
			//     },
			//     "valueTexts": [],
			//     "id": "tRKinterval",
			//     "idHash": 1784331894,
			//     "index": 3907
			// }
			createConfigurationValueDescriptor("tRKinterval", 0x0F43, 0x6A5ABE76, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": "0"
			//             },
			//             {
			//                 "value": "1"
			//             }
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "1",
			//         "displayFactors": "1",
			//         "minimums": "0",
			//         "maximums": "1",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "Save",
			//     "idHash": 3092399,
			//     "index": 12548
			// }
			createConfigurationValueDescriptor("Save", 0x3104, 0x002F2FAF, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": "0",
			//                 "id": "OnOff"
			//             },
			//             {
			//                 "value": "1",
			//                 "id": "Puls"
			//             },
			//             {
			//                 "value": "2",
			//                 "id": "PwmSolar"
			//             },
			//             {
			//                 "value": "3",
			//                 "id": "PwmHeizung"
			//             }
			//         ],
			//         "rootTypeId": "VtPum{}",
			//         "defaults": "2"
			//     },
			//     "valueTexts": [],
			//     "id": "Pum1",
			//     "idHash": 3006019,
			//     "index": 12549
			// }
			createConfigurationValueDescriptor("Pum1", 0x3105, 0x002DDE43, 0),

			// {
			//     "type": {
			//         "valueTexts": [
			//             {
			//                 "value": "0",
			//                 "id": "OnOff"
			//             },
			//             {
			//                 "value": "1",
			//                 "id": "Puls"
			//             },
			//             {
			//                 "value": "2",
			//                 "id": "PwmSolar"
			//             },
			//             {
			//                 "value": "3",
			//                 "id": "PwmHeizung"
			//             }
			//         ],
			//         "rootTypeId": "VtPum{}",
			//         "defaults": "0"
			//     },
			//     "valueTexts": [],
			//     "id": "Pum2",
			//     "idHash": 3006020,
			//     "index": 12550
			// }
			createConfigurationValueDescriptor("Pum2", 0x3106, 0x002DDE44, 0),

			// {
			//     "type": {
			//         "rootTypeId": "TemperatureProxy",
			//         "selectorValueRef": "TemperatureSelector"
			//     },
			//     "valueTexts": [],
			//     "id": "Emv_DDS_Temperatur",
			//     "idHash": 457934698,
			//     "index": 32757,
			//     "storage": "abstract"
			// }
			createConfigurationValueDescriptor("Emv_DDS_Temperatur", 0x7FF5, 0x1B4B876A, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "260"
			//     },
			//     "valueTexts": [],
			//     "id": "Emv_DDS_Temperatur_C",
			//     "idHash": 474682988,
			//     "index": 32758,
			//     "compoundValueRef": "Emv_DDS_Temperatur"
			// }
			createConfigurationValueDescriptor("Emv_DDS_Temperatur_C", 0x7FF6, 0x1C4B166C, 0),

			// {
			//     "type": {
			//         "quants": [
			//             "1"
			//         ],
			//         "rootTypeId": "Number",
			//         "storeFactors": "0.1",
			//         "displayFactors": "0.1",
			//         "minimums": "-40",
			//         "maximums": "500"
			//     },
			//     "valueTexts": [],
			//     "id": "Emv_DDS_Temperatur_F",
			//     "idHash": 474682991,
			//     "index": 32759,
			//     "compoundValueRef": "Emv_DDS_Temperatur"
			// }
			createConfigurationValueDescriptor("Emv_DDS_Temperatur_F", 0x7FF7, 0x1C4B166F, 0),
		};
	}

	private ConfigurationValue createConfigurationValueDescriptor(String valueId, int valueIndex, int valueIdHash, int priority) {
		return new ConfigurationValue(valueId, valueIndex, valueIdHash, 0, priority, false, false);
	}

	@Override
	public ConfigurationValue[] generateClockConfiguration(long time, TimeZone timezone) {
		time += timezone.getOffset(time);
		
		int value = (int) ((time / 60000) % 1440);

		return new ConfigurationValue[] {
			new ConfigurationValue("SysTime", 0x0002, 0x17B2C58E, value, 0, true, false),
		};
	}
	
	public static ConfigurationOptimizerMatcher getMatcher() {
		return new ConfigurationOptimizerMatcher() {
			
			public ConfigurationOptimizer matchOptimizer(int deviceAddress, String version, Customizer customizer, MatcherState state) {
				if (deviceAddress == 0x2211) {
					return new ResolDeltaSolCsPlusXxxConfigurationOptimizer();
				} else {
					return null;
				}
			}
			
		};
	}

}
