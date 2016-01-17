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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class HeaderSetTest {

	@Test
	public void testConstructor() {
		long refTimestamp1 = System.currentTimeMillis();
		Packet testPacket1 = new Packet(refTimestamp1 + 1, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(refTimestamp1 + 2, 2, 0, 0, 0, 0, null);
		List<Packet> testPacketList1 = Arrays.asList(testPacket1, testPacket2);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(refTimestamp1, testPacket1, testPacket2);
		
		assertEquals(refTimestamp1, testHeaderSet1.timestamp);
		assertEquals(2, testHeaderSet1.headerList.size());
		assertTrue(testHeaderSet1.headerList.contains(testPacket1));
		assertTrue(testHeaderSet1.headerList.contains(testPacket2));
		
		HeaderSet<Packet> testHeaderSet2 = new HeaderSet<Packet>(refTimestamp1, testPacketList1.listIterator());

		assertEquals(refTimestamp1, testHeaderSet2.timestamp);
		assertEquals(2, testHeaderSet2.headerList.size());
		assertTrue(testHeaderSet2.headerList.contains(testPacket1));
		assertTrue(testHeaderSet2.headerList.contains(testPacket2));
	}

	@Test
	public void testAddListener() throws Exception {
		HeaderSetListener<Packet> testListener1 = new HeaderSetListener<Packet>() {
			
			public void onHeaderAdded(HeaderSet<Packet> headerSet, Packet header) {
			}

		};
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0);
		
		assertEquals(0, testHeaderSet1.listeners.size());
		
		testHeaderSet1.addListener(testListener1);
		
		assertEquals(1, testHeaderSet1.listeners.size());
	}
	
	@Test
	public void testRemoveListener() throws Exception {
		HeaderSetListener<Packet> testListener1 = new HeaderSetListener<Packet>() {
			
			public void onHeaderAdded(HeaderSet<Packet> headerSet, Packet header) {
			}

		};
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0);
		testHeaderSet1.addListener(testListener1);
		
		assertEquals(1, testHeaderSet1.listeners.size());

		testHeaderSet1.removeListener(testListener1);

		assertEquals(0, testHeaderSet1.listeners.size());
	}
	
	@Test
	public void testContainsHeader() throws Exception {
		long refTimestamp1 = System.currentTimeMillis();
		Packet testPacket1 = new Packet(refTimestamp1 + 1, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(refTimestamp1 + 2, 2, 0, 0, 0, 0, null);
		Packet testPacket3 = new Packet(refTimestamp1 + 3, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(refTimestamp1);
		
		assertEquals(false, testHeaderSet1.containsHeader(testPacket1));
		assertEquals(false, testHeaderSet1.containsHeader(testPacket2));
		assertEquals(false, testHeaderSet1.containsHeader(testPacket3));
		
		testHeaderSet1.addHeader(testPacket1);
		
		assertEquals(true, testHeaderSet1.containsHeader(testPacket1));
		assertEquals(false, testHeaderSet1.containsHeader(testPacket2));
		assertEquals(false, testHeaderSet1.containsHeader(testPacket3));
		
		testHeaderSet1.addHeader(testPacket2);

		assertEquals(true, testHeaderSet1.containsHeader(testPacket1));
		assertEquals(true, testHeaderSet1.containsHeader(testPacket2));
		assertEquals(true, testHeaderSet1.containsHeader(testPacket3));

		testHeaderSet1.removeAllHeaders();
		testHeaderSet1.addHeader(testPacket3);
		
		assertEquals(false, testHeaderSet1.containsHeader(testPacket1));
		assertEquals(true, testHeaderSet1.containsHeader(testPacket2));
		assertEquals(true, testHeaderSet1.containsHeader(testPacket3));
	}
	
	@Test
	public void testAddHeader() throws Exception {
		long refTimestamp1 = System.currentTimeMillis();
		Packet testPacket1 = new Packet(refTimestamp1 + 1, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(refTimestamp1 + 2, 2, 0, 0, 0, 0, null);
		Packet testPacket3 = new Packet(refTimestamp1 + 3, 2, 0, 0, 0, 0, null);

		final int[] listenerCallCount = new int [1];
		final Packet[] listenerPacket = new Packet [1];

		final HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(refTimestamp1);

		HeaderSetListener<Packet> testListener1 = new HeaderSetListener<Packet>() {
			
			public void onHeaderAdded(HeaderSet<Packet> headerSet, Packet packet) {
				assertEquals(testHeaderSet1, headerSet);
				listenerCallCount [0]++;
				listenerPacket [0] = packet;
			}

		};
		
		testHeaderSet1.addListener(testListener1);

		assertEquals(refTimestamp1, testHeaderSet1.timestamp);
		assertEquals(0, testHeaderSet1.headerList.size());
		
		testHeaderSet1.addHeader(testPacket1);
		
		assertEquals(refTimestamp1 + 1, testHeaderSet1.timestamp);
		assertEquals(1, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(1, listenerCallCount [0]);
		assertEquals(testPacket1, listenerPacket [0]);
		
		testHeaderSet1.addHeader(testPacket1);
		
		assertEquals(refTimestamp1 + 1, testHeaderSet1.timestamp);
		assertEquals(1, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(2, listenerCallCount [0]);
		assertEquals(testPacket1, listenerPacket [0]);
		
		testHeaderSet1.addHeader(testPacket2);
		
		assertEquals(refTimestamp1 + 2, testHeaderSet1.timestamp);
		assertEquals(2, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket2));
		assertEquals(3, listenerCallCount [0]);
		assertEquals(testPacket2, listenerPacket [0]);
		
		testHeaderSet1.addHeader(testPacket3);
		
		assertEquals(refTimestamp1 + 3, testHeaderSet1.timestamp);
		assertEquals(2, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket3));
		assertEquals(4, listenerCallCount [0]);
		assertEquals(testPacket3, listenerPacket [0]);
	}
	
	@Test
	public void testAddHeaders() throws Exception {
		long refTimestamp1 = System.currentTimeMillis();
		Packet testPacket1 = new Packet(refTimestamp1 + 1, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(refTimestamp1 + 2, 2, 0, 0, 0, 0, null);
		Packet testPacket3 = new Packet(refTimestamp1 + 3, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(refTimestamp1);

		assertEquals(refTimestamp1, testHeaderSet1.timestamp);
		assertEquals(0, testHeaderSet1.headerList.size());

		testHeaderSet1.addHeaders(testPacket1, testPacket2, testPacket3);

		assertEquals(refTimestamp1 + 3, testHeaderSet1.timestamp);
		assertEquals(2, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket3));
	}
	
	@Test
	public void testRemoveAllHeaders() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		Packet testPacket3 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket1, testPacket2, testPacket3);

		assertEquals(2, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket3));

		testHeaderSet1.removeAllHeaders();
		
		assertEquals(0, testHeaderSet1.headerList.size());
		assertEquals(false, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(false, testHeaderSet1.headerList.contains(testPacket3));
	}

	@Test
	public void testRemoveHeadersOlderThan() throws Exception {
		Packet testPacket1 = new Packet(1388089665000L, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(1388089666000L, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket1, testPacket2);
		
		assertEquals(2, testHeaderSet1.headerList.size());
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket2));

		testHeaderSet1.removeHeadersOlderThan(1388089665500L);

		assertEquals(1, testHeaderSet1.headerList.size());
		assertEquals(false, testHeaderSet1.headerList.contains(testPacket1));
		assertEquals(true, testHeaderSet1.headerList.contains(testPacket2));
	}

	@Test
	public void testGetHeaderCount() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		Packet testPacket3 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket1, testPacket2, testPacket3);
		
		assertEquals(2, testHeaderSet1.getHeaderCount());
	}
	
	@Test
	public void testGetHeaderIterator() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket2, testPacket1);

		Iterator<Packet> testIterator1 = testHeaderSet1.getHeaderIterator();
		
		assertEquals(true, testIterator1.hasNext());
		assertEquals(testPacket2, testIterator1.next());
		assertEquals(true, testIterator1.hasNext());
		assertEquals(testPacket1, testIterator1.next());
		assertEquals(false, testIterator1.hasNext());
	}

	@Test
	public void testGetHeaders() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket2, testPacket1);
		
		Packet[] packets = testHeaderSet1.getHeaders(new Packet [testHeaderSet1.getHeaderCount()]);
		
		assertEquals(2, packets.length);
		assertEquals(testPacket2, packets [0]);
		assertEquals(testPacket1, packets [1]);
	}
	
	@Test
	public void testGetSortedHeaderListIterator() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket2, testPacket1);

		ListIterator<Packet> testIterator1 = testHeaderSet1.getSortedHeaderListIterator();
		
		assertEquals(true, testIterator1.hasNext());
		assertEquals(testPacket1, testIterator1.next());
		assertEquals(true, testIterator1.hasNext());
		assertEquals(testPacket2, testIterator1.next());
		assertEquals(false, testIterator1.hasNext());
	}
	
	@Test
	public void testGetSortedHeaders() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket2, testPacket1);

		Packet[] testPackets1 = testHeaderSet1.getSortedHeaders(new Packet [testHeaderSet1.getHeaderCount()]);

		assertEquals(2, testPackets1.length);
		assertEquals(testPacket1, testPackets1 [0]);
		assertEquals(testPacket2, testPackets1 [1]);
	}
	
	@Test
	public void testGetSortedHeaderSet() throws Exception {
		long refTimestamp1 = System.currentTimeMillis();
		Packet testPacket1 = new Packet(refTimestamp1 + 1, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(refTimestamp1 + 2, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(refTimestamp1, testPacket2, testPacket1);

		HeaderSet<Packet> testHeaderSet2 = testHeaderSet1.getSortedHeaderSet();
		
		assertEquals(refTimestamp1, testHeaderSet2.timestamp);
		assertEquals(2, testHeaderSet2.headerList.size());
		assertEquals(testPacket1, testHeaderSet2.headerList.get(0));
		assertEquals(testPacket2, testHeaderSet2.headerList.get(1));
	}
	
	@Test
	public void testGetId() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket2, testPacket1);

		assertEquals("01_0000_0000_10_0000,02_0000_0000_10_0000", testHeaderSet1.getId());
	}
	
	@Test
	public void testGetIdHash() throws Exception {
		Packet testPacket1 = new Packet(0, 1, 0, 0, 0, 0, null);
		Packet testPacket2 = new Packet(0, 2, 0, 0, 0, 0, null);
		
		HeaderSet<Packet> testHeaderSet1 = new HeaderSet<Packet>(0, testPacket2, testPacket1);

		assertEquals("5c9c71b01aca96a35c15cffd0ec382e8a1be99b3e42eeff57ecd7836aa7f1a24", testHeaderSet1.getIdHash());
	}
	
}
