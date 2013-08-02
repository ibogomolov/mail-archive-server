package org.apache.sling.mailarchiveserver.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.MessageBuilder;
import org.apache.james.mime4j.message.DefaultMessageBuilder;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Part of the code is taken from http://svn.apache.org/repos/asf/sling/trunk/launchpad/test-services/src/main/java/org/apache/sling/launchpad/testservices/serversidetests/WriteableResourcesTest.java
 */
@RunWith(SlingAnnotationsTestRunner.class)
public class MessageStoreImplTestOnServer {
	@TestReference
	private ResourceResolverFactory resourceResolverFactory;
	private ResourceResolver resolver;

	private Resource testRoot;
	private MessageStoreImpl store;

	private static final String TEST_FILES_FOLDER = "testFiles/";

	//	@SuppressWarnings("serial")
	//	private static class Props extends HashMap<String, Object> {
	//		Props(String ... keyValue) {
	//			for(int i=0 ; i< keyValue.length; i+=2) {
	//				put(keyValue[i], keyValue[i+1]);
	//			}
	//		}
	//	}

	@Before
	public void setup() throws Exception {
		resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
		assertNotNull("Expecting non-null ResourceResolver", resolver);
		final Resource root = resolver.getResource("/");
		assertNotNull("Expecting non-null root Resource", root);
		final String path = getClass().getSimpleName() + "_" + System.currentTimeMillis();
		testRoot = resolver.create(root, path, null);

		store = new MessageStoreImpl();
		store.archivePath = testRoot.getPath();
		store.resourceResolverFactory = this.resourceResolverFactory;
	}

	@After
	public void cleanup() throws Exception {
		resolver.delete(testRoot);
		resolver.commit();
		resolver.close();
		testRoot = null;
		store = null;
	}

	private void assertValueMap(ValueMap m, String ... keyValue) {
		assertNotNull("Expecting non-null ValueMap", m);
		for(int i=0 ; i< keyValue.length; i+=2) {
			final String key = keyValue[i];
			final String value = keyValue[i+1];
			assertEquals("Expecting " + key + "=" + value, value, m.get(key, String.class));
		}
	}

	@Test
	public void testSave() throws FileNotFoundException, MimeException, IOException  {
		final String filePath = TEST_FILES_FOLDER + "one.txt";
		final String bodyPath = TEST_FILES_FOLDER + "one_body.txt";

		File testFile = new File(filePath);
		MessageBuilder builder = new DefaultMessageBuilder();
		Message msg = builder.parseMessage(new FileInputStream(testFile));

		store.save(msg);

		File bodyFile = new File(bodyPath);
		Scanner sc = new Scanner(bodyFile);
		String expectedBody = ""; 
		while (sc.hasNextLine()) {
			expectedBody += sc.nextLine() + "\n";
		}

		final Resource r = resolver.getResource(store.getResourcePath(msg));
		assertNotNull("Expecting non-null Resource", r);
		final ModifiableValueMap m = r.adaptTo(ModifiableValueMap.class);
		assertValueMap(m, "body", expectedBody);
	}


}
