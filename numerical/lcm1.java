import java.util.Scanner;
class lcm1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter first number:");
		int a =sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		int lcm=1;
		
		for(int i=1;i<=a*b;i++)
		{
			if( i%a==0&&i%b==0)
			{
				lcm=i;
				break;
			}
			
		}
		System.out.println(lcm);
		
	}
}