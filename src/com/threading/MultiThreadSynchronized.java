/**
 * 
 */
package com.threading;

/**
 * @author Sathiyan
 *
 */
class Counter
{
	int count;
	public synchronized void increment() { // to avoid multiple thread accessing this method at a time // if you use synchronized at a time only one thread can access this method
		count++;
	}
}

public class MultiThreadSynchronized {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */

	
	public static void main(String[] args) throws InterruptedException {
		
		Counter c= new Counter();
		Thread t1=new Thread(() -> {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
				
			}
		);
		Thread t2=new Thread(() -> {
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			
		}
	);
		
      t1.start();
      t2.start();
      t1.join();
      t2.join();
      System.out.println("Count"+c.count);
	}

}
