package practice3;

public class Best_Class_MultipleInheritance implements Test1,Test2,Test3,Test4
{

	public static void main(String[] args)
	{
		Best_Class_MultipleInheritance b=new Best_Class_MultipleInheritance();
		b.work();
		b.hello1();
		b.hello2();
		b.hello3();
		b.hello4();
		b.hello5();

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		Test1.super.work();
		Test2.super.work();
		Test3.super.work();
		Test4.super.work();
	}

	@Override
	public void hello5()
	{
		System.out.println("This is the complete method1 ");
		
	}

	@Override
	public void hello4() {
		// TODO Auto-generated method stub
		System.out.println("This is the complete method2 ");
	}

	@Override
	public void hello3() {
		// TODO Auto-generated method stub
		System.out.println("This is the complete method 3");
	}

	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("This is the complete method 4");
	}

	@Override
	public void hello2() {
		// TODO Auto-generated method stub
		System.out.println("This is the complete method5 ");
	}

}
