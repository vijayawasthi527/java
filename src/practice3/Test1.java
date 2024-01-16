package practice3;

public interface Test1
{
 int a=45;
 int b=34;
	
	void hello1();
 
 void hello2();
 
 default void work()
 {
	  System.out.println("This is the complete method from test1 interface1");
 }
 
}
