/**
 * 
 */
package com.threading;

/**
 * @author Sathiyan
 *
 */
public class MulthiThreadLambdaJoinIsAlive {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(()-> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();}
			}
			
		}); //pass obj to thread to link and start run method
		Thread t2=new Thread(()-> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();}
			}
			
		});
		t1.start();
		try {Thread.sleep(100); } catch (InterruptedException e) {e.printStackTrace();}// to stope overlap start time
		t2.start();
		System.out.println("t1.isAlive()"+t1.isAlive());
		t1.join();
		t2.join();
		System.out.println("t1.isAlive()"+t1.isAlive());
		System.out.println("Bye"); // this will not print by main thread untill t1 and t2 compleats and join with main thread t1.join() and t2.join()

	}

}
