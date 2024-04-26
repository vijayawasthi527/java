package stringBuilder_stringBuffer_Study;

public class String_Builder_Study {

	public static void main(String[] args)
	{
		StringBuilder name=new StringBuilder("Hello All");
		name.append("T");
		
		System.out.println(name);
		
		name.append(true);
		
		System.out.println(name);
		
		name.append("This is buffer String");
		
		System.out.println(name);
		// so in stringbuilder class we can operate on string directly and no need to store it in new variable to store
		
		name.append(89);
		System.out.println(name);
		
		System.out.println(name.charAt(13));
		
		name.insert(12,"zzzz");
		System.out.println(name);
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println(name.length());
		System.out.println(name.capacity());
		
		name.setCharAt(0,'d');
		System.out.println(name);
		
		name.setLength(100);
		System.out.println(name.length());
		
		System.out.println(name);
		
		name.reverse();
		System.out.println(name);
		
		name.replace(0, 4,"Vijay");
		System.out.println(name);
		
		name.append("Checked");
		System.out.println(name);
		
		
		
	
	
	}

}
