package co.uk.idestsoft;

public class StringManipulation2 {
	public static void twoStrings(String original,String toCompare) {
		boolean contains=false;
	//scattered cat
		if(original.length()<toCompare.length())
		{
			contains=false;
			System.out.println(contains);
			return;
		}
		for(int i=0;i<original.length();i++) {
		if((original.substring(i,i+toCompare.length())).equals(toCompare)){
			contains=true;
			break;
		}
		else if(i+toCompare.length()==original.length())
		{
			if((original.substring(i,i+toCompare.length())).equals(toCompare)){
				contains=true;
				break;
			}
			else {
				contains=false;
				break;
			}
			
		}
		else {
			contains=false;
		}
		}
		
		System.out.println(contains);
		
	}
}
