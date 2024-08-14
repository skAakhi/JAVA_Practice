package FileHandling1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer1 {
	
	/*
	 * To Write something in file we have basically three methods :
	 *  1.FileOutputStream
	 *  2.FileWriter
	 *  3.BufferdWriter
	 *  
	 *  
	 *  [To save any text in my file we have to send it in_terms of ASCII code through output streams]
	 */

	public static void main(String[] args) throws IOException {
		
		
		
		File f = new File("./Filewriter1.txt");
		
		if(!f.exists())
			f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		
     	//	fos.write(65);
		//fos.write(65);
		
		String s ="Hai Aakhib we are offering you 50lakhs per year";
		
		
		for(char ch:s.toCharArray())
		//System.out.println((int)ch);
			fos.write((int)ch);
		fos.flush();
		fos.close();
		
		
		
		
		
		
		
		
	}

	

}
