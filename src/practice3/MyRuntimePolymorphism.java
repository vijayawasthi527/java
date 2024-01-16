package practice3;

public class MyRuntimePolymorphism {

	public static void main(String[] args)
	{
		PapaClass p=new PapaClass();
		p.money();
		p.car();
		
		p=new BetaClass();
		p.money();
		p.car();
		
		
		p=new Beta2();
		p.car();
		p.money();
		

	}

}
