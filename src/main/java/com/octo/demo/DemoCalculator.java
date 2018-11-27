/**
 * Hygieia demo
 */
package com.octo.demo;

/**
 * @author Viswanath.Nandanavanam
 */
public class DemoCalculator implements DemoCalculatorInterface {

	/**
	 * This is the demo calculator class Constructor
	 */
	public DemoCalculator() {
		// TODO Auto-generated constructor stub
		
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findSum(int, int)
	 * Addition of two numbers simple addition
	 */
	public int findSum(int a, int b) {
		int c;
		c = a+b;
		System.out.println("The value of a" + a + " The value of b is " + b);
		System.out.println("The value of a" + a + " The value of b is " + b);
		return c;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface
	 * #findDifference(int, int)
	 */
	public int findDifference(int a, int b) {
		int c;
		c = a-b;
		System.out.println("The difference is" + c);
		return c;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface
	 * #findProduct(int, int)
	 */
	public int findProduct(int a, int b) {
		int c;
		c = a*b;
		return c;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#findDivision(int, int)
	 */
	public int findDivision(int a, int b) throws Exception {
		int c= 0;
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}
		c = a/b;
		return c;
	}

	/* (non-Javadoc)
	 * @see com.octo.sonar.demo.sampleproject.DemoCalculatorInterface#compareNumbers(int, int)
	 */
	public boolean compareNumbers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}else{
			result = false;
		}

		return result;
	}

}
