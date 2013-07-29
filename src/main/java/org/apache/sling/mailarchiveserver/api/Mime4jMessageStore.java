package org.apache.sling.mailarchiveserver.api;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.mboxiterator.MboxIterator;

public interface Mime4jMessageStore {
	
	void save(Message m);
	
	void saveAll(MboxIterator iterator);
	
}
