package arrayStudy;

public class MultiDimentionalArrayStudy {

	public static void main(String[] args) 
	{
		
		int num[][]=new int[2][2];
		
		num[0][0]=10;
		num[0][1]=20;
		num [1][0]=30;
		num [1][1]=40;
		
		System.out.print(num[0][0]+" ");
		System.out.println(num [0][1]);
		System.out.print(num [1][0]+" ");
		System.out.println(num [1][1]);
		
		System.out.println(num.length);
		System.out.println("================================");
		
		String name[][]=new String[1][2];
		name[0][0]="vijay";
		name[0][1]="rahul";
		
		for (int i=0;i<=num.length-1;i++)
		{
			for (int j=0;j<=num.length-1;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
	
		String players[][]=new String[3][3];
		players [0][0]="sachn";
		players [0][1]="sehwg";
		players [0][2]="rahul";
		players [1][0]="yuvrj";
		players [1][1]="kaifu";
		players [1][2]="kapil";
		players [2][0]="gvskr";
		players [2][1]="sunny";
		players [2][2]="chika";
		
		for (int i=0; i<=players.length-1;i++)
		{
			for(int j=0;j<=players.length-1;j++)
			{
				System.out.print(players[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
