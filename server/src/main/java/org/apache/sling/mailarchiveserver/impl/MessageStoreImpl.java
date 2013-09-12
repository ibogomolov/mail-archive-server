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

	private void resolverInit() throws LoginException {
		if (resolver == null) {
			resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
		}
	}

	public void save(Message msg) throws IOException {
		try {
			resolverInit();
			Map<String, Object> msgMap = new HashMap<String, Object>();
			msgMap.put(resourceTypeKey, MailArchiveServerConstants.RT_MESSAGE);

			// process body
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

			msgMap.put("Body", msgBody);

			// process header
			Header hdr = msg.getHeader();
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
					msgMap.put(name, value.substring(0, value.length()-FIELD_SEPARATOR.length()));
				}
			}				


			// message JCR path
			// TODO check if list-id is list.domain.com, not dev.sling.apache.org
			String listId = hdr.getField("List-Id").getBody();
			listId = listId.substring(1, listId.length()-1);
			
			String[] testSplit = listId.split("\\.");
			if (testSplit.length > 4 || testSplit.length < 3) {
				throw new RuntimeException("List-Id is invalid: too many dots.");
			}
			String[] split = listId.split("\\.", testSplit.length - 1);
			int idx = 0;
			String list = split[idx++];
			String project = "default";
			if (split.length == 3) {
				project = split[idx++];
			}
			String domain = split[idx++];
			String msgId;
			if (hdr.getField("Message-ID") != null) {
				msgId = hdr.getField("Message-ID").getBody();
				msgId = msgId.substring(1, msgId.length()-1);
			} else {
				msgId = Integer.toHexString(hdr.getField("Date").hashCode());
			}
			msgMap.put(MailArchiveServerConstants.TEXT_ATTRIBUTE, msgId);
			msgId = makeJcrFriendly(msgId);

			String subject = hdr.getField("Subject").getBody();
			String threadName = removeRe(subject);

			String threadPath = threadKeyGen.getThreadKey(msg);
			int threadNodesNumber = threadPath.split("/").length;

			// checking each node of path path
			String path = archivePath+domain+"/"+project+"/"+list+"/"+threadPath;
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
				nodePaths.add(project);
				nodePaths.add(list);
				for (String node : threadPath.split("/")) {
					nodePaths.add(node);
				}

				List<Map<String, Object>> nodeProps = generateNodesProperties(domain, project, list, threadName, threadNodesNumber);

				for (int i = nodePaths.size()-cnt; i < nodePaths.size(); i++) {
					String name = nodePaths.get(i);
					assertResource(parent, name, nodeProps.get(i));
					parent = resolver.getResource(parent.getPath()+"/"+name);
				}
			} 

			if (parent == null) throw new RuntimeException("Parent resource cannot be null.");

			assertResource(parent, msgId, msgMap);

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

	private List<Map<String, Object>> generateNodesProperties(String domain, String project, String list, String threadName, int threadNodesNumber) {
		List<Map<String, Object>> nodeProps = new ArrayList<Map<String, Object>>();

		//domain
		Map<String, Object> props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_DOMAIN);
		props.put(MailArchiveServerConstants.TEXT_ATTRIBUTE, domain);
		nodeProps.add(props);

		//project
		props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_PROJECT);
		props.put(MailArchiveServerConstants.TEXT_ATTRIBUTE, project);
		nodeProps.add(props);

		//list
		props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_LIST);
		props.put(MailArchiveServerConstants.TEXT_ATTRIBUTE, list);
		nodeProps.add(props);

		for (int i = 0; i < threadNodesNumber-1; i++) {
			nodeProps.add(null);
		}

		//thread's last node
		props = new HashMap<String, Object>();
		props.put(resourceTypeKey, MailArchiveServerConstants.RT_THREAD);
		props.put(MailArchiveServerConstants.TEXT_ATTRIBUTE, threadName);
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

	static String removeRe(String s) {
		while (s.toLowerCase().startsWith("re:")) {
			s = s.substring(3).trim();
		}
		return s.trim();
	}

}
