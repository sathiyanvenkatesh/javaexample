/**
 * 
 */
package com.threading;

/**
 * @author Sathiyan
 *
 */
class Hi1 extends Thread{
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

class Hello1 extends Thread {
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
public class MultiThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hi1 object1=new Hi1();
		Hello1 Object2 =new Hello1();
		object1.start();
		try {
			Thread.sleep(100); // to stope overlap start time
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object2.start();


	}

}
