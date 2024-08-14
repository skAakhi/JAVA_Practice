package StreamsPratice;

import java.util.Arrays;
import java.util.List;

public class DemoTWo {
	/*
	 * ParallelStream() [Which will process the data at once or parallel time execution]
	 * 
	 * It does not  follow any order while printing
	 */

	public static void main(String[] args) {
		
		List<Student> l1=Arrays.asList(
				new Student(10,"Junnu",75),
				new Student(11,"Ammu",65),
				new Student(12,"mobbi",78),
				new Student(13,"Bujji",80));
		
		// Normal Stream
		l1.stream().filter(i->i.getMarks()>=70).forEach(i->System.out.println(i.id+" "+i.name));
		
		//ParallelStream() type 1:
		l1.parallelStream().filter(i->i.getMarks()>=70).forEach(i->System.out.println(i.id+" "+i.name));
		//or
		//type 2:
		l1.stream().parallel().filter(i->i.getMarks()>=70).forEach(i->System.out.println(i.id+" "+i.name));
		
		
		
		
		

	}

}

class Student{
	int id;
	String name;
	long marks;
	
	public Student(int id,String name,long marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public long getMarks()
	{
		return marks;
	}
	
	
}
