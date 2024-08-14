package Collections_Work1;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	/*
	 * Hashset---->HashMap---->array of nodes(Keys , values)[At place of value will be setup as a dummy object]only one dummy object will be used commonly among all keys
	 *Because the each key are set as unique in HashMap
	 *
	 *This will allow only distinct values and doesnt follow any sorting order
	 *follows only insertion order.
	 *
	 * 
	 * LinkedHashset---->LinkedHashMap---->line of nodes(keys, values)
	 * 
	 * TreeSet------->TreeMap--->Binary Tree (Which follows sorted order)
	 */

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		//Addition of elements
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(14);
		hs.add(15);
		
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(14);
		hs.add(15);
		
		System.out.println(hs);
		
		//Retrieval of elements
		
		for (Integer i : hs) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		// Verification 
		
//		System.out.println(hs.contains(10));
		
		//There is no Updation in set 
		
		
		// Deletion
		
//		System.out.println(hs.remove(14));
//		System.out.println(hs);
		
		
		// Converting HashSet to array
		
//		Object[] arr=hs.toArray();
//		
//		for (Object ob : arr) {
//			System.out.print(ob+" ");
//			
//		}
//		
//		System.out.println();
		
		// Converting HashSet to String
		
//		String s = hs.toString();
//		
//		System.out.println(s);
//		
//		for (Object ob : arr) {
//			System.out.println(ob);
//			
//		}
		
		System.out.println(hs.size());
		
		
		
		
		
	}

}
