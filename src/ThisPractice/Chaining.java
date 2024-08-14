package ThisPractice;

public class Chaining {
	/*
	 * Chaining technique with the help of this keyword ,
	 *  this is being used in setters methods so that can reduce usability of object 
	 *  to store/set up any value to multiple instance variables 
	 */
     String name;
     int id;
     double marks;
	public String getName() {
		return name;
	}
	public Chaining setName(String name) {
		this.name = name;
		return this;
	}
	public int getId() {
		return id;
	}
	public Chaining setId(int id) {
		this.id = id;
		return this;
	}
	public double getMarks() {
		return marks;
	}
	public Chaining setMarks(double marks) {
		this.marks = marks;
		return this;
	}
	public static void main(String[] args) {
		
		
		Chaining c = new Chaining();
		
		// This is normal way to setup any value through methods 
//		 c.setId(10);
//		 c.setName("A");
//		 c.setMarks(1250);
		 
		 System.out.println(c.getId());
		 System.out.println(c.getName());
		 System.out.println(c.getMarks());
		 
		 //This is Chaining method technique to setup multiple values at once using one object
		setMarks 
		 c.setId(12394).setName("Aakhib").(1256);
		 
		 System.out.println(c.getId());
		 System.out.println(c.getName());
		 System.out.println(c.getMarks());
		
	}

}
