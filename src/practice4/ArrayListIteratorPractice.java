package practice4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteratorPractice 
{
	public static void main(String[] args)
	{
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vijay");
		al.add("Rahul");
		al.add(2,"Abhishek");
		al.add("somya");
		al.add("suresh");
		al.add(1,"aarav");
		System.out.println(al);
		System.out.println(al.contains("suresh"));
		
		System.out.println(al.get(4));
		
		System.out.println(al.indexOf("Rahul"));
		al.add("Vijay");
		
		System.out.println(al);
		System.out.println(al.lastIndexOf("Vijay"));
		//al.clear();
		//System.out.println(al);
		System.out.println("Output from for loop");
		for (int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("output from for each loop");
		for(String a:al)
		{
			System.out.println(a);
		}
			
		
		
		
		
		System.out.println("==============================Iterator================");
		
		
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(al);
		
		ListIterator<String> lt = al.listIterator();
		
		System.out.println("===========output from listIterator================");
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("============reverse output from listIterator==========");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		
		System.out.println(lt.nextIndex());
		
		
		
		
		
		
	}
}
