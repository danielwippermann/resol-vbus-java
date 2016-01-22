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

import java.io.IOException;

import org.junit.Test;

import de.resol.vbus.Connection.ConnectionState;
import de.resol.vbus.ConnectionTest.TestableConnection;

public class ConnectionTest {

	public static class TestableConnection extends Connection {
	
		public TestableConnection() {
			super(0x0020);
		}
		
		@Override
		public void connect() throws IOException {
		}
		
		@Override
		public void disconnect() throws IOException {
		}
		
		@Override
		public void send(Header header) throws IOException {
		}

		protected void emulateHeaderReceived(Header header) {
			for (ConnectionListener listener : listeners) {
				if (header instanceof Packet) {
					listener.packetReceived(this, (Packet) header); 
				} else if (header instanceof Datagram) {
					listener.datagramReceived(this, (Datagram) header);
				} else if (header instanceof Telegram) {
					listener.telegramReceived(this, (Telegram) header);
				}
			}
		}

		protected void emulateHeadersReceived(Header[] headers) {
			for (Header header : headers) {
				emulateHeaderReceived(header);
			}
		}
		
	}
	
	@Test
	public void testConstructor() {
		TestableConnection testConnection1 = new TestableConnection();
		
		assertEquals(ConnectionState.DISCONNECTED, testConnection1.connectionState);
	}

	@Test
	public void testAddAndRemoveListener() throws Exception {
		ConnectionListener refListener1 = new ConnectionAdapter() {};
		
		TestableConnection testConnection1 = new TestableConnection();
		
		assertEquals(0, testConnection1.listeners.size());

		testConnection1.addListener(refListener1);
	
		assertEquals(1, testConnection1.listeners.size());
		assertEquals(true, testConnection1.listeners.contains(refListener1));
		
		testConnection1.removeListener(refListener1);
		
		assertEquals(0, testConnection1.listeners.size());
	}

	@Test
	public void testGetAndSetConnectionState() throws Exception {
		final TestableConnection testConnection1 = new TestableConnection();
		
		final ConnectionState[] expectedConnectionState = new ConnectionState [1];
		
		final int[] callCount = new int [1];
		
		ConnectionListener refListener1 = new ConnectionAdapter() {
			
			@Override
			public void connectionStateChanged(Connection connection) {
				callCount [0]++;
				assertEquals(testConnection1, connection);
				assertEquals(expectedConnectionState [0], testConnection1.connectionState);
				assertEquals(expectedConnectionState [0], testConnection1.getConnectionState());
			}
			
		};

		testConnection1.addListener(refListener1);
		
		expectedConnectionState [0] = ConnectionState.CONNECTING;
		testConnection1.setConnectionState(expectedConnectionState [0]);

		expectedConnectionState [0] = ConnectionState.CONNECTED;
		testConnection1.setConnectionState(expectedConnectionState [0]);
		
		assertEquals(2, callCount [0]);
		
		testConnection1.removeListener(refListener1);
	}
	
	@Test
	public void testCheckAndSetConnectionState() throws Exception {
		final TestableConnection testConnection1 = new TestableConnection();
		
		final ConnectionState[] expectedConnectionState = new ConnectionState [1];
		
		final int[] callCount = new int [1];
		
		ConnectionListener refListener1 = new ConnectionAdapter() {
			
			@Override
			public void connectionStateChanged(Connection connection) {
				callCount [0]++;
				assertEquals(testConnection1, connection);
				assertEquals(expectedConnectionState [0], testConnection1.connectionState);
				assertEquals(expectedConnectionState [0], testConnection1.getConnectionState());
			}
			
		};

		testConnection1.addListener(refListener1);
		
		assertEquals(ConnectionState.DISCONNECTED, testConnection1.getConnectionState());
		assertEquals(0, callCount [0]);
		
		expectedConnectionState [0] = ConnectionState.CONNECTING;
		testConnection1.checkAndSetConnectionState(ConnectionState.DISCONNECTED, ConnectionState.CONNECTING);

		assertEquals(ConnectionState.CONNECTING, testConnection1.getConnectionState());
		assertEquals(1, callCount [0]);
		
		testConnection1.checkAndSetConnectionState(ConnectionState.INTERRUPTED, ConnectionState.RECONNECTING);

		assertEquals(ConnectionState.CONNECTING, testConnection1.getConnectionState());
		assertEquals(1, callCount [0]);
		
		expectedConnectionState [0] = ConnectionState.CONNECTED;
		testConnection1.checkAndSetConnectionState(ConnectionState.CONNECTING, ConnectionState.CONNECTED);

		assertEquals(ConnectionState.CONNECTED, testConnection1.getConnectionState());
		
		assertEquals(2, callCount [0]);
		
		testConnection1.removeListener(refListener1);
	}

