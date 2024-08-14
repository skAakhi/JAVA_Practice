package FileHandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * To read something from text file we prefer usually four methods/classes 
		 * [While getting the data from text_file this will return
		 * ASCII numeric code so By explicitly we have to convert it into char values]
		 * 
		 *  1.FileInputStream
		 *  2.Scanner
		 *  3.FileReader
		 *  4.BufferdReader
		 *  
		 */
		
		
		File f = new File("./FileReader1.txt");
		
		if(!f.exists())
			f.createNewFile();
		
		FileInputStream fis = new FileInputStream(f);// EOF will indicate -1 value
		
		//System.out.println((char)fis.read());
		String text = new String();
		int ASCII;
		
		while((ASCII=fis.read())!=-1 )
		{
			//text+=(char)ASCII;
			System.out.print((char)ASCII);
		}
		//System.out.println(text);
		
		
		
	}

}
