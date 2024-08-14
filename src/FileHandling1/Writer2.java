package FileHandling1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {

	public static void main(String[] args) throws IOException {
		/*
		 * This is also as same like FileOutputStream 
		 * 
		 * But this has some extra features like FileWriter will accept directly charArray,integer,String e.t.c...
		 * 
		 */
		
         File f = new File("./Filewriter1.txt");
		
		if(!f.exists())
			f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		

		String s ="Hai Aakhib we are offering you 50lakhs per year and more free compensation for travel ,room ,food";
		
		
		//for(char ch:s.toCharArray())
		//System.out.println((int)ch);
		//	fw.write((int)ch);//Here you are going to send in_terms of ASCII code to text file , this will char values in text file
		
		fw.write(s);
		fw.flush();
		fw.close();
		

	}

}
