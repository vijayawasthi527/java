package stringUse;

public class VariousMethodsOfStringClass {

	public static void main(String[] args)
	{
	String a1=new String("Vijay");
	String a2=new String("Vijay");
	String a6=new String("VIJAY");
	String a3=new String("   VIJAY AWASTHI  ");
	String a4=new String(" ");//a4 blank hai but empty nahi hai
	String a5=new String("");//a5 full empty because isme koi space bhi nai hai
	
	String k="rahul";
	String t="rahul";
	
	System.out.println(a1.length());
	//System.out.println(length);
	
	boolean check=a1.isBlank();
	System.out.println(check);
	System.out.println(a5.isBlank());
	System.out.println(a5.isEmpty());
	System.out.println(a1.equals(a6));//case sensitive hai
	System.out.println(a4.isEmpty());
	System.out.println("1.============================");
	System.out.println(a1.toUpperCase());
	System.out.println(a6.toLowerCase());
	System.out.println(a3);
	System.out.println(a3.trim());//trims the white space before and after the string value
	System.out.println(a2.contains("ij"));//true
	System.out.println(a1==a2);//false
	System.out.println(k==t);//true
	System.out.println("2.============================");
	System.out.println(a1.equalsIgnoreCase(a6));//true
	System.out.println(a1.charAt(3));//print a because index starts count from 0 
	System.out.println(a3.lastIndexOf('V'));
	System.out.println(a4.isBlank());
	System.out.println("3.============================");
	
	char my= a1.charAt(3);//because index start from 0
	System.out.println(my);
	
	System.out.println(a2.charAt(1));
	System.out.println(a2.charAt(4));
	
	System.out.println("4.============================");
	
	String v1="School";//index S-0,c-1,h-2,o-3,0-4,l-5
	System.out.println(v1.endsWith("ol"));
	
	System.out.println(v1.endsWith("L"));//false beacuse capital L
	
	System.out.println(v1.endsWith("School"));
	System.out.println("5.============================");
	
	System.out.println(v1.startsWith("S"));
	System.out.println(v1.startsWith("o"));
	System.out.println(v1.startsWith("ol",2));//false
	System.out.println(v1.startsWith("ol",4));//index number 4 par ol se start hone wali string hai ya nahi
	System.out.println(v1.startsWith("S",0));
	
	System.out.println("6.============================");
	
	String d1="MAHARASHTRA PUNE INDIA KATRAJ";
	System.out.println(d1.substring(12));//index 12 se lekar baad ki poori string 
	System.out.println(d1.substring(17, 22));//index number 17 se lekar 21 tak print karega lekin range +1 badha ke likhte hain
	System.out.println(d1.substring(0, 11));
	
	//Concat
	
	String e1="Software";
	String e2="Testing";
	
	System.out.println(e1.concat(" ").concat(e2));
	System.out.println(e1.concat(" Development"));
	System.out.println("7.============================");
	
	String f1="mumbai";
	
	System.out.println(f1.indexOf('i'));
	
	System.out.println(f1.indexOf('m'));
	
	System.out.println(f1.lastIndexOf('u'));
	
	System.out.println(f1.lastIndexOf('i'));
	
	String f2="success";
	System.out.println("00.============================");
	
	System.out.println(f2.lastIndexOf('s',0));
	
	System.out.println("8.============================");
	
	String f3="beginning";
	System.out.println(f3.indexOf("in"));
	System.out.println(f3.lastIndexOf("in"));
	
	String s3=new String("Gwalior");
	System.out.println(s3.replace('G','N'));
	
	System.out.println(s3.replace("Gwa","Ind"));
	
	System.out.println(s3.replaceAll("Gwalior", "Indore"));
	
	System.out.println(s3.replaceAll("Gwalior","India is my country"));

	System.out.println("================================");
	
	String g3="beginning";
	System.out.println(g3.indexOf("in"));
	System.out.println(g3.lastIndexOf("in"));
	
	System.out.println("================================");
	
	String p2="success";
	System.out.println(p2.lastIndexOf('s', 5));
	System.out.println(a4.isEmpty());
	
	

	}

}
