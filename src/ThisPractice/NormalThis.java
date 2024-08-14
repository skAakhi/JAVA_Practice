package ThisPractice;

public class NormalThis {
	/*
	 * this keyword  cannot be used in static blocks 
	 * 
	 * this is limited to [Constructors , abstract classes  , interfaces , non static methods & blocks]
	 * 
	 * this is used to point instance variables of that class with respective of every individual object
	 * 
	 */
     int age=50;
     String name = "Aakhib";
	public static void main(String[] args) {
		
	   // Accessing instance variables without using this keyword 
		NormalThis e1 = new NormalThis();
		e1.setAge(20,e1);
		e1.setName("Sk Aakhib",e1);
		
		NormalThis e2 = new NormalThis();
		e1.setAge(22,e2);
		e1.setName("Sk Afzal",e2);
		
		System.out.println(e1.getAge());
		System.out.println(e1.getName());
		
		System.out.println(e2.getAge());
		System.out.println(e2.getName());
		
		
		
		
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age,NormalThis e) {
		e.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name,NormalThis e) {
		e.name = name;
	}
	

}
