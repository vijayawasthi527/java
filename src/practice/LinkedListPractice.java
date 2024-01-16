package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Vijay");
		ll.add(1,"Nikhil");
		System.out.println(ll);
		ll.offer("Rahul");
		System.out.println(ll);
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("============tgraverse using for each loop======");
		
		for(String a:ll)
		{
			System.out.println(a);
		}
		System.out.println("==traverse using Iterator============");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ListIterator<String> lst = ll.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		
		while(lst.hasPrevious())
		{
			System.out.println(lst.previous());
		}
	}

}
