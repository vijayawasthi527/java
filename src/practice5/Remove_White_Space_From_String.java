package practice5;

public class Remove_White_Space_From_String {

	public static void main(String[] args)
	{
		String s1="This is how we are doing work here";
	       
	       String s2="";
	       
	       for(int i=0;i<=s1.length()-1;i++)
	       {
	           if(s1.charAt(i)!=' ')
	           {
	               s2=s2+s1.charAt(i);
	           }
	       }
	       System.out.println("This is the output from string without white spaces:- "+s2);

	}

}
