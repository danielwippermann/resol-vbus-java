package de.resol.vbus;

import java.io.IOException;

public class StreamConnection extends Connection {

	protected LiveInputStream is;
	protected LiveOutputStream os;
	protected Thread thread;

	public StreamConnection(int selfAddress, LiveInputStream is, LiveOutputStream os) {
		super(selfAddress);
		this.is = is;
		this.os = os;
	}
	
	@Override
	public void connect() throws IOException {
		if (connectionState != ConnectionState.DISCONNECTED) {
			throw new IOException("Connection is not disconnected");
		}
		
		setConnectionState(ConnectionState.CONNECTING);

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

			thread.interrupt();
		}
	}

	@Override
	public void send(Header header) throws IOException {
		this.os.writeHeader(header);
	}

	private void runInBackground() {
		setConnectionState(ConnectionState.CONNECTED);

		while (getConnectionState() != ConnectionState.DISCONNECTED) {
			switch (getConnectionState()) {
			case CONNECTED:
				try {
					Header header = this.readHeader();
					if (header != null) {
						emitHeaderReceived(header);
					}
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
				checkAndSetConnectionState(ConnectionState.RECONNECTING, ConnectionState.CONNECTED);
				break;
			case DISCONNECTING:
				checkAndSetConnectionState(ConnectionState.DISCONNECTING, ConnectionState.DISCONNECTED);
				break;
			case DISCONNECTED:
				break;
			case CONNECTING:
				// NOTE(daniel): should not come here
				break;
			}
		}
	}
	
	protected Header readHeader() throws IOException {
		Header header = this.is.readHeader();
		if (header == null) {
			throw new IOException("Stream closed");
		}
		return header;
	}

}
