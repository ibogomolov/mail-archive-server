package org.apache.sling.mailarchiveserver.exchange;

import java.net.MalformedURLException;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.sling.commons.scheduler.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate=true, metatype=false)
public class NewMailChecker implements Runnable {

	private static final int TIME_INTERVAL_IN_MINS = 1;
	private static final Logger logger = LoggerFactory.getLogger(NewMailChecker .class);

	@Reference
	private Scheduler scheduler;

	@Activate
	public void activate() {
		final NewMailChecker job = new NewMailChecker();
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
		try {
			ExchangeConnector connector = new ExchangeConnector();
			connector.getNewMessages();
		} catch (MalformedURLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
