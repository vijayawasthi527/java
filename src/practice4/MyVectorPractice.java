package practice4;

import java.util.Enumeration;
import java.util.Vector;

public class MyVectorPractice {

	public static void main(String[] args)
	{
		Vector<String> vr=new Vector<String>();
		vr.add("Roshni");
		vr.add(1,"Nidhi");
		vr.add("Deepti");
		vr.add(3,"Prachi");
		
		System.out.println(vr);
		
		vr.addElement("Ankita");
		System.out.println(vr);
		
		//vr.setSize(3);
		System.out.println(vr);
		
		vr.insertElementAt("shivani",5);
		System.out.println(vr);
		
		System.out.println(vr.lastElement());
		
		Enumeration<String> vre = vr.elements();
		
		while(vre.hasMoreElements())
		{
			System.out.println(vre.nextElement());
		}
		
		

	}

}
