package interfaces;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
//		Calculator c1=new Calculator();
//		System.out.println(c1.sumOfDivisors(1000));

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String username=scan.nextLine();
		System.out.println(username);
		System.out.println("Enter your age: ");
	
		
		int age=scan.nextInt();
		
		System.out.println(age);
		scan.close();
		
	}

}
