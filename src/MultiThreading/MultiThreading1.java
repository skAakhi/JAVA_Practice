package MultiThreading;

public class MultiThreading1 {
	/*
	 * Use of Synchronized keyword and volatile keyword
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		DairyCount dc = new DairyCount();
		
		Runnable r1 = ()->{
			for(int i=0;i<1000;i+=50)
				dc.Brick();
			
		};
		
		Runnable r2 = ()->{
			for(int i=0;i<2000;i+=50)
				dc.Brick();
			
		};
		
		Runnable r3 = ()->{
			for(int i=0;i<3000;i+=50)
				dc.Brick();
			
		};
		//System.out.println(dc.BrickCount);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(dc.BrickCount);
		t2.sleep(2000);
		System.out.println(dc.BrickCount1);
		
		
	}

}
//The synchronized keyword is applicable to within block level and method level
//Suppose i would like to apply synchronize among  some of the data in the class , then i can put that data within separate block to apply synchronize technique
class  DairyCount{
	
	/*volatile*/ int BrickCount =0; // For updation of data volatile keyword might be not fit , to retrieve any value it is suitable, this will dont get into thread , by object memory there itself it will be updated
	volatile int BrickCount1 =0;
	
	public  synchronized void Brick()
	{
		BrickCount+=50;
	}
	
//	public void Brick()
//	{
//		synchronized(this){
//			BrickCount+=50;
//		}
//		BrickCount1+=50;
//	}
	
	
	
	
	
	
}
