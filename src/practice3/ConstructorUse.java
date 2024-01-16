package practice3;

public class ConstructorUse {

	public static void main(String[] args) 
	{
		ConstructorUse cu=new ConstructorUse(12,33);
		cu.addition();

	}
	
	int a;
	int b;
	
	public ConstructorUse(int k,int j)
	{
		a=k;
		b=j;
		
	}
	
	public void addition()
	{
		int sum=a+b;
		System.out.println("This is the additon of two numbers:- "+sum);
	}
}
