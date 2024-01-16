package methods;

public class AllMethodsInOneClass {

	public static void main(String[] args) 
	{
		Demo1();
		Demo2(21,'F',79.98f);
		
		AllMethodsInOneClass a=new AllMethodsInOneClass();
		
		a.test3();
		
		a.test4(2643,9,'d');

	}
	
	public static void Demo1() //static method without arguments
	{
		System.out.println("This is the output from the static method");
		System.out.println("=============================");
		
	}
	
	public static void Demo2(int age,char gender,float result)//static method with arguments
	{
		System.out.println("This is the output from static method with arguments");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("This is my age:-"+age);
		System.out.println("This is my gender:-"+gender);
		System.out.println("This is my result:-"+result);
		System.out.println("++++++++++++++++++++++++++++");
	}
	

	public void test3()
	{
		System.out.println("This is the output from non-static regular method without arguments");
		System.out.println("=============================");
	}
	
	
	public void test4(int rno,int standard,char section)
	{
		System.out.println("This is the output from non-static method with arguments");
		//System.out.println("=============================");
		System.out.println("This is my rollnumber:-"+rno);
		System.out.println("This is my class:-"+standard);
		System.out.println("This is my section:-"+section);
		System.out.println("=============================");
	}
}
