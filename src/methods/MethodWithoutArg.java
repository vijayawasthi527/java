package methods;

public class MethodWithoutArg {

	public static void main(String[] args) 
	{

    MethodWithoutArg si=new MethodWithoutArg();
     si.StudentInfo();

	}
	
	public void StudentInfo()
	{
		int age;
		
		int rollNumber;
		
		char gendar;
		
		float avg;
		
		
		age=23;
		
		rollNumber=234;
		
		gendar='M';
		
		avg=89.9f;
		
		System.out.println("Student age is "+age);
		System.out.println("Student roll number is "+rollNumber);
		System.out.println("Student gendar is "+gendar);
		System.out.println("Student avg marks are "+avg);
		
		
		
		
	}

}
