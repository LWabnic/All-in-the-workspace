package co.uk.idestsoft;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String message = "Hello";
		//System.out.println(message + " World");
		System.out.println(sayHi("Hello World"));
		sayHi2("Hello World");
		
	}
	
	public static String sayHi(String input){
		
		
		String message=input;
		return message;
	}
	
	public static void sayHi2(String input){
		
		System.out.println(input);
	}

}
