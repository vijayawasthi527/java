package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<>();
		
		v.add("AP");
		v.add("MP");
		v.add("HP");
		v.add("RJ");
		v.add("CG");
		v.add("TN");
		v.add("KN");
		v.add("UP");
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		v.add("DL");
		v.add("JK");
		v.add("HR");
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		System.out.println(v);
		
		v.insertElementAt("KL", 2);
		
		System.out.println(v);
		
		System.out.println(v.remove(1));
		System.out.println(v);
		
		System.out.println(v.remove("RJ"));
		System.out.println(v);
		System.out.println(v.size());
		
		v.setSize(14);
		
		System.out.println(v);
		System.out.println(v.capacity());
		
		System.out.println("=========vector Traversing=====================");
		System.out.println("==========Traversing using for loop============");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("Traving using for each loop");
		for(String a:v)
		{
			System.out.println(a);
		}
		System.out.println("=============Traversing through Iterator=======");
		
		Iterator<String> vl = v.iterator();
		 while(vl.hasNext())
		 {
			 System.out.println(vl.next());
		 }
		 
		 System.out.println("===========traversing through enumarator=======");
		 Enumeration<String> vn = v.elements();
		 
		 while(vn.hasMoreElements())
		 {
			 System.out.println(vn.nextElement());
			 
		 }
		 System.out.println("===============traver through list iterator============");
		 
		 ListIterator<String> vll = v.listIterator();
		 
		 while(vll.hasNext())
		 {
			 System.out.println(vll.next());
		 }
		 
		 System.out.println("==========ListIterator Previous method==========");
		 while(vll.hasPrevious())

		 {
			 System.out.println(vll.previous());
		 }
		 
		 System.out.println("==============Traversing through for each loop=========");
		 
		 for(String s:v)
		 {
			 System.out.println(s);
		 }
		
		
		

	}

}
