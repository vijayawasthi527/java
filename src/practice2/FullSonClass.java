package practice2;

public class FullSonClass implements Father,Mother {

	public static void main(String[] args)
	{
		FullSonClass f=new FullSonClass();
		f.money();
		f.car();
		f.house();
	}

	@Override
	public void house() 
	{
		System.out.println("This is the method from mother interface");
		
	}

	@Override
	public void car()
	{
			System.out.println("This is the method from father interface");	
	}
	
	public void money()
	{
	 Father.super.money();
	  Mother.super.money();
	}
	
	

}
