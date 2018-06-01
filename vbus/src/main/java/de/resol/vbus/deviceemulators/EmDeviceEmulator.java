/**
 * Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.
 * Copyright (C) 2018, Daniel Wippermann.
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
package de.resol.vbus.deviceemulators;

import de.resol.vbus.BaseDeviceEmulator;
import de.resol.vbus.Connection;
import de.resol.vbus.LittleEndianBuffer;
import de.resol.vbus.Packet;

/**
 * The `EmDeviceEmulator` listens for packets directed from a controller
 * to one of the "RESOL extension module EM" addressed, storing the
 * data provided by the controller and replying with a corresponding
 * packet to make the controller believe a real EM is connected to the
 * bus, allowing to emulate "virtual" sensors and relais.
 * 
 * If the `EmDeviceEmulator` does not receive any packet update for 30 s,
 * it resets itself, causing the virtual relay values to go back to 0.
 */
public class EmDeviceEmulator extends BaseDeviceEmulator {

	private static final int BASE_ADDRESS = 0x6650;

	/**
	 * The nested `Relay` class contains information related to a single
	 * virtual relay output.
	 */
	public static class Relay {
		
		private int value1;
		
		private int time1;
		
		private int value2;
		
		private int time2;
		
		private int timer;
		
		private int value;
		
		/**
		 * Return the "value 1" of the relay.
		 * 
		 * @return The "value 1" of the relay in percent.
		 */
		public int getValue1() {
			return value1;
		}
		
		/**
		 * Return the "time 1" of the relay.
		 * 
		 * @return The "time 1" of the relay in milliseconds.
		 */
		public int getTime1() {
			return time1;
		}
		
		/**
		 * Return the "value 2" of the relay.
		 * 
		 * @return The "value 2" of the relay in percent.
		 */
		public int getValue2() {
			return value2;
		}
		
		/**
		 * Return the "time 2" of the relay.
		 * 
		 * @return The "time 2" of the relay in milliseconds.
		 */
		public int getTime2() {
			return time2;
		}
		
		/**
		 * Return the current value of the relay based on the "value X"
		 * and "time X" settings.
		 * @return
		 */
		public int getValue() {
			return value;
		}

		private void update(int deltaMs) {
			timer += deltaMs;
			
			int totalTime = time1 + time2;

			if (totalTime > 0) {
				timer = timer % totalTime;
			} else {
				timer = 0;
			}

			if (totalTime == 0) {
				value = 0;
			} else if (timer < time1) {
				value = value1;
			} else {
				value = value2;
			}
		}

		private void reset() {
			this.value1 = 0;
			this.time1 = 0;
			this.value2 = 0;
			this.time2 = 0;
			this.update(0);
		}

	}

	private int subAddress;
	
	private int[] resistorValues;
	
	private Relay[] relais;
	
	private int timeout;
	
	/**
	 * Create a new `EmDeviceEmulator` using the provided connection and subaddress.
	 * 
	 * @param connection The connection to use.
	 * @param subAddress The sub address (1-15) to use.
	 */
	public EmDeviceEmulator(Connection connection, int subAddress) {
		super(connection);
		
		if ((subAddress < 1) || (subAddress > 15)) {
			throw new Error("Sub address must be between 1 and 15");
		}

		this.subAddress = subAddress;

		resistorValues = new int[] {
			1000000000,
			1000000000,
			1000000000,
			1000000000,
			1000000000,
			1000000000,
		};
		
		relais = new Relay[] {
			new Relay(),
			new Relay(),
			new Relay(),
			new Relay(),
			new Relay(),
		};
	}
	
	public int getSubAddress() {
		return subAddress;
	}

	private void checkResistorNr(int nr) {
		if ((nr < 1) || (nr > 6)) {
			throw new IndexOutOfBoundsException("Resistor number must be between 1 and 6");
		}
	}

	public int getResistorValueByNr(int nr) {
		checkResistorNr(nr);
		return resistorValues [nr - 1];
	}
	