	@Test
	public void testTransceive() throws Exception {
		long timeDiff;
		
		// ---- send a packet, not waiting for reply, just timeout... ----
		TestableConnection testConnection1 = new TestableConnection() {
			
			@Override
			public void send(Header header) throws IOException {
				// simulate echo
				emulateHeaderReceived(header);
			}
			
		};
		
		Packet refPacket1 = new Packet(0, 0, 0, 0, 0, 0, null);
		
		timeDiff = System.currentTimeMillis();
		Header testHeader1 = testConnection1.transceive(refPacket1, 100, 0, 1, null);
		timeDiff = System.currentTimeMillis() - timeDiff;
		
		assertTrue(Math.abs(100 - timeDiff) < 20);
		assertEquals(null, testHeader1);

		// ---- send a datagram, receiving reply before timeout  ----
		TestableConnection testConnection2 = new TestableConnection() {
			
			int tries;
			
			@Override
			public void send(Header header) throws IOException {
				// simulate echo
				emulateHeaderReceived(header);
				
				if (++tries >= 3) {
					Header replyHeader = new Datagram(0, 0, 2, 1, 0, 0, 0);
					emulateHeaderReceived(replyHeader);
				}
			}
			
		};
		
		HeaderFilter refFilter2 = new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Datagram) {
					if (header.destinationAddress == 2) {
						return true;
					}
				}
				return false;
			}
		};
		
		Header refHeader2 = new Datagram(0, 0, 1, 2, 0, 0, 0);
		
		timeDiff = System.currentTimeMillis();
		Header testHeader2 = testConnection2.transceive(refHeader2, 100, 100, 3, refFilter2);
		timeDiff = System.currentTimeMillis() - timeDiff;
		
		assertTrue(Math.abs(300 - timeDiff) < 20);
		assertEquals(2, testHeader2.destinationAddress);
		assertEquals(1, testHeader2.sourceAddress);

		// ---- send a telegram, receiving reply immediately  ----
		TestableConnection testConnection3 = new TestableConnection() {
			
			@Override
			public void send(Header header) throws IOException {
				// simulate echo
				emulateHeaderReceived(header);
				
				Header replyHeader = new Telegram(0, 0, 2, 1, 0, null);
				emulateHeaderReceived(replyHeader);
			}
			
		};
		
		HeaderFilter refFilter3 = new HeaderFilter() {
			
			public boolean filterHeader(Header header) {
				if (header instanceof Telegram) {
					if (header.destinationAddress == 2) {
						return true;
					}
				}
				return false;
			}
		};
		
		Header refHeader3 = new Telegram(0, 0, 1, 2, 0, null);
		
		timeDiff = System.currentTimeMillis();
		Header testHeader3 = testConnection3.transceive(refHeader3, 100, 100, 3, refFilter3);
		timeDiff = System.currentTimeMillis() - timeDiff;
		
		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(2, testHeader3.destinationAddress);
		assertEquals(1, testHeader3.sourceAddress);

		// ---- throw exception during send  ----
		TestableConnection testConnection4 = new TestableConnection() {
			
			@Override
			public void send(Header header) throws IOException {
				throw new IOException("Test");
			}
			
		};
		
		Packet refPacket4 = new Packet(0, 0, 0, 0, 0, 0, null);
		
		timeDiff = System.currentTimeMillis();
		int exceptionCount = 0;
		try {
			testConnection4.transceive(refPacket4, 100, 0, 1, null);
		} catch (IOException ex) {
			assertEquals("Test", ex.getMessage());
			exceptionCount++;
		}
		
		timeDiff = System.currentTimeMillis() - timeDiff;
		
		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(1, exceptionCount);
	}
	
	@Test
	public void testWaitForFreeBus() throws Exception {
		long timeDiff;
		
		final Packet refPacket1 = new Packet(0, 0, 0, 0, 0, 0, null);
		final Datagram refDatagram1 = new Datagram(0, 0, 0, 0, 0, 0, 0);
		final Datagram refDatagram2 = new Datagram(0, 0, 0, 0, 0x0500, 0, 0);
		
		TestableConnection testConnection1 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				emulateHeaderReceived(refPacket1);
				emulateHeaderReceived(refDatagram1);
				emulateHeaderReceived(refDatagram2);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader3 = testConnection1.waitForFreeBus(20000);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refDatagram2, testHeader3);
	}

	@Test
	public void testReleaseBus() throws Exception {
		long timeDiff;
		
		final Header[] refHeaders1 = new Header[] {
			new Packet(0, 0, 0, 0, 0, 0, null),
		};
		
		TestableConnection testConnection1 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				emulateHeaderReceived(header);
				emulateHeadersReceived(refHeaders1);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader1 = testConnection1.releaseBus(0x7E11, 1500, 0, 1);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refHeaders1 [0], testHeader1);
	}
	
	@Test
	public void testGetValueById() throws Exception {
		long timeDiff;
		
		final Header[] refHeaders1 = new Header[] {
			new Packet(0, 0, 0, 0, 0, 0, null),
			new Datagram(0, 0, 0, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0x1234, 0x12341234),
		};
		
		TestableConnection testConnection1 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				assertEquals("00_7E11_0020_20_0300_0000", header.getId());
				emulateHeaderReceived(header);
				emulateHeadersReceived(refHeaders1);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader1 = testConnection1.getValueById(0x7E11, 0x1234, 500, 500, 3);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refHeaders1 [refHeaders1.length - 1], testHeader1);
	}

	
	@Test
	public void testSetValueById() throws Exception {
		long timeDiff;
		
		final Header[] refHeaders1 = new Header[] {
			new Packet(0, 0, 0, 0, 0, 0, null),
			new Datagram(0, 0, 0, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0x1234, 0x12341234),
		};
		
		TestableConnection testConnection1 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				assertEquals("00_7E11_0020_20_0400_0000", header.getId());
				emulateHeaderReceived(header);
				emulateHeadersReceived(refHeaders1);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader1 = testConnection1.setValueById(0x7E11, 0x1234, 0x12341234, true, 500, 500, 3);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refHeaders1 [refHeaders1.length - 1], testHeader1);

		TestableConnection testConnection2 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				assertEquals("00_7E11_0020_20_0200_0000", header.getId());
				emulateHeaderReceived(header);
				emulateHeadersReceived(refHeaders1);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader2 = testConnection2.setValueById(0x7E11, 0x1234, 0x12341234, false, 500, 500, 3);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refHeaders1 [refHeaders1.length - 1], testHeader2);
	}
	
	@Test
	public void testGetValueIdHashById() throws Exception {
		long timeDiff;
		
		final Header[] refHeaders1 = new Header[] {
			new Packet(0, 0, 0, 0, 0, 0, null),
			new Datagram(0, 0, 0, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0x1234, 0x12341234),
		};
		
		TestableConnection testConnection1 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				assertEquals("00_7E11_0020_20_1000_0000", header.getId());
				emulateHeaderReceived(header);
				emulateHeadersReceived(refHeaders1);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader1 = testConnection1.getValueIdHashById(0x7E11, 0x1234, 500, 500, 3);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refHeaders1 [refHeaders1.length - 1], testHeader1);
	}
	
	@Test
	public void testGetValueIdByIdHash() throws Exception {
		long timeDiff;
		
		final Header[] refHeaders1 = new Header[] {
			new Packet(0, 0, 0, 0, 0, 0, null),
			new Datagram(0, 0, 0, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0, 0),
			new Datagram(0, 0, 0x0020, 0x7E11, 0x0100, 0x1234, 0x12341234),
		};
		
		TestableConnection testConnection1 = new TestableConnection() {
			
			public void send(Header header) throws IOException {
				assertEquals("00_7E11_0020_20_1100_0000", header.getId());
				emulateHeaderReceived(header);
				emulateHeadersReceived(refHeaders1);
			}
			
		};

		timeDiff = System.currentTimeMillis();
		Header testHeader1 = testConnection1.getValueIdByIdHash(0x7E11, 0x12341234, 500, 500, 3);
		timeDiff = System.currentTimeMillis() - timeDiff;

		assertTrue(Math.abs(timeDiff) < 20);
		assertEquals(refHeaders1 [refHeaders1.length - 1], testHeader1);
	}

}
