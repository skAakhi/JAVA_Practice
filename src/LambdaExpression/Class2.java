package LambdaExpression;

public class Class2 {
	/*
	 * Using single parameter in lambda expression 
	 * 
	 */

	public static void main(String[] args) {
		 Audi1 a = new Audi1();
		  a.drive(50);
			// using anonymous class
			Code c1 = new Code() {

				@Override
				public void drive(int s) {
					System.out.println("Anonymous drive code");
					System.out.println("Anonymous car driving at speed of :"+s);
					
				}
			
			
			
		};
		c1.drive(60);
		
		// Using lambda expression
	    Code c2 = (sp)->{
	    	System.out.println("Lambda drive code ");
	    	System.out.println("Car1 at speed of :"+sp);
	    };
	    
	    // When you are using one argument in function then no need to use () circular braces EX: Car2 fun
	    //(sp) no need to mention the data_type of variable, compiler can infer this 
	    //If you are mentioning multiple statements then {}; brackets are required
		
		c2.drive(100);
		
		//We can create multiple anonymous functions with lambda expression , We can override that respective interface of method in multiple anonymous functions
		
		 Code c3 = sp->{
		    	System.out.println("Lambda drive code ");
		    	System.out.println("Car2 at speed of :"+sp);
		    };
		    
		    c3.drive(120);
		    
		    

	}
	}
	//Normal method by using class
	class Audi1 implements  Code{

		@Override
		public void drive(int s) {
			System.out.println("Audi drive code");
			System.out.println("Audi driving at speed of :"+s);
			
		}
		return 80;

		
	}

	@FunctionalInterface
	interface Code{
		
		public void drive(int speed);//Abstract method
		
		
	}
