package co.uk.idestsoft;

public class Numbers {

	public static int method1(int input){
		Integer output = input;
		String numbers = output.toString();
		int mySum=0;
		
		for (int i=0;i<numbers.length();i++) 
		{
			char c=numbers.charAt(i);
			
			 mySum+= Character.getNumericValue(c);
		}
		
		return mySum;
	}
	
	/*Create a second method that when given the number 1-99 returns a String representation of this number, 
	 * for example 1 = one, 11 = eleven, 21 = twenty-one.*/
}
