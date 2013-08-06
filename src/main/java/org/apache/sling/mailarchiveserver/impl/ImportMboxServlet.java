package org.apache.sling.mailarchiveserver.impl;

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
import org.apache.sling.mailarchiveserver.api.MboxParser;
import org.apache.sling.mailarchiveserver.api.MessageStore;
import org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.SlingConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@SlingServlet(
		resourceTypes = "mailarchiveserver/import",
		methods = {"POST", "PUT"})
public class ImportMboxServlet extends SlingAllMethodsServlet {

	static final CharsetEncoder ENCODER = Charset.forName("UTF-8").newEncoder();
	static final Logger logger = LoggerFactory.getLogger(ImportMboxServlet.class);

	private static final String IMPORT_FILE_ATTRIB_NAME = "mboxfile";
	private final int BUFFER_SIZE = 10*1024*1024;

	@Reference
	private MboxParser parser;
	@Reference
	private MessageStore store;

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) 
			throws ServletException, IOException {
		File file = null;
		try {
			RequestParameter param = request.getRequestParameter(IMPORT_FILE_ATTRIB_NAME);
			if (param != null) {
				logger.info("Processing attachment: " + param.toString());

				// put attachment to temp file
				file = File.createTempFile("MAS_", ".mbox");
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

				store.saveAll(parser.parse(file));

				response.sendRedirect(SlingConstants.ARCHIVE_PATH + ".html");
			} else {
				logger.info("No attachment to process.");
			}
		} finally {
			if (file != null) {
				file.delete();
				file = null;
			}
		}
	}

}
