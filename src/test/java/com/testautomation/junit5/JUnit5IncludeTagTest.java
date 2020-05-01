package com.testautomation.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ JUnit5Tag.class })
@IncludeTags({ "test1", "test2" })

public class JUnit5IncludeTagTest {

}
