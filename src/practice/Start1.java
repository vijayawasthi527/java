package practice;

public interface Start1 
{
   void mystart1();
   
   void mystart2();
   
   int a=23;
   int b=45;
   
   
   default void mystart9()
   {
	   System.out.println("This is the output from first interface");
   }
}
