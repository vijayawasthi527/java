package methods;

public class StaticMethodCallFromSameClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     
		//how to call static regular method from same(own) class
		//methodName();
		test();//calling static regular method from same class
		test1();//calling static regular method from same class
     
	}
	
	public static void test()//complete static regular method 	
	{
		System.out.println("hi this is static regular method test");
	
	}
	
	public static void test1()
	{
		System.out.println("hi this is static regular method test1");
	
	}
	
}
	
