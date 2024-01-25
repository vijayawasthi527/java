package stringBuilder_stringBuffer_Study;

public class String_Buffer_Study {

	public static void main(String[] args)
	{
		StringBuffer name=new StringBuffer("This is example of stringBuffer Example");
		
		name.append(" This text hasbeen appended");
		System.out.println(name);
		
		
		System.out.println(name.substring(10, 11));
		
		name.replace(12, 12, "qwe55kokookookokok");
		System.out.println(name);
	}

}
