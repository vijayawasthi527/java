package practice5;

public class Myson implements Fathers,Mothers {

	public static void main(String[] args) 
	{
		Myson s=new Myson();
		
		s.look();
		s.nature();
		s.hardWork();
		s.honesty();
		s.love();
		Fathers.test();
		Mothers.test();
		
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		Fathers.super.love();
		Mothers.super.love();
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
	public void hardWork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void honesty() {
		// TODO Auto-generated method stub
		
	}

}
