package variables;

public class TypeOfVariables {
   static int a;//global static variable
   int b=98;    //global non static variable
	

	public static void main(String[] args)
	{
		TypeOfVariables ty=new TypeOfVariables();
		System.out.println("This is the output of global non static variable:-"+ty.b);
		System.out.println("this is the output of global static variable:-"+a);
	
		NewTypeVariable nt=new NewTypeVariable();
		System.out.println("This is the output of global static variable from another class:-"+NewTypeVariable.t);
		System.out.println("This is the output of global non static variable fron another class:-"+nt.k);
	
	     ty.addition();
	     System.out.println("===============================");
	     int a=NewTypeVariable.t;
	     System.out.println("The value of a is:-"+a);
	     System.out.println("===============================");
	}
	
	
	
	
	public void addition()
	{
		int q=33;
		int sum=q+b+a;//here q is a local variable & b is global non static variable
		System.out.println("This the output of sum:-"+sum);
		System.out.println("The value of a is here:-- "+a);
	}


}


