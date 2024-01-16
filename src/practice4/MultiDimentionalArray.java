package practice4;

public class MultiDimentionalArray {

	public static void main(String[] args) 
	{
		
		String name[][]=new String[4][5];
		
		name[0][0]="Vijay";
		name[0][1]="Abhishek";
		name[0][2]="Rahul";
		name[0][3]="Ranjan";
		name[0][4]="Shyam";
		name[1][0]="Bhaskar";
		name[1][1]="Nikhil";
		name[1][2]="Navneet";
		name[1][3]="Ankit";
		name[1][4]="Anurag";
		name[2][0]="Kavikant";
		name[2][1]="Vikas";
		name[2][2]="Ranjit";
		name[2][3]="Surya";
		name[2][4]="Deepak";
		name[3][0]="Deepesh";
		name[3][1]="Abhijeet";
		name[3][2]="Bishesh";
		name[3][3]="Sarvesh";
		name[3][4]="Himmat";
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print("  "+name[i][j]+"  ");
			}
			
			System.out.println();
		}
		
	}

}
