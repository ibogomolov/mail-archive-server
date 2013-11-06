package org.apache.sling.mailarchiveserver.impl;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadKeyGeneratorImplSubjectTest {
	private ThreadKeyGeneratorImpl generator = new ThreadKeyGeneratorImpl();

	@Test
	public void getThreadKeyEqualityTest() {
		String orig = "Chef cookbooks for Installing CQ & packages";
		String re = "Re: Chef cookbooks for Installing CQ & packages";
		assertEquals(generator.getThreadKey(orig), generator.getThreadKey(re));
	}
	
	@Test
	public void getThreadKeyEqualityTest2() {
		String orig = "Dropbox to throw random files in and be accessible through http/ ftp?";
		String re = "Re: Dropbox to throw random files in and be accessible through http/ ftp?";
		String re2 = "RE: Dropbox to throw random files in and be accessible through http/ ftp?";
		assertEquals(generator.getThreadKey(orig), generator.getThreadKey(re));
		assertEquals(generator.getThreadKey(orig), generator.getThreadKey(re2));
	}
}