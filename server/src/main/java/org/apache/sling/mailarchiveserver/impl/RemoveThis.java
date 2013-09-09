package org.apache.sling.mailarchiveserver.impl;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.sling.commons.scheduler.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO move logic to ImportIngestor and remove
@Component(immediate=true, metatype=false)
public class RemoveThis implements Runnable {

	private static final int TIME_INTERVAL_IN_MINS = 1;
	private static final Logger logger = LoggerFactory.getLogger(RemoveThis.class);

	@Reference
	private Scheduler scheduler;

	@Activate
	public void activate() {
		final RemoveThis job = new RemoveThis();
		long period = (60 * TIME_INTERVAL_IN_MINS);
		try {
			scheduler.addPeriodicJob("New mail checker", job, null, period, false, true);
		} catch (Exception e) {
			job.run();
		}
	}

	@Override
	public void run() {
		logger.info("Checking new mail.");
//		SchedulableMailServerConnector connector = new ExchangeConnector();
//		connector.checkNewMessages();
	}

}
