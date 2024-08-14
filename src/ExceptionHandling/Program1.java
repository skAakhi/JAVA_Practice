package ExceptionHandling;

public class Program1 {
    // Why we need exception ?(explanation)
	//2.Un_checked exception(runtime)
	public static void main(String[] args) {
		System.out.println("Program starts");
		int a=10;
		int b=1//0;
		int result=a/b;//usually any number cannot divide with zero , if we try to divide it will face an exception / error.
		
		System.out.println("output is : "+result);
		System.out.println("Ends");
		

	}
	
	
	/* 1.checked exception(compile-time)
	 * 
	 * 2.Un_checked exception(Run-time)
	 */

}
