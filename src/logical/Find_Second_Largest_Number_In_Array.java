package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Find_Second_Largest_Number_In_Array {

	public static void main(String[] args)
	{
		int[] ar= {1,4,51,34,5,23,33,67,102,100,31,12,88,45,99,901,302,122,344};
		
		//without sort the array
		
		TreeSet tr=new TreeSet();
		for(int number:ar)//1,4,51.....
		{
		tr.add(number);//
		}
		System.out.println(tr);//complete tree set
		ArrayList al= new ArrayList(tr);
		System.out.println("Second lowest number "+al.get(1));
		System.out.println("Second highest number "+al.get(al.size()-2));

	}

}
// With Sorting array
//public static void main(String[] args)
//{
//    System.out.println("Find The second Largest Number in Array!");
//    
//    int[] arr={23,56,22,76,89,65,11,113,54,89,908,765,868,990};
//    Arrays.sort(arr);
//    for(int i=0;i<arr.length;i++)
//    {
//        System.out.print(arr[i]+" ");
//    }
//    
//    int total=arr.length;
//    System.out.println(total);
//    int result=total-2;
//    System.out.println(arr[result]);