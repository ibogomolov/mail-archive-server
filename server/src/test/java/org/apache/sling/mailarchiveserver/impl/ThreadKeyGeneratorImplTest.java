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
		
//		result.add(new Object[] {"'''''''9>*'''''''''''''''''''''''''''40>*", ""} ); 
		result.add(new Object[] {"'abc'''9>*'''''''''''''''''''''''''''40>*", "c/cc/abc940"} ); 
		result.add(new Object[] {"abcdefg9>*'''''''''''''''''''''''''''40>*", "g/gg/abcdefg940"} ); 
		result.add(new Object[] {"abcdefg9>h'''''''''''''''''''''''''''40>*", "h/hh/abcdefg9h40"} ); 
		result.add(new Object[] {"abcdefg9>hi''''''''''''''''''''''''''40>*", "h/hi/abcdefg9hi40"} ); 
		result.add(new Object[] {"abcdefg9>hijklmnopqrstuvwxyzabcdefghi40>*", "h/hi/abcdefg9hijklmnopqrstuvwxyzabcdefghi40"} ); 
		result.add(new Object[] {"abcdefg9>hijklmnopqrstuvwxyzabcdefghi40>j", "h/hj/abcdefg9hijklmnopqrstuvwxyzabcdefghi40j"} ); 
		result.add(new Object[] {"abcdefg9>hijklmnopqrstuvwxyzabcdefghi40>jk", "h/hj/abcdefg9hijklmnopqrstuvwxyzabcdefghi40jk"} ); 
		result.add(new Object[] {"'''''''9>'''''''abc''''''''''''''''''40>*", "a/ac/9abc40"} ); 
		result.add(new Object[] {"'''''''9>*'''''''''''''''''''''''''''40>*abc'", "a/aa/940abc"} ); 

		return result;
	}

	public ThreadKeyGeneratorImplTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void testGetThreadKey() {
//		final Message m = mock(Message.class);
//		final Header header = mock(Header.class);
//		final Field subject = mock(Field.class);
//		when(m.getHeader()).thenReturn(header);
//		when(header.getField(Matchers.same("Subject"))).thenReturn(subject);
//		when(subject.getBody()).thenReturn(input);
		assertEquals(expected, generator.getThreadKey(input));
	}
}