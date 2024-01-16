package practice2;

public class StringMethodsUses {

	public static void main(String[] args) 
	{
		String name = "vijay,rahul,abhishek,anurag";
		String naam="who let's the dog out";
		System.out.println(name.length());
		System.out.println(name.isEmpty());
		System.out.println(name.isBlank());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indent(2));//left side se 2 position right me shift ho jaayegi poori string
		System.out.println(name.replace('a', 'T'));
		System.out.println(name.replaceAll("vijay","Gadha"));
		System.out.println(name.equals(naam));
		System.out.println(name.equalsIgnoreCase(naam));
		System.out.println(name+" ".concat(naam));
		System.out.println(naam.trim());
		System.out.println(name==naam);
		System.out.println(name.indexOf('g'));
		System.out.println(name.charAt(23));
		System.out.println(name.substring(4, 21));
	
	String a3[]=name.split("anurag");
	for(int i=0;i<=a3.length-1;i++)
	{
		System.out.println(a3[i]);
	}
	
	}
	
	

}
