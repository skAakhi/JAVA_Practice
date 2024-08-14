package ThisPractice;

public  class  Emloyee implements Car{

	public static void main(String[] args) {
		Emloyee e = new Emloyee();
		e.brakes();
		
		// abstract class creating obj using anonymous inner class'
		
		User u = new User() {

			@Override
			public void show() {
				System.out.println("Show method inside anonymous class");
			}
			
			
		};
		u.show();
		u.SetCarName("Latest car Fortuner");
		System.out.println(u.getName());
		
		
		

	}

	@Override
	public void drive() {
		System.out.println("Drive code ");
		
	}

}
