package org.apache.sling.mailarchiveserver.impl;

import static java.lang.Character.isLetter;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.makeJcrFriendly;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.removeRe;

import java.util.Random;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Message;
import org.apache.sling.mailarchiveserver.api.ThreadKeyGenerator;

@Component
@Service(ThreadKeyGenerator.class)
public class ThreadKeyGeneratorImpl implements ThreadKeyGenerator {

	/**
	 * These constants are gotten by sampling around 1500 messages 
	 * from some open source projects using SubjectLettersEntropy class.
	 * 
	 * Entropy of each letter position of the subject was calculated. And two letter positions 
	 * with biggest entropy and occurrence in at least 90% of the messages were chosen.
	 * 
	 * In order to {@link #getThreadKey(Message)} works correctly, following invariant should hold: LETTER_POS_WITH_BIGGEST_ENTROPY < LETTER_POS_WITH_2ND_BIGGEST_ENTROPY
	 */
	private static final int LETTER_POS_WITH_BIGGEST_ENTROPY = 9;
	private static final int LETTER_POS_WITH_2ND_BIGGEST_ENTROPY = 40;

	public String getThreadKey(String subject) {
		subject = removeRe(subject);
		char prefix1;
		char prefix2;
		try {
			prefix1 = assignPrefix(subject, LETTER_POS_WITH_BIGGEST_ENTROPY);
			prefix2 = assignPrefix(subject, LETTER_POS_WITH_2ND_BIGGEST_ENTROPY);
		} catch (IllegalArgumentException e) {
			Random rand = new Random();
			prefix1 = (char) (rand.nextInt(26) + 'A'); 
			prefix2 = (char) (rand.nextInt(26) + 'a'); 
		}
		return ""+prefix1+"/"+prefix1+prefix2+"/"+ makeJcrFriendly(subject);
	}

	private static char assignPrefix(String subject, int length) {
		char prefix;
		if (subject.length() > length) {

			int i = length;
			while (i > -1 && !isLetter(subject.charAt(i))) 
				i--;
			if (i > -1) 
				prefix = subject.charAt(i);
			else {
				i = length;
				while (i<subject.length() && !isLetter(subject.charAt(i))) 
					i++;
				if (i<subject.length()) 
					prefix = subject.charAt(i);
				else 
					throw new IllegalArgumentException();
			}

		} else {

			int i = subject.length()-1;
			while (i > -1 && !isLetter(subject.charAt(i))) 
				i--;
			if (i > -1) 
				prefix = subject.charAt(i);
			else 
				throw new IllegalArgumentException();

		}

		return prefix;
	}

}
