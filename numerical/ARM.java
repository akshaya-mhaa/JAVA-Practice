import java.util.Scanner;
class ARM 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		int num=sc.nextInt();
		if(isarm(num))
			System.out.println(num+"is an armstrong number");
		else
			System.out.println(num+"is not an armstrong number");
	}
	public static boolean isarm(int num)
	{
		int temp=num;
		int sum=0;
		int count=count(num);
		while(num!=0)
		{
			int d=num%10;
			sum=sum+pow(d,count);
			num=num/10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	public static int pow(int d,int cou)
	{
		int pow=1;
		for(int i=1;i<=cou;i++)
		{
			pow=pow*d;
		}
		return pow;
	}
}
