package org.apache.sling.mailarchiveserver.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Message;
import org.apache.sling.commons.scheduler.Scheduler;
import org.apache.sling.mailarchiveserver.api.Ingestor;
import org.apache.sling.mailarchiveserver.api.MessageStore;
import org.apache.sling.mailarchiveserver.api.SchedulableMailServerConnector;

@Component
@Service(value=Ingestor.class)
public class ImportIngestor implements Ingestor {

	@Reference
	private MessageStore store;
	@Reference
	private Scheduler scheduler;
	
	private Queue<NewMailData> queue = new PriorityQueue<>();
	private List<SchedulableMailServerConnector> scheduledConnectors = new ArrayList<>();

	@Activate
	public void activate() {
		// TODO Auto-generated method stub
		
		// get NewMailData from the queue
		// process newMessages
		// rescheduling: make decisions when to execute connector next time
		// go to next NewMailData
		
		// infinite loop here through previous operations
	}
	
	
	@Override
	public void addNewMailForProcessing(NewMailData newMail) {
		// TODO Auto-generated method stub
		
	}
	
	private void processNewMail(Iterable<Message> messages) {
		// TODO Auto-generated method stub

	}
	
	private void reschedule(SchedulableMailServerConnector connector) {
		// TODO Auto-generated method stub

	}


	@Override
	public void scheduleConnector(SchedulableMailServerConnector c) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void retireConnector(SchedulableMailServerConnector c) {
		// TODO Auto-generated method stub
		
	}

}
