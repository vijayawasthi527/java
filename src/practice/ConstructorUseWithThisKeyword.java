package practice;

public class ConstructorUseWithThisKeyword
  {
	static String compamy_name;
     int emp_id;
     String name;
     String department_name;
     double salary;
     
     
     public ConstructorUseWithThisKeyword(String k,int a,String name1,String dep,double sal)
     {
    	emp_id=a;
    	name=name1;
    	department_name=dep;
    	salary=sal;
    	compamy_name=k;
     }
	
	public static void main(String[] args)
	{
		ConstructorUseWithThisKeyword cs=new ConstructorUseWithThisKeyword("ABC Ltd.",12,"vijay","IT",3453400d);
         cs.emp_details();
         
         ConstructorUseWithThisKeyword cs2=new ConstructorUseWithThisKeyword("ABC Ltd.",23,"kumar","IT",3351400d);
         cs2.emp_details();
	}
	
	public void emp_details()
	{   		//System.out.println(" Company Name   empid  name  department_name  salary(CTC) \n");
	
	
		System.out.println("  "+compamy_name+"        "+emp_id+"   "+name+"        "+department_name+"       "+salary);
	
	}
  }
 


