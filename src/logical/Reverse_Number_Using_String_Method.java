package logical;

public class Reverse_Number_Using_String_Method {

	public static void main(String[] args) 
	{
		int orgNum=1234;
		int revNum;
		
		String orgNumString=Integer.toString(orgNum);
		String revNumString="";
		
		for(int i=0;i<=orgNumString.length()-1;i++)
		{
			revNumString=orgNumString.charAt(i)+revNumString;
		}
		revNum=Integer.parseInt(revNumString);
		System.out.println(revNum);

	}

}
