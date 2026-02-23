import java.util.Scanner;
class frequency 
{
	public static void main(String[] args) 
	{
		int arr[]={1,1,3,2,4,3,5,5,6,7,8,8,7,9,0};
		int a[]=new int [10];
		for(int i=0;i<arr.length;i++){
			a[arr[i]]++;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println("count of "+i+"is"+a[i]);
		}
	}
}
