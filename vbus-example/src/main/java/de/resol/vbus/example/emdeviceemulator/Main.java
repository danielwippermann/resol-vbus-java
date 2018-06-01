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
package de.resol.vbus.example.emdeviceemulator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.InetAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import de.resol.vbus.Connection;
import de.resol.vbus.TcpDataSource;
import de.resol.vbus.TcpDataSourceProvider;
import de.resol.vbus.deviceemulators.EmDeviceEmulator;

/**
 * ## Overview
 * 
 * This example connects to a VBus data source and emulates two RESOL EM devices.
 * If the controller connected to the VBus supports extension modules you should
 * be able to activate them and use the fake sensors and relais in the controller.
 * 
 * 
 * ## Customization
 * 
 * There are several points of customization in the code below:
 * 
 * - the `host`, `password` and `channel` variables in the `run` method
 * 
 * The code contains `CUSTOMIZEME` comments at those locations.
 * 
 * 
 * ## Links
 * 
 * https://www.resol.de/en/produktdetail/83
 * http://danielwippermann.github.io/resol-vbus/vbus-packets.html#6650_0000_0200
 * http://danielwippermann.github.io/resol-vbus/vbus-packets.html#0000_6650_0100
 */
public class Main {

	protected static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

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
	
	protected EmDeviceEmulator device1;
	
	protected EmDeviceEmulator device2;
	
	protected long lastTime;

	protected ScheduledFuture<?> future;
	
	/**
	 * The `run` method connects to all sources of VBus data and starts logging the incoming data.
	 * It eventually also configures a timer to periodically trigger the storage of the received data
	 * into a permanent storage.
	 * 
	 * @throws Exception
	 */
	public void run() throws Exception {
		/*
		 * Connect to the VBus data source.
		 *
		 * CUSTOMIZEME: change the information / credentials
		 */
		String host = "192.168.13.45";
		String password = "vbus";
		int channel = 0;

		TcpDataSource dataSource = TcpDataSourceProvider.fetchInformation(InetAddress.getByName(host), 1500);
		dataSource.setLivePassword(password);
		Connection connection = dataSource.connectLive(channel, 0x0020);

		/*
		 * Create the first device emulator at sub-address 1.
		 */
		device1 = new EmDeviceEmulator(connection, 1);

		/*
		 * Add a property change listener.
		 */
		device1.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				Main.this.propertyChange(device1, evt);
			}

		});

		/*
		 * Load some dummy sensor values.
		 */
		device1.setResistorValueByNrAndPt1000Temperatur(1, -40);
		device1.setResistorValueByNrAndPt1000Temperatur(2, 0);
		device1.setResistorValueByNrAndPt1000Temperatur(3, 40);
		device1.setResistorValueByNrAndPt1000Temperatur(4, 80);
		device1.setResistorValueByNrAndPt1000Temperatur(5, 120);
		device1.setResistorValueByNrAndPt1000Temperatur(6, 160);

		/*
		 * Start the device. This will start listening for EM request packets
		 * and answering them with a reply packet containing the fake
		 * sensor values set above. 
		 */
		device1.start();

		/*
		 * Repeat the steps for the second device emulator at sub-address 2.
		 */
		device2 = new EmDeviceEmulator(connection, 2);

		device2.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				Main.this.propertyChange(device2, evt);
			}

		});

		device2.setResistorValueByNrAndPt1000Temperatur(1, -20);
		device2.setResistorValueByNrAndPt1000Temperatur(2, 20);
		device2.setResistorValueByNrAndPt1000Temperatur(3, 60);
		device2.setResistorValueByNrAndPt1000Temperatur(4, 100);
		device2.setResistorValueByNrAndPt1000Temperatur(5, 140);
		device2.setResistorValueByNrAndPt1000Temperatur(6, 180);

		device2.start();
		
		/*
		 * Establish the connection and start the listening background thread.
		 */
		connection.connect();

		/*
		 * Store the current timestamp to calculate intervals.
		 */
		lastTime = System.currentTimeMillis();

		/*
		 * Start a 200 ms timer to continuously update the device emulators.
		 */
		Runnable command = new Runnable() {
			
			public void run() {
				try {
					Main.this.update();
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}

		};
		
		future = scheduler.scheduleAtFixedRate(command, 0, 200, TimeUnit.MILLISECONDS);
	}

	/**
	 * This method calculates the time interval between the last call and now
	 * and updates the devices accordingly.
	 * 
	 * The interval is capped at 3000 ms in case the application suspends for
	 * a longer period of time.
	 */
	void update() {
		long now = System.currentTimeMillis();
		int diff = (int) (now - lastTime);
		lastTime = now;
		
		if (diff > 3000) {
			diff = 3000;
		}

		device1.update(diff);
		device2.update(diff);
	}

	/**
	 * This method is called every time a PropertyChangeEvent is fired on
	 * one of the device emulators.
	 * 
	 * This example only prints them to to console.
	 * 
	 * @param device The device emulator that fired the property change.
	 * @param evt The property change event.
	 */
	void propertyChange(EmDeviceEmulator device, PropertyChangeEvent evt) {
		System.out.println(device.getSubAddress() + ": " + evt.getPropertyName() + " old:" + evt.getOldValue() + ", new:" + evt.getNewValue());
	}
	
}
