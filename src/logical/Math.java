package logical;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) 
	{
		System.out.println("Please Enter First Number: -");
		Scanner sc=new Scanner(System.in);
		int FNum=sc.nextInt();
		
		System.out.println("Please Enter Second Number");
		int SecNum=sc.nextInt();
		
		int addition=FNum+SecNum;
		int sub=FNum-SecNum;
		int multi=FNum*SecNum;
		int div=FNum/SecNum;
		
		System.out.println("Addition of Both Digits are:- "+addition);
		System.out.println("Substraction of Both Digits are:- "+sub);
		System.out.println("Multiplication of Both Digits are:- "+multi);
		System.out.println("Division of Both digits are:- "+div);

	}

}
