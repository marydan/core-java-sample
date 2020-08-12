package ThreadSamples;

import java.util.Date;

class Mydata extends Thread {
	
	static int choice=0;
	Mydata(String nm, int prio)
	{
		this.setName(nm);
		this.setPriority(prio);
	}
	
	public void run()
	{
		while(choice==0)
		{
		System.out.println("Currently running thread" + this.getName());
		   try
		   {
			   Thread.sleep(1000);
		   }
		   catch(InterruptedException e)
		   {
			   
		   }
		
		}
	}
}
 
 class DisplayDatetime implements Runnable
 {
	 public void run()
	 {
		 while(true)
		 {
		 System.out.println("Seconds " + new Date().getSeconds());
		 try
		   {
			   Thread.sleep(1000);
		   }
		   catch(InterruptedException e)
		   {
			   
		   }
		 }
	 }
 }

public class CommonData
{
	public static void main(String arg[]) throws Exception
	{
		Mydata mythread=new Mydata("Development",Thread.MAX_PRIORITY);
		Mydata secondthread=new Mydata("Testing",Thread.MAX_PRIORITY);
		DisplayDatetime datethread=new DisplayDatetime();
	
		mythread.start();
		
	//	new Thread(datethread).start();
	
		System.out.println("Doing transaction in main method");
		
		Thread.sleep(3000);
		
		mythread.choice=1;
		
	//	System.out.println(mythread.getState());
		//datethread.start();
		try
		{
			mythread.join();
		}
	   catch(Exception e) {}
		
		
		System.out.println("Child thread completed , proceeding with main thread");
	 
		
		// secondthread.start();
	}
}



