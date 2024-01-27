package pattern;

public class Equilateral_Up_WithSpace 
{	
//			*
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
	public static void main(String[] args)
	{
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)
		{
		//for space
		for(int j=1;j<=space;j++)
		{
		System.out.print(" ");
		}
		//for star
		for(int k=1;k<=star;k++)
		{
		System.out.print("* ");
		}
		star++;
		space--;
		System.out.println();
		
		}

	}

}
