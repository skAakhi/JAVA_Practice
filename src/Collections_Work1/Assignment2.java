package Collections_Work1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {

	/*
	 * WAP to print the sum of the even numbers in a list
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
		
		
		
		
//		a.add(4);
//		a.add(5);
//		a.add(0);
//		a.add(9);
//		a.add(8);
//		a.add(10);
		
		int sum=0;
		for (Integer i : a) {
			
			if(i%2==0) 
				sum+=i;
			
		}
		System.out.println("Sum of even numbers is :"+sum);
		
		sc.close();
		
		
		
		
	}

}
