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
	
	private String phrase;
	private String expectedQuery;
	
	@Parameters(name="{0}")
    public static Collection<Object[]> data() {
        List<Object[]> params = new ArrayList<Object[]>();
        params.add(new Object[] {"", QueryBuilderImpl.BASE} );
        params.add(new Object[] {"word", QueryBuilderImpl.BASE + ""} ); //FIXME
        params.add(new Object[] {"", QueryBuilderImpl.BASE} );
        params.add(new Object[] {"", QueryBuilderImpl.BASE} );
        return params;
    }
    
    public SearchServiceQueryPipelineTest(String one, String two) {
    	phrase = one;
    	expectedQuery = two;
    }
    
    @Test
	public void testQueryPipeline() {
    	String query = builder.buildQuery(parser.parse(phrase), QueryBuilderImpl.SQL2);
    	assertTrue(String.format("Expected: %s\n  Output: %s", expectedQuery, query), expectedQuery.equals(query));
    }

}
