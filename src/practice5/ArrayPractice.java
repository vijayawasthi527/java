package practice5;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int arr[][]=new int[2][4];
		arr[0][0]=11;
		arr[0][1]=12;
		arr[0][2]=23;
		arr[0][3]=65;
		arr[1][0]=605;
		arr[1][1]=695;
		arr[1][2]=85;
		arr[1][3]=65;
		
		//System.out.println(arr.length);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
