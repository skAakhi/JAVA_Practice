package StreamsPratice;

import java.util.Arrays;
import java.util.List;

public class NonTerminalTwo {
	/*
	 * Distinct method() : is used to store unique elements from the stream
	 * 
	 * Limit method() : Limiting number of collection objects collecting from stream
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,8,12,3,4,5,6,75,4);
		
		//Distinct()
		
		//l1.stream().distinct().forEach(System.out::println);
		
		//Case1: The number which is divisible by 2 are require all unique elements to print it in the output console
		
		//l1.stream().filter(i->i%2==0).distinct().forEach(System.out::println);
		
		
		
		//Limit()
		
	//	l1.stream().limit(5).forEach(System.out::println);
		
		
		

	}

}
