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
package de.resol.vbus.example.aggregator;

import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;

import de.resol.vbus.Connection;
import de.resol.vbus.ConnectionAdapter;
import de.resol.vbus.HeaderSet;
import de.resol.vbus.HeaderSetConsolidator;
import de.resol.vbus.HeaderSetConsolidatorListener;
import de.resol.vbus.Packet;
import de.resol.vbus.Specification;
import de.resol.vbus.TcpDataSource;
import de.resol.vbus.TcpDataSourceProvider;
import de.resol.vbus.Specification.PacketFieldValue;

/**
 * ## Overview
 * 
 * This example connects to multiple sources of VBus data and starts logging the incoming data.
 * It also configures a timer to periodically trigger the storage of the received data
 * into a permanent storage.
 * 
 * This example focuses on data streams conforming to protocol version 1.0 or what the VBus
 * specification calls: "packets". Packets are sent regularly from the VBus master without
 * the need to request them. So this example can simply start listening for incoming
 * data, decode it and store the contained information.
 * 
 * 
 * ## Technical details
 * 
 * The example uses multiple `TcpConnection` instances to connect to LAN-enabled VBus
 * devices. It starts to passively listen for incoming VBus data on all of them. Once a
 * VBus packet is successfully decoded from the raw stream of bytes it is wrapped into
 * a `Packet` instance containing the following information:
 * 
 * - the timestamp when it was received
 * - the VBus channel it was received on
 * - the VBus addresses of both its destination and source
 * - a command field
 * - a field announcing a number of payload frames
 * - optionally the payload frames themselves.
 * 
 * When a `Packet` is received, it contains the channel number of the physical VBus
 * it was received on. Since this example aggregates data from multiple sources it
 * changes this channel to a virtual one, allowing to distinguish data from different
 * sources.
 * 
 * The `Packet` with the modified channel number is then added to a
 * `HeaderSetConsolidator<Packet>` instance. That instance serves as a `Set<Packet>`,
 * storing only the latest `Packet` in it.
 * 
 * Every time a `Packet` is received, the method `updateData` is called. The method
 * uses the `Specification` class to decode the payload contained in the frames
 * of the `Packet` instances into a list of `PacketFieldValue` instances. This list
 * is then converted into a `HashMap<String, Double>` for easier access. From there
 * certain data points are copied over in order to be stored permanently.
 * 
 * The key for that hash map is the so called "packet field ID", a string uniquely
 * identifying a certain `PacketFieldValue`. The string looks like this:
 * "01_0010_7E11_10_0100_000_2_0". To get a list of packet field IDs you can use
 * the `dumpListOfPacketFieldValues` method below.
 * 
 * The permanent storage will not be started right from the beginning. Instead the
 * example waits for the `HeaderSetConsolidator<Packet>` instance to "settle". That
 * means that is waits until the amount of unique `Packet` instances in the set
 * has been stable for a certain amount of time. Once the set is considered "settled"
 * the timer for the permanent storage is started.
 * 
 * Every time the timer triggered the `storeData` method is called. The method takes
 * the data copied and maintained by the `updateData` method and stores it permanently.
 * The current implementation simply prints it to `System.out`.
 * 
 * 
 * ## Customization
 * 
 * There are several points of customization in the code below:
 * 
 * - the constant `PERMANENT_STORAGE_INTERVAL`
 * - the calls to `connectAndStartLogging` inside the `run` method
 * - the `updateData` method
 * - the `storeData` method
 * 
 * The code contains `CUSTOMIZEME` comments at those locations.
 * 
 * 
 * ## Links
 * 
 * http://danielwippermann.github.io/resol-vbus/vbus-specification.html
 * http://danielwippermann.github.io/resol-vbus/vbus-packets.html
 */
public class Main {

	/**
	 * The interval in milliseconds to perform permanent storage in.
	 * 
	 * CUSTOMIZEME: change it
	 */
	static final int PERMANENT_STORAGE_INTERVAL = 10 * 1000;  // 10 seconds
	
