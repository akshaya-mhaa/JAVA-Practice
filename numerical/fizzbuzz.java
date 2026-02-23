import java.util.Scanner;
class fizzbuzz 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a%3==0 && a%7==0)
		{
			System.out.println(a+"is fizzbuzz");
		}
		else if(a%3==0)
		{
			System.out.println(a+"is fizz");
		}
		else if(a%7==0)
		{
			System.out.println(a+"is buzz");
		}
	}
}
