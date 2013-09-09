package org.apache.sling.mailarchiveserver.api;

import org.apache.sling.mailarchiveserver.impl.NewMailData;

public interface Ingestor {

	void addNewMailForProcessing(NewMailData newMail);

	void scheduleConnector(SchedulableMailServerConnector c);
	
	void retireConnector(SchedulableMailServerConnector c);
	
}