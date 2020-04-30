package com.testautomation.junit5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnit5TestSuiteDemoTest2 {

	String message = "Sam";
	JUnit5TestSuiteDemoClass messageUtil = new JUnit5TestSuiteDemoClass(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
