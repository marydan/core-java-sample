package ThreadSamples;

class Light extends Thread
{
 int status=3;
 public static final int switchon=2;
 public static final int switchoff=0;
// public static final int 
 String company;
  Light(String n)
  {
	  company=n;
  }

  public  synchronized void setStatus(int a)
  {
	  status=a;
	  if(status==2)
	  {
		  notify();
	  }
  }
  
  
  public boolean checkStatus()
  {
	  System.out.println("Status is "+ status);
	  
	  while(status==1)
	  {
		  try
		  {
			  wait();
		  }
	
		  catch(Exception ie) {}
		  
		 
		  
	
	  }
	  if(status==0)
		  return false;
		  
		 return true;	
  }
	
  public void run()
  {
	  while(true)
	  {
		  System.out.println(company);
		
		  if(!checkStatus())
			   break;
	  }
  }
}


public class SampleWaitJoin {

	public static void main(String[] args) throws Exception
	{
		
		Light tube=new Light("Surya");
		Light tablelamp=new Light("Sun");
		
		tube.start();

	tube.setStatus(1);
	
	Thread.sleep(2000);
	
	tube.setStatus(Light.switchon);
	Thread.sleep(3000);
	
	tube.setStatus(Light.switchoff);
      
	}

}
