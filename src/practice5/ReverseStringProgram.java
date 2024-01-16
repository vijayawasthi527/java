package practice5;

public class ReverseStringProgram {

	public static void main(String[] args) 
	{
		ReverseStringProgram rs=new ReverseStringProgram();
		rs.myString();

	}
	
	public void myString()
	{
		String name="Hello How are you Vijay";
		
		String reverse="";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			reverse=name.charAt(i)+reverse;
			
		}
		System.out.println(reverse);
	}

}
