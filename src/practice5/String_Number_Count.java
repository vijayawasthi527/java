package practice5;

public class String_Number_Count {

	public static void main(String[] args)
	{
		 String name="How are you vijay!!!";
	       int count=0;
	       
	       for(int i=0;i<=name.length()-1;i++)
	       {
	           if(name.charAt(i)!=' ')
	           {
	               count++;
	           }
	       }
	       System.out.println("Total Number of characters in String are:- "+count);

	}

}
