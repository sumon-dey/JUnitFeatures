package com.testautomation.junit5;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnit5TestSuiteRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnit5TestSuite.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
