package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(56);
		al.add(89);
		al.add(98);
		
		System.out.println(al);
		System.out.println(al.get(3));
		
		System.out.println("===============for Loop=============");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("==============for each loop===============");
		
		for(Integer a:al)
		{
			System.out.println(a);
		}
		
		System.out.println("===========Iterator===============");
		
		//Iterator<Integer> it=al.iterator();
		Iterator<Integer> it = al.iterator();
		//Iterator<Integer> it1 = al.iterator();
		
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());<----java.util.NoSuchElementException
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("===================ListIterator===============");
		
		ListIterator<Integer> list = al.listIterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println("======================Using list iterator in reverse direction==========================");

		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
		System.out.println(list.nextIndex());
		
		System.out.println(al);
		list.remove();
		System.out.println(al);
		list.next();
		System.out.println(al);
		list.remove();
		System.out.println(al);
		
		
		
	}

}
