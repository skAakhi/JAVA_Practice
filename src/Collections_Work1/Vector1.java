package Collections_Work1;

import java.util.*;

public class Vector1 {
  
	/*Collections is a  framework , which provides interfaces and their implemented classes 
	 * 
	 *  Vector 1.0 - legacy class 
	 *  collections 1.2
	 *  Generics 1.5
	 *  
	 *  Incrementation: 100%
	 *  
	 *  1.This will allow duplicate elements and null values
	 *  
	 *  
	 */
	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<>();
		
		
//		System.out.println(v.size());
//		System.out.println(v.capacity());//Initial size - 10 and default size - 10
//		v.add(10);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
    	v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(14);
		v.add(15);
		v.add(16);
		v.add(17);
//		v.add(18);
//		v.add(19);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		v.add(10);
//		v.add("Jucy");
		
		//System.out.println(v);
		
		/*for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}*/
		
		/*for (Object object : v) {
			System.out.print(object+" ");
			
		}*/
		
		//Adding at specific index 
		
//		v.add(0,9);
//		System.out.println(v);
//		
		// Removing elements from vector(will remove according to index)
		
//		v.remove(0);
//		v.removeAll(v);
//		System.out.println(v);
		
		//updating new value in_place of values in  vector list v
		
//		v.set(10,20);
//		System.out.println(v);
		
		// clearing all elements from the list it is same as like removeAll methos
		
//		v.clear();
//		System.out.println(v);
		
		// verification 
		
		//System.out.println(v.contains(10));
		//System.out.println(v.contains(100));
		//System.out.println(v.containsAll(obj));// You can  from same list or two different lists
		
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(10);
		v2.add(11);
		v2.add(12);
		v2.add(13);
		v2.add(14);
		v2.add(15);
//		
//		System.out.println(v2);
		
		// Verification
		
		//System.out.println(v.containsAll(v2));
	//	System.out.println(v.contains(v2));
		
		/*
		 *                   Adding elements in v vector from v2 vector
		
		for (Object object : v2) {
			
			v.add(object);
			
		}
		System.out.println(v);     (or)
		
		*/
		
		
		// Adding all elements from v2 vector to v vector
		
//		v.addAll(v2);
//		System.out.println(v);
		
		
		
		
		// converting array to vector list
		
//		Integer[] arr= {1,2,3,4};
//		
//		
//		Vector v = new Vector(Arrays.asList(arr));
//		
//		System.out.println(v);
		
		// converting vector list to array 
		
//		Vector v = new Vector();
//		v.add(10);
//     	v.add(11);
//		v.add(12);
//		v.add(13);
//		v.add(14);
//		v.add(15);
//		
//		
//		Object [] arr = v.toArray();
		/*
		for (Object object : arr) {
			System.out.print(object+" ");
		}*/
		
		/*for(int i=0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}*/
		
		
		// Finding index positions
		
//		System.out.println(v.indexOf(14));
//	
//		System.out.println(v.lastIndexOf(14));
//		
		
		// Finding first and last elements
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}
	/*
	 * Operations:
	 *  1.Add
	 *  2.Retrive
	 *  3.Remove
	 *  4.Update
	 *  5.Verification
	 *  
	 */

}
