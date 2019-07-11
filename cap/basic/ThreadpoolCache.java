package com.cap.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolCache {
	
		public static void main(String[] args) {
			ExecutorService service=Executors.newCachedThreadPool();
			for(int i=0;i<100;i++)
			{
				service.execute(new Task1234());
				}
			System.out.println("Thread name"+Thread.currentThread().getName());
			}
		}
		class Task1234 implements Runnable
		{
			public void run()
		
			{
				System.out.println("Thread name"+Thread.currentThread().getName());
		}
		
}
