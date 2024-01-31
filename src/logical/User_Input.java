package logical;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your first name: -");
		String firstName=sc.next();
		
		System.out.println("Please enter your last name: -");
		String lastName=sc.next();
		
		System.out.println("Your Full Name is "+firstName+" "+lastName);

	}

}
