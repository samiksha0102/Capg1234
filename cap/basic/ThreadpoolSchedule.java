package com.cap.basic;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadpoolSchedule {
	
		public static void main(String[] args) {
			ScheduledExecutorService service=Executors.newScheduledThreadPool(1000);
			//service.schedule(new Task31(),10,TimeUnit.SECONDS);
			service.scheduleAtFixedRate(new Task31(),15,10, TimeUnit.SECONDS);
			//service.scheduleWithFixedDelay(new Task31(),20,10, TimeUnit.SECONDS);
			
			for(int i=0;i<100;i++)
			{
				service.execute(new Task123());
				}
				
			System.out.println("Thread name "+Thread.currentThread().getName());
			}
		}
		class Task31 implements Runnable
		{
			public void run()
		
			{
				System.out.println("Thread name "+Thread.currentThread().getName());
		}
		
		}
