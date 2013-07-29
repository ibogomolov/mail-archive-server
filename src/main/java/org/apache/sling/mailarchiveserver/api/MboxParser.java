package org.apache.sling.mailarchiveserver.api;

import java.io.File;

import org.apache.james.mime4j.mboxiterator.MboxIterator;

public interface MboxParser {
	
	MboxIterator parse(File f);
	
}
