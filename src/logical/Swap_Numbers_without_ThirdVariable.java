package logical;

public class Swap_Numbers_without_ThirdVariable {

	public static void main(String[] args) {
		int a=100;
		int b=90;
		
		System.out.println("Before swapping values of a="+a+" and b="+b);


		a=a+b;//190
		b=a-b;//100=190-90
		a=a-b;//90=190-100
		System.out.println("After swapping values of a="+a+" and b="+b);


	}

}
