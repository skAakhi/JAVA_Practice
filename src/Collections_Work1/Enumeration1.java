package Collections_Work1;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;

public class Enumeration1 {
	/*
	 *  Enumeration
	 *  It is for iterating only legacy classes collection objects(values)
	 *  
	 *  version - 1.0
	 *  
	 *  legacy classes - Stack,Vector,HashTable,Properties,Dictionaries(abstract class) 
	 *  
	 */

	public static void main(String[] args) {
		
		//Map<Integer ,String> m = new Hashtable<>();
//		
//		m.put(6, "Aakhib");
//		m.put(9, "Afzal");
//		m.put(8, "shiro");
//		m.put(10, "Raja veravarma");
//		
//		Enumeration<String>val=m.elements();	
//		while(val.hasMoreElements())
//		{
//			System.out.println(val.nextElement());
//		}
//		
		
       //Stack<Integer> s = new Stack<>();
//		
//		s.add(10);
//		s.add(20);
//		//System.out.println(s);
//		s.push(30);
//		s.push(40);
//		System.out.println(s);
//		Enumeration<Integer>val=s.elements();	
//		while(val.hasMoreElements())
//		{
//			System.out.println(val.nextElement());
//		}
		
       Properties p = new Properties();
	 //  FileInputStream fis = new FileInputStream(f);
	  //  p.load(fis);
		p.setProperty("URL","92.837.0098.09765.2");
		// p.setProperty("URL","NEW BROWSER");
		//or
		// p.replace("URL", "Babe.com");
		p.setProperty("Username", "SkAakhib");
		p.setProperty("Password","skzzpsry@301172");
		Enumeration<Object>val=p.elements();	
		    while(val.hasMoreElements())
			{
				System.out.println(val.nextElement());
			}

	}

}
