package scanner;

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
	public static double div(double firstNumber,double secondNumber) {
		result = firstNumber / secondNumber;
		
		return result;
	}
}
