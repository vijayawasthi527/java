package practice5;

public interface Fathers 
{
	void hardWork();
	void honesty();
	default void love()
	{
	System.out.println("Fathers love");
	}
	static void test()
	{
	System.out.println("Fathers test method");
}
}
