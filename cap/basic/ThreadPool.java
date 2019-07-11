package com.cap.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(20);
		for(int i=0;i<100;i++)
		{
			service.execute(new Task123());
			}
		System.out.println("Thread name"+Thread.currentThread().getName());
		}
	}
	class Task123 implements Runnable
	{
		public void run()
	
		{
			System.out.println("Thread name"+Thread.currentThread().getName());
	}
	
	}
