import java .util.Scanner;
class times1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] arr={1,4,5,2,0,9,6,8,7,6,5,3,0,1};
		System.out.print("ENter an element to be searched:");
		int ele=sc.nextInt();
		System.out.println("Number of times "+ele+"present is"+count(arr,ele));
		
	}
	public static int count(int[] arr,int ele)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
				count++;
		}
		return count;
	}
}
