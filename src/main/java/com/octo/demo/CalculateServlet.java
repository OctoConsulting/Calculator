package com.octo.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octo.utils.CalculatorConstants;

public class CalculateServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DemoCalculator calculator = new DemoCalculator();
	private Integer number1 = new Integer(0);
	private Integer number2 = new Integer(0);
	int result = 0;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String numberStr1 = request.getParameter("number1");
		String numberStr2 = request.getParameter("number2");
		String mathOp = request.getParameter("mathOperation");
		if (numberStr1 != null && !numberStr1.isEmpty())
			number1 = Integer.parseInt(numberStr1);
		
		if (numberStr2 != null && !numberStr2.isEmpty())
			number2 = Integer.parseInt(numberStr2);
		
		if (mathOp.equals(CalculatorConstants.ADDITION)) {
			result = calculator.findSum(number1.intValue(), number2.intValue());
		}else if(mathOp.equals(CalculatorConstants.SUBTRACTION)) {
			result = calculator.findDifference(number1.intValue(), number2.intValue());
		}else if(mathOp.equals(CalculatorConstants.MULTIPLICATION)) {
			result = calculator.findProduct(number1.intValue(), number2.intValue());
		}else if(mathOp.equals(CalculatorConstants.DIVISION)) {
			try {
				result = calculator.findDivision(number1.intValue(), number2.intValue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			boolean booleanResult = true;
			booleanResult = calculator.compareNumbers(number1.intValue(), number2.intValue());
			result = (booleanResult) ? 1 : 0;
		}
		request.setAttribute("result", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/result.jsp");
	    dispatcher.forward(request, response);
	    return;
	}

}
