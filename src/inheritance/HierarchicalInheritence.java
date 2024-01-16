package inheritance;

public class HierarchicalInheritence {

	public static void main(String[] args)
	{
		GrandSon1 g=new GrandSon1();
		g.jewellery();
		g.clothes();
		g.dog();
		
		System.out.println("===================");
		
		GrandSon2 h=new GrandSon2();
		h.jewellery();
		h.clothes();

	}

}
