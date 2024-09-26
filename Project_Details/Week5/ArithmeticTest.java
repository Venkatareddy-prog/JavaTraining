package com.junit5eg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.junitchk.Arithmetic;

class ArithmeticTest {
	static Arithmetic arithmetic;

	@BeforeAll
	static void befallmet() {
		System.out.println("Before All method");
		arithmetic = new Arithmetic();

	}

	/*
	 * @BeforeEach void befeachmet() { System.out.println("Before Each method"); }
	 */

	@Test
	void testAdd() {
		assertEquals(6, arithmetic.add(3, 3), "Addition should return the sum of two numbers");
	}

	@Test
	void testSubtract() {
		assertEquals(1, arithmetic.subtract(5, 4), "Subtraction should return the difference of two numbers");
	}

	@Test
	void testMultiply() {
		assertEquals(6, arithmetic.multiply(2, 3), "Multiplication should return the product of two numbers");
	}

	@Test
	void testDivide() {
		assertEquals(2, arithmetic.divide(6, 3), "Division should return the quotient of two numbers");
	}

	@Test
	void testDivideByZero() {
		ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetic.divide(1, 0),
				"Division by zero should throw ArithmeticException");
		assertEquals("Cannot divide by zero", thrown.getMessage());
	}
}