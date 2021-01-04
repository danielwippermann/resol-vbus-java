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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import org.junit.Test;

import de.resol.vbus.Connection.ConnectionState;

public class TcpConnectionTest {

	static class Endpoint {
		
		int phase;

		ServerSocket serverSocket;
		
		Thread thread;
		
		boolean stopped;
		
		Socket currentClientSocket;

		InetSocketAddress serverSocketAddress;

		void setup() throws IOException {
			phase = 18;
			
			ServerSocket serverSocket = new ServerSocket();
			serverSocket.bind(null);
			
//			System.out.println(serverSocket.getLocalPort());
			
			this.serverSocket = serverSocket;
			serverSocketAddress = new InetSocketAddress(InetAddress.getLoopbackAddress(), serverSocket.getLocalPort());
			
			thread = new Thread(new Runnable() {
				
				public void run() {
					while (!stopped) {
						try {
//							System.err.println("Listening for new connection");
							listenInBackground();
						} catch (IOException ex) {
							// ex.printStackTrace();
						} finally {
							if (currentClientSocket != null) {
								try {
									currentClientSocket.close();
								} catch (IOException ex) {
									// nop
								}
								currentClientSocket = null;
							}
						}
					}
				}
				
			});
			
			thread.start();
		}

		void teardown() throws IOException, InterruptedException {
			stopped = true;
			if (currentClientSocket != null) {
				currentClientSocket.close();
				currentClientSocket = null;
			}
			if (serverSocket != null) {
				serverSocket.close();
				serverSocket = null;
			}
			if (thread != null) {
				thread.join();
				thread = null;
			}
		}
		
		void listenInBackground() throws IOException {
			Socket socket = serverSocket.accept();
			currentClientSocket = socket;
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
		
			if (phase <= 0) {
				socket.close();
			} else if (phase <= 1) {
				out.println("-ERROR: Unsupported command");
				out.flush();
			} else if (phase <= 2) {
				out.println("Invalid response");
				out.flush();
			} else {
				out.println("+HELLO");
				out.flush();
			}
			
			String line;
			while ((line = in.readLine()) != null) {
				if (line.startsWith("CONNECT ")) {
					if (phase <= 3) {
						socket.close();
					} else if (phase <= 4) {
						out.println("-ERROR: Unsupported command");
						out.flush();
					} else if (phase <= 5) {
						out.println("Invalid response");
						out.flush();
					} else {
						out.println("+OK");
						out.flush();
					}
				} else if (line.startsWith("PASS ")) {
					if (phase <= 6) {
						socket.close();
					} else if (phase <= 7) {
						out.println("-ERROR: Unsupported command");
						out.flush();
					} else if (phase <= 8) {
						out.println("Invalid response");
						out.flush();
					} else {
						out.println("+OK");
						out.flush();
					}
				} else if (line.equals("CHANNELLIST")) {
					if (phase <= 9) {
						socket.close();
					} else if (phase <= 10) {
						out.println("-ERROR: Unsupported command");
						out.flush();
					} else if (phase <= 11) {
						out.println("Invalid response");
						out.flush();
					} else {
						out.println("*1:Test");
						out.println("+OK");
						out.flush();
					}
				} else if (line.startsWith("CHANNEL ")) {
					if (phase <= 12) {
						socket.close();
					} else if (phase <= 13) {
						out.println("-ERROR: Unsupported command");
						out.flush();
					} else if (phase <= 14) {
						out.println("Invalid response");
						out.flush();
					} else {
						out.println("+OK");
						out.flush();
					}
				} else if (line.equals("DATA")) {
					if (phase <= 15) {
						socket.close();
					} else if (phase <= 16) {
						out.println("-ERROR: Unsupported command");
						out.flush();
					} else if (phase <= 17) {
						out.println("Invalid response");
						out.flush();
					} else {
						out.println("+OK");
						out.flush();
						break;
					}
				} else {
					out.println("-ERROR: Unknown command '" + line + "'");
					out.flush();
				}
			}
			
			LiveOutputStream os = new LiveOutputStream(socket.getOutputStream());

			int headerIndex = 0;
			Header[] headers = new Header[] {
				new Packet(0, 0, 0, 0, 0, 0, null),
				new Datagram(0, 0, 0, 0, 0, 0, 0),
				new Telegram(0, 0, 0, 0, 0, null),
				null,
				null,
				null,
			};
			
			while (socket.isConnected()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					// nop
				}
				
				if (headers [headerIndex] != null) {
					os.writeHeader(headers [headerIndex]);
				}

				headerIndex += 1;
				if (headerIndex >= headers.length) {
					headerIndex = 0;
				}
			}

