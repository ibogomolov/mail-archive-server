package org.apache.sling.mailarchiveserver.exchange;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.james.mime4j.dom.Message;
import org.apache.sling.mailarchiveserver.util.MessageFieldName;
import org.junit.Test;

import exchange.v2007sp3.ws.client.impl.ArrayOfRecipientsType;
import exchange.v2007sp3.ws.client.impl.BodyType;
import exchange.v2007sp3.ws.client.impl.EmailAddressType;
import exchange.v2007sp3.ws.client.impl.MessageType;
import exchange.v2007sp3.ws.client.impl.SingleRecipientType;

public class ExchangeConnectorTest {
    private static final String ONE_EMAIL = "one@list.com";
    private static final String TWO_EMAIL = "two@list.com";
    private static final String THREE_EMAIL = "three@list.com";

    ExchangeConnector exCon = new ExchangeConnector();
    {
        Set<String> mlists = new LinkedHashSet<String>();
        mlists.add(ONE_EMAIL);
        mlists.add(TWO_EMAIL);
        mlists.add(THREE_EMAIL);
        exCon.mailingLists = mlists;
    }
    
    @Test
    public void messageToMultipleListsTest() throws IOException, DatatypeConfigurationException {
        MessageType message = new MessageType();
        
        EmailAddressType sender = new EmailAddressType();
        sender.setEmailAddress("sender@admin.com");
        SingleRecipientType srt = new SingleRecipientType();
        srt.setMailbox(sender);
        message.setFrom(srt);
        
        EmailAddressType one = new EmailAddressType();
        one.setEmailAddress(ONE_EMAIL);
        EmailAddressType two = new EmailAddressType();
        two.setEmailAddress(TWO_EMAIL);
        final List<EmailAddressType> toMailbox = new ArrayList<EmailAddressType>();
        toMailbox.add(one);
        toMailbox.add(two);
        ArrayOfRecipientsType aort = new ArrayOfRecipientsType() {
            @Override
            public List<EmailAddressType> getMailbox() {
                return toMailbox; 
            }
        };
        message.setToRecipients(aort);
        
        message.setInternetMessageId("id");
        
        message.setDateTimeSent(DatatypeFactory.newInstance().newXMLGregorianCalendar());
        
        BodyType bt = new BodyType();
        bt.setValue("This is body.");
        message.setBody(bt);
        
        List<Message> msgs = exCon.convertExchangeMessageToMime4jMessages(message, null);
        assertEquals(2, msgs.size());
        
        assertTrue(msgs.get(0).getHeader().getField(MessageFieldName.LIST_ID).getBody().contains("one"));
        assertTrue(msgs.get(1).getHeader().getField(MessageFieldName.LIST_ID).getBody().contains("two"));
    }
    

}