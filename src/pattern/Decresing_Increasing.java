package pattern;

public class Decresing_Increasing {

	public static void main(String[] args) 
	{
//------------------------------------
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
//-------------------------------------------------	
		//Step .1 Count Total no of Rows = 9; Use Outer for loop for No. of Rows
		
		int star=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
		
		

	}

}
