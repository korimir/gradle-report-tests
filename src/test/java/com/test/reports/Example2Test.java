package com.test.reports;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example2Test {
	private static final Logger LOGGER = LoggerFactory.getLogger(Example2Test.class);

	@Test
	public void testPrint1() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example2Test#testPrint1");
		LOGGER.error("Just print 1");
		System.err.println("Error 1");
	}
	
	@Test
	public void testPrint2() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example2Test#testPrint2");
		LOGGER.error("Just print 2");
		System.err.println("Error 2");
	}
	
	@Test
	public void testPrint3() {
	}
	
	@Test
	public void testPrint4() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example2Test#testPrint2");
		LOGGER.error("Just print 2");
		System.err.println("Error 2");
	}
}
