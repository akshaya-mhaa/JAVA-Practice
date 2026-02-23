import java.util.Scanner;
class AddMul 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int c=sc.nextInt();
		System.out.println((a+b)*c);
	}
}
