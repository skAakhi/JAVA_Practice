package FileHandling1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader4 {

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader in this class you have two constructors 
		 * [1.Accept reader object ,2.Reader file]
		 * This is allowing some methods in BufferedReader , which will help to read automatically text file values (Directly provides the line)
		 */
		
		
		 File f = new File("./FileReader1.txt");
			
			if(!f.exists())
				f.createNewFile();
			
			//FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(new FileReader(f));//[This will accept only Reader object so here whatever we are creating object for FileReader this also considerable]
			
			String text = new String();
			String line = new String();
			int ASCII;
			//Normal conversion
			/*while((ASCII=br.read())!=-1 )
			{
				text+=(char)ASCII;
				//System.out.print((char)ASCII);
			}
			System.out.println(text);*/
			
			
			
			
			//Because of the unique feature in BufferedReader class , will automatically entire line without iterating line by line
			//This will provide you entire line internally by itself
			while((line=br.readLine()) != null) {
				System.out.println(line);
				//text+=line+"\n";
				
				
			}
			//System.out.println(text);
			
			
			//fr.close();
			br.close();
		
		

	}

}
