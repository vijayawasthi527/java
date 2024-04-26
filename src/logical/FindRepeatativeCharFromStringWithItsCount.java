package logical;

import java.util.HashMap;
import java.util.Set;

public class FindRepeatativeCharFromStringWithItsCount {

	public static void main(String[] args) 
	{
		String str="absbdsdbfdgndtengensdfsagfa";
		HashMap<Character,Integer> mp=new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++)//0,1
		{
		char temp = str.charAt(i);//a,b....x
		if(mp.containsKey(temp))//a?
		{
		mp.put(temp, mp.get(temp)+1);
		//mp.put(temp,2);
		}
		else
		{
		mp.put(temp, 1); //a 1 b 1
		}
		Set<Character> myKeys = mp.keySet();//
		for(Character m:myKeys)
		{
		System.out.println(m+": "+mp.get(m));
		}
		System.out.println("=================================");
		//to print values repeatating more than equal to 2 times

		

		Set<Character> myKeys1 = mp.keySet();
		for(Character m1:myKeys1)
		{
		if(mp.get(m1)>=2)
		{
		System.out.println(m1+":"+mp.get(m1));
		}
		}
	}

	}}
