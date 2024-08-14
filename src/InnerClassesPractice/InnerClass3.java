package InnerClassesPractice;

public class InnerClass3 {

	/*
	 *  2.Local inner classes[This will be restricted to any block such as like , 
	 *  main method ,Constructor,static block , non static block, any closed block .
	 *  
	 *  We can able to access outer class members with local inner class
	 *  But cant access from outer class to local inner class level
	 *  
	 *  Access modifier valid only - abstract ,final
	 *  
	 *  
	 */
	
	private int id =101;
	public static void main(String[] args) {
		int sal=10000;
		
		 class abc1{
			 public void source()
			 {
				 System.out.println("Source code");
				 System.out.println(sal);
			 }
			
		}
		 abc1 a = new abc1();
		 a.source();

	}
//	public  InnerClass3(){
//		class abc2{
//			
//		}
//		
//	}
//	static {
//         class abc3{
//			
//		}
//		
//	}
//	
//	{
//      class abc4{
//			
//		}
//	}
//	

}
/*
 * You cannot declare to your local class as static 
 */
