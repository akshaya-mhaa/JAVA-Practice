import java.util.Scanner;
class Unit 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Unit digit : "+(n%10));
	}
}
