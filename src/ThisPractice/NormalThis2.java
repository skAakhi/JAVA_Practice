package ThisPractice;

public class NormalThis2 {
	
	int age=50;
    String name = "Aakhib";
	public static void main(String[] args) {
		//Using this keyword 
		 NormalThis2 e1 = new  NormalThis2();
		 e1.setAge(20);
		 e1.setName("Aakhib");
		 
		 NormalThis2 e2 = new  NormalThis2();
		 e2.setAge(22);
		 e2.setName("Afzal");
		 
		 System.out.println(e1.getAge());
		 System.out.println(e1.getName());
		 
		 System.out.println(e2.getAge());
		 System.out.println(e2.getName());
		 
		

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
