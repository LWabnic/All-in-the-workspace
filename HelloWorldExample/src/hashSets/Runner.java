package hashSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
		//HashSet<String> hashSet=new HashSet<>(Set.of("X","Y"));
		
//		Set<String> hashSet=new HashSet<>(Set.of("X","Y"));
//		
//		hashSet.add("A");
//		hashSet.add("A");
//		hashSet.add("A");
//		
//		System.out.println(hashSet);
//		System.out.println(hashSet.size());
//		System.out.println(hashSet.isEmpty());
//		hashSet.remove("X");
//		System.out.println(hashSet);
//		System.out.println(hashSet.contains("A"));
//		hashSet.clear();
//		System.out.println(hashSet);
		
//		for(String handle:hashSet) {
//			System.out.println(handle);
//		}
		
		//Map<String,Integer>nameAndAge=new HashMap<>();
//		HashMap<String,Integer>nameAndAge=new HashMap<>();
//		
//		nameAndAge.put("Jordan", 26);
//		nameAndAge.put("Alan", 52);
//		nameAndAge.put("Pawel", 52);
//		//nameAndAge.put("Alan", 6);
//		
//		System.out.println(nameAndAge);
//		
//		System.out.println(nameAndAge.get("Jordan"));
//		
//		System.out.println(nameAndAge.size());
//		
//		nameAndAge.remove("Alan");
//		
//		System.out.println(nameAndAge);
//		
//		for(String i:nameAndAge.keySet()) {
//			System.out.println(i);
//		}
//		for(Integer i:nameAndAge.values()) {
//			System.out.println(i);
//		}
//		for(Entry<String,Integer> i:nameAndAge.entrySet()) {
//			System.out.println(i);
//		}
		
		MorseCode translator =new MorseCode();
		translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-");
	}

}
