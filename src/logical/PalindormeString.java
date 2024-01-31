package logical;

public class PalindormeString {

	public static void main(String[] args) 
	{
		String org="rotator";//wow,noon,mom,repaper,deed,kayak
		String rev="";
		
		for(int i=0;i<=org.length()-1;i++)
		{
			rev=org.charAt(i)+rev;
			
		}
		System.out.println("Original String is :- "+org);
		System.out.println("Reverse String is :- "+rev);
		
		if(org.equals(rev))
		{
			System.out.println("Given String is palindrome");
		}
		
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}

}
