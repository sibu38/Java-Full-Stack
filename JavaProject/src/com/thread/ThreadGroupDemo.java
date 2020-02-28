package com.thread;

public class ThreadGroupDemo implements Runnable
{
	Thread t1,t2,t3;
	public ThreadGroupDemo() {
	t1=new Thread(this);
	t2=new Thread(this);
	t3=new Thread(this);
	t1.setName("PING");
	t2.setName("PONG");
	t3.setName("TONG");
	t1.start();
	t2.start();
	t3.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupDemo runnable=new ThreadGroupDemo();
		ThreadGroup g1=new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(g1, runnable,"one");  
        Thread t2 = new Thread(g1, runnable,"two");  
        Thread t3 = new Thread(g1, runnable,"three");  
        //t3.setDaemon(true); //To stop the thread after the end of all non-daemon Threads(if  true)
        t1.start(); 
        t2.start(); 
        t3.start();  
        
		
	}
	@Override
	public void run() 
	{
		Thread currentThread=Thread.currentThread();
		if (Thread.currentThread().getName().equals("PING"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if (Thread.currentThread().getName().equals("PONG"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("\t PONG");
				try {
					
					Thread.sleep(400);
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 
		else if (Thread.currentThread().getName().equals("TONG"))
		{
			for(;;)
			{
				System.out.println("\t\tTONG");
				try {
					
					Thread.sleep(700);
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 
	}
}
