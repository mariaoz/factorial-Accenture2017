package org.accenture.fac;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	private Factorial factorial;

	@Before
	public void init() {
		factorial = new Factorial();
	}

	@Test
	public void shouldFactorialOfZeroReturnOne() {

		long result = factorial.compute(0);
		long expectedValue = 1;

		assertEquals(expectedValue, result);

	}

	@Test
	public void shouldFactorialOfOneReturnOne() {

		long result = factorial.compute(1);
		long expectedValue = 1;

		assertEquals(expectedValue, result);

	}

	@Test
	public void shouldFactorialOfTwoReturnTwo() {

		long result = factorial.compute(2);
		long expectedValue = 2;

		assertEquals(expectedValue, result);

	}

	@Test
	public void shouldFactorialOfFiveReturn120() {
		long result = factorial.compute(5);
		long expectedValue = 120;

		assertEquals(expectedValue, result);

	}
	@Test(expected= RuntimeException.class)
	public void shouldFactorialOfNegativeNumberSendAnException() {
		factorial.compute(-1);

	}
}
