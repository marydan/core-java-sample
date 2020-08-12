	package ThreadSamples;

class Displaydata
{
	int amount=5000;
	
	 public void calcuPercentage(int amount,int percentage,String type)
	 {
	 synchronized(this)
		 {
		 if (type=="long")
		 {
		  for (int i=0;i<=5;i++)
		  {
			 System.out.println(i+amount*percentage/100 + "Type is " + type);
			 
			 try {
					Thread.sleep(2000);
					}
					catch(Exception e) {}
			 
		   }
		 }
		 else if(type=="short")
		 {
			 System.out.println(amount*percentage/100 + "Type is " + type);
		 }
		 
		 }
   }
}


class LongCustomer extends Thread
{
	
	Displaydata data;
	
	LongCustomer(Displaydata d)
	{
		data=d;
	}
	public void run()
	{
		data.calcuPercentage(2000,10,"long");
//		try {
//		Thread.sleep(2000);
//		}
//		catch(Exception e) {}
	}
}

class TempCustomer extends Thread
{
	Displaydata data;
	
	TempCustomer(Displaydata d)
	{
		data=d;
	}
	
	
	public void run()
	{
		data.calcuPercentage(5000,5,"short");
//		try {
//		Thread.sleep(2000);
//		}
//		catch(Exception e) {}
	}
	
}


public class Numerdisplayer {

	public static void main(String ar[]) throws Exception
	{
		
		Displaydata data=new Displaydata();
 LongCustomer longcustomer=new LongCustomer(data);
 TempCustomer tempcust=new TempCustomer(data);
 
 longcustomer.start();
 
 
 
 tempcust.start();
 
 longcustomer.join();
 
	}
}
