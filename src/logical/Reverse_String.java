package logical;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String name="This is my name!!! Vijay Awasthi";
		String rev="";
		
		
		for(int i=0;i<=name.length()-1;i++)
		{
			rev=name.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
