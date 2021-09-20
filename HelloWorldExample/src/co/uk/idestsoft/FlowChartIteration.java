package co.uk.idestsoft;

public class FlowChartIteration {
	public static void method1() {
		int a=100;
		for(int i=100;i<201;i++) {
			
			System.out.println(a++);
		}
	}
	
	public static void method2() {
		int a=100;
		
		for(int i=100;i<=200;i++) {
			if(a%2==0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
			a++;
		}
	}
	
	public static void method3() {
		for(int i=1;i<=10;i++) {
			for(int j=0;j<11;j++) {
				System.out.println(i);
			}
		}
	}
	public static void method5() {
		for(int i=1;i<11;i++) {
			for(int j=0;j<i;j++)
			{
				System.out.println(i);
			}
		}
	}

}
