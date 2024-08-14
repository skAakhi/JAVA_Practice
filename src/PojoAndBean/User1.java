package PojoAndBean;

public class User1 {

	public static void main(String[] args) {
		 Employee e1 = new Employee();
		 Employee e2 = new Employee();
		 Employee e3 = new Employee();
		 
		 e1.setId(110);
		 e1.name="Aakhib";
		 e1.salary=500000;
		 
		// System.out.println(e1.getId());
		// System.out.println(e1.name);
		// System.out.println(e1.salary);
		 
		 e2.setId(111);
		 e2.name="Richy";
		 e2.salary=50002;
		 
		// System.out.println(e2.getId());
		// System.out.println(e2.name);
		// System.out.println(e2.salary);
		 
		 e3.setId(112);
		 e3.name="Jhon Haris";
		 e3.salary=50000;
		 
		// System.out.println(e3.getId());
		// System.out.println(e3.name);
		// System.out.println(e3.salary);
		 
		 
		 Employee[] emp = new Employee[] {e1,e2,e3};
		 
		 for(Employee id:emp) {
			 System.out.println(id.name);
			 System.out.println(id.salary);
			 System.out.println(id.getId());
		 }


		 

	}

}
