package Collections_Work1;

import java.util.ArrayList;

public class Arraylist1 {
	/*
	 * This arraylist class is implementing list interface 
	 * 
	 *  This is introduced in 1.2
	 *  
	 *  Initial size - 10 
	 *  
	 *  default size - 0 
	 *  
	 *  Increamentation - 50%
	 *  
	 *  
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		System.out.println(a.size());
		a.add(10);
		System.out.println(a.size());
		

	}

}