			socket.close();
		}
		
	}
	
	@Test
	public void testConnectAndDisconnect() throws Exception {
		Endpoint endpoint = new Endpoint();

		endpoint.setup();
		
		for (int phase = 0; phase < 18; phase++) {
//			System.err.println("PHASE " + phase);
			
			endpoint.phase = phase;
			
			TcpConnection testConnection = new TcpConnection(0x0020, endpoint.serverSocketAddress, "via", "password", 1);
	
			int exceptionCount = 0;
			try {
				testConnection.connect();
			} catch (IOException ex) {
//				ex.printStackTrace();
				exceptionCount++;
			}
			
			assertEquals(1, exceptionCount);
			assertEquals(ConnectionState.DISCONNECTED, testConnection.getConnectionState());
		}
		
		endpoint.phase = 18;
		
		final TcpConnection testConnection2 = new TcpConnection(0x0020, endpoint.serverSocketAddress, "via", "password", 1);
		
		final int[] listenerCallCount = new int [1];
		
		ConnectionListener refListener2 = new ConnectionAdapter() {
			
			public void connectionStateChanged(Connection connection) {
				assertEquals(testConnection2, connection);
				listenerCallCount [0]++;
			}
			
		};
		
		testConnection2.addListener(refListener2);
		
		testConnection2.disconnect();

		testConnection2.connect();
		
		testConnection2.removeListener(refListener2);
		
		assertEquals(2, listenerCallCount [0]);
		assertEquals(ConnectionState.CONNECTED, testConnection2.getConnectionState());

		int exceptionCount2 = 0;
		
		try {
			testConnection2.connect();
		} catch (IOException ex) {
			exceptionCount2++;
		}
		
		assertEquals(1, exceptionCount2);
		
		final int[] listenerCallCount2a = new int [3];
		
		ConnectionListener refListener2a = new ConnectionAdapter() {
		
			@Override
			public void packetReceived(Connection connection, Packet packet) {
				assertEquals(testConnection2, connection);
				listenerCallCount2a [0]++;
			}
			
			@Override
			public void datagramReceived(Connection connection, Datagram dgram) {
				assertEquals(testConnection2, connection);
				listenerCallCount2a [1]++;
			}
			
			@Override
			public void telegramReceived(Connection connection, Telegram tgram) {
				assertEquals(testConnection2, connection);
				listenerCallCount2a [2]++;
			}
			
		};
		
		testConnection2.addListener(refListener2a);
		
		int exceptionCount2a = 0;

		try {
			Thread.sleep(400);
		} catch (InterruptedException ex) {
			exceptionCount2a++;
		}
		
		testConnection2.removeListener(refListener2a);
		
		assertEquals(0, exceptionCount2a);
		assertEquals(1, listenerCallCount2a [0]);
		assertEquals(1, listenerCallCount2a [1]);
		assertEquals(1, listenerCallCount2a [2]);

		testConnection2.disconnect();
		
		assertEquals(ConnectionState.DISCONNECTED, testConnection2.getConnectionState());
		
		endpoint.teardown();
	}

	@Test
	public void testConnectAndDisconnectWithReconnect() throws Exception {
		Endpoint endpoint = new Endpoint();

		endpoint.setup();
		
		final TcpConnection testConnection3 = new TcpConnection(0x0020, endpoint.serverSocketAddress, "via", "password", 1);
		
		final int[] listenerCallCount3 = new int [1];
		
		final ArrayList connectionStateHistory = new ArrayList();

		ConnectionListener refListener3 = new ConnectionAdapter() {
			
			public void connectionStateChanged(Connection connection) {
				assertEquals(testConnection3, connection);
				listenerCallCount3 [0]++;
				connectionStateHistory.add(connection.getConnectionState());
			}
			
		};
		
		testConnection3.addListener(refListener3);
		
		testConnection3.connect();
		
		assertEquals(2, listenerCallCount3 [0]);
		assertEquals(ConnectionState.CONNECTED, testConnection3.getConnectionState());

		endpoint.currentClientSocket.close();
		
		int exceptionCount3 = 0;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			exceptionCount3++;
		}
		
		assertEquals(0, exceptionCount3);
		assertEquals(3, listenerCallCount3 [0]);
		assertEquals(ConnectionState.INTERRUPTED, testConnection3.getConnectionState());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			exceptionCount3++;
		}
		
		assertEquals(5, listenerCallCount3 [0]);
		assertEquals(ConnectionState.CONNECTED, testConnection3.getConnectionState());

		endpoint.teardown();

		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			exceptionCount3++;
		}
		
		assertEquals(0, exceptionCount3);
		assertEquals(6, listenerCallCount3 [0]);
		assertEquals(ConnectionState.INTERRUPTED, testConnection3.getConnectionState());

		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			exceptionCount3++;
		}
		
		assertTrue(connectionStateHistory.size() >= 8);
		assertEquals(ConnectionState.RECONNECTING, connectionStateHistory.get(6));
		assertEquals(ConnectionState.INTERRUPTED, connectionStateHistory.get(7));

		testConnection3.removeListener(refListener3);

		testConnection3.disconnect();
		
		assertEquals(ConnectionState.DISCONNECTED, testConnection3.getConnectionState());


		if (false) {
			final TcpConnection testConnection5 = new TcpConnection(0x0020, new InetSocketAddress("192.168.13.1", 7053), null, "vbus", 0);
			
			ConnectionListener refListener5 = new ConnectionAdapter() {
				
				public void connectionStateChanged(Connection connection) {
					assertEquals(testConnection5, connection);
				}

				@Override
				public void packetReceived(Connection connection, Packet packet) {
					assertEquals(testConnection5, connection);
//					System.out.println(packet.getId());
				}
				
				@Override
				public void datagramReceived(Connection connection, Datagram dgram) {
					assertEquals(testConnection5, connection);
//					System.out.println(dgram.getId());
				}
				
				@Override
				public void telegramReceived(Connection connection, Telegram tgram) {
					assertEquals(testConnection5, connection);
//					System.out.println(tgram.getId());
				}
				
			};
			
			testConnection5.addListener(refListener5);
			
			testConnection5.connect();
			
			assertEquals(ConnectionState.CONNECTED, testConnection5.getConnectionState());
			
			int exceptionCount5 = 0;

			try {
				Thread.sleep(10000);
			} catch (InterruptedException ex) {
				exceptionCount5++;
			}

			testConnection5.removeListener(refListener5);
			
			testConnection5.disconnect();
			
			assertEquals(ConnectionState.DISCONNECTED, testConnection5.getConnectionState());
			assertEquals(0, exceptionCount5);
		}
		
		endpoint.teardown();
	}

	@Test
	public void testSend() throws Exception {
		Endpoint endpoint = new Endpoint();

		endpoint.setup();
		
		Datagram refDatagram1 = new Datagram(0, 0, 0, 0, 0, 0, 0);
		
		final TcpConnection testConnection3 = new TcpConnection(0x0020, endpoint.serverSocketAddress, "via", "password", 1);
		
		final int[] listenerCallCount3 = new int [1];
		
		ConnectionListener refListener3 = new ConnectionAdapter() {
			
			public void connectionStateChanged(Connection connection) {
				assertEquals(testConnection3, connection);
				listenerCallCount3 [0]++;
			}
			
		};
		
		testConnection3.addListener(refListener3);
		
		testConnection3.send(refDatagram1);
		
		testConnection3.connect();
		
		assertEquals(2, listenerCallCount3 [0]);
		assertEquals(ConnectionState.CONNECTED, testConnection3.getConnectionState());

		testConnection3.send(refDatagram1);
		
		endpoint.teardown();
	}

}
