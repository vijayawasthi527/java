package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.addFirst("Vijay");
		System.out.println(ll);
		ll.addFirst("rahul");
		System.out.println(ll);
		ll.addLast("sohail");
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.pop());//it return NO SUCH ELEMENT EXCEPTION if list is empty
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.poll());//it returns NULL is list is empty
		System.out.println(ll.size());
		System.out.println(ll.get(0));
		System.out.println(ll);
		System.out.println(ll.offerFirst("Bhole"));
		System.out.println(ll);
		ll.add(2,"Kumar");
		
		ll.add("shishu");
		ll.add("bhaskar");
		
		for (String a:ll)
		{
			System.out.println(a);
		}

		
		
		
		ll.offerLast("vijay");
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		ll.offer("KL");
		System.out.println(ll);
		
		ll.offerLast("Vj");
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.poll());
		System.out.println(ll.pop());
		
		Iterator<String> l1 = ll.iterator();
		System.out.println(l1.next());
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		ListIterator<String> lt = ll.listIterator();
		
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		
		System.out.println(ll.get(3));	
	}

}
