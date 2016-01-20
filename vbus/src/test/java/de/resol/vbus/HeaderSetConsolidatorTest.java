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

import static org.junit.Assert.*;

import org.junit.Test;

public class HeaderSetConsolidatorTest {

	@Test
	public void testConstructor() {
		long refTimestamp1 = System.currentTimeMillis();
		long refMinTimestamp1 = refTimestamp1 - 60000;
		long refMaxTimestamp1 = refTimestamp1 + 60000;
		int refSieveInterval1 = 10000;
		int refTimeToLive1 = 60000;
		
		HeaderSetConsolidator<Packet> testHsc1 = new HeaderSetConsolidator<Packet>(refTimestamp1, refMinTimestamp1, refMaxTimestamp1, refSieveInterval1, refTimeToLive1);
		
		assertEquals(refTimestamp1, testHsc1.timestamp);
		assertEquals(refMinTimestamp1, testHsc1.minTimestamp);
		assertEquals(refMaxTimestamp1, testHsc1.maxTimestamp);
		assertEquals(refSieveInterval1, testHsc1.sieveInterval);
		assertEquals(refTimeToLive1, testHsc1.timeToLive);
	}

	@Test
	public void testStartAndStopTimer() throws Exception {
		final HeaderSetConsolidator<Packet> testHsc1 = new HeaderSetConsolidator<Packet>(0, Long.MIN_VALUE, Long.MAX_VALUE, 0, 0);
		
		final int[] testListenerCallCount = new int [1];

		HeaderSetConsolidatorListener<Packet> testListener1 = new HeaderSetConsolidatorListener<Packet>() {
			
			public void headerAdded(HeaderSet<Packet> headerSet, Packet header) {
			}
			
			public void headerSetProcessed(HeaderSetConsolidator<Packet> hsc) {
				assertEquals(testHsc1, hsc);
				testListenerCallCount [0]++;
			}

		};

		testHsc1.addListener(testListener1);
		
		testHsc1.startTimer(100);
		
		Thread.sleep(250);
		
		assertEquals(true, (testListenerCallCount [0] >= 2) && (testListenerCallCount [0] <= 3));

		testHsc1.stopTimer();
		
		Thread.sleep(250);

		assertEquals(true, (testListenerCallCount [0] >= 2) && (testListenerCallCount [0] <= 3));
	}
	
	@Test
	public void testProcessHeaderSet() throws Exception {
		long refTimestamp1 = System.currentTimeMillis() / 100 * 100;
		int refSieveInterval1 = 100;
		int refTimeToLive1 = 300;

		Packet testPacket1 = new Packet(refTimestamp1 - 200, 0, 0, 0, 0, 0, null);
		
		final HeaderSetConsolidator<Packet> testHsc1 = new HeaderSetConsolidator<Packet>(refTimestamp1 - 300, refTimestamp1 - 200, refTimestamp1 + 200, refSieveInterval1, refTimeToLive1);
		
		final int[] testListenerCallCount = new int [1];

		HeaderSetConsolidatorListener<Packet> testListener1 = new HeaderSetConsolidatorListener<Packet>() {
			
			public void headerAdded(HeaderSet<Packet> headerSet, Packet header) {
			}
			
			public void headerSetProcessed(HeaderSetConsolidator<Packet> hsc) {
				assertEquals(testHsc1, hsc);
				testListenerCallCount [0]++;
			}

		};
		
		HeaderSetListener<Packet> testListener2 = new HeaderSetListener<Packet>() {
			
			public void headerAdded(HeaderSet<Packet> headerSet, Packet header) {
			}

		};

		testHsc1.addListener(testListener1);
		testHsc1.addListener(testListener2);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 - 300, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(0, testListenerCallCount [0]);

		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 - 250, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(0, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 - 200, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(1, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 - 150, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(1, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 - 100, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(2, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 - 50, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(2, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(3, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 + 50, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(3, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 + 100, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(4, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 + 150, testPacket1));
		
		assertEquals(0, testHsc1.getHeaderCount());
		assertEquals(4, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 + 200, testPacket1));
		
		assertEquals(0, testHsc1.getHeaderCount());
		assertEquals(5, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 + 250, testPacket1));
		
		assertEquals(0, testHsc1.getHeaderCount());
		assertEquals(5, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1 + 300, testPacket1));
		
		assertEquals(0, testHsc1.getHeaderCount());
		assertEquals(5, testListenerCallCount [0]);
		
		testHsc1.processHeaderSet(new HeaderSet<Packet>(refTimestamp1, testPacket1));
		
		assertEquals(1, testHsc1.getHeaderCount());
		assertEquals(6, testListenerCallCount [0]);
		
		testHsc1.removeListener(testListener2);
		testHsc1.removeListener(testListener1);
	}

}
