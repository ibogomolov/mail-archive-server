package org.apache.sling.mailarchiveserver.exchange;

import java.net.MalformedURLException;

public class TestMain {

	public static void main(String[] args) throws MalformedURLException {
		ExchangeConnector connector = new ExchangeConnector();

		System.out.println("*** main BEGIN");
		connector.getNewMessages();
		System.out.println("*** main END");
	}

}
