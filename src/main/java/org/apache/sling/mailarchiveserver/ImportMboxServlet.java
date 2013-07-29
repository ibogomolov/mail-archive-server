package org.apache.sling.mailarchiveserver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.mailarchiveserver.Mime4jMessageStoreImpl.SlingConstants;
import org.apache.sling.mailarchiveserver.api.MboxParser;
import org.apache.sling.mailarchiveserver.api.Mime4jMessageStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@SlingServlet(
		resourceTypes = "mailarchiveserver/import",
		methods = {"POST", "PUT"})
public class ImportMboxServlet extends SlingAllMethodsServlet {

	static final CharsetEncoder ENCODER = Charset.forName("UTF-8").newEncoder();
	
	private static final String FS_TEMP_PATH = "temp";
	private static final String IMPORT_FILE_ATTRIB_NAME = "mboxfile";
	private final int BUFFER_SIZE = 10*1024*1024;
	private static final Logger logger = LoggerFactory.getLogger(ImportMboxServlet.class);

	@Reference
	private MboxParser parser;
	@Reference
	private Mime4jMessageStore store;

	
	
	@Override
	public void init() throws ServletException {
		File tempDir = new File(FS_TEMP_PATH);
		if (tempDir.exists()) {
			for (String filePath : tempDir.list())
				new File(FS_TEMP_PATH,filePath).delete();
		} else {
			tempDir.mkdir();
		}

		super.init();
	}

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) 
			throws ServletException, IOException {

		RequestParameter param = request.getRequestParameter(IMPORT_FILE_ATTRIB_NAME);
		logger.info("Processing attachment: " + param.toString());

		// put attachment to temp file
		String fileName = param.getFileName();
		File file = new File(FS_TEMP_PATH,fileName);
		FileOutputStream fileOut = new FileOutputStream(file);
		FileChannel fileChannel = fileOut.getChannel();
		InputStream mboxIn = param.getInputStream();
		byte[] buffer = new byte[BUFFER_SIZE];
		int read = 0;
		while ((read = mboxIn.read(buffer)) != -1) {
			ByteBuffer buf2 = ENCODER.encode(CharBuffer.wrap(new String(buffer, 0, read)));
			fileChannel.write(buf2);
		}
		fileChannel.close();
		fileOut.close();
		mboxIn.close();

		// TODO null checks
		store.saveAll(parser.parse(file));

		response.sendRedirect(SlingConstants.ARCHIVE_PATH + ".html");
	}
}
