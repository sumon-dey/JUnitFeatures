package com.testautomation.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.ValueSource;

public class JUnit5Parameterization2 {

	@ParameterizedTest
	@ValueSource(ints = { 1, 12, 42 })
	public void testWithExplicitArgumentConversion(@ConvertWith(ToOctalStringArgumentConverter.class) String argument) {
		System.out.println(argument);
		assertNotNull(argument);
	}
}

class ToOctalStringArgumentConverter extends SimpleArgumentConverter {

	@Override
	protected Object convert(Object source, Class<?> targetType) {
		assertEquals(Integer.class, source.getClass(), "Can only convert from Integers.");
		assertEquals(String.class, targetType, "Can only convert to String");
		return Integer.toOctalString((Integer) source);
	}
}
