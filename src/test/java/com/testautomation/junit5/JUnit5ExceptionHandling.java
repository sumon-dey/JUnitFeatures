package com.testautomation.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit5ExceptionHandling {

	@Test
	void testExpectedException() {
		Throwable exception = Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("One");
		});
		System.out.println(exception.getMessage());
	}

	@Test
	void testExpectedExceptionWithSuperType() {
		Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("One");
		});
		System.out.println(exception.getMessage());
	}

	@Test
	void testExpectedExceptionFail() {
		// no exception will be thrown here and this test will fail
		Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("1");
		});
		System.out.println(exception.getMessage());
	}

}
