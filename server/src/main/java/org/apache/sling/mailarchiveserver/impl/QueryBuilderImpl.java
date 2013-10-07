package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.SearchQueryParserImpl.SearchParameters.SEARCH_PARAMETER_TO_MESSAGE_FIELD_MAP;
import static org.apache.sling.mailarchiveserver.impl.SearchQueryParserImpl.SearchParameters.SET_OF_SEARCH_PARAMETERES;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.mailarchiveserver.api.QueryBuilder;
import org.apache.sling.mailarchiveserver.impl.SearchQueryParserImpl.SearchParameters;

@Component
@Service(QueryBuilder.class)
public class QueryBuilderImpl implements QueryBuilder {

	static final String BASE = "SELECT * FROM [nt:unstructured] WHERE ";
	private static final String AND = " AND ";
	private static final String OR = " OR ";

	public static final String SQL2 = "SQL2";

	private String buildSQL2Query(Map<String, List<String>> tokens) {
		// TODO implement
		String constraints = "";
		Set<String> searchParameters = new HashSet<String>(SET_OF_SEARCH_PARAMETERES);
		
		// tokens constraints
		for (String tokenClass : tokens.keySet()) {
			if (tokenClass.equals(SearchParameters.NONE)) {
				continue;
			}
			searchParameters.remove(tokenClass);
			String fieldConstraint =  buildFieldConstraints(tokenClass, tokens);
			constraints += "("+ fieldConstraint +")" + AND;
		}

		// global constraints
		String fieldConstraint =  buildFieldConstraints(SearchParameters.NONE, tokens);
		constraints += "("+ fieldConstraint +")" + AND;
		
		return BASE + constraints.substring(0, constraints.length()-AND.length());
	}

	private static String buildFieldConstraints(String tokenClass, Map<String, List<String>> tokens) {
		List<String> ls = tokens.get(tokenClass);
		String messageField = SEARCH_PARAMETER_TO_MESSAGE_FIELD_MAP.get(tokenClass);
		String fieldConstraint = "";
		for (String value : ls) {
			fieldConstraint += messageField + " LIKE '%" + value + "%'" + OR;
		}
		return fieldConstraint.substring(0, fieldConstraint.length()-OR.length());
	}

	@Override
	public String buildQuery(Map<String, List<String>> tokens, String lang) {
		if (lang.trim().equalsIgnoreCase(SQL2)) {
			return buildSQL2Query(tokens);
		} else {
			throw new IllegalArgumentException("Invalid lang argument!");
		}
	}

}
