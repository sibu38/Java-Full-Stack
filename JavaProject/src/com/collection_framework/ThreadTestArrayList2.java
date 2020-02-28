package com.collection_framework;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTestArrayList2 extends Thread {
	public static void main(String[]args)
	{
		List<String> arrayList = new CopyOnWriteArrayList<String>();
		Runnable runnable1=new Runnable()
		{
			@Override
			public void run() {
				//Thread runnableThread=Thread.currentThread();
				for(int i=0;i<20;i++)
				{
					arrayList.add("Thread Running");
					try 
					{
						Thread.sleep(300);
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
			public void run() {
				//Thread runnableThread=Thread.currentThread();
					for(int i=0;i<20;i++)
					{
						Iterator<String> itr = arrayList.iterator();
						while(itr.hasNext()) {
						String name = itr.next();
						System.out.println(name);
						try 
						{
							Thread.sleep(200);
						} 
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
		Thread t1=new Thread(runnable1);
		Thread t2=new Thread(runnable2);
		//testArrayList(runnable1,runnable2);
		t1.start();
		t2.start();
	}
	/*private static void testArrayList(Runnable r1,Runnable r2) {
		List<Runnable> arrayList = new ArrayList<Runnable>();
		arrayList.add(r1);
		arrayList.add(r2);
		}*/
}
