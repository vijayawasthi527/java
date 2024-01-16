package practice5;

public class ConstructorPractice {
	
	int id=23;
	String name="Vijay";
	boolean result=true;
	float percentage=45.909f;
	double price=345323454d;
	

	public static void main(String[] args) 
	{
		ConstructorPractice cp=new ConstructorPractice();
		cp.details();
		
		ConstructorPractice cp1=new ConstructorPractice("Shubhash");
		cp1.details();
		
		ConstructorPractice cp2=new ConstructorPractice(12,"Avinash",false,77.897f,9894328d);
		cp2.details();
	}
	
	public ConstructorPractice()
	{
		id=45;
		name="Abhishek";
		result=false;
		percentage=89.989f;
		price=342342424d;
	}
	
	public ConstructorPractice(String y)
	{
		name=y;
	}
	
	public ConstructorPractice(int x,String y,boolean u,float t,double r)
	{
		name=y;
		id=x;
		result=u;
		percentage=t;
		price=r;
	}
	
	public void details()
	{
		System.out.println("My name is "+name);
	}
}
