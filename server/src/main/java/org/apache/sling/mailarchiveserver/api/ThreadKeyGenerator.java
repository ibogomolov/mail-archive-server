package org.apache.sling.mailarchiveserver.api;

import org.apache.james.mime4j.dom.Message;

public interface ThreadKeyGenerator {

	String getThreadKey(String subject);

}
