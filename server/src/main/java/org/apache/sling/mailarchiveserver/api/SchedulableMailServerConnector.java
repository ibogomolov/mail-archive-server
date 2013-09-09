package org.apache.sling.mailarchiveserver.api;

public interface SchedulableMailServerConnector extends Runnable {

	void checkNewMessages();
	
	void removeMessages(Iterable<String> ids);
	
}
