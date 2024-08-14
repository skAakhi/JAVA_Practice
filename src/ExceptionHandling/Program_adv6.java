package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program_adv6 {
/*
 * While building any application we may face more than one Exception across the code,
 * 1. To deal with individual Exceptions we can create miltiple_catch() blocks (or) 
 * 2. If you want to deal entire exception by using single catch block , Yes obviously we can do that too also. 
 */
	public static void main(String[] args) throws IOException {
		int result=0;
        File f = new File("./FileReader1.txt");
         int[] arr = {1,2,3,4};
		
		if(!f.exists())
		f.createNewFile();
	
		//Auto closable classes [we can pass such kind of resources which classes is implementing auto_closable interfaces]
		try(
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr );
			){// Here you can check very clearly by pointing reference variable there is no data leak , therefore no need to use close() methods to my resources 
			
			//result=arr[5];
			 System.out.println(arr[1]/0);
			
			
			
		}
		
		// for all exceptions Exception class is common to deal with individual we have to be mention specific of that class
		/*catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(IndexOutOfBoundsException e2) {
			e2.printStackTrace();
		}
		catch(ArithmeticException e3) {
			e3.printStackTrace();
		}*/
		
		//To deal with multiple exceptions using by single catch block , but the message for all exceptions is common
		
		catch(FileNotFoundException | IndexOutOfBoundsException | ArithmeticException e1) {
			e1.printStackTrace();
		}
		
		
		
	}

}
