package logistics;

public class TestAnything {
	public static int superBlock(String input) {
		int lastChar=0;
		int thisChar=0;
	
		
		for(int i=0;i<input.length();i++) {
		
			
		if(i==0)
			{
			thisChar++;
			continue;
			}
			else {
				if(input.charAt(i-1)==input.charAt(i) && i==input.length()-1) {
					thisChar++;
					if(thisChar>lastChar)
					{
						lastChar=thisChar;
						continue;
					}
				}
				
				
				else if(input.charAt(i-1)==input.charAt(i)) {
					thisChar++;
				}
					
				else {
				 {
						if(lastChar>thisChar)
						{
							thisChar=1;
							continue;
						}
						else {
							lastChar=thisChar;
							thisChar=1;
						}
					}
				}
				
			}
			
		}
		
		System.out.println(lastChar);
		return lastChar;
	}
}
