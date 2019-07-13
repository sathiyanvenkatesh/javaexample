/**
 * 
 */
package com.threading;

/**
 * @author Sathiyan
 *
 */


class Hi {
	public void show() {
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

class Hello {
	public void show() {
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

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // all execution done by main thread
		Hi object1=new Hi();
		Hello Object2 =new Hello();
		object1.show();
		Object2.show();

	}

}
