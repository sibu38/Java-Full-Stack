package com.thread;

public class PingPongTest extends Thread
{
	public PingPongTest(String threadName)
	{
	//super.setName(threadName);
	super.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnableThread1=new Runnable()
		{
			public void run() 
			{
				//Thread runnableThread=Thread.currentThread();
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
		Runnable runnableThread2=new Runnable()
		{
			public void run() 
			{
			//Thread runnableThread=Thread.currentThread();
			for(int i=0;i<20;i++)
			{
				System.out.println("\tPONG");
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
		Thread t1=new Thread(runnableThread1);
		Thread t2=new Thread(runnableThread2);
		t1.start();
		t2.start();
	}
}
