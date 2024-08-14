
 class Test1 {
	 Test1(){
		 //this.id=10;
		 System.out.println("Constructor");
	 }
	 void drive()
	 {
		 System.out.println("Drive code is implemented");
	 }
	
	 static{
		 System.out.println("Non-Static block 2");
	 }
	 
	 {
		 System.out.println("non-Static block");
	 }

	 static{
		 System.out.println("Non-Static block 1");
	 }
//	 Test1(){
//		 //this.id=10;
//		 System.out.println("Constructor");
//	 }
	public static void main(String[] args) {
		
		//System.out.println("hello hai AAKHIB");
		//Test1 t1 = new Test1();
		//new Test1();
		
		zeno z=()->{
			System.out.println("code Zeno is executing");
		};
		z.code();
		
	}

}
 //@functionalinterface
 public interface zeno{
	 void code();
 }
