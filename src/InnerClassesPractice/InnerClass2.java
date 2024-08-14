package InnerClassesPractice;

public class InnerClass2 {
	/*
	 *  Here we are discussing about two kinds of inner classes
	 *  
	 *  1.Non-static inner classes(Nested)
	 *  2.Static inner classes(Nested)
	 *  
	 *  Except creating objects in static and non static is different 
	 *  and remaining all other operations with static classes is similar as Non-static  
	 */
   private int id =101;
   public void add1()
	{
		//int id =103;
		System.out.println("Outter add code");
		
	}	
	public static void main(String[] args) {
		System.out.println("Outter class main mehod");
		//A a=new InnerClass2().new A();
		//a.add();
		 InnerClass2 i1=new InnerClass2();
		
		//i1.new A().show();
		 //or
	     A a=i1.new A();
		 a.show();
//        B b=i1.new B();
//        b.sub();
//		
	// To access static class 
		 C c1=new InnerClass2.C();
		 c1.sal();
		 
		
		

	}
   
    class A //implements Interface1 //extends User1
	{
    	 int id =102;
    	public void add()
    	{
    		int id =103;
    		System.out.println("Inner add code");
    		System.out.println(id);
    		System.out.println(this.id);
    		System.out.println(InnerClass2.this.id);
    		
//    		InnerClass2 i = new InnerClass2 ();
//    		i.add1();
    		
    	}	
    	public void show()
    	{
    		A a1 =new A();
    		a1.add();
    	}
//		@Override
//		public void oppo() {
//			// TODO Auto-generated method stub
//			
//		}
//		@Override
//		public void apple() {
//			// TODO Auto-generated method stub
//			
//		}
    	 
    	
	}
    
    
//      public class B// extends A
//  	  {
//  	   public void sub()
//  	   {
//  		   System.out.println("class B executed");
//  		   A a2 = new InnerClass2().new A();
//  		   a2.show();
//  	   }
//
//  		
//     	}
    //For Static inner class
    public  static class C
  	{
    	public void sal()
    	{
    		System.out.println("50 LAKHS ONLY");
    	}
  	   

  		
  	}
//    public static class D{
//    	
//    }
//    public abstract class E{
//    	
//    }
//    public final class F{
//    	
//    }
//   
}
/* 
 * 1.Can inner class declared with public/private/protected - YES
 * 2.Can we create static/abstract/final inner classes - YES
 * 3.Can we create object for inner class - YES  [In outer class] & [Inner class]
 * Can you create object for outer class inside the inner class - YES 
 * 
 * How to access inner class variables when they are duplicated in inner class
 *1. Accessing private outer instance variable , inner class instance variables -YES
 *2.How can we recognize any generated class file as outer class or inner class - YES
 *
 *
 *1.Creating inner class object of UserClass2 in another java file of inner class - YES
 *[Example shown in User1 class]
 *
 * 1.Can an inner class extend any non-abstract class- YES
 * 2.Can an inner class extend any abstract class - YES
 * 3..Can an inner class implements any interface -YES 
 * 4.Can we extend any other inner class by another inner class
 * 
 * 
 * 
 * 
 * 
 * 
 */
