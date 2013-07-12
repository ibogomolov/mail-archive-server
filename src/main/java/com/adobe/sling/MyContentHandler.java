package com.adobe.sling;

import java.io.IOException;
import java.io.InputStream;

import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.parser.AbstractContentHandler;
import org.apache.james.mime4j.parser.ContentHandler;
import org.apache.james.mime4j.parser.MimeStreamParser;
import org.apache.james.mime4j.stream.BodyDescriptor;
import org.apache.james.mime4j.stream.Field;

public class MyContentHandler extends AbstractContentHandler {

	@Override
	public void body(BodyDescriptor bd, InputStream is) throws MimeException, IOException {
		System.out.println(String.format("body: %s\n%s", bd, is));
//		System.out.println("body");
	}

	@Override
	public void endBodyPart() throws MimeException {
		System.out.println("endBodyPart");
	}

	@Override
	public void endHeader() throws MimeException {
		System.out.println("endHeader");
	}

	@Override
	public void endMessage() throws MimeException {
		System.out.println("endMessage");
	}

	@Override
	public void endMultipart() throws MimeException {
		System.out.println("endMultipart");
	}

	@Override
	public void epilogue(InputStream is) throws MimeException, IOException {
		System.out.println("epilogue\n" + is);
//		System.out.println("epilogue");
	}

	@Override
	public void field(Field field) throws MimeException {
//		System.out.println(String.format("field: %s\n%s",field.getName(), field.getBody()));
		System.out.println("field");
	}

	@Override
	public void preamble(InputStream is) throws MimeException, IOException {
		System.out.println("preamble");
	}
	@Override
	public void raw(InputStream is) throws MimeException, IOException {
		System.out.println("raw");
	}

	@Override
	public void startBodyPart() throws MimeException {
		System.out.println("startBodyPart");
	}

	@Override
	public void startHeader() throws MimeException {
		System.out.println("startHeader");
	}

	@Override
	public void startMessage() throws MimeException {
		System.out.println("startMessage");
	}

	@Override
	public void startMultipart(BodyDescriptor bd) throws MimeException {
		System.out.println("startMultipart");
	}
}

