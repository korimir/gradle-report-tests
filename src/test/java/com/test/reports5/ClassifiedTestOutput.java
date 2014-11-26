package com.test.reports5;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassifiedTestOutput {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClassifiedTestOutput.class);
	private static final Logger CLIENT_IN = LoggerFactory.getLogger("CLIENT_IN");
	private static final Logger CLIENT_OUT = LoggerFactory.getLogger("CLIENT_OUT");
	private static final Logger EXTERNAL_IN = LoggerFactory.getLogger("EXTERNAL_IN");
	private static final Logger EXTERNAL_OUT = LoggerFactory.getLogger("EXTERNAL_OUT");

	@Test
	public void test() {
		LOGGER.debug("Initializing...");
		for (int i = 0; i < 20; i++) {
			LOGGER.debug("Configuring stage " + i + "...");
		}

		for (int i = 0; i < 3; i++) {
			CLIENT_IN.debug("Receiving message: NewOrderSingle " + i);
			if (i == 1) {
				LOGGER.error("Error during processing message " + i);
				CLIENT_OUT.debug("Returning reject: ExecutionReport " + i);
			} else {
				for (int j = 0; j < 8; j++) {
					LOGGER.debug("Processing stage " + j + "...");
				}
				EXTERNAL_OUT.debug("Sending message: 35=D|34=" + i);
				EXTERNAL_IN.debug("Receiving response: 35=8|34=" + i);
				for (int j = 0; j < 4; j++) {
					LOGGER.debug("Handling response in stage " + j + "...");
				}
				CLIENT_OUT.debug("Returning accept: ExecutionReport " + i);
			}
		}
	}
}
