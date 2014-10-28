package com.test.reports3;

import org.apache.log4j.Logger;
import org.junit.Test;

public class NotManyLogsTest {
	Logger logger = Logger.getLogger(NotManyLogsTest.class);

	@Test
	public void generateTests100() {
		Helper.generate(logger, 100);
	}

	@Test
	public void generateTests1000() {
		Helper.generate(logger, 1000);
	}

	@Test
	public void generateTests10000() {
		Helper.generate(logger, 10000);
	}

}
