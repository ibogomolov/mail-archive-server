package org.apache.sling.mailarchiveserver.exchange;

import java.io.IOException;

import org.apache.sling.mailarchiveserver.api.Connector;

public class TestMain {

	public static void main(String[] args) throws IOException {
		String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);
		Connector connector = new ExchangeConnector("config.txt");

		System.out.println("*** main BEGIN");
		connector.checkNewMessages(1);
		System.out.println("*** main END");
	}

}
