package com.thread;

public class DaemonThread extends Thread
{
	public DaemonThread(String threadName)
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
	Runnable runnableThread3=new Runnable()
	{
		public void run() 
		{
			//Thread runnableThread=Thread.currentThread();
			for(;;)
			{
				System.out.println("\t\tTONG");
				try 
				{
					Thread.sleep(600);
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
		Thread t3=new Thread(runnableThread3);
		t3.setDaemon(true); //To stop the thread after the end of all non-daemon Threads(if  true)
		t1.start();
		t2.start();
		t3.start();//Runs a infinite thread id not set to daemon thread
		
	}
}
