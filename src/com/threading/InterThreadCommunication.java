/**
 * 
 */
package com.threading;

import java.lang.management.RuntimeMXBean;

/**
 * @author Sathiyan
 *
 */

class TestObject{
	int num;
	boolean valueSet =false;
	public synchronized void set(int num) {
		while(valueSet) {
			try{wait();} catch(Exception e) {} // wait() is not thread method , its a object method when you use this it will make wait all the threads which is using this object 
		}
		System.out.println("Put :"+num);
		this.num=num;
		valueSet=true;
		notify();// this will notify to other thread  in waiting state 
	}
	
	public synchronized void get() {
		
		while(!valueSet) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Get :"+num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable{
	
	TestObject tobject;

	public Producer(TestObject tobject) {
		
		this.tobject = tobject;
		Thread t1 = new Thread(this, "Producer Thread");
		t1.start();
	}
	
	public void run() {
		int i=0;
		while (true) {
			tobject.set(i++);
			try {Thread.sleep(100); } catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

class Consumer implements Runnable
{
	TestObject tobj ;

	public Consumer(TestObject tobj) {		
		this.tobj = tobj;
		Thread t2 = new Thread(this, "Consumer Thread");
		t2.start();
	}
	
	public void run() {
		while(true) {
			tobj.get();
			try {Thread.sleep(100); } catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}


public class InterThreadCommunication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestObject ob= new TestObject();
     
        new Producer(ob);
        new Consumer(ob);
	}

}
