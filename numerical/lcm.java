import java.util.Scanner;
class  lcm
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter first value:");
		int a=sc.nextInt();
		System.out.println("enter second value:");
		int b=sc.nextInt();
		int lcm=1;
	
		for(int i=Math.max(a,b);i<=a*b;i++)
		{
			if (i%a==0&&i%b==0)
			{
				 lcm=i;
				break;
			}
		}
		System.out.println("lcm is"+lcm);
	}
}
