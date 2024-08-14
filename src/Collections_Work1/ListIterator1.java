package Collections_Work1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class ListIterator1 {
	
	/*
	 * ListIterator 
	 * 
	 * This is for iterating only for all classes  of list interface objects
	 * 
	 * This is Bi-directional can add,read,write,delete the elements in forward and backward side 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		//Stack<Integer> a = new Stack<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		ListIterator<Integer>l=a.listIterator();
		//forward
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println();
		
		//Backward
		
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		System.out.println();
		
		//To add 
		l.add(50);
		//System.out.println(l.previousIndex());
		l.add(60);
		//System.out.println(l.previousIndex());
		System.out.println(a);
		l.remove();
		System.out.println(a);
		
		
		
		
	}

}
