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
package de.resol.vbus;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.LinkedList;

public class TestableConnection extends Connection {

	private LinkedList<Header> txQueue;
	
	public TestableConnection(int selfAddress) {
		super(selfAddress);
		txQueue = new LinkedList<Header>();
	}
	
	@Override
	public void connect() throws IOException {
		setConnectionState(ConnectionState.CONNECTING);
		setConnectionState(ConnectionState.CONNECTED);
	}
	
	@Override
	public void disconnect() throws IOException {
		setConnectionState(ConnectionState.DISCONNECTING);
		setConnectionState(ConnectionState.DISCONNECTED);
	}
	
	@Override
	public void send(Header header) throws IOException {
		txQueue.add(header);
	}

	public void simulateRx(Header header) {
		emitHeaderReceived(header);
	}
	
	public void assertTxQueueEmpty() {
		assertNull(txQueue.poll());
	}
	
	public Header dequeueTx() {
		return txQueue.remove();
	}

}
