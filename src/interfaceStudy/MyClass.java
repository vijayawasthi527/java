package interfaceStudy;

public class MyClass implements MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyClass s=new MyClass();
         s.test();
         s.test1(12,44);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("incomplete method is completed here");
	}

	@Override
	public void test1(int a, int b)
	{
		int sum=a+b;
		System.out.println("The Sum of two variables is:- "+sum);
		
		
	}

}
