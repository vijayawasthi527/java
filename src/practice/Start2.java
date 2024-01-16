package practice;

public interface Start2 
{
  void mystart11();
  
  void mystart22();
  
  default void mystart9()
  {
	  System.out.println("This is the output from interface Start2");
  }
}
