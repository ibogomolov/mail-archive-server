package org.apache.sling.mailarchiveserver.api;

import java.util.Iterator;

import org.apache.james.mime4j.dom.Message;

public interface Pipeline {

	boolean processNewMasseges(Iterator<Message> iter);

}