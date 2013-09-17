package org.apache.sling.mailarchiveserver.impl;

import java.util.Iterator;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.mailarchiveserver.api.SearchService;

@Component
@Service(SearchService.class)
public class SearchServiceImpl implements SearchService {

	@Reference
	private	ResourceResolverFactory resourceResolverFactory;
	ResourceResolver resolver = null;

	public SearchServiceImpl() throws LoginException {
		System.out.println("*** Search constructor");
		if (resolver == null) {
			resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
		}
	}

	@Override
	public Iterator<Resource> find(String phrase) {
		Iterator<Resource> res = resolver.findResources(phrase, "xpath");
		// TODO implement
		return res;
	}

}
