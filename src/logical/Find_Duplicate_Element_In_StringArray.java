package logical;

public class Find_Duplicate_Element_In_StringArray {

	public static void main(String[] args)
	{
		String[] ar= {"Selenium","java","webdriver","testing","software","Selenium","java","Selenium"};
		System.out.println("Duplicate elements are :-");
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].equals(ar[j]))
				{
					System.out.println(ar[j]+" ");
				}
			}
		}
		
		

	}

}
