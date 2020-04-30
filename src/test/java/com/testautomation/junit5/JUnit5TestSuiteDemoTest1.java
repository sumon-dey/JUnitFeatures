package com.testautomation.junit5;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnit5TestSuiteDemoTest1 {

	String message = "Sam";
	JUnit5TestSuiteDemoClass messageUtil = new JUnit5TestSuiteDemoClass(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
