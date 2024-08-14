package PojoAndBean;

public class User2 {

	public static void main(String[] args) {
	
		
		Student s = new Student();
		s.setId(101);
		s.setName("Aakhib");
		s.setMarks(97.08);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getMarks());

	}

}
