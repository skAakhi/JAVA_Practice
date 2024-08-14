package Collections_Work1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
	/*
	 * Liked HashSet class is extending HashSet class
	 */

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new LinkedHashSet<>();
		
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
		
		
		
		

	}

}
