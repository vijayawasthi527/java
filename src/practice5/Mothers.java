package practice5;

public interface Mothers
{

	void look();
	void nature();
	default void love()
	{
	System.out.println("Mothers love");
	}
	static void test() {
	System.out.println("Mothers test method");
}
}