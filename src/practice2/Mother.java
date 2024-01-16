package practice2;

public interface Mother 
{
  default void money()
  {
	  System.out.println("This is the money fom mother");
  }
  
  void house();
}
