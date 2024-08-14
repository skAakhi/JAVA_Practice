package ThisPractice;

public abstract class User {
	
	String carName="FORTUNER";
	
	public abstract void show();

	public void SetCarName(String name) {
		this.carName=name;
	}
	public String getName() {
		return carName;
	}
	
}
