package org.apache.sling.mailarchiveserver.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.dom.Body;
import org.apache.james.mime4j.dom.Entity;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.Multipart;
import org.apache.james.mime4j.dom.SingleBody;
import org.apache.james.mime4j.dom.TextBody;
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
			msgProps.put(resourceTypeKey, MailArchiveServerConstants.RT_MESSAGE);
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
		} catch (LoginException e) {
			throw new RuntimeException("LoginException");
		}
	}

	public void saveAll(Iterator<Message> iterator) throws IOException {
		int mcount = 0;
		while (iterator.hasNext()) {
			Message msg = (Message) iterator.next();

			save(msg);

			mcount++;
			if (mcount % 100 == 0) {
				logger.debug(mcount+" messages processed.");
			}
		}
		logger.info(mcount+" messages processed.");
	}

	private static String getMessageBody(Message msg) throws IOException {
		String msgBody = "";
		Body body = msg.getBody();
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
		} else if (body instanceof Multipart) {
			Multipart mpart = (Multipart) body;
			Entity bodyPart = mpart.getBodyParts().get(0);
			body = bodyPart.getBody();
			if (body instanceof TextBody) {
				TextBody tbody = (TextBody) bodyPart.getBody();
				BufferedReader br = new BufferedReader(tbody.getReader());
				String line = null;
				while ((line = br.readLine()) != null) {
					msgBody += line+"\n";
				}   
				msgBody = msgBody.substring(0, msgBody.length()-1);
			}
		}
		return msgBody;
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
			nodeProps.add(setProperties(MailArchiveServerConstants.RT_DOMAIN, domain));
			nodeProps.add(setProperties(MailArchiveServerConstants.RT_LIST, list));
			for (int i = 0; i < threadNodesNumber-1; i++) {
				nodeProps.add(null);
			}
			nodeProps.add(setProperties(MailArchiveServerConstants.RT_THREAD, threadName));

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
		// PROD change behavior to create or nothing (not to update)
		if (checkResource == null) {
			final Resource newResource = resolver.create(parent, name, newProps);
			resolver.commit();
			if (newProps == null) {
				logger.debug(String.format("Resource created at %s without parameters.", newResource.getPath()));
			} else {
				logger.debug(String.format("Resource created at %s with resource type %s.", newResource.getPath(), newProps.get(resourceTypeKey).toString()));
			}
		} else if (newProps != null && !newProps.isEmpty()) {
			final ModifiableValueMap props = checkResource.adaptTo(ModifiableValueMap.class);
			props.putAll(newProps);
			resolver.commit();
			logger.debug(String.format("Resource updated at %s with resource type %s.", checkResource.getPath(), props.get(resourceTypeKey).toString()));
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
