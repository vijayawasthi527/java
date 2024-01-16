package practice2;

public class MultidimentionalArray {

	public static void main(String[] args)
	{
	String name[][]=new String[1][2];
	name[0][0]="Vijay";
	name[0][1]="Abhishek";
	
	for(int i=0;i<=name.length-1;i++)
	{
		for(int j=0;j<=name.length;j++)
		{
			System.out.println(name[i][j]);
		}
	}
	System.out.println(name.length);

	}

}
