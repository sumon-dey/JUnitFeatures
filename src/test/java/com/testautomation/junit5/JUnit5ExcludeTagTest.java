package com.testautomation.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ JUnit5Tag.class })
@ExcludeTags({ "test1" })

public class JUnit5ExcludeTagTest {

}
