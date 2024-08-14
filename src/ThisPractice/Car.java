package ThisPractice;

/*
 *this keyword is used to get the details of implemented class of interface
 */

public interface Car {
	
	public void drive();
	
	default void brakes()
	{
		System.out.println("interface brakes code");
		System.out.println(this.getClass().getName());
	}
	
	

}
