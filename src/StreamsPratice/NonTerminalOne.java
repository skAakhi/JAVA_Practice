package StreamsPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonTerminalOne {
	/*
	 * Non-Terminal methods :
	 * 1.Distinct
	 * 2.limit
	 * 3.filter
	 * 4.map
	 * 5.flatMap
	 * 
	 * FlatMap is for stream of collection objects , it is similar like map but we use it for processing single object
	 * EXample:
	 * list=[[1,2],[3,4],[5,6]] 
	 * 
	 */

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2);
		List<Integer> l2 = Arrays.asList(3,4);
		
		List<List<Integer>>finallist=new ArrayList<>();
		
		finallist.add(l1);
		finallist.add(l2);
		
		System.out.println(finallist);
		
		//FlatMap()
		
		//Normal method
//		for (List<Integer> list : finallist) {
//			System.out.println(list);
//			
//		}
		
		//finallist.stream().flatMap(i->i.stream()).forEach(System.out::println);
		//or
		//finallist.stream().flatMap(i->i.stream()).forEach(i->System.out.println(i));
		
		
		
		//case1: Printing the number which is divisible by 2 and doubling the each value before printing it 
		
		//finallist.stream().flatMap(i->i.stream().filter(i1->i1%2==0).map(x->x*2)).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}

}
