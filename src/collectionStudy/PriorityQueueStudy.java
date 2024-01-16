package collectionStudy;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueStudy {

	public static void main(String[] args)
	{
		PriorityQueue<Object> pq=new PriorityQueue<>();
		
		pq.add("Vijay");
		pq.add("Abhishek");
		pq.add("Goapl");
		pq.add("Prajakta");
		pq.add("Sahil");
		pq.add("Vinayak");
		pq.add("sandhya");
		pq.add("Ramesh");
		
		System.out.println(pq.element());
		System.out.println(pq.poll());
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		Iterator<Object> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		for(Object a:pq)
		{
			System.out.println(a);
		}
		
		
	}

}
