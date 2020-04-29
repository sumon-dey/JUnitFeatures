package com.testautomation.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class JUnit5CommonAnnotations {

	// this gets executed before each test. It is used to prepare the test
	// environment e.g. reading input data, initializing the class etc.
	@BeforeEach
	public void beforeEach() {
		System.out.println("JUnit5 -> Inside beforeEach() method");
	}

	@Test
	public void test1() {
		System.out.println("JUnit5 -> Inside test1() method");
	}

	// to run the test 3 times
	@RepeatedTest(3)
	public void test2() {
		System.out.println("JUnit5 -> Inside test2() method");
	}

	// the method is a factory for dynamic tests
	@TestFactory
	public void test3() {
		System.out.println("JUnit5 -> Inside test3() method");
	}

	// this gets executed after each test. It is used to cleanup the test
	// environment e.g. deleting temporary data, restoring defaults etc. It can also
	// save memory by cleaning up expensive memory structures.
	@AfterEach
	public void afterEach() {
		System.out.println("JUnit5 -> Inside afterEach() method");
	}

}
