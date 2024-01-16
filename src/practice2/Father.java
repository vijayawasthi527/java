package practice2;

public interface Father 
{

	
	default void money()
	{
		System.out.println("This is the money from father");
	}
	
	void car();
	 
}
