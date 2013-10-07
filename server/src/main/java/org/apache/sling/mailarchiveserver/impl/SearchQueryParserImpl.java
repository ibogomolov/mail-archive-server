package org.apache.sling.mailarchiveserver.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.mailarchiveserver.api.SearchQueryParser;

/**
 * TODO describe search lang 
 * 
 * 
 * @author Igor Bogomolov
 */
@Component
@Service(SearchQueryParser.class)
public class SearchQueryParserImpl implements SearchQueryParser {

	@Override
	public Map<String, List<String>> parse(String phrase) {
		Map<String, List<String>> res = new HashMap<String, List<String>>();
		phrase = phrase.trim();
		if (phrase == "") { // TODO null
			return res;
		}
		String[] lexemes = phrase.split(" ");
		for (String lexeme : lexemes) {
			String[] token = lexeme.split(":");
			if (token.length == 1) {
				insertTokenIntoMap(token[0].trim(), SearchParameters.NONE, res);
			} else {
				insertTokenIntoMap(token[0].trim(), getSearchParameter(token[0].trim()), res);
			}
		}
		return res;
	}

	private static String getSearchParameter(String trim) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void insertTokenIntoMap(String tokenString, String tokenClass, Map<String, List<String>> map) {
		List<String> ls = map.get(tokenClass);
		if (ls == null) {
			ls = new ArrayList<String>();
		}
		ls.add(tokenString);
		map.put(tokenClass, ls);
	}

	public static class SearchParameters {
		public static final String NONE = "";
		
		public static final String FROM = "from";
		public static final String SUBJ = "subject";
		public static final String LIST = "list";

		public static final Set<String> SET_OF_SEARCH_PARAMETERES = new HashSet<String>();
		public static final Map<String, String> SEARCH_PARAMETER_TO_MESSAGE_FIELD_MAP = new HashMap<String, String>();

		static {
			SET_OF_SEARCH_PARAMETERES.add(FROM);
			SET_OF_SEARCH_PARAMETERES.add(SUBJ);
			SET_OF_SEARCH_PARAMETERES.add(LIST);
			
			SEARCH_PARAMETER_TO_MESSAGE_FIELD_MAP.put(FROM, "From");
			SEARCH_PARAMETER_TO_MESSAGE_FIELD_MAP.put(SUBJ, "Subject");
			SEARCH_PARAMETER_TO_MESSAGE_FIELD_MAP.put(LIST, "List-Id");
		}
	}
}