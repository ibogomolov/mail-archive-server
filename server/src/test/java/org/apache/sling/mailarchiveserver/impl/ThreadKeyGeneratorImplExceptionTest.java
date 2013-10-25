package org.apache.sling.mailarchiveserver.impl;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadKeyGeneratorImplExceptionTest {
	private ThreadKeyGeneratorImpl generator = new ThreadKeyGeneratorImpl();

	@Test
	public void getThreadKeyEqualityTest() {
		String orig = "Chef cookbooks for Installing CQ & packages";
		String re = "Re: Chef cookbooks for Installing CQ & packages";
		assertEquals(generator.getThreadKey(orig), generator.getThreadKey(re));
	}
}