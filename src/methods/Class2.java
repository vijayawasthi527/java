package methods;

public class Class2 {

	public static void main(String[] args) 
	{
		Class2 c=new Class2();//new is a keyword and it is also called memory assignment operator. it assign memory to object
		c.fn1();
		c.fn2();
		
		Class1 d=new Class1();
		d.fn3();
		d.fn4();

	}
	
	public void fn1()
	{
		int a=12;
		int b=23;
		int c=a+b;
		System.out.println("Here is the sum of 12 & 23 = "+c);
	}
	
	public void fn2()
	{
		double d=3424.56d;
		double e=89.89d;
		double k= d*e;
		System.out.println("Here is the multiplication of 3424.56 & 89.89= "+k);
	}

}
