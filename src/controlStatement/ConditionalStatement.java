package controlStatement;

public class ConditionalStatement
    {
	  static int marks;
	  static int marks1;
	  static int marks2;

	public static void main(String[] args)
	{
	ConditionalStatement cs=new ConditionalStatement();
	cs.studentRecord1();
	cs.studentRecord2();
	cs.studentRecord3();
	
	//System.out.println(marks2);
	
	if (marks1>=55)
	{
		System.out.println("You are the topper among all!!!! your marks is "+marks1);
	}
     
	else if (marks1<55 && marks1>44)
	{
		System.out.println("You are the second topper of class: "+marks1);
	}
	
	char gender='F';
	if (gender=='M')
	{
		System.out.println("I am male");
	}
	else
	{
		System.out.println("I am female");
	}
	}
	
	public void studentRecord1()
	{
		marks=35;
	}
	public void studentRecord2()
	{
		marks1=45;
	}
	public void studentRecord3()
	{
		marks2=55;
	}

}
