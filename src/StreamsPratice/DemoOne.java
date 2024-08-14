package StreamsPratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoOne {
	/*
	 *  1.Sorted()
	 *  
	 *  2.AnyMatch()
	 *  3.AllMatch()
	 *  4.noneMatch()  
	 *  [Not only arrayList we can check with rest of implemented class ex:Set,Map .....e.t.c..
	 * 
	 *  
	 *  5.FindAny()
	 *  6.FindFirst()
	 */

	public static void main(String[] args) {
		

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,8,12,3,4,5,6,75,4);
		
		List<String> l2 = Arrays.asList("Apple","Banana","Pine","goa","orange");
		
		
		//Sorting in Ascending order 
		
		//l1.stream().sorted().forEach(System.out::println);
		
		//or
		//List<Integer>l3=l1.stream().sorted().collect(Collectors.toList());
		
		//System.out.println(l3);
		
		//Allowing only distinct values and sorting in ascending order
		
//		List<Integer>l3=l1.stream().sorted().distinct().collect(Collectors.toList());
//		System.out.println(l3);
		
		
		// Sorting in Descending order
		
//		List<Integer>l3=l1.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
//		System.out.println(l3);
		
		
		//AnyMatch()
//		
//		boolean result=l2.stream().anyMatch(w->{return w.startsWith("Ba");});
//		
//		System.out.println(result);
		
		//AllMatch()
//         boolean result=l2.stream().allMatch(w->{return w.startsWith("Ba");});
//		
//		System.out.println(result);
		
		//NoneMatch()
//		    boolean result=l2.stream().noneMatch(w->{return w.startsWith("z");});
//			
//			System.out.println(result);
			
			
			
			
			//FindAny()
		
//		Optional<String>val=l2.stream().findAny();
//		System.out.println(val);
//		System.out.println(val.get());
		
		
		//FindFirst()
		
//		Optional<String>val1=l2.stream().findFirst();
//		System.out.println(val1.get());
		
		
		
		
	}

}
