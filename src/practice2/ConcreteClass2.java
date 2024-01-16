package practice2;

public class ConcreteClass2 extends AbstractPractice
{

	public static void main(String[] args)
	{
		ConcreteClass2 c=new ConcreteClass2();
		c.test1();
		c.test2();
		c.test3();
	}

	@Override
	public void test1()
	{
		System.out.println("This is the implementation of abstract method");
		
	}

	@Override
	public void test2()
	{
		
		System.out.println("This is the implementation of abstract method");
	}
	
	
	

}
