package exceptions;

public class CustomException extends ArithmeticException {

	public CustomException(String string) {
		super("Custom"+string);
	}
}
