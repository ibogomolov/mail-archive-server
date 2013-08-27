package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.ImportMboxServlet.ENCODER;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
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

	public Iterator<Message> parse(InputStream is) {
		try {
			return new Mime4jParserIterator(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	static class Mime4jParserIterator implements Iterator<Message> {

		private Iterator<CharBufferWrapper> mboxIterator;
		private static final int BUFFER_SIZE = 10*1024*1024;

		public Mime4jParserIterator(InputStream is) throws IOException {
			File tempFile = null;
			try {
				// create temp file
				tempFile = File.createTempFile("MAS_", ".mbox");
				FileOutputStream fileOS = new FileOutputStream(tempFile);
				FileChannel fileChannel = fileOS.getChannel();
				byte[] buffer = new byte[BUFFER_SIZE];
				int read = 0;
				while ((read = is.read(buffer)) != -1) {
					ByteBuffer buf2 = ENCODER.encode(CharBuffer.wrap(new String(buffer, 0, read)));
					fileChannel.write(buf2);
				}
				fileChannel.close();
				fileOS.close();
				is.close();

				createMboxIterator(tempFile);
			} finally {
				if (tempFile != null) {
					tempFile.delete();
					tempFile = null;
				}
			}
		}

		private void createMboxIterator(File f) {
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
