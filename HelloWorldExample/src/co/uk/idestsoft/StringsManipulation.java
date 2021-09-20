package co.uk.idestsoft;

public class StringsManipulation {

	public static void method1() {
		String first="yesterday it was raining";
		String second="today it is sunny";
		
		String mix = (second+", "+first).toUpperCase();
		System.out.println(mix);
		String news=mix.replace(mix.substring(12,35), "");
		
		System.out.println(news);
	}
	
	/*For this task you are to implement 4 methods that manipulate String objects. 
	 * For all parts of this section you are only allowed to use the length(), substring(), 
	 * and equals() methods. 
	 * Avoid using arrays or any methods you have yet to be taught as this defeats 
	 * the purpose of the exercise:

Method 1 - When given a String, count and return how many words there are in that String.*/
	
//	public static int method2(String input) {
//		
//		int words=0;
//		for (int i = 0; i < input.length(); i++){
//		    char c = input.charAt(i);
//		    if(c==' ') {
//		    	words++;
//		    }
//		    
//		}
//		return words;
//	}
//	public static int method2(String word){ 
//		
//		int i=0;
//		int counter=0;
//		
//		while(i<=word.length()) {
//			
//			char c = word.charAt(i);
//			
//			
//			
//			if(c==' ' && word.charAt(i+1)==' ' && i+1 ==word.length()-1 )
//			{
//				
//				counter++;
//				break;
//				
//			}
//			if(i==word.length()-1)
//			{
//				counter++;
//				break;
//			}
//			if(c==' ' && word.charAt(i+1)==' ')
//			{
//				
//				i++;
//				continue;
//			}
//			if(c==' '){
//				
//				counter++;
//				
//				
//			}
//			
//			i++;
//			
//		}
//
//		return counter;
//		
//	}
//	public static void method3(String word){ 
//		
//		int i=0;
//		int counter=-1;
//		
//		while(i<=word.length()) {
//			
//			char c = word.charAt(i);
//			counter++;
//			
//			if(c==' ' && word.charAt(i+1)==' ' && i+1 ==word.length()-1 )
//			{
//				
//				System.out.println(word.substring(i-counter, i+1));
//				break;
//				
//			}
//			if(i==word.length()-1)
//			{
//				System.out.println(word.substring(i-counter, i+1));
//				break;
//			}
//			if(c==' ' && word.charAt(i+1)==' ')
//			{
//				counter--;
//				i++;
//				continue;
//			}
//			if(c==' '){
//				
//				System.out.println(word.substring(i-counter, i));
//				counter=-1;
//				
//				
//			}
//			
//			i++;
//			
//		}
//
	/*Method 1 - When given a String, count and return how many words there are in that String.
	 * */
		public static void method5(String word) {
			
			int count=0;
			boolean wordFound=false;
	
			for(int i=0;i<word.length();i++) {
				
				
				if(word.charAt(i)==' ' && wordFound || i==word.length()-1 && wordFound )
				{
					count++;
					wordFound=false;
				}
				if(word.charAt(i)==' ')
				{
					continue;
				}
				else if(word.charAt(i)!=' ')
				{
					wordFound=true;
				}
			}
			
			System.out.println(count);
		}
		
public static void method6(String word) {
			
			int charCount=0;
			boolean wordFound=false;
	
			for(int i=0;i<word.length();i++) {
				
				
				if(word.charAt(i)==' ' && wordFound || i==word.length()-1 && wordFound )
				{
					if(i==word.length()-1 && wordFound) {
						System.out.println(word.substring(i-charCount,i+1));
						
						wordFound=false;
						charCount=0;
					}
					else {
						System.out.println(word.substring(i-charCount,i));
						
						wordFound=false;
						charCount=0;
					}
					
				}
				if(word.charAt(i)==' ')
				{
					continue;
				}
				else if(word.charAt(i)!=' ')
				{
					charCount++;
					wordFound=true;
				}
			}
			
			System.out.println();
		}


//				
//					
//			}
//		}
//		
//	}

	
}
