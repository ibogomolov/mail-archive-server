package org.apache.sling.mailarchiveserver;

import static org.apache.sling.mailarchiveserver.Mime4jMessageStoreImpl.makeJcrFriendly;
import static org.apache.sling.mailarchiveserver.Mime4jMessageStoreImpl.removeRe;

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
		String subject = hdr.getField("Subject").getBody();

		char prefix1;
		char prefix2;

		if (subject.length() > 40) {
			int i = 40;
			while (!Character.isLetter(subject.charAt(i))) 
				i--;
			prefix1 = subject.charAt(i);

			i = 9;
			while (!Character.isLetter(subject.charAt(i))) 
				i--;
			prefix2 = subject.charAt(i);
		} else if (subject.length() > 9) {
			int i = 9;
			while (!Character.isLetter(subject.charAt(i))) 
				i--;
			prefix1 = subject.charAt(i);

			i--;
			while (!Character.isLetter(subject.charAt(i))) 
				i--;
			prefix2 = subject.charAt(i);
		} else {
			int i = subject.length();
			while (!Character.isLetter(subject.charAt(i))) 
				i--;
			prefix1 = subject.charAt(i);

			i--;
			while (!Character.isLetter(subject.charAt(i))) 
				i--;
			prefix2 = subject.charAt(i);
		}
		return ""+prefix1+"/"+prefix1+prefix2+"/"+ makeJcrFriendly(removeRe(subject));
	}

}
