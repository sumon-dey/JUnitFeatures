package com.testautomation.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.testautomation.junit5")
public class JUnit5TestSuiteWithPackages {

}
