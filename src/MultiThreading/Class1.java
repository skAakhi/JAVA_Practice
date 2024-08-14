package MultiThreading;

public class Class1 {
	/*
	 * Remember the concepts of 
	 * Task & Multi-Tasking
	 * Process & Multi-processing
	 * Thread & Multi-Threading
	 * 
	 * There are four ways of creating Threads
	 * 
	 * 1.By Extending Thread class
	 * 2.By implementing Runnable interface
	 * 3.Using anonymous class
	 * 4.Using anonymous function with lambda expressions
	 * 
	 * Runnable interface ----->Thread class ----> Start method ------> run method
	 *
	 */

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hai how are you");
		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getId());
	    System.out.println(Thread.currentThread().getPriority());
//		
    Class2 c1 = new Class2();
//	    Class2 c2 = new Class2();
//	    Class2 c3 = new Class2();
//	    
		Thread t11 = new Thread(c1);
//		Thread t2 = new Thread(c2);
//		Thread t3 = new Thread(c3);
//		
		t11.start();
//		t2.start();
//		t3.start();
//		
//		System.out.println(Thread.currentThread().activeCount());
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
	    
	    // Anonymous inner class
	    
//	    Class2 c1 = new Class2() {
//
//			@Override
//			public void run() {
//				System.out.println("Anonymous inner class run method");
//				
//			}
//	    	
//	    };
//	   Thread t1 = new Thread(c1);
//	   Thread t2 = new Thread(c1);
//	   t1.start();
//	   t2.start();
	    
	    // With Anonymous function with lambda expression
	    
	    Runnable r1 = ()->{
	    	for(int i=0;i<5;i++)
	        System.out.println("Anonymous1 inner function rum method overided");
	    			};
	    Runnable r2 = ()->{
	    	for(int i=0;i<5;i++)
	    	System.out.println("Anonymous2 inner function rum method overided");
	    };
	    Runnable r3 = ()->{
	    	for(int i=0;i<5;i++)
	    	System.out.println("Anonymous3 inner function rum method overided");
	    };
	    	
	   Thread t1 = new Thread(r1,"t1");
	   Thread t2 = new Thread(r2,"t2");
	   Thread t3 = new Thread(r3,"t3");
	   System.out.println(t1.getName());
	   System.out.println(t2.getName());
	   System.out.println(t3.getName());
	   
	   
	    t1.start();
	    t1.join();
      t2.start();
      t2.join();
	    t3.start();
//	   
//		
//
}

}

class Class2 implements Runnable{ // and Extends Thread
	public void run()
	{
		System.out.println("Run method is called");
	}
	
}

//@FunctionalInterface
//interface Class2 {
//	public void run();
//}


/*
* Thread cycle
* 1.New 
* 2.Runnable
* 3.Join waiting
* 4.Specified time waiting
* 5.Terminated
*/
