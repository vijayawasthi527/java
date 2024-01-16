package interfaceStudy;

public class Son implements Father,Mother
{

	public static void main(String[] args) 
	{
		Son s=new Son();
		s.money();
		s.nature();
		s.look();
		s.care();
		Father.run();
		Mother.run();
		System.out.println(Father.i);
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		Father.super.money();
		Mother.super.money();
	}

	@Override
	public void honety() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void care() {
		// TODO Auto-generated method stub
		
	}
	
}
