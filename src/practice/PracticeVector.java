package practice;

import java.util.Enumeration;
import java.util.Vector;

public class PracticeVector {

	public static void main(String[] args) 
	{
		Vector<String> vc=new Vector<String>();
		vc.add("vijay");
		vc.add("Abhishek");
		vc.add("Rahul");
		
		System.out.println(vc);
		Enumeration<String> enu = vc.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}

	}

}
