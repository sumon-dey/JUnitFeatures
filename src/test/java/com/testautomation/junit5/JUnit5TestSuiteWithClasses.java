package com.testautomation.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ JUnit5TestSuiteDemo1.class, JUnit5TestSuiteDemo2.class })
public class JUnit5TestSuiteWithClasses {

}