	/**
	 * The main entry function. It just creates an instance of this class and
	 * calls the run method, catching and printing any error that might occur.
	 */
	public static void main(String[] args) {
		try {
			Main instance = new Main();
			instance.run();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	/**
	 * The following fields are used to cache information in the
	 * `updateData` method to be stored by the `storeData` method.
	 * 
	 * CUSTOMIZEME: add more variables
	 */
	Double tempCol1Actual;
	
	AverageValue tempCol1Average;
	
	/**
	 * The constructor of the `Main` class. It is used to initialize the `AverageValue`
	 * instances declared above.
	 */
	Main() {
		tempCol1Average = new AverageValue();
	}
	
	/**
	 * The `run` method connects to all sources of VBus data and starts logging the incoming data.
	 * It eventually also configures a timer to periodically trigger the storage of the received data
	 * into a permanent storage.
	 * 
	 * @throws Exception
	 */
	public void run() throws Exception {
		/*
		 * First a `HeaderSetConsolidator<Packet>` is created. The class serves multiple purposes:
		 * 
		 * 1. It acts like a `Set` for packets: every time a `Packet` is added it replaces the
		 *    older version of itself (with same channel / address / command combination), causing
		 *    only the lastest version of the packet to be present in the set.
		 * 2. It contains a timer mechanism the can be started to fire at regular intervals. That
		 *    makes it very easy to permanently store the received data at certain intervals.
		 *    
		 * The arguments to the constructor of the `HeaderSetConsolidator<Packet>` allow to
		 * define several filter criteria, but they are not used in this example.
		 */
		HeaderSetConsolidator<Packet> hsc = new HeaderSetConsolidator<Packet>(0, Long.MIN_VALUE, Long.MAX_VALUE, 0, 0);

		/*
		 * Connect to the VBus data sources. The function takes the following arguments:
		 * 
		 * - the host name / IP address of the LAN-enabled VBus device
		 * - the "remote access" password
		 * - the physical VBus channel on the LAN-enabled VBus device (only applicable for DL3)
		 * - the virtual VBus channel the data gets assigned to
		 * - the `HeaderSetConsolidator<Packet>` instance the data should be collected in
		 * 
		 * CUSTOMIZEME: change the information / credentials, add more connections...
		 */
		connectAndStartLogging("192.168.13.45", "vbus", 0, 1, hsc);
		connectAndStartLogging("192.168.13.45", "vbus", 0, 2, hsc);
		
		/*
		 * Once all connections are established, the incoming `Packet` instances will be added
		 * to the `HeaderSetConsolidator<Packet>`. It then takes some time for all possible
		 * packet variations to be received (e.g. some don't get send on every cycle).
		 * The `HeaderSetSettledTracker` is a helper class to determine when it is safe
		 * to assume the no new packet variation will be received. That information
		 * can be used for example to start the permanent storage functionality.
		 */
		HeaderSetSettledTracker settledTracker = new HeaderSetSettledTracker(hsc);
		
		/*
		 * Add a listener to the HeaderSetConsolidator to get a
		 * notification when new `Packet` instances arrive and
		 * when the timer interval elapsed.
		 */
		hsc.addListener(new HeaderSetConsolidatorListener<Packet>() {
			
			public void headerAdded(HeaderSet<Packet> headerSet, Packet packet) {
				/*
				 * This callback is called every time a `Connection` adds a `Packet` instance.
				 * 
				 * It first calls to `updateData` method to copy certain VBus values
				 * into its own cache.
				 */
				updateData(headerSet);

				/*
				 * Next it checks whether this `Packet` instance caused the `HeaderSet`
				 * to be considered "settled". If yes the timer for the permanent storage
				 * is started. 
				 */
				if (settledTracker.hasSettled()) {
					/*
					 * Optionally print the list of `PacketFieldValue` instances
					 * gathered from the `HeaderSet` to see which fields are
					 * available in the `updateData` method.
					 */
					dumpListOfPacketFieldValues(headerSet);

					/*
					 * Start the time, causing the `headerSetProcessed` listener
					 * callback below to be called at the given interval.
					 */
					hsc.startTimer(PERMANENT_STORAGE_INTERVAL);
				}
			}
			
			public void headerSetProcessed(HeaderSetConsolidator<Packet> hsc) {
				/*
				 * This callback is called every time the permanent storage timer
				 * triggers.
				 * 
				 * It first calls `updateData` again to ensure that all `AverageValue`
				 * caches use the correct timestamp.
				 */
				updateData(hsc);
				
				/*
				 * Next it calls the `storeData` method to handle the permanent storage
				 * of the cached data.
				 */
				storeData(hsc.getTimestamp());
			}

		});
	}

	/**
	 * The `connectAndStartLogging` method performs the following steps:
	 * 
	 * - it fetches basic information about the LAN-enabled VBus device from the provided host
	 * - it connects to the provided physical VBus channel
	 * - it listens for incoming `Packet` instances, rewriting their channel to the provided
	 *   virtual one and adding them to the provided `HeaderSet`
	 * 
	 * @param host Host name or IP address to connect to
	 * @param password Remote access password (can be changed in the device, defaults to "vbus")
	 * @param physicalChannel The physical VBus channel to connect to
	 * @param virtualChannel The virtual VBus channel to rewrite the received `Packet` instances to
	 * @param hs The header set to add the rewritten `Packet` instances to.
	 * @throws Exception
	 */
	void connectAndStartLogging(String host, String password, int physicalChannel, int virtualChannel, HeaderSet<Packet> hs) throws Exception {
		// Create a connection to a LAN-enabled VBus device
		TcpDataSource dataSource = TcpDataSourceProvider.fetchInformation(InetAddress.getByName(host), 1500);
		dataSource.setLivePassword(password);
		Connection connection = dataSource.connectLive(physicalChannel, 0x0020);
		
		// Add a listeners to the Connection to monitor state changes and
		// add incoming packets to the HeaderSetConsolidator
		connection.addListener(new ConnectionAdapter() {
			
			@Override
			public void connectionStateChanged(Connection connection) {
				System.out.println("connection(" + virtualChannel + ")@connectionStateChanged: " + connection.getConnectionState());
			}
			
			@Override
			public void packetReceived(Connection connection, Packet packet) {
				/*
				 * Since the VBus channel is an immutable information of the `Packet` instance
				 * changing it involves serializing the `Packet` information and the decoding
				 * it again, providing the virtual VBus channel and then adding the rewritten
				 * `Packet` instance to the `HeaderSet<Packet>` instance.
				 */
				byte[] liveBuffer = packet.toLiveBuffer(null, 0, 0);

				Packet packetWithVirtualChannel = Packet.fromLiveBuffer(liveBuffer, 0, liveBuffer.length, packet.getTimestamp(), virtualChannel);
				
				hs.addHeader(packetWithVirtualChannel);
			}

		});

		// Establish the connection and start the listening background thread
		connection.connect();
	}

	/**
	 * This method is called to transfer the information from the `HeaderSet<Packet>`
	 * to the cache of data points.
	 * 
	 * @param hs The set of `Packet` instances.
	 */
	public void updateData(HeaderSet<Packet> hs) {
		// Get a sorted list of packets
		Packet[] packets = hs.getSortedHeaders(new Packet [hs.getHeaderCount()]);
		
		// Use the `Specification` to get a list of `PacketFieldValue` instances.
		Specification spec = Specification.getDefaultSpecification();
		PacketFieldValue[] pfvs = spec.getPacketFieldValuesForHeaders(packets);

		// Create a hash map from packet field ID to the corresponding value.
		HashMap<String, Double> valueById = new HashMap<>();
		for (PacketFieldValue pfv : pfvs) {
			valueById.put(pfv.getPacketFieldId(), pfv.getRawValueDouble());
		}
		
		long timestamp = hs.getTimestamp();

		// Transfer the data into the cache
		//
		// CUSTOMIZEME: use the correct packet field IDs and cache variables here
		tempCol1Actual = valueById.get("01_0010_7E11_10_0100_000_2_0");
		tempCol1Average.update(timestamp, tempCol1Actual);
	}
	
	/**
	 * This method is called every time the timer started using
	 * `hsc.startTimer()` elapses. Currently it will only print the received
	 * information to stdout, but it should be easy to add a more permanent
	 * storage here.
	 * 
	 * @param timestamp Timestamp in milliseconds since UNIX epoch.
	 */
	public void storeData(long timestamp) {
		Date date = new Date(timestamp);
		
		// CUSTOMIZEME: use different permanent storage strategy
		System.out.println(date.toString() + ": collector 1: actual = " + tempCol1Actual + ", temperateKol1 = " + tempCol1Average.get(timestamp));
	}

	/**
	 * This method prints the list of `PacketFieldValue` information contained in the
	 * provided `HeaderSet<Packet>`.
	 * 
	 * It can be used find the "packet field ID" string of a 
	 * @param hs
	 */
	public void dumpListOfPacketFieldValues(HeaderSet<Packet> hs) {
		Packet[] packets = hs.getSortedHeaders(new Packet [hs.getHeaderCount()]);
		
		Specification spec = Specification.getDefaultSpecification();
		PacketFieldValue[] pfvs = spec.getPacketFieldValuesForHeaders(packets);

		for (PacketFieldValue pfv : pfvs) {
			System.out.println(pfv.getPacketFieldId() + ": " + pfv.getName() + " (" + pfv.getPacketFieldSpec().getUnit().getUnitTextText() + ")");
		}
	}
	
	/**
	 * This helper class tracks whether a `HeaderSet<Packet>` has settled.
	 */
	static class HeaderSetSettledTracker {
		
		HeaderSet<Packet> headerSet;
		
		boolean isSettled;
		
		int packetCount;
		
		int counter;
		
		public HeaderSetSettledTracker(HeaderSet<Packet> hs) {
			this.headerSet = hs;
		}

		/**
		 * This method should be called every time a new `Packet` is added
		 * to the `HeaderSet<Packet>`. The function returns `true` if this
		 * `Packet` addition caused the `HeaderSet<Packet>` to go from
		 * "not yet settled" to "settled".
		 * 
		 * @return see above
		 */
		public boolean hasSettled() {
			boolean result = false;

			if (!isSettled) {
				int currentCount = headerSet.getHeaderCount();
				if (packetCount != currentCount) {
					packetCount = currentCount;
					counter = 3 * currentCount;
				} else if (counter > 0) {
					counter -= 1;
				} else {
					isSettled = true;
					result = true;
				}
			}
			
			return result;
		}

	}
	
	/**
	 * This class is a small helper to calculate an average value. It is operated
	 * by two methods: `update` and `get`.
	 */
	static class AverageValue {
		
		/**
		 * The last timestamp in milliseconds since UNIX epoch when the `update`
		 * method was called.
		 */
		long lastTimestamp;
		
		/**
		 * The last value when the `update` method was called.
		 */
		Double lastValue;

		/**
		 * The dividend of the future average value.
		 */
		double dividend;
		
		/**
		 * The divisor of the future average value.
		 */
		double divisor;

		/**
		 * The `update` method should be called every time a new value is received.
		 * It will calculate the every value for the time passed since the last
		 * value was received and store the necessary information for the `get`
		 * method to receive
		 * 
		 * @param timestamp Timestamp in milliseconds since UNIX epoch
		 * @param value Value to average, can be null if value is not known
		 */
		public void update(long timestamp, Double value) {
			if ((lastValue != null) && (value != null)) {
				long timeDiff = timestamp - lastTimestamp;
				dividend += (lastValue.doubleValue() + (value.doubleValue() - lastValue.doubleValue()) / 2) * timeDiff;
				divisor += timeDiff;
			}
			
			lastTimestamp = timestamp;
			lastValue = value;
		}
		
		/**
		 * The `get` method retrieves the stored average information and returns
		 * it, reseting the stored information in the process. It returns `null`
		 * if no average value was received since creating this instance or last
		 * calling the `get` function.
		 * 
		 * @param timestamp Timestamp in milliseconds since UNIX epoch.
		 * @return Averaged value or `null` if no average could be provided.
		 */
		public Double get(long timestamp) {
			if (lastValue != null) {
				update(timestamp, lastValue);
			}

			Double result;
			if (divisor != 0) {
				result = dividend / divisor;
			} else {
				result = null;
			}
			
			dividend = 0;
			divisor = 0;

			return result;
		}

	}
	
}
