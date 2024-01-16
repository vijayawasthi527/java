package practice2;

public class MyConcreteClass extends ConstructorPractice{

	public static void main(String[] args)
	{
		MyConcreteClass m=new MyConcreteClass();
		m.vijay();
		m.awasthi();

	}

	@Override
	public void vijay() 
	{
		
		System.out.println("This is the body of first abstract method");
	}

	@Override
	public void awasthi()
	{
		System.out.println("This is the body of second abstract method");
		
	}

}
