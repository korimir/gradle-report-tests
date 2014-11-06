package com.test.reports4;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelComputingTest {
	final static Logger logger = Logger.getLogger(ParallelComputingTest.class);

	@Test
	public void test() {
		Class<?>[] cls = { ParallelTest1.class, ParallelTest2.class };

		//Parallel among methods in a class  
		JUnitCore.runClasses(ParallelComputer.methods(), cls);
	}

	public static class ParallelTest1 {
		@Test
		public void a() throws InterruptedException {
			for (int i = 0; i < 1000; i++) {
				logger.debug("ParallelTest1#a");
				Thread.sleep(1);
			}
		}

		@Test
		public void b() throws InterruptedException {
			for (int i = 0; i < 1000; i++) {
				logger.debug("ParallelTest1#b");
				Thread.sleep(1);
			}
		}
	}

	public static class ParallelTest2 {
		@Test
		public void a() throws InterruptedException {
			for (int i = 0; i < 1000; i++) {
				logger.debug("ParallelTest2#a");
				Thread.sleep(1);
			}
		}

		@Test
		public void b() throws InterruptedException {
			for (int i = 0; i < 1000; i++) {
				logger.debug("ParallelTest2#b");
				Thread.sleep(1);
			}
		}
	}

}
