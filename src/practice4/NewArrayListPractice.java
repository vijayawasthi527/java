package practice4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NewArrayListPractice {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Vijay");
		al.add(1,"shekhar");
		al.add("Bhaskar");
		
		System.out.println(al.contains("Vijay"));
		
		Object al1 = al.clone();
		System.out.println(al1);
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
			
		}
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String a:al)
		{
			System.out.println(a);
		}
		System.out.println("===============List Itreto==================");
		
		ListIterator<String> list = al.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}
	

}
