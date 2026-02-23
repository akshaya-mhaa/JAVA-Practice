import java.util.Scanner;
class sumofdigits 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int l=n%10;
			sum=sum+l;
			n=n/10;
			
		}
		System.out.println(sum);
	}
}
