package practice2;

public class SplitStringPractice {

	public static void main(String[] args) 
	{
	
		String name="I love my chillo";
		String name1[]=name.split("o");
		
		for(int i=0;i<=name1.length-1;i++)
		{
			System.out.print(name1[i]);
		}

	}

}
