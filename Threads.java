package Threads;

class MyThread extends Thread{    //thread class
	public void start() {
//		System.out.println("Thread is Starting...");
		for(int i = 0; i<5; i++) {
			System.out.println("Thread is Starting..."+i);
			
			try {
				Thread.sleep(1000);
				
				
			}
			catch(InterruptedException e) {
				System.out.println("Thread is Starting..."+e);
				
			}
					
		}
	}
}
public class Threads {
	public static void main(String[]args) {
		MyThread m1 = new MyThread();
		m1.start();
		System.out.println("Thread is Completed...");
	
	}

}

