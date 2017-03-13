package com.octo.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import com.octo.utils.CalculatorConstants;

public class CalculateServlet extends HttpServlet {
	/**
	 * CalculateServlet doGet method
	 */
	private static final long serialVersionUID = 1L;
	private DemoCalculator calculator = new DemoCalculator();
	private Integer number1 = new Integer(0);
	private Integer number2 = new Integer(0);
	private Integer number3 = new Integer(1);
	int result = 0;
	int resultNotUsed = 0;
	
	
	//Implement addition CALC-1
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int abc = 10;
		String numberStr1 = request.getParameter("number1");
		System.out.println("The numberStr1 " + numberStr1);
		String numberStr2 = request.getParameter("number2");
		System.out.println("The numberStr2" + numberStr2);
		String mathOp = request.getParameter("mathOperation");
		System.out.println("The mathOp" + mathOp);
		if (numberStr1 != null && !numberStr1.isEmpty())
			number1 = Integer.parseInt(numberStr1);
		
		if (numberStr2 != null && !numberStr2.isEmpty())
			number2 = Integer.parseInt(numberStr2);
		
		if (mathOp.equals(CalculatorConstants.ADDITION)) {
			result = calculator.findSum(number1.intValue(),  number2.intValue());
			System.out.println("The result is " +  result);
		}else if(mathOp.equals(CalculatorConstants.SUBTRACTION)) {
			result = calculator.findDifference(number1.intValue(), number2.intValue());
			System.out.println("The result is " + result);
			System.out.println("The result is " + result);
			System.out.println("The result is " + result);
			System.out.println("The result is " + result);
			System.out.println("The result is " + result);
			System.out.println("The result is " + result);
		}else if(mathOp.equals(CalculatorConstants.MULTIPLICATION)) {
			result = calculator.findProduct(number1.intValue(), number2.intValue());
			System.out.println("The result is " + result);
			System.out.println("The result is " + result);
			int cde = 10;
			System.out.println("The result is " + result);
			int def = 100;
			int efg = 114;
		}else if(mathOp.equals(CalculatorConstants.DIVISION)) {
			try {
				result = calculator.findDivision(number1.intValue(), number2.intValue());
				System.out.println("The result is " + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			boolean booleanResult = true;
			booleanResult = calculator.compareNumbers(number1.intValue(), number2.intValue());
			System.out.println("The result is " + booleanResult);
			result = (booleanResult) ? 1 : 0;
			System.out.println("The result is " + booleanResult);
			System.out.println("The result is " + booleanResult);
			System.out.println("The result is " + booleanResult);
		}
		request.setAttribute("result", result);
		//Forwarding to result.jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("/result.jsp");
	    dispatcher.forward(request, response);
	    return;
	}

}
