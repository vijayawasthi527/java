package practice4;

import java.util.ArrayList;

public class PracticeArrayList {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<>();
		
		al.add(23);
		al.add(1, 45);
		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
		al.add(45);
		al.add(34);
		al.add(2, 89);
		System.out.println(al);
		
		Object al1 = al.clone();
		
		System.out.println(al1);
		
		boolean result = al.contains(39);
		System.out.println(result);
		
		al.ensureCapacity(5);
		System.out.println(al.size());
		
		al.add(98);
		al.add(67);
		al.add(56);
		
		System.out.println(al.size());
		
		System.out.println(al.equals(al1));
		
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		System.out.println(al.indexOf(34));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove(5));
		
		al.add("vijay");
		System.out.println(al);
		
	}

}
