package Collections_Work1;

import java.util.Stack;

public class Stack1 {
	/* stack represents LIFO principal
	 * 
	 * The picture of stack we should imagine vertical order , but with Vector in horizantal order 
	 * 
	 * Stack 1.0 - legacy class
	 * Collections 1.2
	 * Generics 1.5
	 * 
	 * 
	 * Stack class is extending vector class 
	 * So, whatever the properties and methods does vector class has , those same methods will be applicable to Stack class as well.
	 * In stack class  we are not preferring those of methods of vector class instead it has four special methods 
	 * 
	 * Methods:
	 *  1.Push()
	 *  2.pop()
	 *  3.peek()
	 *  4.Search() [This will traverse the elements from top of the stack , there basically index starts with 1 
	 *  
	 * 
	 */

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		s.add(10);
		s.add(20);
		//System.out.println(s);
		s.push(30);
		s.push(40);
		System.out.println(s);
		
//		s.pop();
//		
//		System.out.println(s);
//		
		System.out.println(s.peek());
		
		// Difference between display method and index of method  
		
        System.out.println(s.search(40));
        System.out.println(s.search(30));
        
        
        System.out.println(s.lastIndexOf(40));
        System.out.println(s.lastIndexOf(30));
        
		
		
		
		
		
		
	}

}
