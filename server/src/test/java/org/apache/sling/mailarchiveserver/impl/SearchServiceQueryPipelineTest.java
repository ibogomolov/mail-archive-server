package org.apache.sling.mailarchiveserver.impl;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SearchServiceQueryPipelineTest {

	private static SearchQueryParserImpl parser = new SearchQueryParserImpl();
	private static QueryBuilderImpl builder = new QueryBuilderImpl();

	private String searchPhrase;
	private String expectedQuery;

	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		List<Object[]> params = new ArrayList<Object[]>();
		params.add(new Object[] {"", QueryBuilderImpl.BASE } );
		params.add(new Object[] {"word", QueryBuilderImpl.BASE_WHERE 
				+ "(LOWER(Body) LIKE '%word%' "
				+ "OR LOWER(Subject) LIKE '%word%' "
				+ "OR LOWER(From) LIKE '%word%' "
				+ "OR LOWER(List-Id) LIKE '%word%')" } );
		params.add(new Object[] {"hello from:world", QueryBuilderImpl.BASE_WHERE 
				+ "(LOWER(From) LIKE '%world%') "
				+ "AND (LOWER(Body) LIKE '%hello%' "
				+ "OR LOWER(Subject) LIKE '%hello%' "
				+ "OR LOWER(From) LIKE '%hello%' "
				+ "OR LOWER(List-Id) LIKE '%hello%')" } );
		params.add(new Object[] {"suBjecT:here", QueryBuilderImpl.BASE_WHERE 
				+ "(LOWER(Subject) LIKE '%here%')" } );
		params.add(new Object[] {"FROM:me list:public about:stuff", QueryBuilderImpl.BASE_WHERE 
				+ "(LOWER(List-Id) LIKE '%public%') "
				+ "AND (LOWER(From) LIKE '%me%')" } );

		//        params.add(new Object[] {"", QueryBuilderImpl.BASE} );
		return params;
	}

	public SearchServiceQueryPipelineTest(String one, String two) {
		searchPhrase = one;
		expectedQuery = two;
	}

	@Test
	public void testQueryPipeline() {
		String query = builder.buildQuery(parser.parse(searchPhrase), QueryBuilderImpl.SQL2);
		assertTrue(String.format("\nExpected: %s\n   Output: %s", expectedQuery, query), expectedQuery.equals(query));
	}

}
