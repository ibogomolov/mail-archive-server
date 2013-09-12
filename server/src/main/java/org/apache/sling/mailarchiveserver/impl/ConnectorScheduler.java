package org.apache.sling.mailarchiveserver.impl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.sling.mailarchiveserver.api.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ConnectorScheduler {

	private static final int RETREIVE_MESSAGES_LIMIT = 3;
	private static final Logger logger = LoggerFactory.getLogger(ConnectorScheduler.class);

	private List<Connector> scheduledConnectors = new ArrayList<>();
	private Deque<Connector> executionQueue;
	
	@Activate
	public void activate() {
		// TODO check Bertran's example - sling.ScriptEngineManagerFactory
		while (true) {
			logger.info("Checking new mail.");
			Collections.sort(scheduledConnectors, null); // PROD comparator, introduce class abstract PriorityConnector implements Connector
			executionQueue = new ArrayDeque<>(scheduledConnectors);
			while (!executionQueue.isEmpty()) {
				Connector c = executionQueue.remove();
				int retreived = c.checkNewMessages(RETREIVE_MESSAGES_LIMIT);
				if (retreived == RETREIVE_MESSAGES_LIMIT) {
					executionQueue.add(c);
				}
			}
		}
	}
	
}
