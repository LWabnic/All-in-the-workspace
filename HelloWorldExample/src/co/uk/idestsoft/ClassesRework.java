package co.uk.idestsoft;

public class ClassesRework {
	

		public void Change(float cost,float notes) {
			float costToPennies=cost*100;
			float notesToPennies=notes*100;
			int note50=0;
			int note20=0;
			int note10=0;
			int note5=0;
			int coin1=0;
			int coin05=0;
			int coin02=0;
			int coin01=0;
			int coin005=0;
			int coin002=0;
			int coin001=0;
			float changeInPennies=notesToPennies-costToPennies;
			
			System.out.println(changeInPennies);
			
			
		while(changeInPennies>0) {
			
			if(changeInPennies>=50*100) {
				changeInPennies-=50*100;
				note50++;
			}
			else if(changeInPennies>=20*100) {
				changeInPennies-=20*100;
				note20++;
			}
			else if(changeInPennies>=10*100) {
				changeInPennies-=10*100;
				note10++;
			}
			else if(changeInPennies>=5*100) {
				changeInPennies-=5*100;
				note5++;
			}
			else if(changeInPennies>=1*100) {
				changeInPennies-=1*100;
				coin1++;
			}
			else if(changeInPennies>=0.5*100) {
				changeInPennies-=0.5*100;
				coin05++;
			}
			else if(changeInPennies>=0.2*100) {
				changeInPennies-=0.2*100;
				coin02++;
			}
			else if(changeInPennies>=0.1*100) {
				changeInPennies-=0.1*100;
				coin01++;
			}
			else if(changeInPennies>=0.05*100) {
				changeInPennies-=0.05*100;
				coin005++;
			}
			else if(changeInPennies>=0.02*100) {
				changeInPennies-=0.02*100;
				coin002++;
			}
			else if(changeInPennies>=0.01*100) {
				changeInPennies-=0.01*100;
				coin001++;
			}
		}
		System.out.println("In total, you should have recieved:");
	    System.out.printf("Number of �50 notes: %3d  %n", note50);
	    System.out.printf("Number of �20 notes: %3d  %n", note20);
	    System.out.printf("Number of �10 notes: %3d  %n", note10);
	    System.out.printf("Number of �5 notes: %3d  %n", note5);
	    System.out.printf("Number of �1 coins: %3d  %n", coin1);
	    System.out.printf("Number of �0.5 coins:: %3d  %n", coin05);
	    System.out.printf("Number of �0.2 coins: %3d  %n", coin02);
	    System.out.printf("Number of �0.1 coins: %3d  %n", coin01);
	    System.out.printf("Number of �0.05 coins:: %3d  %n", coin005);
	    System.out.printf("Number of �0.02 coins:: %3d  %n", coin002);
	    System.out.printf("Number of �0.01 coins:: %3d  %n", coin001);
			
		
		}
		public void FizzBuzz(int input) {
			
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
		
		public void FlowChart(int A) {
			
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
