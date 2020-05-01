package com.testautomation.junit5;

/*@Nested annotation lets us nest inner test classes to force a certain execution order. 
 * It is used to group tests together. It is optional to create nested tests.
 * It helps to create hierarchical contexts to structure the related unit tests together.
 * It helps to keep the tests clean and readable.*/

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Outer Class")
public class JUnit5GroupingTests {

	@Test
	@DisplayName("Test of Outer Class")
	public void outerTest() {
		System.out.println("Inside the outerTest() method");
	}

	@Nested
	@DisplayName("Inner Class1")
	public class InnerClass1 {

		@Test
		public void innerClass1Test1() {
			System.out.println("Inside the innerClass1Test1() method");
		}

		@Test
		public void innerClass1Test2() {
			System.out.println("Inside the innerClass1Test2() method");
		}

		@Test
		public void innerClass1Test3() {
			System.out.println("Inside the innerClass1Test3() method");
		}

	}

	@Nested
	@DisplayName("Inner Class2")
	public class InnerClass2 {

		@Test
		public void innerClass2Test1() {
			System.out.println("Inside the innerClass2Test1() method");
		}

		@Test
		public void innerClass2Test2() {
			System.out.println("Inside the innerClass2Test2() method");
		}

		@Test
		public void innerClass2Test3() {
			System.out.println("Inside the innerClass2Test3() method");
		}

	}

	@Nested
	@DisplayName("Inner Class3")
	public class InnerClass3 {

		@Test
		public void innerClass3Test1() {
			System.out.println("Inside the innerClass3Test1() method");
		}

		@Test
		public void innerClass3Test2() {
			System.out.println("Inside the innerClass3Test2() method");
		}

		@Test
		public void innerClass3Test3() {
			System.out.println("Inside the innerClass3Test3() method");
		}
	}
}
