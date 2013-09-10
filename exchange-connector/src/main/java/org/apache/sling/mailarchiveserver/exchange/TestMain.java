package org.apache.sling.mailarchiveserver.exchange;

import java.io.IOException;

import org.apache.sling.mailarchiveserver.api.Connector;

public class TestMain {

	public static void main(String[] args) throws IOException {
		Connector connector = new ExchangeConnector("config.txt");

		System.out.println("*** main BEGIN");
		connector.checkNewMessages(100);
		System.out.println("*** main END");
	}

}
