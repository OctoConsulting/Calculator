package com.octo.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * Author: Viswanath Nandanavanam
 
 */
public class CalculatorTest {
	private static DemoCalculator calculator = new DemoCalculator();
	
	@After
	public void afterEachTest() {
		System.out.println("This is executed after each Test");
	}

	@Test
	public void testSum() {
		int result = calculator.findSum(5, 5);
		int result1 = calculator.findSum(4, 5);
		assertEquals(10, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.findDivision(16, 2);
			assertEquals(8, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.findDivision(10, 0);
	}

	@Test
	public void testEqual() {
		boolean result = calculator.compareNumbers(20, 20);

		assertTrue(result);
	}

	@Test
	public void testSubstraction() {
		int result = calculator.findDifference(10,3);

		assertEquals(7, result);
	}
	}
