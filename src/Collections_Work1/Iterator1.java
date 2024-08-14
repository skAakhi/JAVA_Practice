package Collections_Work1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;

public class Iterator1 {
	/*
	 *  Iterator 
	 *  
	 *  It is for iterating all classes collection objects(values)
	 *  
	 *  Legacy classes(1.0) + New classes (1.2)
	 *  
	 *  one directon , read only with special permission for removing elements
	 *  
	 *  This works under only collection interface of all classes [list queue,set]
	 *  
	 *  To access this in map interface we have separate technique ,which is shown below
	 *  so,the collection interface will makes allow map interface to access some class , upon those we can indirectly access it
	 *  
	 *  
	 */

	public static void main(String[] args) {
		
		//ArrayList<Integer> a = new ArrayList<>();
//		Stack<Integer> a = new Stack<>();
//		
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		Iterator<Integer>i=a.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		i.remove();
//		System.out.println(a);
		
		//Removing
		
//		while(i.hasNext())
//		{
//		 System.out.println(i.next());
//			i.remove();
//			
//		}
//		i.next();
//		//i.remove();
//		System.out.println(a);
		
		
//		
		
		
		//Map
//		Map<Integer ,String> m = new HashMap<>();
//		m.put(6, "Aakhib");
//		m.put(9, "Afzal");
//		m.put(8, "shiro");
//		m.put(10, "Raja veravarma");
		
//		Iterator<Integer>i=m.keySet().iterator();
//		    while(i.hasNext())
//			{
//				System.out.println(i.next());
//			}
		//like 
		
//		   Iterator<String>i2= m.values().iterator();
//		    Iterator<Map.Entry<Integer,String>>i1= m.entrySet().iterator();
//		    while(i1.hasNext())
//			{
//				System.out.println(i1.next());
//			}
		
		//for Properties class
		
		    Properties p = new Properties();
		  // FileInputStream fis = new FileInputStream(f);
		    //p.load(fis);
			p.setProperty("URL","92.837.0098.09765.2");
			// p.setProperty("URL","NEW BROWSER");
			//or
			// p.replace("URL", "Babe.com");
			p.setProperty("Username", "SkAakhib");
			p.setProperty("Password","skzzpsry@301172");
			
			Iterator<Object>i=p.elements().asIterator();
			        while(i.hasNext())
			       {
					System.out.println(i.next());
				    }
		
		
		
		
		
		
	}

}
