package FileHandling1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer3 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * BufferedWriter will accept instance of FileWriter
		 */
		
        File f = new File("./Filewriter1.txt");
		
		if(!f.exists())
			f.createNewFile();
       // FileWriter fw = new FileWriter(f);
		

		String s ="Hai Aakhib we are offering you 70lakhs per year and more free compensation for travel ,room ,food";
		
		
		//BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		
		
		bw.write(s);
		
		bw.flush();
		bw.close();
		//fw.close();
		
		
		
		

	}

}
