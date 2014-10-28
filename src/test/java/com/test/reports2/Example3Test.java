package com.test.reports2;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example3Test {
	private static final Logger LOGGER = LoggerFactory.getLogger(Example3Test.class);

	@Test
	public void testPrint1() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example3Test#testPrint1");
		LOGGER.error("Just print 1");
		System.err.println("Error 1");
	}
	
	@Test
	public void testPrint2() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example3Test#testPrint2");
		LOGGER.error("Just print 2");
		System.err.println("Error 2");
	}
}
