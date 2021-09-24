package streamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
//		List<String> myList =List.of("cat","dog","goat");
		
		//forEach
		//myList.forEach(x->System.out.println(x));
		
		//streams
		
//		Stream<String> myStream =Stream.of("cat","dog","parrot");
//		
//		List<Integer> numbers =Arrays.asList(2,3,4,5);
//		
//		Stream<Integer> square = numbers.stream();
		
		//filter
		//myStream.filter(x->x.contains("o")).forEach(x->System.out.println(x));
		
		//maps
//		myStream.map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		//collectors
	//	List<String>myStringList=myStream.map(x->x.toUpperCase()).collect(Collectors.toList());
		
		//sorted
//		List<String> nameList=Arrays.asList("Zac","Angelica");
//		List<String> result =nameList.stream().sorted().collect(Collectors.toList());
				
//		System.out.println(result);
		
		//reduce
		
//		List<Integer> nums=Arrays.asList(1,2,3,4,5);
//		int sum=nums.stream().reduce((a,b)->a+b).get();
//		System.out.println(sum);
//		
//		int evenSum=nums.stream().filter(x->(x%2==0)).reduce((a,b)->a+b).get();
//		System.out.println(evenSum);
		
		List<String> names =Arrays.asList("Micheal","Dean","James","Chris");
		
		    names.stream()
		            .forEach(x -> System.out.println("Hello "+x));

		    List<Integer> nums=Arrays.asList(2,3,4,5);
//			int mul=nums.stream().reduce((a,b)->a*b).get();
//			System.out.println(mul);
//			Optional<Integer> max =nums.stream().max((a,b)->a.compareTo(b));
//			System.out.println(max.get());
//		    Optional<Integer> max =nums.stream().min((a,b)->a.compareTo(b));
//			System.out.println(max.get());
//		    Stream<Integer> odd =nums.stream().filter(a->(a%2!=0));
//		    odd.forEach(System.out::println);
//		    Stream<Integer> even =nums.stream().filter(a->(a%2==0));
//		    even.forEach(System.out::println);
//		    int sum=nums.stream().reduce((a,b)->a+b).get();
//		    System.out.println(sum);
		    
		    Stream<Integer> squareAndOdd=nums.stream().map(x->x*x).filter(x->(x%2!=0));
		    squareAndOdd.forEach(System.out::println);
	}

}
