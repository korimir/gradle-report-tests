package com.test.reports;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example1Test {
	private static final Logger LOGGER = LoggerFactory.getLogger(Example1Test.class);
	
	@BeforeClass
	public static void setup() {
		LOGGER.debug("Writing setup for this examples");
	}

	@Test
	public void testPrint1() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example1Test#testPrint1");
		LOGGER.error("Just print 1");
		System.err.println("Error 1");
		LOGGER.error("Just print 1 another");
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example1Test#testPrint1");
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example1Test#testPrint1");
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example1Test#testPrint1");
	}

	@Test
	public void testPrint2() {
		LOGGER.debug("Hello");
		LOGGER.debug("This is Example1Test#testPrint2");
		LOGGER.error("Just print 2");
		System.err.println("Error 2");
	}
}
