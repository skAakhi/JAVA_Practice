package InnerClassesPractice;

public class InnerClass4 {
	/*
	 * 3.Anonymous inner class
	 * 
	 * To override any method of concern class generally we will apply inheritance concept,
	 * so by extending it with another class it is possible to over ride of that respective method
	 * ,therefoe the code is going to be with some complex line 
	 * 
	 * To overcome that we can apply  Anonymous inner class which is in very precise line[This will be created in main method]
	 * 
	 */

	public static void main(String[] args) {
//		Vivo v = new Vivo() {
//			public void copy()
//			{
//				System.out.println("Third party company Copy code");//Overriding  copy method
//			}
//			
//		};//InnerClass4$1 java will named like 
//		v.copy();
//		v.print();
		
		
//		AbstractClass ab = new AbstractClass() {
//
//			@Override
//			public void copy() {
//				System.out.println("Anonymous class copy code");
//				
//			}
//			
//		};
//		
//		ab.print();
//		ab.copy();
//
//	}
		
		Interface1 i = new Interface1() {

			@Override
			public void oppo() {
				System.out.println("Anonymous class oppo code");
				
			}

			@Override
			public void apple() {
				System.out.println("Anonymous clas apple code");
				
			}
			
		};
		i.apple();
		i.oppo();
	

}
class Vivo{
	public void print()
	{
		System.out.println("Vivo Print code");
	}
	public void copy()
	{
		System.out.println("Copy code");//Overriding  copy method
	}
}

//class Company extends Vivo{
//	{
//		System.out.println("Third party company Copy code");//Overriding  copy method
//	}
//	
//}
}