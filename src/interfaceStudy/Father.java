package interfaceStudy;

public interface Father 
{
void honety();
void care();

static int i=10;

default void money()
{
	System.out.println("This is father's money");
}

static void run()
{
	System.out.println("This is the father's static run method");
}
}

