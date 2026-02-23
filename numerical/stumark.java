import java.util.Scanner;
class  stumark
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter no. of students:");
		int no=sc.nextInt();
		int[] arr= new int[no];
		System.out.println("enter the marks");
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Average mark="+average(arr,no));
		System.out.println("Highest="+highest(arr,no));
		
		System.out.println("Lowest="+lowest(arr,no));
		System.out.println("Above average");
		for(int i=0;i<no;i++)
		{
			if(arr[i]>average(arr,no))
				System.out.println((i+1)+"-"+arr[i]);
		}
		System.out.print(print(arr,no));
		
	}
	public static int highest(int[] arr,int no)
	{
		int lar=0;
		for(int i=0;i<no;i++)
		{
			if(arr[i]>lar)
				lar=arr[i];
		}
		return lar;		
	}
	public static int lowest(int[] arr,int no)
	{
		int low=arr[0];
		for(int i=0;i<no;i++)
		{
			if(arr[i]<low)
				low=arr[i];
		}
		return low;		
	}
	public static int average(int[] arr,int no)
	{
		int sum=0;
		for(int i=0;i<no;i++)
		{
			sum=sum+arr[i];
		}
		return sum/no;		
	}
	public static void print(int[] arr,int no)
	{
		for(int i=0;i<no;i++)
			System.out.print((i+1)+"-"+arr[i]);
	}
	
}
