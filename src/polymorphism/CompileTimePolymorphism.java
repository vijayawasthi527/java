package polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) 
	{
		CompileTimePolymorphism c=new CompileTimePolymorphism();
		c.addition();
		c.addition(11,78);
		c.addition("vijay");
		//method overloading is happening here because we have two methods with same name but different parameters
		//we call same method as there name is the same but there signautre is different
	}
	
	public void addition()
	{
		int a=12;
		int b=45;
		int sum=a+b;
		System.out.println("This is the sum of two veriables:- "+sum);
	}
	
	public void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("This is the sum of two veriables:- "+sum);
	}
	
	public void addition(String g)
	{
		System.out.println("this is the String output:-  "+g);
	}
}
