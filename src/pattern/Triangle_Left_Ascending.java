package pattern;

public class Triangle_Left_Ascending {

	public static void main(String[] args) 
	{
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}