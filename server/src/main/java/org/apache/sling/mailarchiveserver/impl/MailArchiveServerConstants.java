package org.apache.sling.mailarchiveserver.impl;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class MailArchiveServerConstants {
	
	static final String ARCHIVE_PATH = "/content/mailarchiveserver/archive/";
	
	static final String NAME_ATTRIBUTE = "jcr:text";
	static final String DATE_ATTRIBUTE = "Date";
	static final String BODY_ATTRIBUTE = "Body";
	static final String SUBJECT_ATTRIBUTE = "Subject";
	static final String UPDATED_ATTRIBUTE = "lastUpdate";

	//RT = ResourceType
	static final String RT_KEY = "sling:resourceType";
	static final String DOMAIN_RT = "mailarchiveserver/domain";
	static final String LIST_RT = "mailarchiveserver/list";
	static final String THREAD_RT = "mailarchiveserver/thread";
	static final String MESSAGE_RT = "mailarchiveserver/message";

	public static final CharsetEncoder ENCODER = Charset.forName("UTF-8").newEncoder();

}
