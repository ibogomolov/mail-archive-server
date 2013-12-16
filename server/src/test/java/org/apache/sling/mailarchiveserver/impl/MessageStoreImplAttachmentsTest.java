package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.MessageStoreImplRepositoryTestUtil.getResourcePath;
import static org.apache.sling.mailarchiveserver.util.MessageFieldName.CONTENT;
import static org.apache.sling.mailarchiveserver.util.MessageFieldName.LIST_ID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import org.apache.james.mime4j.dom.BinaryBody;
import org.apache.james.mime4j.dom.Body;
import org.apache.james.mime4j.dom.Entity;
import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.Multipart;
import org.apache.james.mime4j.dom.TextBody;
import org.apache.james.mime4j.message.BodyPart;
import org.apache.james.mime4j.message.MessageImpl;
import org.apache.james.mime4j.message.MultipartImpl;
import org.apache.james.mime4j.storage.StorageBodyFactory;
import org.apache.james.mime4j.stream.Field;
import org.apache.james.mime4j.stream.RawField;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.discovery.impl.setup.MockedResourceResolver;
import org.apache.sling.mailarchiveserver.util.MailArchiveServerConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessageStoreImplAttachmentsTest {
    private ResourceResolver resolver;
    private Resource testRoot;
    private MessageStoreImpl store;

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

        store = new MessageStoreImpl() {
            protected ResourceResolver getResourceResolver() {
                return resolver;
            }
        };
        store.threadKeyGen = new ThreadKeyGeneratorImpl();
        store.archivePath = testRoot.getPath() + "/";
        store.resourceTypeKey = MessageStoreImplRepositoryTest.TEST_RT_KEY;
    }

    @After
    public void cleanup() throws Exception {
        resolver.close();
        resolver = null;
        testRoot = null;
        store = null;
    }

    @Test
    public void simpleMultipartMessageTest() throws IOException {
        Multipart multipart = new MultipartImpl("mixed");
        BodyPart body = createTextAttachment("This is the first part of the template..", "plain");
        multipart.addBodyPart(body);
        BodyPart att1 = createRandomBinaryAttachment(200);
        multipart.addBodyPart(att1);
        BodyPart att2 = createRandomBinaryAttachment(300);
        multipart.addBodyPart(att2);
        BodyPart att3 = createTextAttachment("Some sample text here...?!", "html");
        multipart.addBodyPart(att3);
        BodyPart att4 = createRandomBinaryAttachment(100);
        multipart.addBodyPart(att4);
        BodyPart att5 = createTextAttachment("Some other text here...?!", "plain");
        multipart.addBodyPart(att5);
        MessageImpl message = new MessageImpl();
        message.setMultipart(multipart);
        message.setSubject("Template message");

        message.setDate(new Date());
        Header h = message.getHeader();
        h.setField(new RawField(LIST_ID, "<list.example.com>"));

        assertSaveMessageWithAttachments(message);
    }

    private void assertSaveMessageWithAttachments(Message msg) throws IOException {
        store.save(msg);

        List<BodyPart> attList = new LinkedList<BodyPart>();
        MessageStoreImpl.recursiveMultipartProcessing((Multipart) msg.getBody(), new StringBuilder(), new StringBuilder(), false, attList); 
        @SuppressWarnings("unchecked")
        Queue<BodyPart> attachmentsMsg = (Queue<BodyPart>) attList;
        assertTrue("No attachments found", attachmentsMsg.size() > 0);
        
        final Resource r = resolver.getResource(getResourcePath(msg, store));
        assertNotNull("Expecting non-null Resource", r);
        for (Resource aRes : r.getChildren()) {
            final ModifiableValueMap aMap = aRes.adaptTo(ModifiableValueMap.class);
            BodyPart aMsg = attachmentsMsg.poll();
            assertNotNull("JCR contains more attachments", aMsg);

            for (Field f : aMsg.getHeader().getFields()) {
                String name = f.getName();
                assertEquals("Field "+name+" is different", (aMap.get(name, String.class)), f.getBody());
            }
            
            if (aMsg.getBody() instanceof TextBody) {
                assertEquals("Content is not the same", MessageStoreImpl.getTextPart(aMsg), aMap.get(CONTENT, String.class));
            } else if (aMsg.getBody() instanceof BinaryBody) {
                assertEquals("Content is not the same", getBinPart(aMsg), aMap.get(CONTENT, String.class));
            } else {
                fail("Unknown type of attachment body");
            }
        }
        assertEquals("Message contains more attachments", attachmentsMsg.poll(), null);
    }

    private String getBinPart(Entity part) throws IOException {
        BinaryBody tb = (BinaryBody) part.getBody();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        tb.writeTo(baos);
        return new String(baos.toByteArray());
    }

    /*
     * taken from http://svn.apache.org/repos/asf/james/mime4j/trunk/examples/src/main/java/org/apache/james/mime4j/samples/transform/TransformMessage.java
     */
    private static BodyPart createTextAttachment(String text, String subtype) {
        TextBody body = new StorageBodyFactory().textBody(text, MailArchiveServerConstants.DEFAULT_ENCODER.charset().name());

        BodyPart bodyPart = new BodyPart();
        bodyPart.setContentDisposition("attachment", "file"+Math.random());
        bodyPart.setText(body, subtype);

        return bodyPart;
    }

    /*
     * taken from http://svn.apache.org/repos/asf/james/mime4j/trunk/examples/src/main/java/org/apache/james/mime4j/samples/transform/TransformMessage.java
     */
    private static BodyPart createRandomBinaryAttachment(int numberOfBytes) throws IOException {
        byte[] data = new byte[numberOfBytes];
        new Random().nextBytes(data);

        Body body = new StorageBodyFactory().binaryBody(new ByteArrayInputStream(data));

        BodyPart bodyPart = new BodyPart();
        bodyPart.setContentDisposition("attachment", "file"+Math.random());
        bodyPart.setBody(body, "application/octet-stream");

        return bodyPart;
    }

}
