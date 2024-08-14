package Collections_Work1;

import java.util.TreeSet;

public class Set3 {
	/*
	 * Tree set is not purely implemented class of set 
	 *  
	 * It is implementing Navigable interface,which is extending sorted set interface
	 * 
	 * It follows sorted order and not insertion order
	 * 
	 * DE-Yes   SYNC-NO     SO-Yes   IO-No    NULLVAL-NO
	 *
	 */

	public static void main(String[] args) {
		
		TreeSet<Integer> hs = new TreeSet<>();
		
		hs.add(21);
		hs.add(12);
		hs.add(9);
		hs.add(14);
		hs.add(144);
		hs.add(21);
		hs.add(22);
		hs.add(23);
	
		
		System.out.println(hs);
		
		//Retrieval of elements
//		
//		for (Integer i : hs) {
//			System.out.print(i+"  ");
//			
//		}
//		System.out.println();
//		//Retrieval of first element and last element
//		System.out.println(hs.pollFirst());
//		System.out.println(hs.pollLast());
//		
		// Deletion
		
//		hs.remove(21);
//		
//		System.out.println(hs);
		
		
		// presenting elements as sub list 
		
//		System.out.println(hs.subSet(10, 20));//defining range irrespective of object values , also can mention objects too as well
		
		
		
		// Reversing the elements using descendingSet() method
		
		System.out.println(hs.descendingSet());
		
		System.out.println(hs.higher(22));// Will provide its next to higher value
		
		System.out.println(hs.lower(22));// Will provide its next to lower value
		
		System.out.println(hs.tailSet(22));//>= from the element
		
		

	}

}
