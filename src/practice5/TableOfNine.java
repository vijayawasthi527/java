package practice5;

public class TableOfNine {

	public static void main(String[] args) 
	{
		//table of nine
		
		System.out.println("Table of nine:---->");
		TableOfNine lg=new TableOfNine();
		lg.table();

	}
	
	public void table() 
	{
		int number=9;
		
		
		for(int i=1;i<=10;i++)
		{
			int tables=number*i;
			System.out.println(tables);
		}
		
		
	}
	

}
