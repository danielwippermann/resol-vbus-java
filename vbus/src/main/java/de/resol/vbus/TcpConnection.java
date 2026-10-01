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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * The `TcpConnection` class extends the basic `Connection` functionality and
 * uses TCP socket communication the send and receive VBus live data using
 * one of the LAN-enabled communication adapters like:
 * 
 * - VBus/LAN
 * - DL2
 * - DL3
 * - KM1
 * 
 * In addition to that it allows a connection using RESOL's VBus.net service.
 */
public class TcpConnection extends Connection {

	/**
	 * The read timeout in milliseconds used unless {@link #setReadTimeout(int)} says otherwise.
	 */
	public static final int DEFAULT_READ_TIMEOUT = 5000;

	/**
	 * How long the peer may take to answer each step of the handshake, in milliseconds.
	 * It is deliberately independent of the read timeout: a peer is expected to answer
	 * a command at once, however long a VBus may stay silent afterwards.
	 */
	private static final int HANDSHAKE_TIMEOUT = 5000;

	private SocketAddress socketAddress;
	
	private String viaTag;
	
	private String password;
	
	private Integer channel;
	
	private Thread thread;
	
	private Socket socket;

	private LiveInputStream is;
	
	private LiveOutputStream os;
	
	private int readTimeout = DEFAULT_READ_TIMEOUT;
	
	/**
	 * Creates a `TcpConnection` instance, initializing its members to the given values.
	 * 
	 * @param selfAddress VBus address to use as source address in `Header` instances
	 * created by this `Connection`.
	 * @param socketAddress Host and port to connect to TCP socket to.
	 * @param viaTag Via tag to connect to or `null` if VBus.net is not used.
	 * @param password Password to connect to VBus-over-TCP service.
	 * @param channel VBus channel to connect to.
	 */
	public TcpConnection(int selfAddress, SocketAddress socketAddress, String viaTag, String password, Integer channel) {
		super(selfAddress);
		this.socketAddress = socketAddress;
		this.viaTag = viaTag;
		this.password = password;
		this.channel = channel;
	}
	
	/**
	 * Returns how long the connection waits for data before it considers itself interrupted.
	 * 
	 * @return Read timeout in milliseconds, `0` meaning that it waits forever.
	 */
	public int getReadTimeout() {
		return readTimeout;
	}
	
	/**
	 * Sets how long the connection waits for data before it considers itself interrupted
	 * and reconnects.
	 * 
	 * A VBus is not necessarily busy all the time: some controllers pause for several seconds
	 * between bursts of packets. If such a pause is longer than the read timeout, the connection
	 * is torn down and established again although nothing is wrong with it, and everything the
	 * peer sends in the meantime is lost.
	 * 
	 * The timeout applies to live data only, not to the handshake, and takes effect the next
	 * time the connection is established.
	 * 
	 * @param readTimeout Read timeout in milliseconds, `0` to wait forever.
	 */
	public void setReadTimeout(int readTimeout) {
		if (readTimeout < 0) {
			throw new IllegalArgumentException("Read timeout must not be negative");
		}
		this.readTimeout = readTimeout;
	}
	
	@Override
	public void connect() throws IOException {
		if (connectionState != ConnectionState.DISCONNECTED) {
			throw new IOException("Connection is not disconnected");
		}
		
		setConnectionState(ConnectionState.CONNECTING);

		try {
			connectInternal();
		} catch (IOException ex) {
			setConnectionState(ConnectionState.DISCONNECTED);
			throw ex;
		}

		thread = new Thread(new Runnable() {
			
			public void run() {
				runInBackground();
			}
			
		});
		thread.start();
	}
	
	@Override
	public void disconnect() throws IOException {
		if (connectionState != ConnectionState.DISCONNECTED) {
			setConnectionState(ConnectionState.DISCONNECTING);

			disconnectInternal();
		
			setConnectionState(ConnectionState.DISCONNECTED);
		}
	}
		
	@Override
	public void send(Header header) throws IOException {
		if (this.os != null) {
			this.os.writeHeader(header);
		}
	}
	
