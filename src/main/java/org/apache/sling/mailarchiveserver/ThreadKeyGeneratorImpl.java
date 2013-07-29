package org.apache.sling.mailarchiveserver;

import static org.apache.sling.mailarchiveserver.Mime4jMessageStoreImpl.makeJcrFriendly;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.sling.mailarchiveserver.api.ThreadKeyGenerator;

@Component
@Service(ThreadKeyGenerator.class)
public class ThreadKeyGeneratorImpl implements ThreadKeyGenerator {
	
	public String getThreadKey(Message m) {
		Header hdr = m.getHeader();
		String thread = hdr.getField("Subject").getBody();
		boolean done = false;
		while (!done) {
			if (thread.toLowerCase().startsWith("re:")) {
				thread = thread.substring(3).trim();
				continue;
			}
			done = true;
		}
		thread = makeJcrFriendly(thread);

		char prefix1;
		char prefix2;

		if (thread.length() > 40) {
			int i = 40;
			while (!Character.isLetter(thread.charAt(i))) 
				i--;
			prefix1 = thread.charAt(i);

			i = 9;
			while (!Character.isLetter(thread.charAt(i))) 
				i--;
			prefix2 = thread.charAt(i);
		} else if (thread.length() > 9) {
			int i = 9;
			while (!Character.isLetter(thread.charAt(i))) 
				i--;
			prefix1 = thread.charAt(i);
			
			i--;
			while (!Character.isLetter(thread.charAt(i))) 
				i--;
			prefix2 = thread.charAt(i);
		} else {
			int i = thread.length();
			while (!Character.isLetter(thread.charAt(i))) 
				i--;
			prefix1 = thread.charAt(i);
			
			i--;
			while (!Character.isLetter(thread.charAt(i))) 
				i--;
			prefix2 = thread.charAt(i);
		}
		return ""+prefix1+"/"+prefix1+prefix2+"/"+thread;
	}

}
