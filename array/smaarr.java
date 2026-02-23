import java.util.Scanner;
import java.util.Arrays;
class smaarr 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		
		System.out.println("enter the values:");
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
		}
		
		for(int j=n-1;j>=0;j--)
			System.out.println(arr[j]);
	}
}
