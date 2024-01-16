package arrayStudy;

import java.util.Arrays;

public class ArrayUses1 {

	public static void main(String[] args) 
	{
		String[] players=new String[12];//Array Declaration
		
		players[0]="Vijay";
		players[1]="rahul";
		players[2]="kumar";
		players[3]="Kesahv";
		players[4]="Gopal";
		players[5]="Sahil";
		players[6]="prajakta";
		players[7]="Sandhya";
		players[8]="vinayak";
		players[9]="Amol";
		//Arrays.sort(players);
		
		for(int k=0;k<=players.length-1;k++)
		{
			System.out.println(players[k]);
		}
		
		//System.out.println(players[8]);
		
		int[] rollNumbers=new int[5];
		rollNumbers[0]=1;
		rollNumbers[1]=23;
		rollNumbers[2]=32;
		rollNumbers[3]=4;
		rollNumbers[4]=00;
		
	
		
		Arrays.sort(rollNumbers);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(rollNumbers[i]);
		
		}
				//System.out.println(rollNumbers.length);
			
		char name[]= {'a','v','f','g','d','e','t'};
		Arrays.sort(name);
		for(int j=0;j<=name.length-1;j++)
		{
			System.out.println(name[j]);
		}
				
				
			
	
	}

}
