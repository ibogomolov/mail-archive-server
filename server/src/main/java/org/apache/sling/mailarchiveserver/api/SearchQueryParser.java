package org.apache.sling.mailarchiveserver.api;

import java.util.List;
import java.util.Map;

import org.apache.sling.mailarchiveserver.impl.SearchQueryParserImpl.SearchParameters;

public interface SearchQueryParser {

	Map<String, List<String>> parse(String query);
}
