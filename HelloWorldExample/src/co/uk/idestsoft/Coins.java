package co.uk.idestsoft;

public class Coins {

	public static void Change(float cost,float notes) {
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
    System.out.printf("Number of ?50 notes: %3d  %n", note50);
    System.out.printf("Number of ?20 notes: %3d  %n", note20);
    System.out.printf("Number of ?10 notes: %3d  %n", note10);
    System.out.printf("Number of ?5 notes: %3d  %n", note5);
    System.out.printf("Number of ?1 coins: %3d  %n", coin1);
    System.out.printf("Number of ?0.5 coins:: %3d  %n", coin05);
    System.out.printf("Number of ?0.2 coins: %3d  %n", coin02);
    System.out.printf("Number of ?0.1 coins: %3d  %n", coin01);
    System.out.printf("Number of ?0.05 coins:: %3d  %n", coin005);
    System.out.printf("Number of ?0.02 coins:: %3d  %n", coin002);
    System.out.printf("Number of ?0.01 coins:: %3d  %n", coin001);
		
	
	}
}
