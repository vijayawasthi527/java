package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(1,34);
		al.add(25);
		al.add(45);
		al.add(90);
		System.out.println(al);
		Object al1 = al.clone();
		
		System.out.println(al.size());
		System.out.println(al.equals(al1));
		System.out.println(al.get(1));
		System.out.println(al.indexOf(23));
		
		System.out.println("============Traverse through for loop=============");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("===========Traverse through for each loop===========");
		
		for(Integer a:al)
		{
			System.out.println(a);
		}
		
		System.out.println("================Traverse using Iterator===============");
		
		Iterator<Integer> it = al.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("============Traverse using List Iterator=============");
		
		ListIterator<Integer> lst = al.listIterator();
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
