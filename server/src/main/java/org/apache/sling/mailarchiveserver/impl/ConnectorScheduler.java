package org.apache.sling.mailarchiveserver.impl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.apache.sling.mailarchiveserver.api.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ConnectorScheduler implements Runnable {

	private static final int RETREIVE_MESSAGES_LIMIT = 10;
	private static final Logger logger = LoggerFactory.getLogger(ConnectorScheduler.class);

	@Reference(
			cardinality=ReferenceCardinality.OPTIONAL_MULTIPLE, 
			policy=ReferencePolicy.DYNAMIC,
			referenceInterface=Connector.class)
	private List<Connector> scheduledConnectors = new ArrayList<>();
	private Deque<Connector> executionQueue;

	// TODO change?
	@Activate
	public void activate() throws InterruptedException {
//		new Thread(this).start(); // PROD uncomment
	}

	@Override
	public void run() {
		while (true) {
			logger.info("Checking new mail.");
			Collections.sort(scheduledConnectors, null); // PROD comparator, introduce class abstract PriorityConnector implements Connector
			executionQueue = new ArrayDeque<>(scheduledConnectors);
			while (!executionQueue.isEmpty()) {
				Connector c = executionQueue.remove();
				int retreived = c.checkNewMessages(RETREIVE_MESSAGES_LIMIT);
				logger.info("Retrieved {} messages.", retreived);
			}
			try {
				TimeUnit.SECONDS.sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}

	public synchronized void bindConnector(Connector c) {
		scheduledConnectors.add(c);
	}

	public synchronized void unbindConnector(Connector c) {
		scheduledConnectors.remove(c);
	}

}
