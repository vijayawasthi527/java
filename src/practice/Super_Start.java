package practice;

public class Super_Start implements Start2,Start1
{

	public static void main(String[] args)
	{
		Super_Start s=new Super_Start();
		s.mystart9();
		s.mystart11();
		s.mystart22();
		System.out.println("These are the variables from interface:- "+Start1.a);

	}

	@Override
	public void mystart1()
	{
		System.out.println("This the defination of mystart1");
		
		
		
	}

	@Override
	public void mystart2() 
	{
		System.out.println("this is the defination of mystart2");
		
		
	}

	@Override
	public void mystart9() {
		// TODO Auto-generated method stub
		Start1.super.mystart9();
		Start2.super.mystart9();
	}

	@Override
	public void mystart11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mystart22() {
		// TODO Auto-generated method stub
		
	}
	

}

	