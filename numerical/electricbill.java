import java.util.Scanner;
class electricbill 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of units:");
		int unit=sc.nextInt();
		if(unit<=100)
		{
			System.out.println("no amount needed:");
		}
		else if(unit<=200)
		{
			int a=unit-100;
			int b=a*7;
			System.out.println(b+"is the amount need to paid");
		}
		else if(unit<=400)
		{
			int c=unit-200;
			int d=700+(c*10);
			System.out.println(d+"is the amount need to be paid");
		}
		else
		{
			int e=unit-400;
			int f=700+2000+(e*12);
			System.out.println(f+"is the amount need to be paid");
		}
			
	}
}
