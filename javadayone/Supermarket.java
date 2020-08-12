package javadayone;

import java.util.Scanner;

class SpecificationSM
{
  String companyname;
  String incharge;
  int codenumber;
  Scanner scanner;
   static int count=0;

  
  private Integer barcode;  //encapsulated

//  SpecificationSM()
//  {
//	  
//  }
  SpecificationSM(){
	  companyname="ABC supermarket";
  }
 SpecificationSM(String company)
 {
	  System.out.println("in parent");
	 companyname=company;
 }
  
 void addCount()
 {
//	 count++;
 }
   void getDetails()
   {
	   scanner=new Scanner(System.in);
	   System.out.println("Enter incharge");
	   //companyname=scanner.next();
	   incharge=scanner.next();
	   System.out.println("Enter code");
	   codenumber=scanner.nextInt();
	
   }
   
   void printCompanydata()
	 {
		 System.out.println(companyname + incharge );
	 }
   
   
   
 void  dispBarCode()
   {
	   barcode=29910; // auto boxing
	    
	   int code=barcode; // auto unboxing
	
	   
   }
}

class NationalSM extends SpecificationSM
{
	 String country;
	 
	 NationalSM(){
		
	 }
	 
//	 NationalSM(String cntry)
//	 {
//		
//		 super(cntry);
//		 count++;
//		 
//		 System.out.println("Inside chidl");
//		
//	 }
//	 
	 void getDetails()
	 {
		// super.getDetails();
		 country="India";
		 count++;
	 }
	
	 void printCompanydata()
	 {
		 System.out.println("country " + country);
		 super.printCompanydata();
	 }
	 
	 void nationDeails()
	 {
		 System.out.println("This is located near Pacific ocean, population 136 cr");
	 }
	
}

class RegionalSM extends NationalSM
{
	String region;
	String addr;
	
	RegionalSM(){
		 //count++;
	};
//	RegionalSM(String s)
//	{
//		
//		super(s);
//		 count++;
//	}
	void getRegionDetails(String region,String man)
	{
		this.region=region;
		this.addr=man;
		//getDetails();
		count++;
		
	}
	void printRegionDetails()
	{
		System.out.println("Region is" + region);
	}
	
}


public class Supermarket {

	  void getSpecificData(SpecificationSM spec)
	  {
		  if(spec instanceof RegionalSM)
		  {
			  RegionalSM regional=(RegionalSM) spec;
			  regional.printRegionDetails();
		  }
		  else if (spec instanceof NationalSM)
		  {
			  NationalSM national=(NationalSM) spec;
			  national.nationDeails();
		  }
	  }
	
	
	public static void main(String ar[])
	{
		//SpecificationSM market=new SpecificationSM();
//		NationalSM nationindia=new NationalSM("ABC Market");
//		nationindia.getDetails();
//		nationindia.printNationdata();
//		
//		SpecificationSM market1=new NationalSM(); 
//	//	market1.getDetails();
////		market1.getDetails();
////		market1.printCompanydata();
//		
//	  SpecificationSM market2=new RegionalSM();
////	market2.g
//	  Supermarket supermarket=new Supermarket();
//	  
//	  System.out.println("Count of users " + market1.count);
//	  supermarket.getSpecificData(market1);
//	  
	
	  NationalSM nationindia=new NationalSM();
	 nationindia.getDetails();
	  
	  RegionalSM region=new RegionalSM();
	 region.getRegionDetails("south", "mary");
	  
	  System.out.println(SpecificationSM.count);
	   
	  
//	  market2.getDetails();
//	  market2.printCompanydata();
//	  
//	  
//	  SpecificationSM market[];
//	  market=new SpecificationSM[2];
//	  
//	  market[0]=new NationalSM();
//	  market[1]=new RegionalSM();
//	  
	}
	
	
}
