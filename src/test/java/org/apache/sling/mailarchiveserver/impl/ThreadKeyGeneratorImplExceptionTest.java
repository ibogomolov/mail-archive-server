package org.apache.sling.mailarchiveserver.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.stream.Field;
import org.apache.sling.mailarchiveserver.impl.ThreadKeyGeneratorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Matchers;

@RunWith(Parameterized.class)
public class ThreadKeyGeneratorImplExceptionTest {
	private ThreadKeyGeneratorImpl generator = new ThreadKeyGeneratorImpl();
	private final String input;

	@Parameters(name="{1}")
	public static List<Object[]> data() {
		final List<Object[]> result = new ArrayList<Object[]>();
		
		result.add(new Object[] {null, "subject header should exist"} ); 
		result.add(new Object[] {"", "subject should not be empty"} ); 
		result.add(new Object[] {"0123456789 \t!@#$^&()_+=-[]{}/?.>,<\\", "subject should contain at least 1 letter"} ); 

		return result;
	}

	public ThreadKeyGeneratorImplExceptionTest(String input, String expected) {
		this.input = input;
	}

	@Test(expected=RuntimeException.class)
	public void getThreadKeyException() {
		final Message m = mock(Message.class);
		final Header header = mock(Header.class);
		final Field subject = mock(Field.class);
		when(m.getHeader()).thenReturn(header);
		when(header.getField(Matchers.same("Subject"))).thenReturn(subject);
		when(subject.getBody()).thenReturn(input);
		generator.getThreadKey(m);
	}
}