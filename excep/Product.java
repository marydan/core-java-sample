
public class Product {

	int productid;
	String productname;
	int price;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString()
	{
		return "Product id"+ productid + " Name is " + productname +  " price" + price;
	}
	
	
}
