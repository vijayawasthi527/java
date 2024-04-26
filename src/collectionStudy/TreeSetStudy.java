package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{	
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(12);
		ts.add(45);
		ts.add(56);
		ts.add(90);
		ts.add(103);
		ts.add(11);
		
		System.out.println(ts);
	System.out.println("===============================");
		System.out.println(ts.ceiling(13));
		System.out.println("++++++++++++++++++++++++++++++++=");
		System.out.println(ts.first());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(ts.floor(9));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		System.out.println(ts.higher(46));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		System.out.println(ts.first());
		
		System.out.println(ts.higher(67));
		
		System.out.println(ts.lower(90));
		
		
		System.out.println("================for each loop=================");
		
		for(Object a:ts)
		{
			System.out.println(a);
		}
		
		System.out.println("=======================traversing through Itretor=============");
		
		Iterator<Object> it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===============traversing through decending Iterator===========");
		
		Iterator<Object> di = ts.descendingIterator();
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
		
		
		
		
	}

}
