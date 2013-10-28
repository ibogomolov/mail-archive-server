package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.NO_SUBJECT;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.getDomainNodeName;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.getListNodeName;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.makeJcrFriendly;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.stream.Field;
import org.apache.sling.api.resource.ValueMap;

public class MessageStoreImplRepositoryTestUtil {

	/**
	 * Code is taken from http://svn.apache.org/repos/asf/sling/trunk/launchpad/test-services/src/main/java/org/apache/sling/launchpad/testservices/serversidetests/WriteableResourcesTest.java
	 */
	static void assertValueMap(ValueMap m, String ... keyValue) {
		assertNotNull("Expecting non-null ValueMap", m);
		for(int i=0 ; i< keyValue.length; i+=2) {
			final String key = keyValue[i];
			final String value = keyValue[i+1];
			assertEquals("Expecting " + key + "=" + value, value, m.get(key, String.class));
		}
	}

	static String readTextFile(File bodyFile) throws FileNotFoundException {
		Scanner sc = null;
		try {
			sc = new Scanner(bodyFile);
			String expectedBody = ""; 
			while (sc.hasNextLine()) {
				expectedBody += sc.nextLine() + "\n";
			}
			expectedBody = expectedBody.substring(0, expectedBody.length()-1);
			return expectedBody;
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

	static String specialPathFromFilePath(String fpath, String suffix) {
		int dotIdx = fpath.lastIndexOf(".");
		String bodyPath = fpath.substring(0, dotIdx) + suffix + fpath.substring(dotIdx); 
		return bodyPath;
	}

	static String getResourcePath(Message msg, MessageStoreImpl store) {
		final Header hdr = msg.getHeader();
		final String listIdRaw = hdr.getField("List-Id").getBody();
		final String listId = listIdRaw.substring(1, listIdRaw.length()-1); // remove < and >

		String msgId;
		final Field msgIdField = hdr.getField("Message-ID");
		if (msgIdField != null) {
			msgId = msgIdField.getBody();
			msgId = msgId.substring(1, msgId.length()-1);
		} else {
			msgId = Integer.toHexString(hdr.getField("Date").hashCode());
		}
		msgId = makeJcrFriendly(msgId);
		
		String subject;
		final Field subjectField = hdr.getField("Subject");
		if (subjectField == null) {
			subject = NO_SUBJECT;
		} else {
			subject = subjectField.getBody();
		}
		
		String threadPath = store.threadKeyGen.getThreadKey(subject);
		String path = store.archivePath + getDomainNodeName(listId) + "/" + getListNodeName(listId) +
				"/" + threadPath + "/" + msgId;
		return path;
	}

}
