package controlStatement;

public class NestedIfStatement {

	public static void main(String[] args)
	{
		 String name="Vijay";
	        String userid="vijay@gmail.com";
	        String password="vijay@123";
	        String hashcode="qwerty";
	    
	    if(name=="Vijay")
	    {
	        System.out.println("Please enter your userId");
	        if(userid=="vijay@gmail.com")
	        {
	            System.out.println("Please enter password");
	            if(password=="vijay@123")
	            {
	                System.out.println("Please enter your hash code");
	                if(hashcode=="qw")
	                {
	                    System.out.println("Welcome!!! you are successfully login");
	                }
	                else
	                {
	                    System.out.println("Wrong Hashcode given");
	                }
	            }
	                else
	                {
	                    System.out.println("wrong password!!!");
	                }
	        }
	                else
	                {
	                    System.out.println("wrong userid!!!");
	                }
	    }
	                else
	                {
	                    System.out.println("Wrong name!! Please try again");
	                }
	            }
	}
	            
	        
			
		



