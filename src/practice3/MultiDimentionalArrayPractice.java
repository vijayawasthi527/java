package practice3;

public class MultiDimentionalArrayPractice {

	public static void main(String[] args) 
	{
		String vijay[][]=new String[2][3];
		vijay[0][0]="vijay1";
		vijay[0][1]="Awasthi";
		vijay[0][2]="Hello";
		vijay[1][0]="rahul";
		vijay[1][1]="kumar";
		vijay[1][2]="Keshav";
		
		for(int i=0;i<=vijay.length-1;i++)
		{
			for(int j=0;j<=vijay.length;j++)
			{
				System.out.print(vijay[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
