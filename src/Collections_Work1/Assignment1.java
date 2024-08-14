package Collections_Work1;

import java.util.*;

public class Assignment1 {
	
/*
 *  1.WAP to print sum and average of elements present in the list
 */

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter number of elements that you want to inser :");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextInt());
		}
		
//		a.add(4);
//		a.add(5);
//		a.add(0);
//		a.add(9);
//		a.add(8);
//		a.add(10);
//		
		// Printing sum of elements present in the list
		int sum=0;
		int avg=0;
		int count=0;
		
		for (Integer integer : a) {
			sum+=integer;
			count++;
			
			
		}
		System.out.println("Sum of Elements is :"+sum);
		System.out.println("The average of elements is :"+sum/count);
		
	}

}
