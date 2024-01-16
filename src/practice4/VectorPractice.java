package practice4;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) 
	{
		Vector<Object> vc=new Vector<>();
		vc.add(23);
		vc.add("Vijay");
		vc.add(23.78);
		
		for (int i=3;i<=6;i++)
		{
			vc.add(i);
		}
		
		System.out.println(vc);
		
		//System.out.println(vc.capacity());
		
		
		
		System.out.println(vc.capacity());
		System.out.println(vc.size());
		vc.setSize(34);
		System.out.println(vc.capacity());
		System.out.println(vc.size());
		System.out.println(vc);
		
		System.out.println(vc.firstElement());

	}

}
