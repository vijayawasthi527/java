package methods;

public class AllMethodsCallInOneClass {

	public static void main(String[] args)
	{
	AllMethodsInOneClass m=new AllMethodsInOneClass();
	m.test3();
	m.test4(125,11,'j');
	
	AllMethodsInOneClass.Demo1();
	AllMethodsInOneClass.Demo2(23,'M',88.8f);

	}

}
