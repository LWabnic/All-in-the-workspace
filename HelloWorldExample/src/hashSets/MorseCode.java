package hashSets;

import java.util.HashMap;

public class MorseCode {

	public void translate(String input) {
		HashMap<String,String>nameAndAge=new HashMap<>();
		//(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		nameAndAge.put(".---", "J");
		nameAndAge.put(".-", "A");
		nameAndAge.put("...-", "V");
		nameAndAge.put("..", "I");
		nameAndAge.put("...", "S");
		nameAndAge.put("-.-.", "C");
		nameAndAge.put("---", "O");
		nameAndAge.put(".-..", "L");
		nameAndAge.put("-.-", "K");
		
		String [] firstSplit=input.split(" ");
		
		StringBuilder morse =new StringBuilder();
		
		for(int i=0;i<firstSplit.length;i++) {
			
			if(firstSplit[i].equals("/")) {
				morse.append(" ");
			}else {
			morse.append(nameAndAge.get(firstSplit[i]));
			}
		
		}
		
		System.out.println(morse);
		}
	
	
	
	
}
