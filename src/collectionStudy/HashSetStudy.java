package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<>();
		hs.add("Sachin");
		hs.add(23);
		hs.add(23.33f);
		hs.add('F');
		hs.add("Rachin");
		hs.add(true);
		hs.add(null);
		hs.add(23);
		hs.add(null);
		
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Suresh");
		hs1.add("Vishesh");
		hs1.add("vighnesh");
		hs1.add(null);
		hs1.add(null);
		
		System.out.println(hs1);
		
		for(Object a:hs)
		{
			System.out.println(a);
		}
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
