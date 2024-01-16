package controlStatement;

public class TestCaseStatement 
{
    String vijay="awasthi";
    
	public static void main(String[] args)
	{
		TestCaseStatement b=new TestCaseStatement();
		b.name();
		//name();
	}
	
	public TestCaseStatement()
	{
		vijay="Sharma";
		
	}
	
	public  void name()
	{
	//String name="awasthi";
				
		switch(vijay)
		{
		case "awasthi":System.out.println("hello vijay");
		break;
		
		case "Sharma":System.out.println("Bye_bye");
		break;
		
		default:System.out.println("hello");
		break;
		}
	
	}
	

}
