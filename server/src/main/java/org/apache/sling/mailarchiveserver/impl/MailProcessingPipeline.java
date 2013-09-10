package org.apache.sling.mailarchiveserver.impl;

import java.io.IOException;
import java.util.Iterator;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Message;
import org.apache.sling.mailarchiveserver.api.MessageStore;
import org.apache.sling.mailarchiveserver.api.Pipeline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Service(value=Pipeline.class)
public class MailProcessingPipeline implements Pipeline {

	private static final Logger logger = LoggerFactory.getLogger(MailProcessingPipeline.class);

	@Reference
	private MessageStore store;
	
	@Override
	public boolean processNewMasseges(Iterator<Message> iter) {
		// TODO extend to one email sent to several mailing lists
		while (iter.hasNext()) {
			try {
				store.save(iter.next());
			} catch (IOException e) {
				logger.info("Error in processing new messages : " + e.getMessage());
				return false;
			}
		}
		return true;
	}
	
}
