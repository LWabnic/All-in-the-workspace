package co.uk.idestsoft;

public class FizzBuzz {

	public static void method1(int input) {
		
		if(input%3==0 && input%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(input%5==0)
		{
			System.out.println("Buzz");
		}
		else if(input%3==0 ) {
			System.out.println("Fizz");
		}
		else {
			System.out.println(input);
		}
	}
	

}
