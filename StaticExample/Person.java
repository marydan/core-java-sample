package StaticExample;


class Myidentity
{
	static double idvalue;
	
	static
	{
		idvalue=0;
		int a=0;
		System.out.println("Generating IDs for a person");
	}
	
	double getId(int a)
	{
		return Math.random()*a; 
	}
}

public class Person {

	public static void main(String[] args) {
	
		Myidentity myid=new Myidentity();
		System.out.println( myid.getId(1900));

	}

}
