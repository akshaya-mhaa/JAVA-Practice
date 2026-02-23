import java.util.Scanner;
class BINARYSEARCH 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5,6,7};
		System.out.println("enter an element:");
		int ele=sc.nextInt();
		System.out.println("position"+findindex(arr,ele));
		
	}
	public static int findindex(int[] arr,int ele)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(ele==arr[mid])
				return mid;
			else if(ele >arr[mid])
				l=mid+1;
			else
				r=mid-1;
		}
		return -1;
	}
}
