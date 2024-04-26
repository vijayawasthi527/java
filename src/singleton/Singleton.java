package singleton;

public class Singleton
{
	
	private static Singleton e;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if (e == null) {
            e = new Singleton();
            }
		return e;
			
	}

}
