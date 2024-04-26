package logical;

public class ChangeOrderOfString {

	public static void main(String[] args)
	{
		String s="This is india";
		//odd positions--> rev
		//even position--> rev
		
		String[] arr=s.split(" ");//{"This","is","india"}
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			if(i%2==0)//(i%2!=0) for even number
			{
				String s1=arr[i];
				arr[i]=revString(s1);
				
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		

	}
	
	 public static String revString(String input)
	 {
		 String rev="";
		 for(int i=0;i<=input.length()-1;i++)
		 {
			 rev=input.charAt(i)+rev;
		 }
		 return rev;
	 }

}
