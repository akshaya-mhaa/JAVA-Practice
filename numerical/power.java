import java.util.Scanner;
class power 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		int n=sc.nextInt();
		System.out.println("enter power:");
		int p=sc.nextInt();
		int ans=1;
		for(int i=1;i<=p;i++)
			ans=ans*n;
		System.out.println("answer is"+ans);
	}
}
