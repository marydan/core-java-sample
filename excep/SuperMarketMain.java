import java.io.IOException;

public class SuperMarketMain {

	
	  void checkPrice(int price) throws PriceNegativeException
	  {
		    if(price<0)
		    	throw new PriceNegativeException("Price can't be -ve");
	  }
	  
	  
	
	public static void main(String[] args) throws IOException {
		 
		Product products[];
       products=new Product[3];
     
    
         
         for(int i=0;i<=2;i++)
       {
       products[i]=new Product();  
       
     	}
    	   try
       {
    	     products[0].setProductid(10);
             products[0].setProductname("Table");	  
             products[0].setPrice(-150);
             SuperMarketMain supermarket=new SuperMarketMain();
             supermarket.checkPrice(products[0].getPrice());
             
            int average=products[0].getPrice()/0;
//               
             System.out.println(products[0].toString());
//             
//             products[3].setProductid(20);
//             products[3].setProductname("Chair");
       }
//    	   catch(NullPointerException excep)
//    	   {
//    		   System.out.println("Product not initialized");
//    	   }
//    	   catch(ArrayIndexOutOfBoundsException ae)
//    	   {
//    		   System.out.println("Array sizing error " + ae.toString());
//    	   }
    	   catch(PriceNegativeException ex)
    	   {
    		   System.out.println("error " + ex.toString());
    	   }
           finally
           {
        	   System.out.println("Product details are Processed");
           }
        System.out.println("ABC Supermarket : Chennai");     
             
//       }
     
        
        char c=(char)System.in.read();
		
        
	}

}
