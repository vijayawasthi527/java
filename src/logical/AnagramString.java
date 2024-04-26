	package logical;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) 
	{
		String s="java";
		String t="ajav";
		
		char[] s1=s.toCharArray();
		char[] t1=t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		Boolean result=Arrays.equals(s1,t1);
		if(result==true)
		{
			System.out.println("Given Strings are anagram");
		}
		else
		{
			System.out.println("Given Strings are not anagram");
		}
		

	}

}
