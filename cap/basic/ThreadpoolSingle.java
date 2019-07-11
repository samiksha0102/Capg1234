package com.cap.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolSingle {
	public static void main(String[] args) {
		ExecutorService service=Executors.newSingleThreadExecutor();
		for(int i=0;i<100;i++)
		{
			service.execute(new Task12());
			}
		System.out.println("Thread name"+Thread.currentThread().getName());
		}
	}
	class Task12 implements Runnable
	{
		public void run()
	
		{
			System.out.println("Thread name"+Thread.currentThread().getName());
	}
	
	}


