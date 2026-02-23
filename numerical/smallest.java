import java.util.Scanner;
class smallest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		
		
		if(a<b && a<c) 
		{
			System.out.println(a+"is smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println(b+"is smallest");
		}
		else
		{
			System.out.println(c+"is smallest");
		}
	}
}
