package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.MessageStoreImplRepositoryTestUtil.getResourcePath;
import static org.apache.sling.mailarchiveserver.util.MessageFieldName.LIST_ID;
import static org.apache.sling.mailarchiveserver.util.MessageFieldName.PLAIN_BODY;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

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
        BodyPart part1 = createTextPart("This is the first part of the template..", "plain");
        multipart.addBodyPart(part1);
        BodyPart part2 = createRandomBinaryPart(200);
        multipart.addBodyPart(part2);
        BodyPart part3 = createRandomBinaryPart(300);
        multipart.addBodyPart(part3);
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

        Queue<BodyPart> attachmentsMsg = getAttachments(msg); 

        final Resource r = resolver.getResource(getResourcePath(msg, store));
        assertNotNull("Expecting non-null Resource", r);
        for (Resource aRes : r.getChildren()) {
            final ModifiableValueMap aMap = aRes.adaptTo(ModifiableValueMap.class);
            BodyPart aMsg = attachmentsMsg.poll();
            assertNotNull("JCR contains more attachments", aMsg);

            for (Field f : aMsg.getHeader().getFields()) {
                String name = f.getName();
                assertTrue(f.getBody().equals(aMap.get(name, String.class)));
            }

            MessageStoreImpl.getTextPart(aMsg).equals(aMap.get(PLAIN_BODY, String.class));
        }
        assertTrue("Message contains more attachments", attachmentsMsg.poll() == null);
    }

    /*
     * taken from http://svn.apache.org/repos/asf/james/mime4j/trunk/examples/src/main/java/org/apache/james/mime4j/samples/transform/TransformMessage.java
     */
    private static BodyPart createTextPart(String text, String subtype) {
        TextBody body = new StorageBodyFactory().textBody(text, MailArchiveServerConstants.DEFAULT_ENCODER.charset().name());

        BodyPart bodyPart = new BodyPart();
        bodyPart.setText(body, subtype);
        //        bodyPart.setContentTransferEncoding("quoted-printable");

        return bodyPart;
    }

    /*
     * taken from http://svn.apache.org/repos/asf/james/mime4j/trunk/examples/src/main/java/org/apache/james/mime4j/samples/transform/TransformMessage.java
     */
    private static BodyPart createRandomBinaryPart(int numberOfBytes)
            throws IOException {
        byte[] data = new byte[numberOfBytes];
        new Random().nextBytes(data);

        Body body = new StorageBodyFactory().binaryBody(new ByteArrayInputStream(data));

        BodyPart bodyPart = new BodyPart();
        bodyPart.setBody(body, "application/octet-stream");
        //        bodyPart.setContentTransferEncoding("base64");

        return bodyPart;
    }

    private Queue<BodyPart> getAttachments(Message msg) {
        Queue<BodyPart> res = new LinkedList<BodyPart>();
        if (msg.isMultipart()) {
            Multipart multipart = (Multipart) msg.getBody();
            for (Entity enitiy : multipart.getBodyParts()) {
                BodyPart part = (BodyPart) enitiy;
                if (part.getDispositionType() != null && !part.getDispositionType().equals("")) {
                    res.add(part);
                }
            }
        }
        return res;
    }

}
