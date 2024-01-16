package practice3;

public class StringSplitMethod {

	public static void main(String[] args)
	{
		String s1="My name is vijay";
	       String s2[]=s1.split(" ");
	       
	       for(int i=0;i<=s2.length-1;i++)
	       {
	           System.out.println(s2[i]);
	       }
	       
	       System.out.println("=========================");
	       
	       String a1="I_love_My_India";
	       String a2[]=a1.split("_");//storing the output of split method in string array
	       
	       //split the string on the basis of underscore;
	       
	       for(int i=0;i<=a2.length-1;i++)
	       {
	    	   System.out.println(a2[i]);
	    	   
	       }
	       System.out.println(a2);//it will throw a garbage values
	}

}
