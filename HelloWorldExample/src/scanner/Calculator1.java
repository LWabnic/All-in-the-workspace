package scanner;

import exceptions.CustomException;

public class Calculator1 {

	public static double result;
	
	public static double add(double num1,double num2) {
		result = num1 + num2;
		
		return result;
	}
	public static double sub(double firstNumber,double secondNumber) {
		result = firstNumber - secondNumber;
		
		return result;
	}
	public static double mul(double firstNumber,double secondNumber) {
		result = firstNumber * secondNumber;
		
		return result;
	}
	public static double div(double firstNumber,double secondNumber) throws ArithmeticException {
		
		if(secondNumber==0) {
			throw new ArithmeticException("Can't divide it by zero");
		}
		else if(secondNumber>firstNumber){
			throw new CustomException("Can't divide a larger number");
		}else{
			result = firstNumber / secondNumber;
		}
		
		
		return result;
	}
}
