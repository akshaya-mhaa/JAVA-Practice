import java.util.Scanner;
class Age 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your birthday:");
		int date=sc.nextInt();
		int mon=sc.nextInt();
		int year=sc.nextInt();
		System.out.println("Your current age is "+(2025-year));
	}
}
