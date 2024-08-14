package Collections_Work1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class PropertiesFileClass {
	
	/*Properties file  [ Extension - .properties]
	 * 
	 * The main purpose of prop file to load its information into application java file 
	 * 
	 * Application layer(java file)----->Data base[To load this any information from APL->DB we require that particular DB(URL,USERNAME,PASSWORD)]
	 * 
	 * So , we cannot say that the DB may be will crash any time or any other requirement to change its DB 
	 * then we cannot modify java file application at all time when we need (it is meant to be bad practice)
	 * , Therefore to overcome that we have introduced one type of property file , which will maintain its (URL,USERNAME,PASSWORD) to update , delete , modify , verify 
	 * as we can certain sort of things which will reflect to its correspondence java files.
	 * 
	 * In prop file we maintain (key(obj),value(obj)) pair , and it separated by = operator
	 * 
	 * This is a type of Data Structure ,
	 *  because it is extending internally HashTable class and it come from map interface, which will store the data in the form of (key ,value ) basis.
	 *  
	 * 
	 */

	public static void main(String[] args) throws IOException {
		
		File f = new File("DB.properties");
		
		if(!f.exists())
			f.createNewFile();
		
		//System.out.println(f.exists());
		
		Properties p = new Properties();
	   FileInputStream fis = new FileInputStream(f);
	    p.load(fis);
		p.setProperty("URL","92.837.0098.09765.2");
		// p.setProperty("URL","NEW BROWSER");
		//or
		// p.replace("URL", "Babe.com");
		p.setProperty("Username", "SkAakhib");
		p.setProperty("Password","skzzpsry@301172");
		//Writing
		FileOutputStream fos = new FileOutputStream(f);
		
		p.store(fos, "This is confidential information  please do not share this with any one");
		
		// Retrieving keys 
		
		System.out.println(p);
	    Set<Object>s=p.keySet();
//	    System.out.println(s);
//	    
//	for (Object ob : s) {
//		
//		System.out.print(ob+" ");
//	}
//	System.out.println();
	   //Retrieving values 
	
	
//        Collection<Object>val=p.values();
//        System.out.println(val);
//        for (Object ob : val) {
//        	System.out.print(ob+" ");
//			
//		}
        
        //Retrieving of values based on keys
        
        for (Object ob : s) {
        	//System.out.println(ob+"---->"+p.getProperty((String)ob));
        	//or
        	System.out.println(ob+"---->"+p.get(ob));
			
		}
        
        //Updation
        
        //Reading
       // FileInputStream fis = new FileInputStream(f);
        
     //   p.load(fis);
        
//        p.setProperty("URL","NEW BROWSER");
//          p.replace("URL", "Babe.com");
//        System.out.println(p);// We have this experimented this above part of the code 
//        
        
        //Deletion 
        
        //p.clear();
        //p.remove("URL");
       // p.remove("URL", "92.837.0098.09765.2");
       // System.out.println(p);
        
		
		//Verification
        
//        System.out.println(p.containsKey("URL"));
//        System.out.println(p.contains("SkAakhib"));
        
        
        //Entry set
        Set<Entry<Object,Object>>obj=p.entrySet();
        System.out.println(obj);
		
        for (Entry<Object, Object> entry : obj) {
        	System.out.println(entry);
			
		}
	}

}
