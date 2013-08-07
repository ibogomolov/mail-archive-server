package org.apache.sling.mailarchiveserver.api;

import java.io.File;
import java.util.Iterator;

import org.apache.james.mime4j.dom.Message;

public interface MboxParser {
	
	Iterator<Message> parse(File f);
	
}
