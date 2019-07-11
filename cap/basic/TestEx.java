package com.cap.basic;

/*class ThreadEx implements Runnable {
public void run()
{for(int i=1;i<10;i++)
	System.out.println("Thread");
}
	
}
class TestEx{
	public static void main(String[] args) {
		ThreadEx t=new ThreadEx();
		Thread t1=new Thread(t);
		t1.start();
}}*/
class ThreadEx extends Thread {
public void run()
{for(int i=1;i<5;i++)
	System.out.println(" user Thread"+Thread.currentThread());
}
	
}
class TestEx{
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setPriority(10);
		ThreadEx t=new ThreadEx();
		t.start();
		t.join();
		/*ThreadEx t1=new ThreadEx();
		t1.start();
		t1.join();
		ThreadEx t2=new ThreadEx();
		t2.start();
		t2.join();*/
		for(int i=1;i<5;i++) {
			Thread.currentThread().setName("wake up");
		
			System.out.println(" main Thread"+Thread.currentThread());
			
		}
		
}}