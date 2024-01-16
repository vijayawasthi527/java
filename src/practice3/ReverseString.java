package practice3;

public class ReverseString {

	public static void main(String[] args)
	{
		String originalStr = "HELLO MY NAME IS VIJAY";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		System.out.println(originalStr.length());
	}

}
