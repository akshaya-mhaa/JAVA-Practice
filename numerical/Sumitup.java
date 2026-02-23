import java.util.Scanner;
class Sumitup 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n==0)
			System.out.println("Sum is :0");
		else if(n%9==0)
			System.out.println("Sum is:9");
		else 
			System.out.println("Sum is :"+n%9);
	}
}
