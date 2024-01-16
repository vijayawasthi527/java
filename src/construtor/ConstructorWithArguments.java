package construtor;

public class ConstructorWithArguments {

	String name;
	int rollNumber;
	char gender;
	long phoneNumber;
	float percentage;
	boolean result;
	
	public ConstructorWithArguments()
	{
		name="Vijay Awasthi";
		rollNumber=342;
		gender='M';
		phoneNumber=445589343908l;
		percentage=99.87f;
		result=true;
		
	}
	
	public ConstructorWithArguments(String name1)//Constructor with single argument
	{
		name=name1;
	}
	
	public ConstructorWithArguments(String name2,int rno,char sex)
	{
		name=name2;
		rollNumber=rno;
		gender=sex;
	}
	
	public ConstructorWithArguments(String naam,int number,char sex,long mobile,float pratishat,boolean status)
	{
		name=naam;
		rollNumber=number;
		gender=sex;
		phoneNumber=mobile;
		percentage=pratishat;
		result=status;
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
      ConstructorWithArguments cb=new ConstructorWithArguments();
      cb.details();
      //cb.remarks();
      
      ConstructorWithArguments cb1=new ConstructorWithArguments("Rahul Kumar");
      cb1.details();
      //cb1.remarks();
      
      ConstructorWithArguments cb2=new ConstructorWithArguments("keshav kumar",896,'M');
      cb2.details();
      //cb2.remarks();
      
      ConstructorWithArguments cb3=new ConstructorWithArguments("Meena kumari",007,'F',89896504,99.99f,true);
      cb3.details();
      cb3.remarks();
	}
	
	
	public void details()
	{
		System.out.println("My name is:- "+name);
		System.out.println("My rollNumber is:- "+rollNumber);
		System.out.println("My gender is:- "+gender);
		System.out.println("My phone number is:- "+phoneNumber);
		System.out.println("My percentage is:- "+percentage);
		System.out.println("My examResult is:-"+result);
		System.out.println("==============================");
	}
	
	public void remarks()
	{
		System.out.println("!!!!!!!!!!You are outstanding Student!!!!!!!!!"+name);
		System.out.println("==============================");
	}
	
	

}
