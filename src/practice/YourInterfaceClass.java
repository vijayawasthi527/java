package practice;

public class YourInterfaceClass implements YourInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        YourInterfaceClass y=new YourInterfaceClass();
        y.vijay();
        y.keshav();
        y.rahul();
	}

	@Override
	public void vijay() {

System.out.println("This is the value of my :- "+YourInterface.a);
		
	}

	@Override
	public void rahul() {

     System.out.println("This is the output from interface:- "+YourInterface.b);
		
	}

}
