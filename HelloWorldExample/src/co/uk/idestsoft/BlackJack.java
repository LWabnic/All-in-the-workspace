package co.uk.idestsoft;

public class BlackJack {

	public static int game(int num1,int num2) {

	int result=0;	
	if (num1<=21 && num2<=21) {
	if(21-num1<21-num2) {
		result=num1;
	}
	else {
		result=num2;
	}
	}
	else if(num1>21 && num2>21) {
		result=0;
	}
	else {
		if(num1>21) {
			result=num2;
		}
		if(num2>21) {
			result=num1;
		}
	}
	

		return result;

	}
}
/*Given 2 integer values greater than 0, 
 * return whichever is closest to 21 without going over 21. 
 * If they both go over 21 then return 0.
 * play (10, 21) -> 21
 play (20, 18) -> 20
 play (1, 22) -> 1
 play (22, 23) -> 0*/

 