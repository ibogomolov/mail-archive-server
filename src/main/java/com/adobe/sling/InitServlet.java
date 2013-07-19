package com.adobe.sling;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@SlingServlet(
		 paths = "/content/mailarchiveserver/init"
		)
// FIXME how to do initialization correctly? 
public class InitServlet extends SlingAllMethodsServlet {

	public static final String FS_TEMP_PATH = "temp";
	public static final String IMPORT_FILE_ATTRIB_NAME = "mboxfile";
	public static final CharsetEncoder ENCODER = Charset.forName("UTF-8").newEncoder();

	private static final String ROOT_NODE_NAME = "mailarchiveserver";
	private static final String ROOT_JCR_PATH = "/content/"+ROOT_NODE_NAME;
	private static final String ARCHIVE_NODE_NAME = "archive";
	private static final String ARCHIVE_PATH = ROOT_JCR_PATH+"/"+ARCHIVE_NODE_NAME;
	private static final String IMPORT_NODE_NAME = "import";
	@Reference
	private ResourceResolverFactory resourceResolverFactory;
	private ResourceResolver resolver;
	private static final Logger logger = LoggerFactory.getLogger(InitServlet.class);


	private ResourceResolver resolverInit() {
		try {
			return resourceResolverFactory.getAdministrativeResourceResolver(null);
		} catch (LoginException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void init() throws ServletException {
		resolver = resolverInit();
		
		Map<String, Object> props = new HashMap<String, Object>();
		// set ROOT_NODE's sling:resourceType
		props.put("sling:resourceType", SlingResourceType.ROOT);
		assertResourceWithLogging(resolver.getResource("/content"), ROOT_NODE_NAME, props);

		// set ARCHIVE_NODE's sling:resourceType
		props.clear();
		props.put("sling:resourceType", SlingResourceType.ARCHIVE);
		assertResourceWithLogging(resolver.getResource(ROOT_JCR_PATH), ARCHIVE_NODE_NAME, props);

		// set IMPORT_NODE's sling:resourceType
		props.clear();
		props.put("sling:resourceType", SlingResourceType.IMPORTT);
		assertResourceWithLogging(resolver.getResource(ROOT_JCR_PATH), IMPORT_NODE_NAME, props);

		super.init();
	}

	private void assertResourceWithLogging(Resource parent, String name, Map<String, Object> newProps) {
		try {
			String checkPath = parent.getPath()+"/"+name;
			final Resource checkResource = resolver.getResource(checkPath);
			if (checkResource == null) {
				final Resource newResource = resolver.create(parent, name, newProps);
				resolver.commit();
				if (newProps == null) {
					logger.info(String.format("Resource created at %s without parameters.", newResource.getPath()));
				} else {
					logger.info(String.format("Resource created at %s with parameters %s .", newResource.getPath(), newProps.toString()));
				}
			} else if (newProps != null && !newProps.isEmpty()) {
				final ModifiableValueMap props = checkResource.adaptTo(ModifiableValueMap.class);
				if (props != null) {
					props.putAll(newProps);
					resolver.commit();
					logger.info(String.format("Resource updated at %s with parameters %s .", checkResource.getPath(), props.toString()));
				}
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

	public static class SlingResourceType {
		public static final Object ROOT = "mailarchiveserver/root";
		public static final String IMPORTT = "mailarchiveserver/import";
		public static final String ARCHIVE = "mailarchiveserver/archive";

		public static final String DOMAIN = "mailarchiveserver/domain";
		public static final String PROJECT = "mailarchiveserver/project";
		public static final String LIST = "mailarchiveserver/list";
		public static final String THREAD = "mailarchiveserver/thread";
		public static final String MESSAGE = "mailarchiveserver/message";
	}

}
