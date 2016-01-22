package de.resol.vbus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionAdapterTest {

	@Test
	public void testForCoverageSake() {
		ConnectionListener testListener1 = new ConnectionAdapter();
		
		testListener1.connectionStateChanged(null);
		testListener1.packetReceived(null, null);
		testListener1.datagramReceived(null, null);
		testListener1.telegramReceived(null, null);
	}

}
