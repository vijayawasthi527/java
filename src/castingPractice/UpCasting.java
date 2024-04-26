package castingPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UpCasting {

	public static void main(String[] args) 
	{
		SubClass b=new SubClass();
		SuparClass s=new SuparClass();
		
		s.printing();
		s.publishing();
		
		b.printing();
		b.publishing();
		
		//UpCasting
		//creating object of subClass and giving ref of super class
		System.out.println("============================================");
		
		SuparClass s1=new SubClass();
		s1.printing();
		s1.publishing();
		
		//s1.shop();
		
		

	}

}
