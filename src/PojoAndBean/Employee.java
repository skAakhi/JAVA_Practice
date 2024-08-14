package PojoAndBean;

public class Employee {

	/*
	 * This class will describes about POJO class rules (Ex: Structures in c), which will store multiple information of every individual employee.
	 * 
	 * Rules:
	 *  1.The class must be Public 
	 *  2.It should not implement any interface and extend any classes 
	 *  3.It should not make use of any keyword annotations EX:@override , @functionalinterface e.t.c...
	 *  
	 *  Choice:
	 *  1.Setters and Getters methods 
	 *  2.Making instance variables as Private 
	 */
	
	 private int id;
     String name;
	 double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
