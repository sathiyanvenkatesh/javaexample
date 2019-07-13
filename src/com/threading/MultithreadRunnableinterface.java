/**
 * 
 */
package com.threading;

/**
 * @author Sathiyan
 *
 */
class Hi2 implements Runnable{
	public void run() {
	for(int i=0;i<=5;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class Hello2 implements Runnable {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultithreadRunnableinterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable object1=new Hi2();// create instance/object for Runnableinterface
		Runnable Object2 =new Hello2();
		
		Thread t1=new Thread(object1); //pass obj to thread to link and start run method
		Thread t2=new Thread(Object2);
		t1.start();
		try {
			Thread.sleep(100); // to stope overlap start time
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
