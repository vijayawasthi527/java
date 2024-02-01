package logical;

public class Arm_Strong_Number {

	public static void main(String[] args)
	{
		int num=153;
		int sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(num);
		System.out.println(sum);
		
		if(num==sum)
		{
			System.out.println("This is armStrong Number");
		}
		else
		{
			System.out.println("This is not a armStrong Number");
		}

	}

}
