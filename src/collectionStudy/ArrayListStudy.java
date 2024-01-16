package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		
		al.add("Vijay");
		al.add(12);
		al.add(true);
		al.add(12.23);
		al.add(null);
		al.add("Rahul");
		al.add("Prajakta");
		al.add("Gopal");
		al.add("Sandhya");
		al.add("Vinayak");
		
		System.out.println(al);
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(12);
		al1.add(34);
		al1.add(45);
		
		System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Shivaji");
		al2.add("Savarkar");
		al2.add("Tukaram");
		al2.add("Balasaheb");
		al2.add("Chapekar");
		
		System.out.println(al2);

		//ArrayList<Double> al3=new ArrayList<>();
		//ArrayList<Float> al4=new ArrayList<Float>();
		//ArrayList<Character> al5=new ArrayList<Character>();
		//ArrayList<Boolean> al6=new ArrayList<Boolean>();
	}

}
