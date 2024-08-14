package BufferAndBuilder;

public class StringPractice1 {
	/*
	 * String is immutable ( That means data cannot be changed and if changed concurrently address also will  be change)
	 * 
	 * Version - 1.0 
	 * 
	 * StringBuffer is mutable (This is introduced for multi-thraeding purpose internally will applicable Synchronization process)
	 *                        If we update,insert,delete the data , the address remains same 
	 *                        
	 *  version - 1.0, capacity - 16
	 *  
	 *  String is mutable (This is introduced for Single-thraeding purpose internally will not applicable Synchronization process)
	 *                        If we update,insert,delete the data , the address remains same
	 *              
	 * version - 1.5 [This is to increase the performance of single threading applications]
	 *   
	 */

	public static void main(String[] args) {
		//Normal String 
		String s1 = "Hello";//20,22
		String s2 = "hello";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));// Check content meaning is same or not
        
        s1=s1+"Hai";
        System.out.println(s1);
        
		String s3 = "HelloHai";
		System.out.println(s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println("----------------------------");
		
		// StringBuffer 
		
		
		StringBuffer sb1 = new StringBuffer("Hello");//20
		StringBuffer sb2 = new StringBuffer("Hello");//21
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));//20 equals 21
		System.out.println(sb1.compareTo(sb2));// if equal - o otherwise -1
		
		sb1.append("Hai");
		
		StringBuffer sb3 = new StringBuffer("HelloHai");//22
		
		System.out.println(sb1==sb3);//20 == 22
		System.out.println(sb1.equals(sb3));//20 equals 22
		System.out.println(sb1.compareTo(sb3));//HelloHai HelloHai = 0 
		
		// Operation 
		// Insert,Delete,Update,Reverse
		
		System.out.println("---------------------------");
		
		//System.out.println(sb2.reverse());
		
		sb2.insert(0, "Hai");// index , data 
		
		//sb2.delete(0, 2);// from index to end index
		
		//sb2.replace(0, 3, "ROL");
		//System.out.println(sb2.capacity());//16+Hello = 21 
		
		//sb2.ensureCapacity(100); // we can make our own default size
		
		//System.out.println(sb2.length());
		
		//String sb4 = sb2.substring(0, 3);//Sub-String to string 
		
		//System.out.println(sb4);
		
		System.out.println(sb2);
		
		
		
		
		
		// All operations are similar in StringBuilder as well
		

		
	}

}
