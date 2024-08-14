package FileHandling1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader3 {

	public static void main(String[] args) throws IOException {
		/*
		 * FIleReader is having method constructors every single one we use it for different purposes
		 * 
		 * FileInputStream methods are similar in the FileReader one 
		 */
		
        File f = new File("./FileReader1.txt");
		
		if(!f.exists())
			f.createNewFile();
		
		
		FileReader fr = new FileReader(f);
		
		String text = new String();
		int ASCII;
		
		while((ASCII=fr.read())!=-1 )
		{
			//text+=(char)ASCII;
			System.out.print((char)ASCII);
		}
		//System.out.println(text);
		fr.close();
		
	}

}
