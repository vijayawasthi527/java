package exception_Handling_Study;

public class Exception_Study_Try_Catch_Finally {

	public static void main(String[] args) 
	{
		int a=0;
		int b=0;
		
		String name="Vijay";
		
		
		
		try 
		{
			//System.out.println(a/b);
			
			System.out.println(name.charAt(9));
			
			
		} 
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("Can't locate the character out of bound");
		}
		
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("This message will show when index is out of bound!!");
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("this is real exception");
		}
		
		finally 
		{
			System.out.println("Exception has finally tackled");
		}

	}

}
