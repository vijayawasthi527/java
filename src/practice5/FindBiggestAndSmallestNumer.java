package practice5;

public class FindBiggestAndSmallestNumer {

	public static void main(String[] args) 
	{
		int a=10;
		int b=56;
		int c=9;
		int d=4;
		
		int big = Math.max(a, b);
		int big1 = Math.max(c, d);
		int biggest = Math.max(big, big1);
		System.out.println("Biggest Number is:-----> "+biggest);
		
		int small = Math.min(a,b);
		int small1=Math.min(c,d);
		
		int smallest=Math.min(small,small1);
		System.out.println("Smallest number is:----> "+smallest);

	}

}
