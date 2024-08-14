package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program_adv5 {
	
	/*
	 * Try with re_source due to avoid obj.close() methods automatically without interference of user / developer so generally in this case we prefer try block to dump all resources
	 */

	public static void main(String[] args) throws IOException{ // or Exception or Throwable 
		File f = new File("./FileReader1.txt");
		
		
		if(!f.exists())
		f.createNewFile();
	
		//Auto closable classes [we can pass such kind of resources which classes is implementing auto_closable interfaces]
		try(
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr );
			){// Here you can check very clearly by pointing reference variable there is no data leak , therefore no need to use close() methods to my resources 
			
		}// for all exceptions Exception class is common to deal with individual we have to be mention specific of that class
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
