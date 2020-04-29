package com.testautomation.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*If we have several test classes, we can combine them into a test suite. 
 * Running a test suite executes all test classes in that suite in the specified order. 
 * A test suite can also contain other test suites.*/
@RunWith(Suite.class)
@SuiteClasses({ JUnitDemo2.class, JUnitDemo1.class })
public class JUnitTestSuite {

}
