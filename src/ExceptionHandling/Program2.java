package ExceptionHandling;

import java.util.Arrays;

public class Program2 {
  //Use of TRY, CATCH, FINALLY blocks
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int a=10;
		int b=0;//1;
		int result =0;
		
		try 
		{
			 result=a/b;
		}
		catch(ArithmeticException e) {
			
			//System.out.println(e.toString());
			//e.printStackTrace();
			System.out.println(Arrays.toString(e.getStackTrace()));
			
			
		}
		finally {
			System.out.println("Thank you for visiting");
		}
		System.out.println("output is : "+result);
		System.out.println("Program Ends");
	}

}
