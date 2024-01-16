package interfaceStudy;

public interface Mother 
{
void look();
void nature();

default void money()
{
	System.out.println("This is from moter's money");
}
static void run()
{
	System.out.println("This is the mother's run");
}
}
