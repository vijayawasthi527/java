package logical;

public class Fabonancy_Series {

	public static void main(String[] args) 
	{
		int num=20;
		int num1=0;
		int num2=1;
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(num1);
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}

	}

}
