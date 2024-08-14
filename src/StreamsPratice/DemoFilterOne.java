package StreamsPratice;

import java.util.*;
import java.util.stream.Collectors;

public class DemoFilterOne {
	/*
	 * Streams: It is used to process the data from the collections
	 * 
	 * Case1: Sorting the elements which is divisible by 2 and storing it in another list
	 *  or after processing printing it directly
	 */

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Integer[] iar = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		List<Integer> l1 =  Arrays.asList(iar);

		
//		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		
    	List<Integer> l2 = new ArrayList<>();
		
		//Normal method
//		for (Integer i : l1) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//				
//			
//		}
		
		// storing it in another list
		
		l2=l1.stream()
		.filter(i-> i%2==0)
		.collect(Collectors.toList());
		
		System.out.println(l2+" ");
		
		
		// Printing it directly
		
//		l1.stream()
//		.filter(i-> i%2==0).forEach(i->System.out.println(i));
		
		
		/*
		 * Case2 : Sorting out the all words from the list which is greater than above 6 and less than 8 and removing null values from the list 
		 * 
		 */
//	     List<String> l1 = Arrays.asList("Aakhib",null,"Afzal",null,"Parveen",null,"Karimulla");
//	     
//	     List<String> l2 = new ArrayList<>();
//	     
//	     // printing it directly
//	     
//	     l1.stream()
//	               .filter(w-> (w!=null) && w.length()>=6 && w.length()<=8)
//	               .forEach(System.out::println);
//	     
//	     //or .forEach(i->System.out.println(i));
//	     
//	     
//	     l2= l1.stream()
//	               .filter(w-> (w!=null) && w.length()>=6 && w.length()<=8)
//	               .collect(Collectors.toList());
//	     
//	     System.out.println(l2);
	     

	}

}
