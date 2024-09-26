package com.junit5eg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.junitchk.Calculate;

public class CalculateTests {
	Calculate calculate;

	@BeforeEach
	void met() {
		calculate = new Calculate();
	}

	@ParameterizedTest
	@CsvSource({ "1, 1, 2", "2, 3, 5", "4, 5, 9", "10, 20, 30", "0, 0, 0" })
	void testAddition(int a, int b, int expectedSum) {
		int actual_value = calculate.add(a, b);
		assertEquals(expectedSum, actual_value, "The sum of " + a + " and " + b + " should be " + expectedSum);
	}
}