	private void runInBackground() {
		while (getConnectionState() != ConnectionState.DISCONNECTED) {
			switch (getConnectionState()) {
			case CONNECTED:
				try {
					Header header = this.is.readHeader();
					if (header == null) {
						throw new IOException("Socket closed");
					}

					emitHeaderReceived(header);
				} catch (IOException ex) {
					checkAndSetConnectionState(ConnectionState.CONNECTED, ConnectionState.INTERRUPTED);
				}
				break;
			case INTERRUPTED:
				try {
					Thread.sleep(1000);
					checkAndSetConnectionState(ConnectionState.INTERRUPTED, ConnectionState.RECONNECTING);
				} catch (InterruptedException ex) {
					// nop
				}
				break;
			case RECONNECTING:
				try {
					connectInternal();
					checkAndSetConnectionState(ConnectionState.RECONNECTING, ConnectionState.CONNECTED);
				} catch (IOException ex) {
					checkAndSetConnectionState(ConnectionState.RECONNECTING, ConnectionState.INTERRUPTED);
				}
				break;
			case DISCONNECTING:
			case CONNECTING:
				// NOTE(daniel): should not come here
				break;
			case DISCONNECTED:
				break;
			}
		}
	}
	
	private void connectInternal() throws IOException {
		Socket socket = new Socket();
		socket.setSoTimeout(HANDSHAKE_TIMEOUT);
		socket.connect(socketAddress, 5500);

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		
		String errorMessage = null;
		
		String line = in.readLine();
		if (line == null) {
			errorMessage = "Unexpected end of stream while waiting for HELLO";
		} else if (line.charAt(0) == '-') {
			errorMessage = line;
		} else if (line.charAt(0) != '+') {
			errorMessage = "Unexpected line while waiting for HELLO";
		}
		
		if ((errorMessage == null) && (viaTag != null) && (viaTag.length() > 0)) {
			out.println("CONNECT " + viaTag);
			out.flush();
			
			line = in.readLine();
			if (line == null) {
				errorMessage = "Unexpected end of stream while waiting for CONNECT response";
			} else if (line.charAt(0) == '-') {
				errorMessage = line;
			} else if (line.charAt(0) != '+') {
				errorMessage = "Unexpected line while waiting for CONNECT response";
			}
		}
		
		if ((errorMessage == null) && (password != null) && (password.length() > 0)) {
			out.println("PASS " + password);
			out.flush();
			
			line = in.readLine();
			if (line == null) {
				errorMessage = "Unexpected end of stream while waiting for PASS response";
			} else if (line.charAt(0) == '-') {
				errorMessage = line;
			} else if (line.charAt(0) != '+') {
				errorMessage = "Unexpected line while waiting for PASS response";
			}
		}

		// FIXME(daniel): insert CHANNELLIST command and callback

		if ((errorMessage == null) && (channel != null)) {
			out.println("CHANNEL " + channel);
			out.flush();
			
			line = in.readLine();
			if (line == null) {
				errorMessage = "Unexpected end of stream while waiting for CHANNEL response";
			} else if (line.charAt(0) == '-') {
				errorMessage = line;
			} else if (line.charAt(0) != '+') {
				errorMessage = "Unexpected line while waiting for CHANNEL response";
			}
		}
		
		if (errorMessage == null) {
			out.println("DATA");
			out.flush();
			
			line = in.readLine();
			if (line == null) {
				errorMessage = "Unexpected end of stream while waiting for DATA response";
			} else if (line.charAt(0) == '-') {
				errorMessage = line;
			} else if (line.charAt(0) != '+') {
				errorMessage = "Unexpected line while waiting for DATA response";
			}
		}
		
		if (errorMessage != null) {
			socket.close();
			
			throw new IOException(errorMessage);
		}

		socket.setSoTimeout(readTimeout);

		Socket previousSocket = this.socket;

		this.socket = socket;
		this.is = new LiveInputStream(socket.getInputStream(), (channel != null)?channel:0);
		this.os = new LiveOutputStream(socket.getOutputStream());
		
		setConnectionState(ConnectionState.CONNECTED);

		if (previousSocket != null) {
			try {
				previousSocket.close();
			} catch (IOException ex) {
				// ignore it
			}
		}
	}
	
	private void disconnectInternal() throws IOException {
		if (os != null) {
			os = null;
		}
		
		if (is != null) {
			is = null;
		}
		
		if (socket != null) {
			socket.close();
			socket = null;
		}
	}

}
