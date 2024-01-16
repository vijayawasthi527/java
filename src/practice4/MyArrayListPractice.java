package practice4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayListPractice {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("vijay");
		al.add("rahul");
		al.add("rakesh");
		al.add("suresh");
		al.add("sumit");
		al.add("gourav");
		
		System.out.println(al);
		
		System.out.println(al.get(1));
		
		al.add(2,"manish");
		
		System.out.println(al.get(2));
		System.out.println(al);
		
		Object alc = al.clone();
		System.out.println(alc);
		
		System.out.println(al.contains("vijay"));
		
		System.out.println(al.size());
		
		al.ensureCapacity(9);
		al.add("");
		
		System.out.println(al.equals(alc));
		
		System.out.println(al);
		
		System.out.println(al.get(4));
		
		System.out.println(al.indexOf("sumit"));
		
		System.out.println(al.remove(0));
		System.out.println(al);
		al.add(0,"vijay");
		System.out.println(al);
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		for(String a:al)
		{
			System.out.println(a);
		}
		
		ListIterator<String> ltr = al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
	}

}
