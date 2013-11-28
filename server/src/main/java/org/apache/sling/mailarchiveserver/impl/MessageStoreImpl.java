package org.apache.sling.mailarchiveserver.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Entity;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.Multipart;
import org.apache.james.mime4j.dom.TextBody;
import org.apache.james.mime4j.message.BodyPart;
import org.apache.james.mime4j.stream.Field;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.mailarchiveserver.api.MessageStore;
import org.apache.sling.mailarchiveserver.api.ThreadKeyGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Service(MessageStore.class)
public class MessageStoreImpl implements MessageStore {

	@Reference
	private	ResourceResolverFactory resourceResolverFactory;
	ResourceResolver resolver = null;
	@Reference
	ThreadKeyGenerator threadKeyGen;

	static final String FIELD_SEPARATOR = " : ";
	private static final String[] RE_PREFIXES = { "re:", "aw:", "fw:", "re ", "aw ", "fw " };
	static final String NO_SUBJECT = "no subject";

	// for testing
	String archivePath = MailArchiveServerConstants.ARCHIVE_PATH;
	String resourceTypeKey = MailArchiveServerConstants.RT_KEY;

	private static final Logger logger = LoggerFactory.getLogger(MessageStoreImpl.class);

	// resourceResolverFactory is unavailable in constructor
	// TODO but should be in activator, move there
	private void resolverInit() throws LoginException {
		if (resolver == null) {
			resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
		}
	}

	public void save(Message msg) throws IOException {
		// into path: archive/[project.]domain/list/thread/message
		try {
			resolverInit();
			final Map<String, Object> msgProps = new HashMap<String, Object>();
			msgProps.put(resourceTypeKey, MailArchiveServerConstants.MESSAGE_RT);
			msgProps.put(MailArchiveServerConstants.BODY_ATTRIBUTE, getMessageBody(msg));
			msgProps.putAll(getMessagePropertiesFromHeader(msg.getHeader()));

			final Header hdr = msg.getHeader();
			final String listIdRaw = hdr.getField("List-Id").getBody();
			final String listId = listIdRaw.substring(1, listIdRaw.length()-1); // remove < and >

			final String list = getListNodeName(listId);
			final String domain = getDomainNodeName(listId);
			final String subject = (String) msgProps.get(MailArchiveServerConstants.SUBJECT_ATTRIBUTE);
			final String threadPath = threadKeyGen.getThreadKey(subject);
			final String threadName = removeRe(subject);

			Resource parentResource = assertEachNode(archivePath,domain,list,threadPath,threadName);

			String msgNode = makeJcrFriendly((String) msgProps.get(MailArchiveServerConstants.NAME_ATTRIBUTE));
			assertResource(parentResource, msgNode, msgProps);
			updateThread(parentResource, msgProps);
		} catch (LoginException e) {
			throw new RuntimeException("LoginException");
		}
	}

	public void saveAll(Iterator<Message> iterator) throws IOException {
		int mcount = 0;
		while (iterator.hasNext()) {
			Message msg = iterator.next();
			save(msg);
			mcount++;
			if (mcount % 100 == 0) {
				logger.debug(mcount+" messages processed.");
			}
		}
		logger.info(mcount+" messages processed.");
	}

	/**
	 *	code taken from http://www.mozgoweb.com/posts/how-to-parse-mime-message-using-mime4j-library/
	 */
	static String getMessageBody(Message msg) throws IOException {
		StringBuffer msgBody = new StringBuffer();
		if (!msg.isMultipart()) {
			msgBody.append(getTextPart(msg));
		} else {
			Multipart multipart = (Multipart) msg.getBody();
			for (Entity enitiy : multipart.getBodyParts()) {
				BodyPart part = (BodyPart) enitiy;
				if (part.isMimeType("text/plain")) {
					msgBody.append(getTextPart(part));
				} else if (part.isMimeType("text/html")) {
					// TODO html body
					//					String html = getTxtPart(part);
					//					htmlBody.append(html);
				} else if (part.getDispositionType() != null && !part.getDispositionType().equals("")) {
					// TODO collect attachments
					//If DispositionType is null or empty, it means that it's multipart, not attached file
					//					attachments.add(part);
					// TODO process attachments
				} else if (part.isMultipart()) {
					// TODO process recursively
					//					parseBodyParts((Multipart) part.getBody());
				}
			}
		}

		return msgBody.toString();
	}

	/**
	 *	code taken from http://www.mozgoweb.com/posts/how-to-parse-mime-message-using-mime4j-library/
	 */
	private static String getTextPart(Entity part) throws IOException {
		TextBody tb = (TextBody) part.getBody();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		tb.writeTo(baos);
		return baos.toString(MailArchiveServerConstants.ENCODER.charset().name());
	}

	private static Map<String, String> getMessagePropertiesFromHeader(Header hdr) {
		Map<String, String> props = new HashMap<String, String>();

		// parse header
		Set<String> processed = new HashSet<String>();
		for (Field f : hdr.getFields()) {
			String name = f.getName();
			if (!processed.contains(name)) {
				processed.add(name);
				String value = "";
				List<Field> fields = hdr.getFields(name);
				for (Field fl : fields) {
					value += fl.getBody()+FIELD_SEPARATOR;
				}
				props.put(name, value.substring(0, value.length()-FIELD_SEPARATOR.length()));
			}
		}

		// message name
		String name;
		if (hdr.getField("Message-ID") != null) {
			name = hdr.getField("Message-ID").getBody();
			name = name.substring(1, name.length()-1); // remove < and >
		} else {
			name = Integer.toHexString(hdr.getField("Date").hashCode());
		}
		props.put(MailArchiveServerConstants.NAME_ATTRIBUTE, name);

		// message subject if null
		if (hdr.getField("Subject") == null) {
			props.put(MailArchiveServerConstants.SUBJECT_ATTRIBUTE, NO_SUBJECT);
		}

		return props;
	}

