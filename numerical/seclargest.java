import java.util.Scanner;
import java.util.Arrays;
class seclargest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		if(n<2)
			System.out.println("not sufficient");
		else
			System.out.println(arr[n-2]+"is the second largest numbe4r in the array");
		
		
	}
}
