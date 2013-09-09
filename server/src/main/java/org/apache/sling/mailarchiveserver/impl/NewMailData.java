package org.apache.sling.mailarchiveserver.impl;

import org.apache.james.mime4j.dom.Message;
import org.apache.sling.mailarchiveserver.api.SchedulableMailServerConnector;

public class NewMailData {

	SchedulableMailServerConnector connector;
	
	Iterable<Message> newMessages;
	
	// TODO
}
