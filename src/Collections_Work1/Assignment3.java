package Collections_Work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
	
	/*
	 *  1. WAP to Split a list into two lists 
	 *  ex: {4,9,8,5,0,10} --> list1{4,9,8} list2{5,0,10}
	 *  
	 *  2.WAP to merge two lists into a single list
	 *  ex: list1{4,9,8} list2{5,0,10}----> {4,9,8,5,0,10}
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
         Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter number of elements that you want to insert :");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextInt());
		}
//		
//		
//		a.add(4);
//		a.add(5);
//		a.add(0);
//		a.add(9);
//		a.add(8);
//		a.add(10);
		//a.add(11);
		System.out.println(a);
		
		int sindex=a.size()/2;
		
		List<Integer> l1=a.subList(0, sindex);
		List<Integer> l2=a.subList(sindex,a.size());
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println("Merged list l1 :"+l1);
		
		sc.close();
		
		
		
		

	}

}
