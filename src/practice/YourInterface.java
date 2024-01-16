package practice;

public interface YourInterface
{
	int a=34;
	int b=5;
 void vijay();
 
 void rahul();
 
 default void keshav()
 {
	 int vijay=23;
	 int rahul=56;
	 int sum=vijay+rahul;
	 
	 System.out.println("this is the sum:- "+sum);
	 
 }
}
