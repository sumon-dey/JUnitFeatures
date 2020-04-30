package com.testautomation.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class JUnit5GroupedAssertions {

	@Test
	void groupedAssertions() {
		Student student = new Student("Sam", "John");
		// In a grouped assertion, all the assertions are executed and any
		// failures will be reported together.
		assertAll("student", () -> assertEquals("Sam", student.getFirstName()),
				() -> assertEquals("John", student.getLastName()));
	}

	@Test
	void dependentAssertions() {
		// Within a code block, if an assertion fails then the
		// subsequent code in the same block will be skipped.
		Student student = new Student("Sam", "John");
		assertAll("properties", () -> {
			String firstName = student.getFirstName();
			assertNotNull(firstName);
			// this will get executed only if the previous assertion is valid.
			assertAll("first name", () -> assertTrue(firstName.startsWith("S")),
					() -> assertTrue(firstName.endsWith("m")));
		}, () -> {
			// Grouped assertion, so processed independently
			// of results of first name assertions.
			String lastName = student.getLastName();
			assertNotNull(lastName);
			// this gets executed only if the previous assertion is valid.
			assertAll("last name", () -> assertTrue(lastName.startsWith("J")),
					() -> assertTrue(lastName.endsWith("n")));
		});
	}
}

class Student {

	public String firstName;
	public String lastName;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
