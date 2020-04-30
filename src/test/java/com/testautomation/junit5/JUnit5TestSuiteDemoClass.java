package com.testautomation.junit5;

public class JUnit5TestSuiteDemoClass {

	private String message;

	// Constructor
	// @param message to be printed
	public JUnit5TestSuiteDemoClass(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
