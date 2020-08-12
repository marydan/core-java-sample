package StaticExample;

abstract class Report
{
	void printHeader()
	{
		System.out.println("ABC Super Market");
	}
	
	 abstract void printData();
	 
}

interface iHeader
{
	void showHeader();
}
interface iAdmin  extends iHeader
{
  public abstract	void regionalRevenue();
	void regionalGrowth();
}

interface iShowdata
{
	void printData();
}

class Food implements iShowdata
{
 
	public void printData() {
		// TODO Auto-generated method stub
		
	}
	
}

 class RegionalTeam implements iAdmin,iShowdata
{
	 public void showHeader()
	 {
		 System.out.println("ABC Supermarket");
	 }
	void regionEmployee()
	{
		System.out.println("120 Employees Avaialbe");
	}
	public void printData()
	{
		System.out.println("Total items 2000");
	}
	public void regionalRevenue()
	{
		System.out.println("Revenu for the month 10Cr");
	}
	public void regionalGrowth()
	{
		System.out.println("3%");
	}
}

class Customer
{
	//RegionalTeam region=new RegionalTeam();
	iShowdata customer=new RegionalTeam();
	
	 
	void orderDetails()
	{
		customer.printData();
	
		//region.
		System.out.println("Vegies , Fruits");
	}
	void printData()
	{
		System.out.println("Bill No : ABC299");
	}
}

public class Market {

	public static void main(String[] args) {
	Report report;
// RegionalTeam region=new RegionalTeam();
// region.printHeader();
// 
 
	
//	  report=new RegionalTeam();
   //   report.printData();
      
   //   report=new  Customer();
     // report.printData();
	//Market market=new Market();
	//market.print(report);
	  
	Customer customer=new Customer();
	customer.orderDetails();
	
	}

	
	void print(Report report)
	{
		report.printData();
	}
}
