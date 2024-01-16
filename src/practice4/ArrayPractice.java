package practice4;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		//single dimention array
		int numbers[]=new int[6];
		
		numbers[0]=0;
		numbers[1]=100;
		numbers[2]=34;
		numbers[3]=3;
		numbers[4]=1;
		numbers[5]=53;
		
		
		Arrays.sort(numbers);
		
		for(int i=5;i>0;i--)
		{
			System.out.println(numbers[i]);
		}
		
		//multidimentional array
		
		int letters[][]=new int[3][4]; 
		
		letters[0][0]=12;
		letters[0][1]=23;
		letters[0][2]=67;
		letters[0][3]=90;
		letters[1][0]=78;
		letters[1][1]=56;
		letters[1][2]=91;
		letters[1][3]=11;
		letters[2][0]=22;
		letters[2][1]=33;
		letters[2][2]=99;
		letters[2][3]=77;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(" "+letters[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
