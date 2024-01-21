package exception_Handling_Study;

public class Exception_Study {

	public static void main(String[] args) 
	{
		int a=0;
		int b=0;
		
		try 
		{
			System.out.println(a/b);
		} 
		catch (Exception e)
		{
			System.out.println("cant divide by zero");
		}

	}

}
