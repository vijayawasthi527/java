package logical;

public class Count_WhiteSpace_IN_String {

	public static void main(String[] args) 
	{
		String name=new String("This is my name how are you");
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			if(name.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
