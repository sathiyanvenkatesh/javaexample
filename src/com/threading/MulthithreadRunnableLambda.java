/**
 * 
 */
package com.threading;

/**
 * @author Sathiyan
 *
 */
/*class Hi3 implements Runnable{
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
}*/

/*class Hello3 implements Runnable {
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
}*/
public class MulthithreadRunnableLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Runnable object1= ()-> {
				for(int i=0;i<=5;i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			};*/
		/*Runnable Object2 =()-> {
				for(int i=0;i<=5;i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			};*/
		Thread t1=new Thread(()-> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}); //pass obj to thread to link and start run method
		Thread t2=new Thread(()-> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
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
