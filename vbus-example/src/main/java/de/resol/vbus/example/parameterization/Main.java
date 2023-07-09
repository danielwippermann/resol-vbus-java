/**
 * Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.
 * Copyright (C) 2016-present, Daniel Wippermann.
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
package de.resol.vbus.example.parameterization;

import java.net.InetAddress;

import de.resol.vbus.Connection;
import de.resol.vbus.Datagram;
import de.resol.vbus.TcpDataSource;
import de.resol.vbus.TcpDataSourceProvider;

class Value {
	
	String valueId;
	boolean hasValueIdHash;
	int valueIdHash;
	boolean hasValueIndex;
	int valueIndex;
	boolean hasChangedValue;
	int changedValue;
	boolean hasCurrentValue;
	int currentValue;
	
	Value(String valueId, int valueIdHash) {
		this.valueId = valueId;
		this.hasValueIdHash = true;
		this.valueIdHash = valueIdHash;
		this.hasValueIndex = false;
		this.valueIndex = 0;
		this.hasChangedValue = false;
		this.changedValue = 0;
		this.hasCurrentValue = false;
		this.currentValue = 0;
	}
	
	void resetChangedValue() {
		this.hasChangedValue = false;
		this.changedValue = 0;		
	}

	void setChangedValue(int changedValue) {
		this.hasChangedValue = true;
		this.changedValue = changedValue;
	}
	
}

public class Main {

	public static void main(String[] args) {
		try {
			Value[] values = new Value[] {
					new Value("Relais_Regler_R1_Handbetrieb", 0x2D84EA19),
			};

			values [0].setChangedValue(2);

			Connection connection;
			
			// Create a connection to a LAN-enabled VBus device
			TcpDataSource dataSource = TcpDataSourceProvider.fetchInformation(InetAddress.getByName("192.168.180.163"), 500);
			dataSource.setLivePassword("vbus");
			connection = dataSource.connectLive(0, 0x0020);
			
			// Establish the connection
			connection.connect();

			// Passively wait for the datagram offering transfer of the VBus master role
			Datagram dgram = connection.waitForFreeBus(10000);
			if (dgram == null) {
				throw new Error("No bus offer received");
			}
			
			// Remember the address of the controller
			int peerAddress = dgram.getSourceAddress();
			System.out.println("peerAddress = " + peerAddress);

			// Respond to that offer by reading the changeset ID (value index 0) of the controller
			dgram = connection.getValueById(peerAddress, 0x0000, 500, 500, 3);
			if (dgram == null) {
				throw new Error("Unable to get changeset ID");
			}

			// Remember the changeset ID and optionally forget a previously cached value-index-to-value mapping
			int changesetId = dgram.getValue();
			System.out.println("changesetId = " + changesetId);

			int lookedUpValueCount = 0;
			for (Value value : values) {
				if (value.hasValueIdHash && !value.hasValueIndex) {
					// Lookup a value index by its value ID hash (in this example `Relais_Regler_R1_Handbetrieb`)
					dgram = connection.getValueIdByIdHash(peerAddress, value.valueIdHash, 500, 500, 3);
					if (dgram == null) {
						throw new Error("Unable to lookup value index");
					}
					
					// Remember that value index
					value.valueIndex = dgram.getValueId();
					System.out.println("valueIndex = " + value.valueIndex);

					lookedUpValueCount += 1;
				}
			}

			if (lookedUpValueCount > 0) {
				// Read the changeset ID again to "resynchronize"
				dgram = connection.getValueById(peerAddress, 0x0000, 500, 500, 3);
				if (dgram == null) {
					throw new Error("Unable to resynchronize");
				}
			}
			
			int changedValueCount = 0;
			for (Value value : values) {
				if (value.hasValueIndex && value.hasChangedValue) {
					// Send a request to set `Relais_Regler_R1_Handbetrieb`
					dgram = connection.setValueById(peerAddress, value.valueIndex, value.changedValue, false, 500, 500, 3);
					if (dgram == null) {
						throw new Error("Unable to set value");
					}
					
					value.hasChangedValue = false;
					value.changedValue = 0;
					
					changedValueCount += 1;
				}
			}
			
			if (changedValueCount > 0) {
				// Read the changeset ID again to "resynchronize"
				dgram = connection.getValueById(peerAddress, 0x0000, 500, 500, 3);
				if (dgram == null) {
					throw new Error("Unable to resynchronize");
				}
			}

			for (Value value : values) {
				// Send a request to get `Relais_Regler_R1_Handbetrieb`
				dgram = connection.getValueById(peerAddress, value.valueIndex, 500, 500, 3);
				if (dgram == null) {
					throw new Error("Unable to get value");
				}
				
				// Do something with that value
				value.hasCurrentValue = true;
				value.currentValue = dgram.getValue();
				System.out.println("currentValue = " + value.currentValue);
			}

			// Transfer master role back to the controller
			connection.releaseBus(peerAddress, 1500, 0, 2);

			// Disconnect from the VBus
			connection.disconnect();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}

	}

}
