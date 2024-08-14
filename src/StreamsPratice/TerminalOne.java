package StreamsPratice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOne {
	/*
	 * Terminal methods :
	 * 1.min
	 * 2.max
	 * 3.count
	 * 4.reduce
	 * 5.foreach
	 * 6.collect
	 * 7.toArray
	 * 
	 * These Terminals methods directly we can apply on streams or else with Non-Terminal methods to process the data 
	 */

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,8,12,3,4,5,6,75,4);
		
		List<String> l2 = Arrays.asList("Apple","Banana","Pine","goa","orange");
		
		
		//min()[This will process the data finally stores one elements inside of it]
		//Finding the min value among all numbers
//		
//		Optional<Integer>minList=l1.stream().min((val1,val2)->val1.compareTo(val2));
//		
//		System.out.println(minList);
//		System.out.println(minList.get());
//		
//		//max()[This will process the data finally stores one elements inside of it]
//		//Finding the max value among all numbers
//		
//		Optional<Integer>maxList=l1.stream().max((val1,val2)->val1.compareTo(val2));
//		
//		System.out.println(maxList);
//		System.out.println(maxList.get());
//		
//		
//		//Count()
//		long count=l1.stream().count();
//		
//
//		System.out.println(count);
//		
//		//Case1: counting all the elements which is divisible by 3
//		
//		long num=l1.stream().filter(i->i%3==0).count();
//		
//		System.out.println(num);
//		
//		
		//Reduce()[This will process the data finally stores one elements inside of it]
		
		//Finding sum of all elements directly on streams
		
//		int sum=l1.stream().reduce(0,(c,e)->c+e);
//		
//		System.out.println(sum);
//		
//		// Applying Terminal method via Non-terminal methods
//		
//		int sum1=l1.stream().filter(i->i%2==0).reduce(0,(c,e)->c+e);
//		
//		System.out.println(sum1);
		
		
		
		
		// toArray() [Which will convert list of elements to array of elements]
		
//		Object[] arr = l1.stream().toArray();
//		
//		for (Object i : arr) {
//			System.out.println(i);
//		}
		
		
		
		//case2: Counting number of words in the list l2
		
//	         long count=l2.stream().count();
//	         System.out.println(count);
	         
	    //Case3: Changing the words to upperCase which is in even position and LowerCase in odd position
		
		
		
	//List<String>l3=	l2.stream().filter(w->w.length()%2==0).map(i->i.toUpperCase()).collect(Collectors.toList());//.forEach(System.out::println);
		
		//System.out.println(l3);
		
		
		//Case4: Converting odd positions into lower case and even positions to upper case
	         
	         l2.forEach(i->{
	        	 if(i.length()%2==0)
	        		System.out.println( i.toUpperCase());
	        	 else
	        		System.out.println( i.toLowerCase());
	         });
	         
		
		System.out.println(l2);
		
	}

}
