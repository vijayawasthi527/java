package practice4;

public class String_Traverse {

	public static void main(String[] args) 
	{
		
		String k="Hello My name is vijay";
		String j="";
		
		for (int i=0;i<=k.length()-1;i++)
		{
			j=k.charAt(i)+j;
		}
		System.out.println(j);
	}

}
