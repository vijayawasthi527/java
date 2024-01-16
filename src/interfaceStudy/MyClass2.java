package interfaceStudy;

public class MyClass2 implements MyInterface2 {

	public static void main(String[] args)
	{
		MyClass2 m=new MyClass2();
		m.add();
		m.add(43, 34);
		m.add3();
		m.add4(99, 98);

	}

	@Override
	public void add() {
		System.out.println(MyInterface1.a);
		System.out.println(MyInterface1.b);
	}

	@Override
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("This is the output from method from interface1 "+sum);
		
	}

	@Override
	public void add3() {
		System.out.println(MyInterface2.c);
		System.out.println(MyInterface2.d);
		
		
	}

	@Override
	public void add4(int k, int j) {
		int sum=k+j;
		System.out.println("This is the output from method from interface2 "+sum);
		
	}

}
