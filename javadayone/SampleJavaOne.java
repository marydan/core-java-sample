package javadayone;

import java.util.Scanner;

public class SampleJavaOne {

	public static void main(String[] args)
	{
	    
		 int[] num;
		//	 int num[];
		 
		 
		String group[]=new String[3];
	
		Scanner scanobj=new Scanner(System.in);
		
//		for(int i=0;i<=2;i++)
//		{
//		group[i]=scanobj.next();
//		}
//
//	 	
//	 	 for(String s : group)
//	 	 {
//	 		 System.out.println(s.toUpperCase());
//	 	 }
	 	 
	 	 
	 	 String data="mary,dan,usha,vidhya,arvind,vani";
	 	 
	 	 String[] dataarr=data.split(",");
	 	 
	 	 

	 	 for(String name : dataarr)
	 	 {
	 		 if(name.toUpperCase().startsWith("V"))
                  System.out.println(name);
	 			 
	 	  }
	 	 
	 	 String name="Company";
	 	 
	 	 //group[0]="Chemistry";
	 	 
	 	 
	 	int elements[] = new int[6];
	 	
	 	elements = new int[10];

	}

}
