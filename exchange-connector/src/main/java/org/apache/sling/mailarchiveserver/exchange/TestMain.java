package org.apache.sling.mailarchiveserver.exchange;

import java.io.IOException;

import org.apache.sling.mailarchiveserver.api.SchedulableMailServerConnector;

public class TestMain {

	public static void main(String[] args) throws IOException {
		SchedulableMailServerConnector connector = new ExchangeConnector();

		System.out.println("*** main BEGIN");
		connector.checkNewMessages();
		System.out.println("*** main END");
	}

}
