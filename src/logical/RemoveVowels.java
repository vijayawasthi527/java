package logical;

public class RemoveVowels {

	public static void main(String[] args)
	{
		String s="Morena";
		String t="";
		
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				continue;
			}
			t=t+c;
		}
		System.out.println(s);
		System.out.println(t);

	}

}
