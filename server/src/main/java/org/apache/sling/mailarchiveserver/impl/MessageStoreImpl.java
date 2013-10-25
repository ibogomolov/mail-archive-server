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
		try {
			resolverInit();
			Map<String, Object> msgProps = new HashMap<String, Object>();
			msgProps.put(resourceTypeKey, MailArchiveServerConstants.RT_MESSAGE);
			msgProps.put(MailArchiveServerConstants.BODY_ATTRIBUTE, getMessageBody(msg));
			msgProps.putAll(getMessagePropertiesFromHeader(msg.getHeader()));

			// TODO path should be archivePath/[project.]domain/list/threadPath/message
			//									   archive/sling.apache.org/dev/...
			//									   archive/adobe.com/dev/...

			// message JCR path

			// list node name
			Header hdr = msg.getHeader();
			String listId = hdr.getField("List-Id").getBody();
			listId = listId.substring(1, listId.length()-1); // remove < and >
			String[] split = listId.split("\\.");
			int splitL = split.length;
			String list = "";
			if (splitL >= 4) {
				for (int i = 0; i < splitL-3; i++) {
					list += split[i] + ".";
				}
				list = list.substring(0, list.length() - 1);
			} else if (splitL == 3) {
				list = split[0];
			} else {
				throw new RuntimeException("List-Id is invalid: minimum 2 separatory dots required.");
			}

			// domain node name
			String domain = split[splitL-2] + "." + split[splitL-1];

			String threadPath = threadKeyGen.getThreadKey((String) msgProps.get(MailArchiveServerConstants.SUBJECT_ATTRIBUTE));
			int threadNodesNumber = threadPath.split("/").length;

			// checking each node of path
			String path = archivePath+domain+"/"+list+"/"+threadPath;
			Resource parent = resolver.getResource(path);

			if (parent == null) {
				int cnt = 0;
				do {
					cnt++;
					path = path.substring(0, path.lastIndexOf("/"));
					parent = resolver.getResource(path);
				} while (parent == null);

				List<String> nodePaths = new ArrayList<String>();
				nodePaths.add(domain);
				nodePaths.add(list);
				for (String node : threadPath.split("/")) {
					nodePaths.add(node);
				}

				String threadName = removeRe((String) msgProps.get(MailArchiveServerConstants.SUBJECT_ATTRIBUTE));
				List<Map<String, Object>> nodeProps = generateNodesProperties(domain, list, threadName, threadNodesNumber);

				for (int i = nodePaths.size()-cnt; i < nodePaths.size(); i++) {
					String name = nodePaths.get(i);
					assertResource(parent, name, nodeProps.get(i));
					parent = resolver.getResource(parent.getPath()+"/"+name);
				}
			} 

			//			if (parent == null) throw new RuntimeException("Parent resource cannot be null.");

			//			nameAttr + JCRFriendly => path
			String msgPath = makeJcrFriendly( (String) msgProps.get(MailArchiveServerConstants.NAME_ATTRIBUTE) );
			assertResource(parent, msgPath, msgProps);

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
			props.put(MailArchiveServerConstants.SUBJECT_ATTRIBUTE, "no subject");
		}

		return props;
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

	private List<Map<String, Object>> generateNodesProperties(String domainName, String listName, String threadName, int threadNodesNumber) {
		List<Map<String, Object>> nodeProps = new ArrayList<Map<String, Object>>();

		//domain
		Map<String, Object> props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_DOMAIN);
		props.put(MailArchiveServerConstants.NAME_ATTRIBUTE, domainName);
		nodeProps.add(props);

		//list
		props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_LIST);
		props.put(MailArchiveServerConstants.NAME_ATTRIBUTE, listName);
		nodeProps.add(props);

		for (int i = 0; i < threadNodesNumber-1; i++) {
			nodeProps.add(null);
		}

		//thread's last node
		props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_THREAD);
		props.put(MailArchiveServerConstants.NAME_ATTRIBUTE, threadName);
		nodeProps.add(props);

		return nodeProps;
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

	// TODO add for GE and FR
	static String removeRe(String s) {
		while (s.toLowerCase().startsWith("re:")) {
			s = s.substring(3).trim();
		}
		return s.trim();
	}

}
