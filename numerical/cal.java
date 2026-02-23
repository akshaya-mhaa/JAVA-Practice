import java.util.Scanner;
class cal 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number1:");
		int a=sc.nextInt();
		System.out.println("enter a number2:");
		int b=sc.nextInt();
		System.out.println("press a num:");
		int num=sc.nextInt();
		
		
		
		switch(num)
		{
			case 1:
				add(a,b);
				break;
			case 2:
				sub(a,b);
				break;
			case 3:
				mul(a,b);
				break;
			case 4:
				div(a,b);
				break;
			default:
				System.out.println("select another option");
		}
	}
		public static void add(int a,int b)
		{ 
			System.out.println("sum is "+(a+b));
		}
		public static void sub(int a,int b)
		{ 
			System.out.println("difference is "+(a-b));
		}
		public static void mul(int a,int b)
		{ 
			System.out.println("product is "+(a*b));
		}
		public static void div(int a,int b)
		{ 
			System.out.println("quotient is "+(a/b));
		}
}
