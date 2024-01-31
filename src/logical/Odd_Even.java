package logical;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a number to check ODD/EVEN :- ");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println(+number+"is a EVEN Number");
		}
		else
		{
			System.out.println(+number+"is ODD Number");
		}
		

	}

}
