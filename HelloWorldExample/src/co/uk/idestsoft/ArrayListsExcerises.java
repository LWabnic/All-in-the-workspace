package co.uk.idestsoft;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListsExcerises {
	
	
	public static void method1(){
		List<String> meat = new ArrayList<>();
		meat.add("beef");
		meat.add("poultry");
		meat.add("lamb");
		
		System.out.println(meat.get(0));
		Collections.sort(meat);
		System.out.println(meat);
		System.out.println(meat.size());
		
		meat.set(1, "Chicken");
		//meat.remove(2);
		
		
		for (String name:meat) {
			System.out.println(name);
		}
		
//		Collections.reverse(meat);
//		
//		for(int i=0;i<meat.size();i++) {
//			System.out.println(meat.get(i));
//		}
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		
		ArrayList<String> al2 = (ArrayList<String>)al.clone();
		
		System.out.println(al2);
		Collections.swap(meat,0,2);
		System.out.println(meat);
	}
	
}