	public void setResistorValueByNr(int nr, int newValue) {
		checkResistorNr(nr);
		int oldValue = resistorValues [nr - 1];
		if (oldValue != newValue) {
			resistorValues [nr - 1] = newValue;
			firePropertyChange("resistorValue" + nr, oldValue, newValue);
		}
	}
	
	public void setResistorValueByNrAndPt1000Temperatur(int nr, float temperature) {
		float t1 = temperature;
		float t2 = t1 * t1;
		float t3 = t2 * t1;
		float a = 3.9083e-3f;
		float b = -5.775e-7f;
		float c = (t1 < 0) ? -4.183e-12f : 0f;
		float resistor = 1000.0f * (1 + a * t1 + b * t2 + c * (t1 - 100) * t3);
		setResistorValueByNr(nr, Math.round(resistor * 1000));
	}
	
	private void checkRelayNr(int nr) {
		if ((nr < 1) || (nr > 5)) {
			throw new IndexOutOfBoundsException("Relay number must be between 1 and 5");
		}
	}

	private Relay getRelayRefByNr(int nr) {
		checkRelayNr(nr);
		return relais [nr - 1];
	}

	public Relay getRelayByNr(int nr) {
		Relay relayRef = getRelayRefByNr(nr);
		return relayRef;
	}
	
	public int getRelayValueByNr(int nr) {
		Relay relayRef = getRelayRefByNr(nr);
		return relayRef.value;
	}

	@Override
	public void packetReceived(Connection connection, Packet rxPacket) {
		super.packetReceived(connection, rxPacket);

		if (rxPacket.getDestinationAddress() == (BASE_ADDRESS + subAddress)) {
			if ((rxPacket.getCommand() == 0x0200) && (rxPacket.getFrameCount() >= 10)) {
				// Request: http://danielwippermann.github.io/resol-vbus/vbus-packets.html#6650_0000_0200
				LittleEndianBuffer rxFrameData = new LittleEndianBuffer(rxPacket.getFrameData(), 0, 40);

				for (int relayIndex = 0; relayIndex < 5; relayIndex++) {
					int start = relayIndex * 8;
					Relay relay = this.relais [relayIndex];
					
					relay.value1 = rxFrameData.readU8(start);
					relay.time1 = rxFrameData.readU24(start + 1) * 1000;
					relay.value2 = rxFrameData.readU8(start + 4);
					relay.time2 = rxFrameData.readU24(start + 5) * 1000;
				}

				this.timeout = 30000;

				this.update(0);

				// Reply: http://danielwippermann.github.io/resol-vbus/vbus-packets.html#0000_6650_0100
				LittleEndianBuffer txFrameData = new LittleEndianBuffer(24);
				
				for (int sensorIndex = 0; sensorIndex < 6; sensorIndex++) {
					int start = sensorIndex * 4;
					
					txFrameData.writeI32(start, resistorValues [sensorIndex]);
				}
				
				Packet txPacket = new Packet(System.currentTimeMillis(), rxPacket.getChannel(), rxPacket.getSourceAddress(), rxPacket.getDestinationAddress(), 0x0100, 6, txFrameData.getBuffer());
				
				send(txPacket);
			}
		}
	}
	
	@Override
	public int update(int deltaMs) {
		if (this.timeout > deltaMs) {
			this.timeout -= deltaMs;
		} else {
			this.timeout = 0;
		}

		if (this.timeout == 0) {
			for (Relay relay : this.relais) {
				relay.reset();
			}
		}

		for (int relayNr = 1; relayNr <= 5; relayNr++) {
			Relay relay = getRelayRefByNr(relayNr);

			int oldValue = relay.value;
			
			relay.update(deltaMs);
			
			if (relay.value != oldValue) {
				firePropertyChange("relay" + relayNr + "Value", oldValue, relay.value);
			}
		}
		
		int sleepTime = Math.min(this.timeout, 1000);

		return sleepTime;
	}

}
