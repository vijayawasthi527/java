package logical;

public class Reverse_Number_without_String {

	public static void main(String[] args)
	{
		int num=123456;
		int revNum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
//			System.out.println(revNum);		
		}
		System.out.println(revNum);
	}

}
