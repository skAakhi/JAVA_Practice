package Collections_Work1;

public class GarbageCollector {
	/*
	 *  To call my GC explicitly by typing manually [system.gc()] ,which will call finalize method internally if any 
	 *  1.Un-refferenced objects
	 *  2.Un-used objects
	 *  3.Anonymous  objects 
	 *  
	 *  If it found among any one of those , GC will call finalize method at every time . 
	 *  
	 *  Heap memory - 768MB   To increase explicitly - -Xmx800b  [click on Run configure]
	 *  Stack memory-1MB      To increase explicitly - -Xss10b [click on Run configure]
	 *  
	 */
	public void finalize()
	{
		System.out.println("Garbage collected");
	}
	public void print()
	{
		System.out.println("Application code executed");
	}

	public static void main(String[] args) {
		
		GarbageCollector gb1=new GarbageCollector();
		GarbageCollector gb2=new GarbageCollector();
		GarbageCollector gb3=new GarbageCollector();
		
		gb1=null;//Un-refferenced objects
		gb2=gb3;//Un-used objects
		new GarbageCollector().print();//.Anonymous  objects
		System.out.println("Executed");
		
		System.gc();
		// Runtime.getRuntime().gc();

		
		
	}

}
