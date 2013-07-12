package com.adobe.sling;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.james.mime4j.MimeException;
import org.apache.james.mime4j.parser.ContentHandler;
import org.apache.james.mime4j.parser.MimeStreamParser;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

@SlingServlet(
		paths = "/content/mailarchiveserver/import",
		methods = "POST")
public class MyServlet extends SlingAllMethodsServlet {

	//	private static final Logger log = LoggerFactory.getLogger(MyServlet.class);

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) 
			throws ServletException, IOException {

		System.out.println("----- MyServletPOST");

		RequestParameter param = request.getRequestParameter("myfile");
		System.out.println("param tostring: " + param.toString());

		ContentHandler handler = new MyContentHandler();
		MimeStreamParser parser = new MimeStreamParser();
		parser.setContentHandler(handler);
		try {
			parser.parse(param.getInputStream());
		} catch (MimeException e) {
			e.printStackTrace();
		}

		System.out.println("===== ======");
	}
}
