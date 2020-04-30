package com.testautomation.junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class JUnit5Parameterization {

	@ParameterizedTest
	@MethodSource(value = "data")
	public void testWithParameter(int[] data) {
		MyClass2 myClass2 = new MyClass2();
		int m1 = data[0];
		int m2 = data[1];
		int expected = data[2];
		assertEquals(expected, myClass2.multiply(m1, m2));
	}

	public static int[][] data() {
		return new int[][] { { 1, 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
	}
}

class MyClass2 {
	public int multiply(int i, int j) {
		return i * j;
	}
}
