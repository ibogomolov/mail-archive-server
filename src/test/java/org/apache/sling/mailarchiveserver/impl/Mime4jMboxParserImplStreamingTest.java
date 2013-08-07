package org.apache.sling.mailarchiveserver.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * In this class there is only 1 test that parses a big file. I will take to execute it a while.
 */
public class Mime4jMboxParserImplStreamingTest {

	private Mime4jMboxParserImpl parser = new Mime4jMboxParserImpl();

	private static final String TEST_FILES_FOLDER = Mime4jMboxParserImplTest.TEST_FILES_FOLDER;
	private static final double TEST_FILE_RATIO = 2.0;

	@Test
	public void testParseIsStreaming() throws IOException {
		File tempf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File fileToSample = new File(TEST_FILES_FOLDER + "mbox/tomcat-dev-201204.mbox");
			long maxMem = Runtime.getRuntime().maxMemory();
			int cnt = (int) (maxMem * TEST_FILE_RATIO / fileToSample.length()) + 1;

			fis = new FileInputStream(fileToSample);
			byte[] sample = new byte[(int) fileToSample.length()];
			if (fis.read(sample) != fileToSample.length()) 
				throw new RuntimeException();

			tempf = File.createTempFile("MAS_", ".mbox");
			fos = new FileOutputStream(tempf);
			for (int i = 0; i < cnt; i++) {
				fos.write(sample);
			}
			fos.flush();
			fos.close();
			fos = null;
			
			parser.parse(tempf);
		} finally {
			if (tempf != null) {
				tempf.delete();
			}
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

}
