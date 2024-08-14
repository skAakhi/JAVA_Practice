package LambdaExpression;

public class Class3 {
	/*
	 * With return type 
	 */

	public static void main(String[] args) {
		
		Car3 c1 = new Car3() {

			@Override
			public int speed() {
				System.out.println("The speed of car is ");
				return 70;
				
			}
			
		};
		System.out.println(c1.speed());
		//
		Car3 c2 = ()->100;//or 
		Car3 c3 = ()->{
			System.out.println("Speed of car is ");
			return 120;
		};
		System.out.println(c2.speed());
		System.out.println(c3.speed());
	
	}
}

@FunctionalInterface
interface Car3{
	
	public int speed();
	

}