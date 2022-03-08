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

public class RegumaqX45ConfigurationOptimizer extends BaseConfigurationOptimizer {

	@Override
	public ConfigurationValue[] getAdjustableValues() {
		return new ConfigurationValue[] {
				//createConfigurationValueDescriptor("SDKarteLogging_Methode", 0x0023, 0xa00ea974, 0),
				//createConfigurationValueDescriptor("SDKarteLogging_Intervall", 0x0024, 0x6bf2b563, 0),
				createConfigurationValueDescriptor("WarmwasserTSoll", 0x0037, 0x5fc5f901, 0),
				//createConfigurationValueDescriptor("WarmwasserTSollMin", 0x0038, 0x3e5fef4e, 0),
				//createConfigurationValueDescriptor("WarmwasserTSollMax", 0x0039, 0xe033d82d, 0),
				//createConfigurationValueDescriptor("WarmwasserKomfort", 0x003a, 0xac49634e, 0),
				//createConfigurationValueDescriptor("WarmwasserKomfortActivatedTKomfort", 0x003b, 0x9285bc5e, 0),
				//createConfigurationValueDescriptor("WarmwasserNotbetrieb", 0x003c, 0xd7a0c3f7, 0),
				//createConfigurationValueDescriptor("WarmwasserNotbetriebActivatedDrehzahl", 0x003d, 0x92f2567e, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn0", 0x003e, 0xb2e3722d, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn1", 0x003f, 0x014bda0f, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn2", 0x0040, 0x8e3f06d4, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn3", 0x0041, 0x20b287f3, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn4", 0x0042, 0x1dd2306a, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn5", 0x0043, 0x1aae6890, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn6", 0x0044, 0xb710702f, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn7", 0x0045, 0x6c0a3bff, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn8", 0x0046, 0x3d679d06, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn9", 0x0047, 0x4743a69a, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn10", 0x0048, 0xe7680d9d, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn11", 0x0049, 0x72d26f31, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn12", 0x004a, 0x1a1f41d6, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn13", 0x004b, 0x7392b2d0, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn14", 0x004c, 0xbf703bf2, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn15", 0x004d, 0x79a9f9fa, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn16", 0x004e, 0x6d120e62, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn17", 0x004f, 0x2c870c0b, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn18", 0x0050, 0xe54d6e48, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn19", 0x0051, 0x293fbab4, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn20", 0x0052, 0x12d0eff8, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn21", 0x0053, 0x907ea57e, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn22", 0x0054, 0x517b6147, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn23", 0x0055, 0xfd7aac03, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn24", 0x0056, 0x89db31a8, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn25", 0x0057, 0xfcb16a84, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn26", 0x0058, 0xe56769fe, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn27", 0x0059, 0x67df2c4a, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn28", 0x005a, 0xf99ffe39, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn29", 0x005b, 0xcb4c1f33, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn30", 0x005c, 0x018b2e47, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn31", 0x005d, 0xec6b7ab0, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn32", 0x005e, 0xa985e14c, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn33", 0x005f, 0x7b595dd1, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn34", 0x0060, 0x6dd8bedf, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn35", 0x0061, 0xb56adeeb, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn36", 0x0062, 0xe5e921c6, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn37", 0x0063, 0xe88014dc, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn38", 0x0064, 0xbcff15eb, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn39", 0x0065, 0xb9496f45, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn40", 0x0066, 0xb53f9b32, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn41", 0x0067, 0xf6862e7c, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn42", 0x0068, 0xcf2cd677, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn43", 0x0069, 0xf16766a6, 0),
				//createConfigurationValueDescriptor("WarmwasserFwrGrnn44", 0x006a, 0x9a7406ba, 0),
				//createConfigurationValueDescriptor("Zirkulation", 0x0071, 0x30e517ae, 0),
				//createConfigurationValueDescriptor("ZirkulationAnforderung_0SensorNr", 0x0072, 0x42cafaf3, 0),
				//createConfigurationValueDescriptor("ZirkulationAnforderung_0dtImpuls", 0x0074, 0xbc03c4d9, 0),
				//createConfigurationValueDescriptor("ZirkulationAnforderung_0dtImpulsMax", 0x0075, 0x2de88431, 0),
				//createConfigurationValueDescriptor("ZirkulationAnforderung_0dtLaufzeit", 0x0076, 0x1ec6390a, 0),
				//createConfigurationValueDescriptor("ZirkulationAnforderung_0dtWartezeit", 0x0077, 0xfbd57c5e, 0),
				//createConfigurationValueDescriptor("ZirkulationThermisch_0SensorNr", 0x0072, 0xf6ebfad6, 0),
				//createConfigurationValueDescriptor("ZirkulationThermisch_0TSoll", 0x0074, 0x5ccb5a06, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh0", 0x0072, 0xf680713b, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh1", 0x0073, 0x2cbaa5c8, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh2", 0x0074, 0x7464ebb2, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh3", 0x0075, 0xca3a41fa, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh4", 0x0076, 0xe409a808, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh5", 0x0077, 0x87aceef1, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh6", 0x0078, 0xa9e9988d, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh7", 0x0079, 0x951aaeb8, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh8", 0x007a, 0x5aa7fb5b, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh9", 0x007b, 0x6e2b66d6, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh10", 0x007c, 0x0df2930d, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh11", 0x007d, 0x67637bbe, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh12", 0x007e, 0x1d494684, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh13", 0x007f, 0x909a3e7d, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh14", 0x0080, 0xa77de0e1, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh15", 0x0081, 0x71d80253, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh16", 0x0082, 0x77f81e16, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh17", 0x0083, 0xba8873aa, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh18", 0x0084, 0x6c6fb92a, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh19", 0x0085, 0x591700c6, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh20", 0x0086, 0xc435abd7, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh21", 0x0087, 0x0bf22767, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh22", 0x0088, 0x1fdf8a6c, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh23", 0x0089, 0xf92fb213, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh24", 0x008a, 0x3a39216a, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh25", 0x008b, 0x8c434185, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh26", 0x008c, 0x3104f758, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh27", 0x008d, 0x091e540a, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh28", 0x008e, 0xab4d1f4f, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh29", 0x008f, 0x5d9383ca, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh30", 0x0090, 0x0651c7e1, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh31", 0x0091, 0x918956cb, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh32", 0x0092, 0x751bf7d5, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh33", 0x0093, 0xc4738115, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh34", 0x0094, 0x3804d0c5, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh35", 0x0095, 0x3410d739, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh36", 0x0096, 0x82d1fa81, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh37", 0x0097, 0xa8e10637, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh38", 0x0098, 0x1fb14e1a, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh39", 0x0099, 0xcf53d065, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh40", 0x009a, 0x83dbf58e, 0),
				//createConfigurationValueDescriptor("ZirkulationTimer_0WsuRoh41", 0x009b, 0x566679d8, 0),
				//createConfigurationValueDescriptor("RLEinschichtung", 0x00a2, 0x62078496, 0),
				//createConfigurationValueDescriptor("RLEinschichtungActivatedAktorRelaisNr", 0x00a3, 0xcc15613f, 0),
				//createConfigurationValueDescriptor("RLEinschichtungActivatedSensorSpeicherNr", 0x00a5, 0x2e81e537, 0),
				//createConfigurationValueDescriptor("RLEinschichtungActivatedSensorRuecklaufNr", 0x00a7, 0xa18960f9, 0),
				//createConfigurationValueDescriptor("RLEinschichtungActivatedAktorIstInvertiert", 0x00a9, 0x80b23131, 0),
				//createConfigurationValueDescriptor("Nachheizung", 0x00ab, 0x5117874c, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedModus", 0x00ac, 0x59d924c6, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedModusFestwertSensor1Nr", 0x00ad, 0xe9945827, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedModusZonenladungSensor1Nr", 0x00ad, 0xf337edcc, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedModusZonenladungSensor2Nr", 0x00af, 0x86c3c43e, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedAktorRelaisNr", 0x00b1, 0xda96fc8a, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedTEin", 0x00b3, 0xeda34617, 0),
				//createConfigurationValueDescriptor("NachheizungActivatedTAus", 0x00b4, 0x410d0330, 0),
				//createConfigurationValueDescriptor("Fehlerrelais", 0x00b6, 0x87bef57e, 0),
				//createConfigurationValueDescriptor("FehlerrelaisActivatedAktorRelaisNr", 0x00b7, 0x83269420, 0),
				//createConfigurationValueDescriptor("Parallelrelais", 0x00ba, 0x423d0daf, 0),
				//createConfigurationValueDescriptor("ParallelrelaisActivatedAktorRelaisNr", 0x00bb, 0x5e9e77e0, 0),
				//createConfigurationValueDescriptor("ParallelrelaisActivatedBezugsrelais0", 0x00bd, 0x47101b92, 0),
				//createConfigurationValueDescriptor("ParallelrelaisActivatedBezugsrelais1", 0x00be, 0xe863b817, 0),
				//createConfigurationValueDescriptor("ParallelrelaisActivatedBezugsrelais2", 0x00bf, 0x8d7a65f5, 0),
				//createConfigurationValueDescriptor("ParallelrelaisActivatedModus", 0x00c0, 0x9b3ef819, 0),
				//createConfigurationValueDescriptor("ParallelrelaisActivatedOInvertiert", 0x00c1, 0x80424ddd, 0),
				//createConfigurationValueDescriptor("Funktionsblock0", 0x00c7, 0x7bb1d1da, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedAktorRelaisNr", 0x00c8, 0x4ebbf101, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh1", 0x00ca, 0xdc9af596, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh1ActivatedTein", 0x00cb, 0x573ca263, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh1ActivatedTaus", 0x00cc, 0x007345d6, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh1ActivatedSensorNr", 0x00cd, 0xa7b1d1ee, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh2", 0x00cf, 0x103d8f27, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh2ActivatedTein", 0x00d0, 0xc0d93174, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh2ActivatedTaus", 0x00d1, 0x2d1ca0f1, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTh2ActivatedSensorNr", 0x00d2, 0xedc39c08, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivateddT", 0x00d4, 0xe824249a, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivateddTActivateddTein", 0x00d5, 0xf1f6ea86, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivateddTActivateddTaus", 0x00d6, 0xa2eb9300, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivateddTActivatedSensorQuelleNr", 0x00d7, 0x5a0b1d13, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivateddTActivatedSensorSenkeNr", 0x00d9, 0xe3c36fef, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimer", 0x00db, 0x91764022, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh0", 0x00dc, 0xd9e5ea9f, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh1", 0x00dd, 0xa1cc77e4, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh2", 0x00de, 0x40d32616, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh3", 0x00df, 0xa8bc3d6b, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh4", 0x00e0, 0xa6007947, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh5", 0x00e1, 0xdf67ccab, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh6", 0x00e2, 0x8101da1f, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh7", 0x00e3, 0x5353ea25, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh8", 0x00e4, 0x0be588ed, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh9", 0x00e5, 0xe89d362f, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh10", 0x00e6, 0xd82cba44, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh11", 0x00e7, 0x0c65fc04, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh12", 0x00e8, 0x4118c535, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh13", 0x00e9, 0x1c0dfc5e, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh14", 0x00ea, 0x1fde0eed, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh15", 0x00eb, 0xf2d36fe7, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh16", 0x00ec, 0x3271f76c, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh17", 0x00ed, 0x82c84c9d, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh18", 0x00ee, 0x1edef093, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh19", 0x00ef, 0x6f5da0fb, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh20", 0x00f0, 0xd5343579, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh21", 0x00f1, 0x6525e49a, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh22", 0x00f2, 0x0b973f6e, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh23", 0x00f3, 0x7c9aace5, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh24", 0x00f4, 0x03455a92, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh25", 0x00f5, 0xe3c8c466, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh26", 0x00f6, 0x55a67382, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh27", 0x00f7, 0x85a3c272, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh28", 0x00f8, 0xd52a4dea, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh29", 0x00f9, 0xfe37b2ad, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh30", 0x00fa, 0x0f69ddbb, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh31", 0x00fb, 0x391443d3, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh32", 0x00fc, 0xde2991d5, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh33", 0x00fd, 0x20e6d252, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh34", 0x00fe, 0x813475f0, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh35", 0x00ff, 0x570636c8, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh36", 0x0100, 0xf12924c7, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh37", 0x0101, 0x34135fe2, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh38", 0x0102, 0x9939a639, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh39", 0x0103, 0xb42f200f, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh40", 0x0104, 0xa1f784fd, 0),
				//createConfigurationValueDescriptor("Funktionsblock0ActivatedTimerActivatedWsuRoh41", 0x0105, 0x752b2bc4, 0),
				//createConfigurationValueDescriptor("Funktionsblock1", 0x0108, 0xb1c253d7, 0),
				//createConfigurationValueDescriptor("Funktionsblock1Activa1edAktorRelaisNr", 0x0109, 0x943dbcbf, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh1", 0x010b, 0x115a5b4b, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh1Activa1edTein", 0x010c, 0x3c506b3c, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh1ActivatedTaus", 0x010d, 0x98b7109f, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh1ActivatedSensorNr", 0x010e,0x781c1655, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh2", 0x0110, 0xdd5da0bf, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh2ActivatedTein", 0x0111, 0xcbc43009, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh2ActivatedTaus", 0x0112, 0x64dafaca, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTh2ActivatedSensorNr", 0x0113, 0x75317f07, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivateddT", 0x0115, 0xf940394f, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivateddTActivateddTein", 0x0116, 0x84e6b344, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivateddTActivateddTaus", 0x0117, 0x00ced02c, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivateddTActivatedSensorQuelleNr", 0x0118, 0xda5180c4, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivateddTActivatedSensorSenkeNr", 0x011a, 0x5e6c92da, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimer", 0x011c, 0x719d6c15, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh0", 0x011d, 0xcadf9f6d, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh1", 0x011e, 0x101e100f, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh2", 0x011f, 0x2b454f7a, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh3", 0x0120, 0xf4a40e68, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh4", 0x0121, 0xd4332617, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh5", 0x0122, 0x8d5affad, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh6", 0x0123, 0x4e6b7719, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh7", 0x0124, 0x0f1aa407, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh8", 0x0125, 0x667af510, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh9", 0x0126, 0x2f808292, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh10", 0x0127, 0x08bd5076, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh11", 0x0128, 0xbecfb274, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh12", 0x0129, 0xdc4a91a9, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh13", 0x012a, 0xcaeb27a5, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh14", 0x012b, 0x24e490ec, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh15", 0x012c, 0x96d2933d, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh16", 0x012d, 0x4868c54d, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh17", 0x012e, 0x8dc434f1, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh18", 0x012f, 0x7b9ff98c, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh19", 0x0130, 0xa707817e, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh20", 0x0131, 0x55ca4cd2, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh21", 0x0132, 0x48e6bae5, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh22", 0x0133, 0xd02467e3, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh23", 0x0134, 0xe960df07, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh24", 0x0135, 0xef2e0f47, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh25", 0x0136, 0x029b95d7, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh26", 0x0137, 0x153a0e23, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh27", 0x0138, 0xc7837355, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh28", 0x0139, 0xa742e307, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh29", 0x013a, 0x5ddf7f8c, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh30", 0x013b, 0xfe245a68, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh31", 0x013c, 0x509b31bc, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh32", 0x013d, 0xcbea92be, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh33", 0x013e, 0x6ceab668, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh34", 0x013f, 0x2fb4e99b, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh35", 0x0140, 0xe14f7197, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh36", 0x0141, 0x28d10788, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh37", 0x0142, 0xa23c5c54, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh38", 0x0143, 0x364690f1, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh39", 0x0144, 0x042679cc, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh40", 0x0145, 0x82a8ce83, 0),
				//createConfigurationValueDescriptor("Funktionsblock1ActivatedTimerActivatedWsuRoh41", 0x0146, 0x793e1282, 0),
				//createConfigurationValueDescriptor("DesinfektionTSoll", 0x0149, 0xe10b4fc6, 0),
				//createConfigurationValueDescriptor("DesinfektiondtDauer", 0x014a, 0x48f24887, 0),
				//createConfigurationValueDescriptor("Language", 0x0153, 0x3768acdd, 0),
				//createConfigurationValueDescriptor("AutoSommerWinterzeit", 0x0156, 0x9fc045b6, 0),
				//createConfigurationValueDescriptor("DisplayStandby", 0x0157, 0x4ecd7ed5, 0),
				//createConfigurationValueDescriptor("DisplayMode", 0x0158, 0xeae1b1cd, 0),
				createConfigurationValueDescriptor("Relais0Handbetrieb", 0x015a, 0xbf80a661, 0),
				//createConfigurationValueDescriptor("Relais1Handbetrieb", 0x015c, 0xf7b94472, 0),
				//createConfigurationValueDescriptor("Relais2Handbetrieb", 0x015e, 0xc1c0164f, 0),
				//createConfigurationValueDescriptor("Relais3Handbetrieb", 0x0160, 0x583c0a99, 0),
				//createConfigurationValueDescriptor("Relais4Handbetrieb", 0x0162, 0x9e623288, 0),
				//createConfigurationValueDescriptor("Ausgang0Handbetrieb", 0x0165, 0xd06af53b, 0),
				//createConfigurationValueDescriptor("Ausgang1Handbetrieb", 0x0168, 0x435f04c4, 0),
				//createConfigurationValueDescriptor("Ausgang2Handbetrieb", 0x016b, 0x638f4d5a, 0),
				//createConfigurationValueDescriptor("Ausgang3Handbetrieb", 0x016e, 0x9a13b0f4, 0),
				//createConfigurationValueDescriptor("Lin_Handbetrieb", 0x016f, 0xf135f23e, 0),
				//createConfigurationValueDescriptor("UiBlockiert", 0x0171, 0x16948310, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie0Fehler", 0x01ab, 0xd9f9fb1d, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie0Zeitstempel", 0x01ac, 0xc1e4cf23, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie1Fehler", 0x01ad, 0x490bc8db, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie1Zeitstempel", 0x01ae, 0x31e1120f, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie2Fehler", 0x01af, 0xed2eae3c, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie2Zeitstempel", 0x01b0, 0xb2b3800a, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie3Fehler", 0x01b1, 0x9d19ebc8, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie3Zeitstempel", 0x01b2, 0x5a0c4f45, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie4Fehler", 0x01b3, 0x8ccd2e4f, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie4Zeitstempel", 0x01b4, 0x885a5fad, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie5Fehler", 0x01b5, 0x39540885, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie5Zeitstempel", 0x01b6, 0xca9472c8, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie6Fehler", 0x01b7, 0x522ef54d, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie6Zeitstempel", 0x01b8, 0xcb84c2a4, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie7Fehler", 0x01b9, 0xc1da21e4, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie7Zeitstempel", 0x01ba, 0x37574322, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie8Fehler", 0x01bb, 0x7f240da6, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie8Zeitstempel", 0x01bc, 0x737954b3, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie9Fehler", 0x01bd, 0x20b44a04, 0),
				//createConfigurationValueDescriptor("FehlerFehlerhistorie9Zeitstempel", 0x01be, 0x80921a19, 0),
				//createConfigurationValueDescriptor("InbetriebnahmeAbgeschlossen", 0x01c3, 0x711a5286, 0),
		};
	}

	private ConfigurationValue createConfigurationValueDescriptor(String valueId, int valueIndex, int valueIdHash, int priority) {
		return new ConfigurationValue(valueId, valueIndex, valueIdHash, 0, priority, false, false);
	}

	public ConfigurationValue[] setAdjustableValuesWater(int value) {
		return new ConfigurationValue[] {
				new ConfigurationValue("WarmwasserTSoll", 0x0037, 0x5fc5f901, value, 0, true, false),
		};
	}
	public ConfigurationValue[] setAdjustableValuesRelais(int value) {
		return new ConfigurationValue[] {
				new ConfigurationValue("Relais0Handbetrieb", 0x015a, 0xbf80a661, value, 0, true, false),
		};
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
				if (deviceAddress == 5682) {
					return new RegumaqX45ConfigurationOptimizer();
				} else {
					return null;
				}
			}
			
		};
	}

}
