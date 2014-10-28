package com.test.reports3;

import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Helper {

	private static final Random RANDOM = new Random();
	private static final Level[] LEVELS;
	
	static {
		LEVELS = new Level[100];
		Arrays.fill(LEVELS, 0, 2, Level.FATAL);
		Arrays.fill(LEVELS, 2, 5, Level.ERROR);
		Arrays.fill(LEVELS, 5, 10, Level.INFO);
		Arrays.fill(LEVELS, 10, 70, Level.DEBUG);
		Arrays.fill(LEVELS, 70, 100, Level.TRACE);
	}

	public static void generate(Logger logger, int count) {
		logger.info("=== start test " + count);
		StringBuilder buffer = new StringBuilder();

		count = count / 2 + RANDOM.nextInt(count / 2);
		for (int i = 0; i < count; i++) {
			final Level level = LEVELS[RANDOM.nextInt(LEVELS.length)];

			buffer.setLength(0);
			final int repetitions = RANDOM.nextInt(4) + 1;
			for (int r = 0; r < repetitions; r++) {
				buffer.append(" Test messages from ").append(i).append(" of ").append(count)
						.append(", repeating ").append(r).append(" of ").append(repetitions);
			}

			final Exception e;
			if (level == Level.ERROR && RANDOM.nextInt(100) > 95) {
				e = new Exception("Throws new exception to test it", new RuntimeException());
			} else {
				e = null;
			}
			logger.log(level, buffer, e);
		}
		
		logger.info("=== finish test " + count);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
