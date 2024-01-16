package construtor;

public class ConstructorUse {
    
	int a;
	int b;
	int c;
	
	public ConstructorUse()
	{
	  a=23;
	  b=45;
	  c=34;
	}
	
	public ConstructorUse(int x)
	{
		a=x;
		System.out.println("&&&&&&&&&the value of b is :-"+b);
		System.out.println("***********the value of c is:-"+c);
	}
	
	public ConstructorUse(int x, int y)
	{
		a=x;
		b=y;
		
		System.out.println("++++++++++the value of a is:-"+a);
		System.out.println("&&&&&&&&&the value of b is :-"+b);
		System.out.println("***********the value of c is:-"+c);
		
	}
	
	public ConstructorUse(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	public static void main(String[] args)
	{
     
    ConstructorUse cu=new ConstructorUse();
    cu.addition();
    cu.substraction();
    System.out.println("=========================");
    ConstructorUse cu1=new ConstructorUse(100);
    cu1.addition();
    cu1.substraction();
    System.out.println("=========================");
    ConstructorUse cu2=new ConstructorUse(100,200);
    cu2.addition();
    cu2.substraction();
    System.out.println("=======================");
    ConstructorUse cu3=new ConstructorUse(100,200,300);
    cu3.addition();
    cu3.substraction();
    
	
	}
	

	
	public void addition()
	{
		
		int sum=a+b+c;
	
		System.out.println("here is the sum:->  "+sum);
	}
	
	public void substraction()
	{
		int sub=a-b-c;
		System.out.println("here is the substraction:-> "+sub);
	}
}
