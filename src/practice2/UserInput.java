 package practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	static int radius;
	public static void main(String[] args)
	{
		System.out.println("Area of circle");
		
		System.out.println("PLease enter radius in meters");
		
		Scanner sc=new Scanner(System.in);
		try {
		 radius=sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Kindly Provide Numeric input only");
		}
		
		double area=3.14*radius;
		
		System.out.println("area of circle is -> "+area+"Squre meter");
		
		System.out.println("Enter your first name");
		String fname=sc.next();
		System.out.println("Enter Your Last Name");
		String lname=sc.next();
		
		System.out.println("Hello  "+fname+" "+lname+" : This is area: -> "+area);
		sc.close();
		
	}

}
