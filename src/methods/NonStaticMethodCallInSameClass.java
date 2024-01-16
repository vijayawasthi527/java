package methods;

public class NonStaticMethodCallInSameClass {

	public static void main(String[] args) {
		
		NonStaticMethodCallInSameClass N=new NonStaticMethodCallInSameClass();
		/*here N is the object which we have created 
		for calling method from another class*/
		N.sale1();
		N.sale2();
		
	}
	
	public void sale1()
	{
		System.out.println("This is the first method output from nonstatic method");
		
	}
	public void sale2()
	{
		System.out.println("This is the second method output from nonstatic method");
	}
	

}
