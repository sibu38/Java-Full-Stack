package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingPongThread {
	public static void main(String []args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Runnable runnable1=new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<20;i++)
				{
					System.out.println("PING");
					try 
					{
						Thread.sleep(500);
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			
		};
		Runnable runnable2=new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<20;i++)
				{
					System.out.println("\tPONG");
					try 
					{
						Thread.sleep(500);
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			
		};
		executor.execute(runnable1);
		executor.execute(runnable2);
	}
	
}
