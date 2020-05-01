package com.testautomation.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/*@Tag annotation can be used to filter test cases from test plans. 
 * It can help to create multiple different test plans for different environments, 
 * different use-cases or any specific requirement. We can execute set of tests by 
 * including only those tagged tests in test plan or by excluding other tests from test plan.
 * We cannot include both @IncludeTags and @ExcludeTags annotations in single test plan.*/

@Tag("MainClass")
public class JUnit5Tag {

	@Test
	@Tag("TestInsideMainClass")
	@Tag("test1")
	public void test1() {
		System.out.println("Inside the test1() method");
	}

	@Test
	@Tag("TestInsideMainClass")
	@Tag("test2")
	public void test2() {
		System.out.println("Inside the test2() method");
	}

}
