import java.util.Scanner;
class PosNeg 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n>0)
			System.out.println(n+" is positive");
		else
			System.out.println(n+" is negative");
	}
}
