package org.apache.sling.mailarchiveserver.impl;

public class MailArchiveServerConstants {
	
	static final String ARCHIVE_PATH = "/content/mailarchiveserver/archive/";
	static final String NAME_ATTRIBUTE = "jcr:text";
	static final String BODY_ATTRIBUTE = "Body";
	static final String SUBJECT_ATTRIBUTE = "Subject";
	static final String PROJECT_ATTRIBUTE = "hasProject";

	//RT = ResourceType
	static final String RT_KEY = "sling:resourceType";
	static final String RT_DOMAIN = "mailarchiveserver/domain";
	static final String RT_LIST = "mailarchiveserver/list";
	static final String RT_THREAD = "mailarchiveserver/thread";
	static final String RT_MESSAGE = "mailarchiveserver/message";

}
