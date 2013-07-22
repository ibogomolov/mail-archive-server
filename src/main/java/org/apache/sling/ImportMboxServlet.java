package org.apache.sling;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@SlingServlet(
		resourceTypes = "mailarchiveserver/import",
		methods = "POST")
public class ImportMboxServlet extends SlingAllMethodsServlet {

	public static final String FS_TEMP_PATH = "temp";
	public static final String IMPORT_FILE_ATTRIB_NAME = "mboxfile";
	public static final CharsetEncoder ENCODER = Charset.forName("UTF-8").newEncoder();

	private static final String ROOT_NODE_NAME = "mailarchiveserver";
	private static final String ROOT_JCR_PATH = "/content/"+ROOT_NODE_NAME;
	private static final String ARCHIVE_NODE_NAME = "archive";
	private static final String ARCHIVE_PATH = ROOT_JCR_PATH+"/"+ARCHIVE_NODE_NAME;
	private static final String IMPORT_NODE_NAME = "import";
	@Reference
	private ResourceResolverFactory resourceResolverFactory;
	private ResourceResolver resolver;
	private static final Logger logger = LoggerFactory.getLogger(ImportMboxServlet.class);
	private static final String TEXT_ATTRIBUTE = "jcr:text";


	private ResourceResolver resolverInit() {
		try {
			return resourceResolverFactory.getAdministrativeResourceResolver(null);
		} catch (LoginException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void init() throws ServletException {
		File tempDir = new File(FS_TEMP_PATH);
		if (tempDir.exists()) {
			for (String filePath : tempDir.list())
				new File(FS_TEMP_PATH,filePath).delete();
		} else {
			tempDir.mkdir();
		}

		resolver = resolverInit();

		/*
		// set ROOT_NODE's sling:resourceType
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("sling:resourceType", SlingResourceType.ROOT);
		assertResourceWithLogging(resolver.getResource("/content"), ROOT_NODE_NAME, props);

		// set ARCHIVE_NODE's sling:resourceType
		props.clear();
		props.put("sling:resourceType", SlingResourceType.ARCHIVE);
		assertResourceWithLogging(resolver.getResource(ROOT_JCR_PATH), ARCHIVE_NODE_NAME, props);

		// set IMPORT_NODE's sling:resourceType
		props.clear();
		props.put("sling:resourceType", SlingResourceType.IMPORTT);
		assertResourceWithLogging(resolver.getResource(ROOT_JCR_PATH), IMPORT_NODE_NAME, props);
		 */

		super.init();
	}

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) 
			throws ServletException, IOException {

		try {
			RequestParameter param = request.getRequestParameter(IMPORT_FILE_ATTRIB_NAME);
			logger.info("Processing attachment: " + param.toString());

			// put attachment to temp file
			String fileName = param.getFileName();
			File file = new File(FS_TEMP_PATH,fileName);
			FileOutputStream fout = new FileOutputStream(file);
			FileChannel fileChannel = fout.getChannel();
			ByteBuffer buf2 = ENCODER.encode(CharBuffer.wrap(param.getString()));
			fileChannel.write(buf2);
			fileChannel.close();
			fout.close();

			MessageBuilder builder = new DefaultMessageBuilder();
			Map<String, Object> msgMap = new HashMap<String, Object>();
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

			for (CharBufferWrapper messageCharBuffer : MboxIterator.fromFile(file).charset(ENCODER.charset()).build()) {
				Message msg = builder.parseMessage(messageCharBuffer.asInputStream(ENCODER.charset()));
				String msgBody = "";

				Body body = msg.getBody();
				//TODO add multipart types of body
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
				msgMap.put(SlingResourceType.KEY, SlingResourceType.MESSAGE);
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
				String threadName = thread;
				thread = makeJcrPathFriendly(thread);
				
				String path = ARCHIVE_PATH+"/"+domain+"/"+project+"/"+list+"/"+thread;
				Resource parent = resolver.getResource(path);

				if (parent == null) {
					int cnt = 0;
					do {
						cnt++;
						path = path.substring(0, path.lastIndexOf("/"));
						parent = resolver.getResource(path);
					} while (parent == null);
					
					List<String> nodeNames = new ArrayList<String>();
					nodeNames.add(domain);
					nodeNames.add(project);
					nodeNames.add(list);
					nodeNames.add(thread);

					List<Map<String, Object>> nodeProps = new ArrayList<Map<String, Object>>();
					
					//domain
					Map<String, Object> props = new HashMap<String, Object>();
					props.put(SlingResourceType.KEY, SlingResourceType.DOMAIN);
					props.put(TEXT_ATTRIBUTE, domain);
					nodeProps.add(props);
					
					//project
					props = new HashMap<String, Object>();
					props.put(SlingResourceType.KEY, SlingResourceType.PROJECT);
					props.put(TEXT_ATTRIBUTE, project);
					nodeProps.add(props);
					
					//list
					props = new HashMap<String, Object>();
					props.put(SlingResourceType.KEY, SlingResourceType.LIST);
					props.put(TEXT_ATTRIBUTE, list);
					nodeProps.add(props);
					
					//thread
					props = new HashMap<String, Object>();
					props.put(SlingResourceType.KEY, SlingResourceType.THREAD);
					props.put(TEXT_ATTRIBUTE, threadName);
					nodeProps.add(props);

					for (int i = nodeNames.size()-cnt; i < nodeNames.size(); i++) {
						String name = nodeNames.get(i);
						assertResourceWithLogging(parent, name, nodeProps.get(i));
						parent = resolver.getResource(parent.getPath()+"/"+name);
					}
				} 

				if (parent == null) throw new RuntimeException("Parent resource cannot be null.");

				assertResourceWithLogging(parent, msgId, msgMap);
			}

		} catch (MimeException e) {
			e.printStackTrace();
		}

	}

	void assertResourceWithLogging(Resource parent, String name, Map<String, Object> newProps) {
		try {
			String checkPath = parent.getPath()+"/"+name;
			final Resource checkResource = resolver.getResource(checkPath);
			if (checkResource == null) {
				final Resource newResource = resolver.create(parent, name, newProps);
				resolver.commit();
				if (newProps == null) {
					logger.info(String.format("Resource created at %s without parameters.", newResource.getPath()));
				} else {
					logger.info(String.format("Resource created at %s with resource type %s.", newResource.getPath(), newProps.get(SlingResourceType.KEY).toString()));
				}
			} else if (newProps != null && !newProps.isEmpty()) {
				final ModifiableValueMap props = checkResource.adaptTo(ModifiableValueMap.class);
				props.putAll(newProps);
				resolver.commit();
				logger.info(String.format("Resource updated at %s with resource type %s.", checkResource.getPath(), props.get(SlingResourceType.KEY).toString()));
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

	private String makeJcrPathFriendly(String s) {
		return s.trim().replaceAll("[\\s\\.-]", "_").replaceAll("\\W", "");
	}

	public static class SlingResourceType {
		public static final String KEY = "sling:resourceType";
		public static final String ROOT = "mailarchiveserver/root";
		public static final String IMPORTT = "mailarchiveserver/import";
		public static final String ARCHIVE = "mailarchiveserver/archive";

		public static final String DOMAIN = "mailarchiveserver/domain";
		public static final String PROJECT = "mailarchiveserver/project";
		public static final String LIST = "mailarchiveserver/list";
		public static final String THREAD = "mailarchiveserver/thread";
		public static final String MESSAGE = "mailarchiveserver/message";
	}

}
