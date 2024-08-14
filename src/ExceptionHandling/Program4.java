package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program4 {
/*Use of Throw and throws keywords and what is hierarchy
 * Checked_exception(compile-time)_Throws keyword
 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Program Starts");
		int a=10;
		int b=0;//1;
		int result =0;
		
		File  file = new File("D:/resume.docx");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
		
		try 
		{
			 result=a/b;
			 
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.toString());
			//e.printStackTrace();
			
			//throw e;
			
			
		}
		
		finally {
			System.out.println("Thank you for visiting");
		}
		System.out.println("output is : "+result);
		System.out.println("Program Ends");
	}
	/*
	 * Object
	 *   1.Throwable 
	 *        Exception
	 *           Run-time Exception
	 *             1.IndexOutOfBoundsException
	 *             2.NullPointerException
	 *             3.ArithmeticException
	 *         IO Exception
	 *            1.FileNotFoundException
	 *         SQLException
	 *            
	 */


	}


