package methods;

public class NonStaticMethodCallInDifferentClass {

	public static void main(String[] args)
	{
     
		NonStaticMethodCallInSameClass N=new NonStaticMethodCallInSameClass();
		/*here N is the object which we have created 
		for calling method from another class*/
		
		N.sale1();
		N.sale2();


	}

}
