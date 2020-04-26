package com.testautomation.junit;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitOtherAnnotations {

	// @Ignore -> marks that the test should be disabled. This is useful when the
	// underlying code has been changed and the test case has not yet been adapted
	// or if the execution time of this test is too long to be included. It is best
	// practice to provide the optional description, why the test is disabled.
	@Ignore
	public void disabledMethod1() {
		System.out.println("This method will not get executed.");
	}

	@Ignore("This is disabled to demonstrate the disabled functionality of JUnit")
	public void disabledMethod2() {
		System.out.println("This method will not get executed.");
	}

	// the below test fails if the method does not throw the named exception.
	@Test(expected = ArithmeticException.class)
	public void exceptionTest() {
		System.out.println("Inside the exceptionTest() method");
		int num = 24 / 0;
	}

	// the below test fails if the method takes longer than 5000 milliseconds.
	@Test(timeout = 5000)
	public void timeoutTest() {
		System.out.println("Inside the timeoutTest() method");
		try {
			Thread.sleep(4000);
			System.out.println("Waited for 4000 milliseconds (4 seconds)");
			Thread.sleep(6000);
			System.out.println("Waited for 6000 milliseconds (6 seconds)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
