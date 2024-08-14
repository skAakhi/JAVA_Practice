package FileHandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReader2 {

	public static void main(String[] args) throws IOException {


       File f = new File("./FileReader1.txt");
		
		if(!f.exists())
			f.createNewFile();
		//FileInputStream fis = new FileInputStream(f);
		//Scanner sc = new Scanner(f);//[This will accept fileinputstream instance also]
		//Scanner sc = new Scanner(fis);
		Scanner sc = new Scanner(new FileInputStream(f));
		
		//System.out.println(sc.nextLine());//This statement will return only one line
		//System.out.println(sc.hasNext());//This statement will return TURE OR FALSE
		String text = new String();
		while(sc.hasNext()) {
			
			text+=sc.nextLine()+"\n";
			
			//System.out.println(sc.nextLine());
		}
		System.out.println(text);
		
		

	}

}
