package polymorphism;

public class RunTimePolymorphismDemo  {

	public static void main(String[] args) 
	{
		Father f=new Father();
		f.money();
		
		Son s=new Son();
		s.money();
// this also known as overriding because both class have the same method name but
		// at run time its execute on the basis of object through which we have called it
	
	}

}
/* run time polymorphism me base class, apni supar class ke methods ko extends karti hai
 * dono me same name se methods hote hain, lekin jab base class me unmethods ko unki class ke 
 * objects ke through call karte hain to method usi ke hisaab se kaam karta hai
 * isi ko late binding bhi kehta hain */


