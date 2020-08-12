package StaticExample;


class Book
{
	  
	  int price;
	  // Author author=new Author();
	  //Author author=new Author();
	  Book()
	  {
		  price=200;
	  }
	  
	  class Author
	  {
		  
	   String name;
	   int expr;
	   void getDetails(String nm,int e)
	   {
		   name=nm;
		   expr=e;
	   }
	   void showAuthorDetails()
	   {
		   System.out.println("Author is" + name + " Experience " + expr);
	   }
	  };
	  
	  private Author author=new Author();
	Author   getAuthorDetails()
	  { 
		   
	        return author;
		
	   
	  }
	
	void getPaper()
	{
		class Paper
		{
			String papertype;
			  void showPaperType()
			  {
				  papertype="Plain White";
				  System.out.println(papertype);
			  }
			
		}
		
		Paper paper=new Paper();
		paper.showPaperType();
	}
	
	  
}




public class Library {

	public static void main(String[] args) {
	 
		Book book =new Book();
	//	book.author.getDetails("Mart", 30);
//		book.author.showAuthorDetails();
//	
	
	//	Book.author.getDetails("Mart", 20);
		
		//book.author.getDetails(nm, e);
		
	//	System.out.println("Price is " + book.price);
		
		book.getAuthorDetails().getDetails("Paul", 29);
		
		book.getAuthorDetails().showAuthorDetails();
		book.getPaper();
		
	}

}
