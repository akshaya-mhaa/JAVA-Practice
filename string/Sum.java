import java.util.Scanner;
class Sum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter num1:");
		int n1=sc.nextInt();
		System.out.println("Enter num2:");
		int n2=sc.nextInt();
		System.out.println("The sum of"+n1+"+"+n2+"is "+(n1+n2));
	}
}
