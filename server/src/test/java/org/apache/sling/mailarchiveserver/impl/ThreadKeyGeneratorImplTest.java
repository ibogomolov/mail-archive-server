package org.apache.sling.mailarchiveserver.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ThreadKeyGeneratorImplTest {
	private ThreadKeyGeneratorImpl generator = new ThreadKeyGeneratorImpl();
	private final String input;
	private final String expected;

	@Parameters(name="{0}")
	public static List<Object[]> data() {
		final List<Object[]> result = new ArrayList<Object[]>();
		
		result.add(new Object[] {"'''''''9>*'''''''''''''''''''''''''''40>*", "9/90/940"} ); 
		result.add(new Object[] {"'abc'''9>*'''''''''''''''''''''''''''40>*", "9/90/abc940"} ); 
		result.add(new Object[] {"abcdefg9>*'''''''''''''''''''''''''''40>*", "9/90/abcdefg940"} ); 
		result.add(new Object[] {"abcdefg9>h'''''''''''''''''''''''''''40>*", "h/h0/abcdefg9h40"} ); 
		result.add(new Object[] {"abcdefg9>hi''''''''''''''''''''''''''40>*", "h/h0/abcdefg9hi40"} ); 
		result.add(new Object[] {"abcdefg9>hijklmnopqrstuvwxyzabcdefghi40>*", "h/h0/abcdefg9hijklmnopqrstuvwxyzabcdefghi40"} ); 
		result.add(new Object[] {"abcdefg9>hijklmnopqrstuvwxyzabcdefghi40>j", "h/hj/abcdefg9hijklmnopqrstuvwxyzabcdefghi40j"} ); 
		result.add(new Object[] {"abcdefg9>hijklmnopqrstuvwxyzabcdefghi40>jk","h/hj/abcdefg9hijklmnopqrstuvwxyzabcdefghi40jk"} ); 
		result.add(new Object[] {"'''''''9>'''''''abc''''''''''''''''''40>*", "9/90/9abc40"} ); 
		result.add(new Object[] {"'''''''9>*'''''''''''''''''''''''''''40>*abc'", "9/90/940abc"} ); 
		result.add(new Object[] {"", "a/at/unaddressable_subject"} ); 
		result.add(new Object[] {"Re: ", "a/at/unaddressable_subject"} ); 
		result.add(new Object[] {null, "a/at/unaddressable_subject"} ); 
		result.add(new Object[] {"*", "a/at/unaddressable_subject"} ); 
		result.add(new Object[] {"1.5.0", "0/00/1_5_0"} ); 

		return result;
	}

	public ThreadKeyGeneratorImplTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void testGetThreadKey() {
		assertEquals(expected, generator.getThreadKey(input));
	}
}