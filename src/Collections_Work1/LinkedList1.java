package Collections_Work1;

import java.util.*;

public class LinkedList1 {
	/*
	 * same operations as we applied in Vector class are applicable in Linked List class also
	 * 
	 * This is not purely implemented class of list interface
	 * 
	 * LinkedList class implements 
	 * List interface and Dequeue interface as well which extends queue interface .
	 * 
	 * Class structure:
	 * 
	 * size- 
	 * FirstNode- [This will remain same through out the execution]
	 *    ->previous
	 *    ->next
	 * LastNode-
	 *     ->previous
	 *     ->next
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		//LinkedList<Integer> l = new LinkedList<>();
		
		//List<Integer> l = new LinkedList<>();//[The meaning of this line LinkedList class is acquiring the properties of only List interface]
		
		//Deque<Integer> l = new LinkedList<>();//[That means LinkedList class acquiring  Dequeue interface properties
		//and so dequeue interface is extending properties of queue interface ,therefore you can access queue properties as well .
		
		Queue<Integer> l = new LinkedList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		

	}

}
