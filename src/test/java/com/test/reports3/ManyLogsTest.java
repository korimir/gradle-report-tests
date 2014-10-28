package com.test.reports3;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class ManyLogsTest {
	Logger logger = Logger.getLogger(ManyLogsTest.class);

	@Test
	public void generateTests100000_1() {
		Helper.generate(logger, 100000);
	}
	
	@Test
	public void generateTests100000_2() {
		Helper.generate(logger, 100000);
	}

}
