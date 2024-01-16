package inheritance;

public class GrandSon1 extends GrandMother {

	public static void main(String[] args)
	{
		GrandSon1 g=new GrandSon1();
		g.dog();
		g.jewellery();
		g.clothes();

	}
	
	public void dog()
	{
		System.out.println("This is my dog");
	}

}
