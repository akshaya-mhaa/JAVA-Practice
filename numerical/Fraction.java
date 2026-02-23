import java.util.Scanner;
class Fraction 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		double sum=0;
		System.out.println("Enter 1st number: ");
		double a=sc.nextDouble();
		sum+=a-((int)a);
		System.out.println("Enter 2nd number: ");
		double b=sc.nextDouble();
		sum+=b-((int)b);
		System.out.println("the sum of fraction is "+sum);
	}
}
