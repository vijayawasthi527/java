package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lss=new LinkedHashSet<>();
		lss.add("Kehsav");
		lss.add("sunny");
		lss.add("shanti");
		lss.add("shubh");
		lss.add("Tukaram");
		
		System.out.println(lss);
		
		for (String a:lss)
		{
			System.out.println(a);
		}
		
		Iterator<String> list = lss.iterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("===========Iterator===============");
		
		Iterator<String> it = lss.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	

	}

}
