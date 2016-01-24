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

	private SocketAddress socketAddress;
	
	private String viaTag;
	
	private String password;
	
	private int channel;
	
	private Thread thread;
	
	private Socket socket;

	private LiveInputStream is;
	
	private LiveOutputStream os;
	
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
	public TcpConnection(int selfAddress, SocketAddress socketAddress, String viaTag, String password, int channel) {
		super(selfAddress);
		this.socketAddress = socketAddress;
		this.viaTag = viaTag;
		this.password = password;
		this.channel = channel;
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
		socket.setSoTimeout(5000);
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

		if ((errorMessage == null) && (channel != 0)) {
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

		this.socket = socket;
		this.is = new LiveInputStream(socket.getInputStream(), channel);
		this.os = new LiveOutputStream(socket.getOutputStream());
		
		setConnectionState(ConnectionState.CONNECTED);
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
