package practice2;

public class Family implements vijay,Abhishek,Amit 
{

	public static void main(String[] args)
	{
		Family f=new Family();
		f.show();
	}
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Abhishek.super.show();
		vijay.super.show();
		Amit.super.show();
	}

	

	
	
}
