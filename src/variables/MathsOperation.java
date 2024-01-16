package variables;

public class MathsOperation {
	
	int a=10;
	static int b=99; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathsOperation mo=new MathsOperation();
		int sum=90+mo.a;//usesage of non static variable 
	    System.out.println("sum is "+sum);
	     
	    int sub=100-b;//usege of static global variable 
	    System.out.println("sub is:- "+sub);
	    
	    SupplementClass sc=new SupplementClass();
	    int mul=10*sc.m;//use non static variable from another class
	    System.out.println("mul is "+mul);
	    
	    int div=100/SupplementClass.n;//use of static variable from another class
	    System.out.println("div is:-"+div);
	
	}

}
