import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionExample {

	public static void main(String[] args) {
	
//Generics
		
		Vector<Product> elements=new Vector<Product>();
		
		 Product product=new Product();
		 Vendor vendor=new Vendor();
		
		 product.setPrice(100);
		 product.setProductid(10);
		 product.setProductname("Monitor");
		 vendor.setVendorname("Samsung");
		 vendor.setAddress("Chennai");
		 
		elements.add(product);
		// elements.add(vendor);
		 	 
		 ListIterator elementitr=elements.listIterator();
		 
		 while(elementitr.hasNext())
		 {

	       Product prd=elementitr.next();
	       
	       
		 }
		 
		 
		 
//		

		
		
	}

}

















//Object obj=elementitr.next();
////	  obj.
//
//if(obj instanceof Product)
//{
//	  Product prd= (Product) obj;
	  
	  
//	  System.out.println(prd.getProductname());
//}
//else if (obj instanceof Vendor)
//{
//	  Vendor ven=(Vendor) obj;
//	  System.out.println(ven.getVendorname());
//	  
//}








//List books=new ArrayList();
//books.add("ASP");
//books.add("ASP");
//books.add("CPP");
//
//Iterator listbook=books.iterator();
//
//while(listbook.hasNext())
//{
//	
//	System.out.println(listbook.next());
//	
//}
//
//System.out.println("----------------------");
//
//Set newbooks=new TreeSet();
//newbooks.add("ASP");
//newbooks.add("ASP");
//newbooks.add("CPP");
//
//Iterator setbook=newbooks.iterator();
//
//while(setbook.hasNext())
//{
//	
//	System.out.println(setbook.next());
//	
//}