package co.uk.idestsoft;

public class FlowChart {

//	public static int method1(int a,int b,boolean c) {
//		if(c) {
//		return a+b;
//		}else {
//			return a*b :
//		}

	public static void method2(int A) {
		
		if(A>2000){
		System.out.println("A");
			if (A>6000){
			System.out.println("C");}
			
			else if (A<6000){
			System.out.println("B");
			if(A>4000){
					System.out.println("D");}
			//else if(A<4000){
				else {
				System.out.println("E");}
		}}
		
		
		else{

			if(A>100) {
				System.out.println(3);
				if(A<600) {
					System.out.println(4);
					if(A>500){
						System.out.println(6);
					}
					else {
						System.out.println(7);
					}
					
				}
				else {
					System.out.println(5);
				}
			}
			else {
				System.out.println(2);
			}
		}
		
	
		
		
		}
}
