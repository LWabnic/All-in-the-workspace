package scanner;

import java.util.Scanner;

public class Menu1 {

	Scanner input =new Scanner(System.in);
	
	public void menu() {
		boolean menuFlag=true;
		String menuOption="";
		double num1;
		double num2;
		
		System.out.println("Welcome");
		
		while(menuFlag) {
			System.out.println("=".repeat(40));
			System.out.println("Select the operation option");
			System.out.println("=".repeat(40));
			System.out.println("\t1). Addition");
			System.out.println("\t2). Subtraction");
			System.out.println("\t3). Multiplication");
			System.out.println("\t4). Division");
			System.out.println("=".repeat(40));
			System.out.println("\t0). EXIT");
			
			menuOption=this.input.nextLine();
			
			switch(menuOption) {
				case "1":
					System.out.println("Please enter first number");
					num1=input.nextDouble();
					System.out.println("Please enter second number");
					num2=input.nextDouble();
					System.out.println("Your answer is: ");
					System.out.println(scanner.Calculator1.add(num1, num2));
					break;
				case "2":
					System.out.println("Please enter first number");
					num1=input.nextDouble();
					System.out.println("Please enter second number");
					num2=input.nextDouble();
					System.out.println("Your answer is: ");
					System.out.println(Calculator1.sub(num1, num2));
					break;
				case "3":
					System.out.println("Please enter first number");
					num1=input.nextDouble();
					System.out.println("Please enter second number");
					num2=input.nextDouble();
					System.out.println("Your answer is: ");
					System.out.println(Calculator1.mul(num1, num2));
					break;
				case "4":
					System.out.println("Please enter first number");
					num1=input.nextDouble();
					System.out.println("Please enter second number");
					num2=input.nextDouble();
					System.out.println("Your answer is: ");
					System.out.println(Calculator1.div(num1, num2));
					break;
				case "0":
					menuFlag=false;
					System.out.println("Bye!");
					break;
				default:
					System.out.println("Try again: ");
				
			}
		}
	}
}
