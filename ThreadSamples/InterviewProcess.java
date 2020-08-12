package ThreadSamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Interpersonal implements Runnable
{
	String name;
	String keydata;
	String academic;
	Interpersonal(String n,String h)
	{
		name=n;
	keydata=h;
	}
	
	public synchronized  void task()
	{
		if(keydata.equals("sports"))
         System.out.println("Priority to be given in commecial divisions");
		else if (keydata.equals("PG"))
			System.out.println("Priority for Data department");
	}
	public void run()
	{
		for(int i=0;i<=3;i++)
			task();
	}
}


public class InterviewProcess {

	public static void main(String[] args) {
 
		Interpersonal person1=new Interpersonal("Mary","sports");
		Interpersonal person2=new Interpersonal("Manish","PG");
		
//		ScheduledThreadPoolExecutor schedule=(ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(5);
//		
//	schedule.scheduleWithFixedDelay(person1, 5, 2, TimeUnit.SECONDS);
//	schedule.scheduleWithFixedDelay(person2, 3, 5,TimeUnit.SECONDS);
	
	
	ExecutorService executor=Executors.newCachedThreadPool();
	
	try
	{
		executor.execute(person1);
		executor.execute(person2);
		
	}
	finally
	{
		executor.shutdown();
	}
	
	
	
	}

}
