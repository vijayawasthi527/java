package collectionStudy;

import java.util.ArrayList;

public class ArrayList_Methods {

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		
		boolean a2 = al.add("Vijay");
		
		System.out.println(a2);
		
		al.add("Awasthi");
		
		al.add(0,"Shri");
		
		System.out.println(al);
		
		Object alnew = al.clone();
		
		System.out.println("This is the cloned ArrayList:- "+alnew);
		
		System.out.println(al.contains("Vijay"));
		
		al.ensureCapacity(2);
		
		al.add("Khusi");
		System.out.println(al);
		
		System.out.println(al.equals(alnew));
		
		System.out.println(al.get(3));
		
		System.out.println(al.indexOf("Khusi"));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove(1));
		System.out.println(al);
		
		al.set(0,"Kumar");
		
		System.out.println(al);
		
		System.out.println(al.size());
		al.remove("Kumar");
		System.out.println(al);
		
		
		
		
		

	}

}
