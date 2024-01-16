package practiceCollection;

import java.util.TreeSet;

public class TreeSet_Practice {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(23);
		ts.add(34);
		ts.add(56);
		ts.add(89);
		ts.add(12);
		ts.add(0);
		ts.add(0);
		ts.add(1);
		
		for(Object t:ts)
		{
			System.out.println(t);
		}
		System.out.println("==================================");
		System.out.println(ts.ceiling(67));
		System.out.println("==================================");
		System.out.println(ts.first());
		System.out.println("==================================");
		System.out.println(ts.pollFirst());
		System.out.println("==================================");
		System.out.println(ts.floor(31));
		System.out.println("==================================");
		System.out.println(ts.lower(21));
		System.out.println("==================================");
		
		
		
	}

}
