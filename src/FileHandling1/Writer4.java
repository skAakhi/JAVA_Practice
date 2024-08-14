package FileHandling1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer4 {

	public static void main(String[] args) throws IOException {
		/*
		 * This demo is to add two texts
		 */
		
		 File f = new File("./FileReader1.txt");
			
			//if(!f.exists())
				//f.createNewFile();
			
			//FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(new FileReader(f) );
			
			String text = new String();
			String line = " ";
			//int ASCII;
			
			while((line=br.readLine()) != null) {
				//System.out.println(line);
				text+=line+"\n";
				
				
			}
			//System.out.println(text);
			String s ="Hai Aakhib we are offering you 70lakhs per year and more free compensation for travel ,room ,food";
			
			// FileWriter fw = new FileWriter(f);
			//BufferedWriter bw = new BufferedWriter(fw);
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			
			bw.write(text+s);
			//bw.write(s);
			//bw.close();
			bw.flush();
			bw.close();
			//br.close();
			//fr.close();
			//fr.close();
	}

}
