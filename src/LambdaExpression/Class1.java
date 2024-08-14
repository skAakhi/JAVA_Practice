package LambdaExpression;

public class Class1 {
	/*
	 * Lambda Expressions is designed to implement for only functional interface 
	 * 
	 * Introduced in java version of 1.8
	 * 
	 * We can say that this updated version of anonymous inner class,which is for reducing complex of lines
	 */

	public static void main(String[] args) {
		
	   Audi a = new Audi();
	   a.drive();
		// using anonymous class
		Car c1 = new Car() {

			@Override
			public void drive() {
				System.out.println("Anonymous drive code");
				
			}
		
		
		
	};
	c1.drive();
	
	// Using lambda expression
    Car c2 = ()->System.out.println("Lambda drive code");//If you are mentioning multiple statements then {}; brackets are required
	
	c2.drive();

}
}
//Normal method by using class
class Audi implements  Car{

	@Override
	public void drive() {
		System.out.println("Audi drive code");
	}
	
}

@FunctionalInterface
interface Car{
	
	public void drive();//Abstract method
	
	
}
