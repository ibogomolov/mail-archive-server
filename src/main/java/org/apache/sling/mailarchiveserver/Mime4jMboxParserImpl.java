package org.apache.sling.mailarchiveserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.james.mime4j.mboxiterator.MboxIterator;
import org.apache.sling.mailarchiveserver.api.MboxParser;

@Component
@Service(MboxParser.class)
public class Mime4jMboxParserImpl implements MboxParser {

	public MboxIterator parse(File f) {
		try {
			return MboxIterator.fromFile(f).charset(ImportMboxServlet.ENCODER.charset()).build();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
