package methods;

public class MethodWithArgs {

	public static void main(String[] args) 
	{
		MethodWithArgs a=new MethodWithArgs();
		 a.addition(12,34);
		 a.substraction(34,23);
		 a.scolarsinfo(22,'F',2134,78.6f,"Pass");

	}

	public void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Here is the sum of a and b is "+sum);
		
	}
	
	public void substraction(int a,int b)
	{
        int sub=a-b;
        System.out.println("Here is output of sustraction of a & b is "+sub);
        
	}
	
	public void scolarsinfo(int age,char gender,int rollno,float avrMarks,String status)
	{
		System.out.println("=================================");
		
		System.out.println("Scolar's Age is "+age);
		System.out.println("Scolar's Gender is "+gender);
		System.out.println("Scolar's Rollno. is "+rollno);
		System.out.println("Scolar's AvgMarks are "+avrMarks);
		System.out.println("Scolar's Final Result is "+status);
		
		System.out.println("=================================");
		
		
	}
}
