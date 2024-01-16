package practice5;

import java.util.LinkedList;
import java.util.ListIterator;

public class PracticeLinkedList {

	public static void main(String[] args)
	{
		LinkedList<Integer> ll=new LinkedList();
		ll.add(23);
		ll.add(1,66);
		ll.addFirst(45);
		ll.addLast(89);
		
		 System.out.println(ll);
		ll.pollFirst();
		System.out.println(ll);
		
		ll.pop();
		System.out.println(ll);
		
		ListIterator<Integer> lst = ll.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		
		lst.add(44);
		
		System.out.println(ll);

	}

}
