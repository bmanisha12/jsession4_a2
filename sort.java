import java.util.Arrays;
import java.util.Scanner;
public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],i;
		arr = new int[10];
		Scanner s = new Scanner(System.in);
		for(i=0;i<=(arr.length-1);i++)
		{
			System.out.println("\n enter element: ");
			arr[i] = s.nextInt();
		}
		System.out.println("Array elements before sorting: ");
		for(i=0;i<=(arr.length-1);i++)
		{
			System.out.println(" "+arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("Array elements after sorting: ");
		for(i=0;i<=(arr.length-1);i++)
		{
			System.out.println(" "+arr[i]);
		 }
		
		System.out.println("enter index & value to insert in array:");
		int index = s.nextInt();
		int value = s.nextInt();
		
		arr[index-1]=value;
		
 		System.out.println("Array elements after Insertion: ");
		for(i=0;i<=(arr.length-1);i++)
		{
			System.out.println(" "+arr[i]);
		 }
		
		

		
		
	}

	 

}
