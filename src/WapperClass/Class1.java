package WapperClass;

public class Class1 {
	/*
	 * In collections every thing will deals with objects to store any values
	 * 
	 * The primitive data_types are not objects so to deal with collection concept , 
	 * the primitive data_types will be wrapped by specific class to deal with collections
	 * 
	 * wrapper classes :
	 * 1.Boxing
	 * 2.Auto-Boxing
	 * 3.Un-Boxing
	 * 4.Auto-Unboxing
	 */

	public static void main(String[] args) {
		
		//Boxing [The int type of primitive value is wrapped by class, so it is treated as objects
		Integer i = Integer.valueOf(10);
		
		System.out.println(i);
		
		// Auto-Boxing
		
		int j=20;
		
		Integer i1 =j;
		
		System.out.println(i1);
		
		//Un-Boxing
		
		Integer i2 = Integer.valueOf(30);
		
		int j1=i2.intValue();
		
		System.out.println(j1);
		
		String s1 = "16";
		
		int j3 = Integer.valueOf(s1);
		
		System.out.println(j3);
		
		//Auto-Unboxing
		
		int j2 = i2;
		
		System.out.println(j2);
		
		
		
		
		
		
	}

}
