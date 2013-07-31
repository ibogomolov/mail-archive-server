package org.apache.sling.mailarchiveserver.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.MessageBuilder;
import org.apache.james.mime4j.mboxiterator.CharBufferWrapper;
import org.apache.james.mime4j.mboxiterator.MboxIterator;
import org.apache.james.mime4j.message.DefaultMessageBuilder;
import org.apache.sling.mailarchiveserver.api.MboxParser;

import static org.apache.sling.mailarchiveserver.impl.ImportMboxServlet.ENCODER;

@Component
@Service(MboxParser.class)
public class Mime4jMboxParserImpl implements MboxParser {

	public List<Message> parse(File f) {
		List<Message> messages = new ArrayList<Message>();
		try {
			MboxIterator iterable = MboxIterator.fromFile(f).charset(ENCODER.charset()).build();
			for (CharBufferWrapper messageCharBuffer : iterable) {
				MessageBuilder builder = new DefaultMessageBuilder();
				Message msg = builder.parseMessage(messageCharBuffer.asInputStream(ENCODER.charset()));
				messages.add(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MimeException e) {
			e.printStackTrace();
		}
		return messages;
	}

}
