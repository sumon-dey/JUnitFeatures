package com.testautomation.junit5;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;

public class JUnit5DisablingTests {

	/* The @Disabled annotation allows to statically ignore a test. */
	@Disabled
	public void disabledMethod1() {
		System.out.println("This method will not get executed.");
	}

	/* The @Disabled annotation allows to statically ignore a test. */
	@Disabled("Due to some issue this test has been disabled")
	public void disabledMethod2() {
		System.out.println("This method will not get executed.");
	}

	@Test
	public void enabledMethod() {
		System.out.println("This method will get executed.");
	}

	// Assumptions.assumeFalse marks the test as invalid, if its condition evaluates
	// to true.
	@Test
	public void testOnDev1() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), JUnit5DisablingTests::message);
		// remainder of test will be aborted
		System.out.println("This method will not get executed.");
	}

	@Test
	public void testOnProd1() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
		// remainder of test will proceed
		System.out.println("This method will get executed.");
	}

	// Assumptions.assumeTrue evaluates the test as invalid if its condition
	// evaluates to false.
	@Test
	public void testOnDev2() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		// remainder of test will proceed
		System.out.println("This method will get executed.");
	}

	@Test
	public void testOnProd2() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), JUnit5DisablingTests::message);
		// remainder of test will be aborted
		System.out.println("This method will not get executed.");
	}

	private static String message() {
		return "TEST Execution Failed :: ";
	}

}
