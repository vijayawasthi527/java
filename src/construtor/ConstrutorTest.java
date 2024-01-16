package construtor;

public class ConstrutorTest {

	public static void main(String[] args)
	
	{
		ConstrutorTest c = new ConstrutorTest();
		c.my();

	}
	
	/* to call a constructor we don't need to call it with in main method. all
	 * we need , just create an object of that class.Thats it*/

	public ConstrutorTest()//this is the constructor,because we didn't mentioned any return type here ex-void
	{
		System.out.println("This is the constructor demo");
	}
	
	public void my()
	{
	System.out.println("this is my program");
	
	}
}

 