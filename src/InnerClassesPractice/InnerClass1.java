package InnerClassesPractice;

public class InnerClass1 {
	/*Mainly there are four types of inner classes are presented 
	 *  1.Non-static inner classes(Nested)
	 *  2.Static inner classes(Nested)
	 *  3.Local classes 
	 *  4.Anonymous classes 
	 *  
	 * 
	 *  
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Outter class inside main method");
		new InnerClass1().print1();	
		//new InnerClasses2().print2();

	}
	
	public void print1()
	{
		System.out.println("Outter class print code");
	}

}
class InnerClasses2 implements Interface1 {//or User1
	public static void main(String[] args) {
		System.out.println(" class2 inside main method");
		//new InnerClasses2().print1();
		new InnerClasses2().print2();
		//new InnerClasses2().googlecode();
	    //new InnerClass1().print1();	

	}
	public void print2()
	{
		System.out.println("Inner class print code");
	}
//	@Override
//	public void googlecode() {
//		System.out.println("Google bug code is executed");
//		
//	}
//	@Override
//	public void oppo() {
//		System.out.println("Oppo code");
//	}
//	@Override
//	public void apple() {
//		System.out.println("Vivo code");
//		
//	}
	
}
// class InnerClasses3{
//	 public static void main(String[] args) {
//			System.out.println("class3 inside main method");
//
//		}
//	
//}
//class InnerClasses4{
//	public static void main(String[] args) {
//		System.out.println("class4 inside main method");
//
//	}
	



/*1.Can java file contains more than one class -YES
*  2.Can java file contains multiple classes -YES
*  3.In java file can multiple classes declared as public/private/Protected - NO [The public type InnerClasses2 must be defined in its own file]
*  4..In java file can multiple classes declared as-abstract/final -YES
*  5.Can multiple classes contains main method like outter class - YES[Before executing java will ask particularly user permission to execute which class]
*  6.In one java file ,can another class create its own object  - YES 
*  7.Can another class create its object in outter class - YES 
*  8.Can outter class cretae its object in another class - YES
*  
*  
*  
*  1.Can another class extends  outter class , normal class - YES
*  2.Can another class extends   abstract class -YES
*  3.Can another class implements interface - YES 
*  
*  1.Can another class of object create in another file of class and abstract class - YES
*  

*/


