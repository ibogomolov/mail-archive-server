package org.apache.sling.mailarchiveserver.impl;

import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.makeJcrFriendly;
import static org.apache.sling.mailarchiveserver.impl.MessageStoreImpl.removeRe;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageStoreImplStaticMethodsTest {
	
	@Test
	public void testMakeJcrFriendly() {
		assertEquals("Remove each char", "", makeJcrFriendly("��!@#$%^&*()+={}[]<>,/?\\;:'\""));
		assertEquals("Substitute each char with _ char, trimming", "a", makeJcrFriendly(".a_")); 
		assertEquals("Substitute each char with _ char", "b____e", makeJcrFriendly("b_ .-e"));
	}

	@Test
	public void testRemoveRe() {
		assertEquals(removeRe("abc"), "abc");
		assertEquals(removeRe("Re:re"), "re");
		assertEquals(removeRe("Re: abc"), "abc");
		assertEquals(removeRe("RE: abc"), "abc");
		assertEquals(removeRe("rE: abc"), "abc");
		assertEquals(removeRe("re: RE: "), "");
		assertEquals(removeRe("re: abc"), "abc");
		assertEquals(removeRe("re: abc"), "abc");
	}
}
