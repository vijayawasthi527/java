package practice4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PracticeArrayListTraversing {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<>();
		for(int i=0;i<=6;i++)
		{
			al.add(i);
		}
		
		System.out.println("=========travsersing through iterator=======");
		
		Iterator<Object> it = al.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		
		for (int i=2;i<=al.size()-1;i++)
		{
			System.out.println(it.next());
		}
		it.remove();
		
		
		
		System.out.println(al);
		
		System.out.println("============Traversing through listiterator=======");
		
		ListIterator<Object> lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		while (lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		al.set(2,"abhishek");
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(3));
		
		
		System.out.println(al);
		//System.out.println(al.size());
		al.add(88);
		al.add(33);
		al.add(88);
		al.add(88);
		al.add(88);
		System.out.println(al.size());
		al.trimToSize();
		
		
	}

}
