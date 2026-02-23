import java.util.Scanner;
class count 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int l=num%10;
		
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
			
			System.out.println(count);
	}
}
