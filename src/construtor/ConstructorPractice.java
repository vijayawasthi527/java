package construtor;

public class ConstructorPractice {
      
	float percent;
	int marks;
	String name;
	long balance;
	
	public ConstructorPractice()
	{
		percent=67.77f;
		marks=78;
		name="Vijay awasthi";
		balance=3475903298l;
		
	}
	
	
	public static void main(String[] args)
	{
		ConstructorPractice c=new ConstructorPractice();
		c.details();
		
		ConstructorPractice c1=new ConstructorPractice(89.99f);
		c1.details();
		
		ConstructorPractice c2=new ConstructorPractice(78.88f,435,"rahul diwan",8970856);
		c2.details();
		

	}
	
	public ConstructorPractice(float y)
	{
		percent=y;
		
	}
	
	public ConstructorPractice(float y,int z,String k,long t) 
	{
		percent=y;
		marks=z;
		name=k;
		balance=t;
		
		
		
	}

    public void details()
    {
    	System.out.println("My details are follows===========");
    	System.out.println("My name is : "+name);
    	System.out.println("My percents are : "+percent);
    	System.out.println("My marks are : "+marks);
    	System.out.println("My balance is : "+balance);
    }

}


