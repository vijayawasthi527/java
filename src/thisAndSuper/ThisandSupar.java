package thisAndSuper;

import inheritance.Mother;

public class ThisandSupar extends Mother {
	
	int a=12;
	int b=34;
	 static int c=67;

	public static void main(String[] args) 
	{
		ThisandSupar su=new ThisandSupar();
		su.sum();
		details();
		su.cat();
	}
	
	public void sum()
	{
		int a=23;
		// static int k=33;
		int b=45;
		int c=88;
		int sum=this.a+this.b+c;//now its taking global variable's value of a and b because use of this
		int sum1=a+b+c;
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println("This is the use of super keyword:- "+super.s);
	}
	
	protected static void details()
	{
		//int c=56;
	int h=c/2;
	System.out.println(h);
		
	}
	
	public void cat() {
		System.out.println(c);
	}
	

}
