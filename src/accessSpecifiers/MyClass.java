package accessSpecifiers;

public class MyClass {
	
	protected int a=12;
	protected int b=34;
	public int t=45;

	public static void main(String[] args)
	{
		MyClass m=new MyClass();
		m.addition();
		
		
		
		

	}

	
	protected void addition() 
	{
	    
		
		int sum=a+b+t;
		System.out.println("This is the sum of two integers:- "+sum);
		
		
	}
}