	static String getListNodeName(String listId) {
		String list = "";
		String[] split = listId.split("\\.");
		int splitL = split.length;
		if (splitL >= 4) {
			for (int i = 0; i < splitL-2; i++) {
				list += split[i] + ".";
			}
			list = list.substring(0, list.length() - 1);
		} else if (splitL == 3) {
			list = split[0];
		} else {
			throw new RuntimeException("List-Id is invalid: minimum 2 separatory dots required.");
		}
		return list;
	}

	static String getDomainNodeName(String listId) {
		String[] split = listId.split("\\.");
		int splitL = split.length;
		if (splitL >= 3) {
			return split[splitL-2] + "." + split[splitL-1];
		} else {
			throw new RuntimeException("List-Id is invalid: minimum 2 separatory dots required.");
		}
	}

	private Resource assertEachNode(String archive, String domain, String list, String threadPath, String threadName) throws PersistenceException, LoginException {
		final String pathToMessage = archive+domain+"/"+list+"/"+threadPath;

		String path = pathToMessage;
		Resource resource = resolver.getResource(path);

		int cnt = 0;
		while (resource == null) {
			cnt++;
			path = path.substring(0, path.lastIndexOf("/"));
			resource = resolver.getResource(path);
		}

		if (cnt > 0) {
			int threadNodesNumber = threadPath.split("/").length;

			// bind paths
			List<String> nodePaths = new ArrayList<String>();
			nodePaths.add(domain);
			nodePaths.add(list);
			for (String node : threadPath.split("/")) {
				nodePaths.add(node);
			}

			// bind props
			List<Map<String, Object>> nodeProps = new ArrayList<Map<String, Object>>();
			nodeProps.add(setProperties(MailArchiveServerConstants.DOMAIN_RT, domain));
			nodeProps.add(setProperties(MailArchiveServerConstants.LIST_RT, list));
			for (int i = 0; i < threadNodesNumber-1; i++) {
				nodeProps.add(null);
			}
			nodeProps.add(setProperties(MailArchiveServerConstants.THREAD_RT, threadName));

			// checking
			for (int i = nodePaths.size()-cnt; i < nodePaths.size(); i++) {
				String name = nodePaths.get(i);
				assertResource(resource, name, nodeProps.get(i));
				resource = resolver.getResource(resource.getPath()+"/"+name);
			}
		}

		resource = resolver.getResource(pathToMessage);
		if (resource == null) {
			throw new RuntimeException("Parent resource cannot be null.");
		} else {
			return resource;
		}

	}

	private Map<String, Object> setProperties(String resourceType, String name) {
		Map<String, Object> props = new HashMap<String, Object>();
		props.put(resourceTypeKey, resourceType);
		props.put(MailArchiveServerConstants.NAME_ATTRIBUTE, name);
		return props;

	}

	private void assertResource(Resource parent, String name, Map<String, Object> newProps) throws LoginException, PersistenceException {
		resolverInit();
		String checkPath = parent.getPath()+"/"+name;
		final Resource checkResource = resolver.getResource(checkPath);
		if (checkResource == null) {
			final Resource newResource = resolver.create(parent, name, newProps);
			resolver.commit();
			if (newProps == null) {
				logger.debug(String.format("Resource created at %s without parameters.", newResource.getPath()));
			} else {
				logger.debug(String.format("Resource created at %s with resource type %s.", newResource.getPath(), newProps.get(resourceTypeKey).toString()));
			}
		} else {
			logger.debug(String.format("Resource at %s already exists.", checkResource.getPath()));
		}
	}

	private void updateThread(Resource thread, Map<String, Object> msgProps) throws PersistenceException {
		final ModifiableValueMap thrdProps = thread.adaptTo(ModifiableValueMap.class);
		Long prop = (Long) thrdProps.get(MailArchiveServerConstants.UPDATED_ATTRIBUTE);
		Date updatedDate = null; 
		if (prop != null) {
			updatedDate = new Date(prop);
		}
		final String msgProp = (String) msgProps.get(MailArchiveServerConstants.DATE_ATTRIBUTE);
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		final Date msgDate = sdf.parse(msgProp, new ParsePosition(0));
		if (updatedDate == null || msgDate.after(updatedDate)) {
			thrdProps.put(MailArchiveServerConstants.UPDATED_ATTRIBUTE, msgDate.getTime());
			resolver.commit();
		} 
	}

	static String makeJcrFriendly(String s) {
		return s.replaceAll("[\\s\\.-]", "_").replaceAll("\\W", "").replaceAll("\\_", " ").trim().replaceAll(" ", "_");
	}

	static String removeRe(String s) {
		s = s.trim();
		boolean flag = true;
		while (flag) {
			flag = false;
			for (String prefix : RE_PREFIXES) {
				if (s.toLowerCase().startsWith(prefix)) {
					s = s.substring(3).trim();
					flag = true;
				}
			}
		}
		return s.trim();
	}

}
