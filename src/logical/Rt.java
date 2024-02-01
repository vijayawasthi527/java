package logical;

import java.util.Arrays;

public class Rt {

	public static void main(String[] args) 
	{
		System.out.println("Check String is anagram or not!!!!");

	    String str1="Vijay";
	    String str2="jaViy";
	    
	    char[] s1=str1.toCharArray();
	    char[] s2=str2.toCharArray();
	    
	    Arrays.sort(s1);
	    Arrays.sort(s2);
	    
	    Boolean result=Arrays.equals(s1, s2);
	    if(result==true)
	    {
	        System.out.println("String is anagram");
	    }
	    else
	    {
	        System.out.println("String is not anagram");
	    }
	    

	}

}
