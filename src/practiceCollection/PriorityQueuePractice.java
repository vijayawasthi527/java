package practiceCollection;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueuePractice {

	public static void main(String[] args)
	{
		PriorityQueue<Object> pq=new PriorityQueue<>();
		pq.add("vijay");
		pq.add("awasthi");
		pq.add("shera");
		pq.add("shobhit");
		System.out.println(pq);
		
		System.out.println(pq.element());
		Iterator<Object> itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(Object p:pq)
		{
			System.out.println(p);
		}
		
	}

}
