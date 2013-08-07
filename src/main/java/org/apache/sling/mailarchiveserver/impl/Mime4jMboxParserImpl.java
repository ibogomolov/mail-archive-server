package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.ImportMboxServlet.ENCODER;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.dom.MessageBuilder;
import org.apache.james.mime4j.mboxiterator.CharBufferWrapper;
import org.apache.james.mime4j.mboxiterator.MboxIterator;
import org.apache.james.mime4j.message.DefaultMessageBuilder;
import org.apache.sling.mailarchiveserver.api.MboxParser;

@Component
@Service(MboxParser.class)
public class Mime4jMboxParserImpl implements MboxParser {

	public Iterator<Message> parse(File f) {
		return new Mime4jParserIterator(f);
	}

	static class Mime4jParserIterator implements Iterator<Message> {
		private Iterator<CharBufferWrapper> mboxIterator;

		public Mime4jParserIterator(File f) {
			try {
				mboxIterator = MboxIterator.fromFile(f).charset(ENCODER.charset()).build().iterator();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public boolean hasNext() {
			return mboxIterator.hasNext();
		}

		public Message next() {
			MessageBuilder builder = new DefaultMessageBuilder();
			try {
				Message message = builder.parseMessage(mboxIterator.next().asInputStream(ENCODER.charset()));
				return message;
			} catch (MimeException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

}
