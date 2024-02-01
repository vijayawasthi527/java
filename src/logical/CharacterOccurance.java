package logical;

public class CharacterOccurance {

	public static void main(String[] args)
	{
		String name="india";
		int count=0;
		
		char character='i';
		
		for(int i=0;i<name.length();i++)
		{
			char t=name.charAt(i);
			
			if(t==character)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
