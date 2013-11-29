package org.apache.sling.mailarchiveserver.api;

import org.apache.james.mime4j.dom.Message;

public interface MessageProcessor {
	
	void processMessage(Message m);
	
}
