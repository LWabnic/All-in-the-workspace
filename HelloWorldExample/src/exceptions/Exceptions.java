package exceptions;

public class Exceptions {

	public static void division(int a,int b) {
		try {System.out.println(a/b);}	
		catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}
		finally {System.out.println("Finally");
		}
		
	
	
	}
	
		
	
}
