import java.util.Scanner;
class strome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(isStrong(num) == true)
			System.out.println("true");
		else
			System.out.println("false");
		
	}

	public static boolean isStrong(int num)
	{
		int sum=0;
		int n=num;
		while(num!=0)
		{
			int l=num%10;
			sum=sum+fact(l);
			num=num/10;
			
		}
		if(sum==n)
			return true;
		else 
			return false;
	}
	
	public static int fact(int num)
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			 f=f*i;
		}
		return f;
	}
}

