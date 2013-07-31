package org.apache.sling.mailarchiveserver.api;

import org.apache.james.mime4j.dom.Message;

public interface MessageStore {
	
	void save(Message m);
	
	void saveAll(Iterable<Message> iterable);
	
}
