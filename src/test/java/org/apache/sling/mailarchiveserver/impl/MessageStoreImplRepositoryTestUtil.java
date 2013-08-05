package org.apache.sling.mailarchiveserver.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
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
		Header hdr = msg.getHeader();
		String listId = hdr.getField("List-Id").getBody();
		listId = listId.substring(1, listId.length()-1);
		String[] split = listId.split("\\.", 3);
		String list = split[0];
		String project = split[1];
		String domain = split[2];
		String msgId;
		if (hdr.getField("Message-ID") != null) {
			msgId = hdr.getField("Message-ID").getBody();
			msgId = msgId.substring(1, msgId.length()-1);
		} else {
			msgId = Integer.toHexString(hdr.getField("Date").hashCode());
		}
		msgId = MessageStoreImpl.makeJcrFriendly(msgId);
		String threadPath = store.threadKeyGen.getThreadKey(msg);
		String path = store.archivePath+domain+"/"+project+"/"+list+"/"+threadPath+"/"+msgId;
		return path;
	}

}
