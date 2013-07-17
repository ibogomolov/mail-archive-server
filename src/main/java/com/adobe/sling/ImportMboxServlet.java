package com.adobe.sling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TimeZone;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.dom.Body;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.MessageBuilder;
import org.apache.james.mime4j.dom.SingleBody;
import org.apache.james.mime4j.dom.TextBody;
import org.apache.james.mime4j.mboxiterator.CharBufferWrapper;
import org.apache.james.mime4j.mboxiterator.MboxIterator;
import org.apache.james.mime4j.message.DefaultMessageBuilder;
import org.apache.james.mime4j.stream.Field;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@SlingServlet(
		paths = "/content/mailarchiveserver/import",
		methods = "POST")
public class ImportMboxServlet extends SlingAllMethodsServlet {

	public static final String TEMP_PATH = "temp";
	public static final String FORM_INPUT_ATTRIB_NAME = "mboxfile";
	public static final CharsetEncoder ENCODER = Charset.forName("UTF-8").newEncoder();

	private static final String ROOT_PATH_JCR = "/content/mailarchiveserver";
	private static final String ARCHIVE_NODE = "archive";
	@Reference
	private ResourceResolverFactory resourceResolverFactory;
	private static final Logger logger = LoggerFactory.getLogger(ImportMboxServlet.class);


	@Override
	public void init() throws ServletException {
		File tempDir = new File(TEMP_PATH);
		if (tempDir.exists()) {
			for (String filePath : tempDir.list())
				new File(TEMP_PATH,filePath).delete();
		} else {
			tempDir.mkdir();
		}
		super.init();
	}

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) 
			throws ServletException, IOException {

		try {
			RequestParameter param = request.getRequestParameter(FORM_INPUT_ATTRIB_NAME);
			logger.info("Processing attachment: " + param.toString());

			// put attachment to temp file
			// TODO change this
			String fileName = param.getFileName();
			File file = new File(TEMP_PATH,fileName);
			FileOutputStream fout = new FileOutputStream(file);
			FileChannel fileChannel = fout.getChannel();
			ByteBuffer buf2 = ENCODER.encode(CharBuffer.wrap(param.getString()));
			fileChannel.write(buf2);
			fileChannel.close();
			fout.close();

			ResourceResolver resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
			MessageBuilder builder = new DefaultMessageBuilder();
			Map<String, Object> msgMap = new HashMap<String, Object>();
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

			for (CharBufferWrapper messageCharBuffer : MboxIterator.fromFile(file).charset(ENCODER.charset()).build()) {
				Message msg = builder.parseMessage(messageCharBuffer.asInputStream(ENCODER.charset()));
				String msgBody = "";

				Body body = msg.getBody();
				//TODO ! multipart types of body
				if (body instanceof SingleBody) {
					if (body instanceof TextBody) {
						TextBody tbody = (TextBody) body;
						BufferedReader br = new BufferedReader(tbody.getReader());
						String line = null;
						while ((line = br.readLine()) != null) {
							msgBody += line+"\n";
						}   
						msgBody = msgBody.substring(0, msgBody.length()-1);
					}
				}

				msgMap.clear();
				msgMap.put("Body", msgBody);

				Header hdr = msg.getHeader();
				Set<String> processed = new HashSet<String>();
				for (Field f : hdr.getFields()) {
					String name = f.getName();
					if (!processed.contains(name)) {
						processed.add(name);
						String value = "";
						List<Field> fields = hdr.getFields(name);
						for (Field fl : fields) {
							value += fl.getBody()+",";
						}
						msgMap.put(name, value.substring(0, value.length()-1));
					}
				}				

				String listId = hdr.getField("List-Id").getBody();
				listId = listId.substring(1, listId.length()-1);
				String[] split = listId.split("\\.", 3);
				String list = split[0];
				String project = split[1];
				String domain = split[2];
				String msgId = hdr.getField("Message-ID").getBody();
				msgId = msgId.substring(1, msgId.length()-1);
				msgId = makeJcrPathFriendly(msgId);
				String thread = hdr.getField("Subject").getBody();
				boolean done = false;
				while (!done) {
					if (thread.toLowerCase().startsWith("re:")) {
						thread = thread.substring(3).trim();
						continue;
					}
					done = true;
				}
				thread = makeJcrPathFriendly(thread);
				String path = ROOT_PATH_JCR+"/"+ARCHIVE_NODE+"/"+domain+"/"+project+"/"+list+"/"+thread;
				Resource parent = resolver.getResource(path);
				
				if (parent == null) {
					Queue<String> queue = new LinkedList<String>();
					queue.add(ARCHIVE_NODE);
					queue.add(domain);
					queue.add(project);
					queue.add(list);
					queue.add(thread);
					String checkPath = ROOT_PATH_JCR;
					Resource checkParent = resolver.getResource(checkPath);
					while (queue.peek() != null) {
						String name = queue.poll();
						checkPath += "/"+name;
						if (resolver.getResource(checkPath) == null) {
							Resource r = resolver.create(checkParent, name, null);
							logger.info(String.format("Resource at %s created.", r.getPath()));
						}
						checkParent = resolver.getResource(checkPath);
					}
				} 
				
				parent = resolver.getResource(path);
				if (parent == null) throw new RuntimeException("Parent resource cannot be null.");
				
				// TODO overwrite id exists (use case: several imports)
				Resource r = resolver.create(parent, msgId, msgMap);
				resolver.commit();
				logger.info(String.format("Resource at %s created.", r.getPath()));
			}


		} catch (MimeException e) {
			e.printStackTrace();
		} catch (LoginException e) {
			e.printStackTrace();
		}

	}
	
	private String makeJcrPathFriendly(String s) {
		return s.trim().replaceAll("[\\s\\.-]", "_").replaceAll("\\W", "");
	}

}
