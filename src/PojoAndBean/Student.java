package PojoAndBean;

import java.io.Serializable;

/*
 * The JAVA BEAN is extended version of POJO class
 * 
 * Application layer(object)--------Network--------->Database layer
 *  Serializable(object)<--------------------------->Deserializable(data)
 *  
 *  Rules:
 *   1.It must implement serializable interface
 *   2.It should have setter and getters methods 
 *   3.Class properties(Instance variables) must be in Private 
 *   4.It should have one default constructor 
 */

public class Student implements Serializable {
	
	
	private int id;
	
	private String name;
	
	private double marks;
	
	public Student() {
		
	}
	//If you create parameterized constructor by yourself , then we to have create default constructor otherwise java will create itself.
	public Student(int id , String name) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

}
