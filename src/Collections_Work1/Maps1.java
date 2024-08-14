package Collections_Work1;

import java.util.*;
import java.util.Map.Entry;


public class Maps1 {

	/*
	 * The Map is used to store the values on key based system (Reference) , 
	 * so with that keys(references) can able to  easily retrieve those its corresponding values  
	 * The main purpose of maps is often used to store values based on keys as a reference point.
	 * 
	 *   Here HashTable is purely implemented class of map interface 
	 *   and that too we have Hash map,linedHashmap.
	 *   
	 *   In addition we have Tree map which is implementing sorted map interface , which calls indirectly properties of map interface 
	 *   
	 *   
	 */
	public static void main(String[] args) {
		
		// Creation [ For all implemented classes of map interface , we are maintaining similar applicable methods]
		//Hashtable<Integer ,String> m = new Hashtable<>();
		//SortedMap<Integer ,String> m = new TreeMap<>();
		//TreeMap<Integer ,String> m = new TreeMap<>();
		//Map<Integer ,String> m = new HashMap<>();
		//Map<Integer ,String> m = new LinkedHashMap<>();
		
		
		
		//Insertion[This does not follows the insertion order and sorted order]
		
		m.put(6, "Aakhib");
		m.put(9, "Afzal");
		m.put(8, "shiro");
		m.put(10, "Raja veravarma");
		
		
		System.out.println(m);
		 
		// Retrieval of keys and Retrieval of values based on keys
		
//		Set<Integer>key=m.keySet();
//		//System.out.println(key);
//		
//		for (Integer i : key) {
//			System.out.print(i+" ");
//			System.out.println();
//			System.out.println(i+"----->"+m.get(i));
//			
//		}
//		System.out.println();
		
		// Retrieval of values and retrieval of keys based on values
//		
//		Collection<String> s=m.values();
//		System.out.print(s);
//		System.out.println();
//		
//		for (String st : s) {
//			System.out.print(st+" ");
//			System.out.println();
//			//System.out.println(st+"----->"+m.(st));
//			
//			
//		}
//		
		//Updation of elements 
		
//		m.put(10, "Leaders");
//		m.replace(9, "High paid coder");
//		System.out.println(m);
//		m.replace(10, "Leaders", "Fearless");//Replacing old with new one value only if you know exact old value and key of that entry set
//		System.out.println(m);
//		
//		m.putIfAbsent(50, "Wing");
//		System.out.println(m);
//		
		// Verification 
		
//		System.out.println(m.containsKey(10));
//		System.out.println(m.containsValue("Aakhib"));// This will check exact content of that String value
//		System.out.println(m.contains("Aakhib"));
//		
		
		
		//Deletion
		
//		System.out.println(m.remove(10));
//		System.out.println(m);
//		System.out.println(m.remove(9,"Afzal"));
//		System.out.println(m);
//		
////		m.clear();
////		System.out.println(m);
//		
//		m.clone();// This will copy only structure of the hashTable neither values and keys
//		System.out.println(m);
//		
		
		
		// If you would like to print entry set [key value ] of entire row of pairs and for each one
		
		Set<Entry<Integer,String>> en=m.entrySet();
		
		System.out.println(en);
		
		for (Entry<Integer, String> entry : en) {
			
			System.out.println(entry);
			
		}
		
		
		
	
		
		
		
	}

}
