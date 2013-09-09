package org.apache.sling.mailarchiveserver.exchange;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.sling.mailarchiveserver.api.Ingestor;

@Component
public class ExchangeConnectorScheduler {

	@Reference
	private Ingestor ingestor;

	@Activate
	public void activate() {
		// check for config files
		// create ExchangeConnectors from them
		// schedule with ingestor
	}

}

