package javadayone;


public class Calculator {
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	 
	float add(float k,int j)
	{
		return (k+j);
	}
	
	void add (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	void add(int a, float b)
	{
		System.out.println(a+b);
	}

	
	
	public static void main(String ar[])
	{
		Calculator calcu=new Calculator();
	//	calcu.add(10, 12.5f);
		calcu.add(10, 10.2f);
	float ans=calcu.add(12.4f, 30);
	
	System.out.println(ans);
	}
	

	
}
