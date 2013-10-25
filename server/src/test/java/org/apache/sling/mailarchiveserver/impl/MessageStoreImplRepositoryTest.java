package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.MessageStoreImplRepositoryTestUtil.assertValueMap;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImplRepositoryTestUtil.getResourcePath;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImplRepositoryTestUtil.readTextFile;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImplRepositoryTestUtil.specialPathFromFilePath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.MessageBuilder;
import org.apache.james.mime4j.message.DefaultMessageBuilder;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.discovery.impl.setup.MockedResourceResolver;
import org.apache.sling.mailarchiveserver.api.MboxParser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessageStoreImplRepositoryTest {
	private ResourceResolver resolver;
	private Resource testRoot;
	private MessageStoreImpl store;

	private static final String TEST_RT_KEY = "sling_resourceType";
	private static final String TEST_FILE_FIELD_SEPARATOR = " : ";

	private static final String TEST_FOLDER = "test_files/";
	private static final String SINGLEPART_FILE = "singlepart.txt";
	private static final String MULTIPART_FILE = "multipart.txt";
	private static final String MBOX_FILE = "three_messages.txt";
	private static final String BODY_SUFFIX = "_body";
	private static final String HEADERS_SUFFIX = "_headers";

	/**
	 * Some code is taken from http://svn.apache.org/repos/asf/sling/trunk/launchpad/test-services/src/main/java/org/apache/sling/launchpad/testservices/serversidetests/WriteableResourcesTest.java
	 */
	@Before
	public void setup() throws Exception {
		resolver = new MockedResourceResolver();
		assertNotNull("Expecting non-null ResourceResolver", resolver);
		final Resource root = resolver.getResource("/");
		assertNotNull("Expecting non-null root Resource", root);
		final String path = getClass().getSimpleName() + "_" + System.currentTimeMillis();
		testRoot = resolver.create(root, path, null);
		resolver.commit();

		store = new MessageStoreImpl();
		store.resolver = this.resolver;
		store.threadKeyGen = new ThreadKeyGeneratorImpl();
		store.archivePath = testRoot.getPath() + "/";
		store.resourceTypeKey = TEST_RT_KEY;
	}

	@After
	public void cleanup() throws Exception {
		resolver.close();
		resolver = null;
		testRoot = null;
		store = null;
	}


	@Test
	public void testSavePlainMessage() throws FileNotFoundException, MimeException, IOException  {
		File testFile = new File(TEST_FOLDER + SINGLEPART_FILE);
		MessageBuilder builder = new DefaultMessageBuilder();
		Message msg = builder.parseMessage(new FileInputStream(testFile));

		store.save(msg);

		File bodyFile = new File(TEST_FOLDER + specialPathFromFilePath(SINGLEPART_FILE, BODY_SUFFIX));
		String expectedBody = readTextFile(bodyFile);

		final Resource r = resolver.getResource(getResourcePath(msg, store));
		assertNotNull("Expecting non-null Resource", r);
		final ModifiableValueMap m = r.adaptTo(ModifiableValueMap.class);
		assertValueMap(m, "Body", expectedBody);

		File headersFile = new File(TEST_FOLDER + specialPathFromFilePath(SINGLEPART_FILE, HEADERS_SUFFIX));
		assertHeaders(m, headersFile);
	}


	private static void assertHeaders(ModifiableValueMap m, File headersFile) throws FileNotFoundException {
		Map<String, List<String>> expectedHeaders = new HashMap<String, List<String>>();
		Scanner sc = new Scanner(headersFile);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.startsWith("//")) 
				continue;
			String[] colon = line.split(TEST_FILE_FIELD_SEPARATOR);
			String header = colon[0];
			String value = colon[1];
			List<String> values;
			if ((values = expectedHeaders.get(header)) == null) {
				values = new ArrayList<String>();
				expectedHeaders.put(header, values);
			}
			values.add(value);
		}
		sc.close();

		assertEquals("Expecting same number of headers", expectedHeaders.size(), m.keySet().size()-1); // -1 for body

		for (String header : m.keySet()) {
			if (!header.equalsIgnoreCase("body")) {
				for (String value : m.get(header, String.class).split(MessageStoreImpl.FIELD_SEPARATOR)) {
					assertTrue("Expecting same value of header \""+header+"\"", expectedHeaders.get(header).contains(value));
				}
			}
		}
	}

	@Test
	public void testSaveMultipartMessage() throws FileNotFoundException, MimeException, IOException {
		File testFile = new File(TEST_FOLDER + MULTIPART_FILE);
		MessageBuilder builder = new DefaultMessageBuilder();
		Message msg = builder.parseMessage(new FileInputStream(testFile));

		store.save(msg);

		File bodyFile = new File(TEST_FOLDER + specialPathFromFilePath(MULTIPART_FILE, BODY_SUFFIX));
		String expectedBody = readTextFile(bodyFile);

		final Resource r = resolver.getResource(getResourcePath(msg, store));
		assertNotNull("Expecting non-null Resource", r);
		final ModifiableValueMap m = r.adaptTo(ModifiableValueMap.class);
		assertValueMap(m, "Body", expectedBody);
	}

	@Test
	public void testSaveAll() throws IOException {
		MboxParser parser = new Mime4jMboxParserImpl();
		final File file = new File(TEST_FOLDER + MBOX_FILE);
		store.saveAll(parser.parse(new FileInputStream(file)));
		assertStructure();
	}

	private void assertStructure() {
		List<String> types = new ArrayList<String>();
		types.add(MailArchiveServerConstants.RT_DOMAIN);
		types.add(MailArchiveServerConstants.RT_PROJECT);
		types.add(MailArchiveServerConstants.RT_LIST);
		types.add(null);
		types.add(null);
		types.add(MailArchiveServerConstants.RT_THREAD);
		types.add(MailArchiveServerConstants.RT_MESSAGE);

		assertLayer(testRoot, types, 0);
	}

	private static void assertLayer(Resource root, List<String> types, int depth) {
		for (Resource child : root.getChildren()) {
			final ModifiableValueMap m = child.adaptTo(ModifiableValueMap.class);
			if (m.keySet().contains(TEST_RT_KEY)) {
				String type = m.get(TEST_RT_KEY, String.class);
				assertEquals(String.format("Expecting %s to have %s type", child.getPath(), types.get(depth)), types.get(depth), type);
			}
			if (child.getChildren().iterator().hasNext()) {
				assertLayer(child, types, depth+1);
			}
		}

	}

}
