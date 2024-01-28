package practice;

public class Star {

	 public static void main(String[] args)
	    {
	        int space=7;
	        int star=1;
	        for(int a=1;a<=5;a++)
	        {
	            for(int i=1;i<=space;i++)
	            {
	                System.out.print(" ");
	            }
	            
	            for(int j=1;j<=star;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	            space--;
	            star++;
	            
	        }
	        space=1;
	        star=5;
	        for(int b=1;b<=5;b++)
	        {
	            for(int k=1;k<=space;k++)
	            {
	                System.out.print(" ");
	            }
	            for(int l=1;l<=star;l++)
	            {
	                System.out.print(" *");
	            }
	            System.out.println();
	            space++;
	            star--;
	        }
	    }
	}