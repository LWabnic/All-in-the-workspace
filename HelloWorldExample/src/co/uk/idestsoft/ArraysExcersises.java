package co.uk.idestsoft;

public class ArraysExcersises {

	public static void method1() {

		int[] my = new int[10];

		for (int i = 0; i < 10; i++) {
			my[i] = i;
			System.out.println(my[i]);
		}
	}

	public static void method2() {

		int[] my = new int[10];
		

		for (int i = 0; i < 10; i++) {
			my[i] = i;
		}
		for (int i = 0; i < my.length; i++) {
			System.out.println(my[i] * 10);

		}

	}
	public static void method3() {

		int[] my1 = new int[20];

		for (int i = 0; i < 20; i++) {
			my1[i] = i;
		}
		
		for(int i : my1) {
			System.out.println(i*i);
			
		}
	}
	public static boolean method4(int inp) {

	if(inp%2==0) {
		return true;
			
		}
	else return false;
	}
	
	public static void method5() {

		int[] my = new int[10];
		

		for (int i = 0; i < 10; i++) {
			my[i] = i;
		}
		for(int i:my) {
			
			if(method4(i)) {
				System.out.println(i*i*i);
			}
			else {
				System.out.println(i*i);
			}
		}

	}
	
   

}
