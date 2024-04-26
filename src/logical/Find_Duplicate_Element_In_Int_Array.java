package logical;

public class Find_Duplicate_Element_In_Int_Array {

	public static void main(String[] args)
	{
		int ar[]= {1,3,6,3,1,7,9,0};
		System.out.println("Duplicate elements are--> ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
				}
			}
		}

	}

}
