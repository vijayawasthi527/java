package practice3;

public class MyConcreteClass extends MyClass
{
 // here an concrete class is extends abstract class and implements its methods as well as interface
	//methods too
	public static void main(String[] args)
	{
		MyConcreteClass m=new MyConcreteClass();
		m.vijay();
		

	}

	@Override
	public void vijay()
	{
		int jod=a+b;
		System.out.println("This is imcomplete method from interface"+jod);
		
	}

	@Override
	public void rahul()
	{
		
		
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication()
	{
		
	}

}
