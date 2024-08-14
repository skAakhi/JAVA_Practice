package ExceptionHandling;
//How to do Stack trace, where exactly error got occurred
public class Program3 {
	static int a=10;
	static int b=0;//1;
	static int result =0;
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		method2();
		System.out.println("output is : "+result);
		System.out.println("Program Ends");
		

		

/*Stack trace:
 * 1.Method name
 * 2.Method line
 * 3.Method information (which type of exception)
 * 4.Method location
 */
	
	
}
	public static void method2()
	{
		method1();
	}
	public static void method1()
	{
	
		 result=a/b;
	
		
		
	}
	
}

