import java.util.Scanner;
class positive 
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) 
	{
		int c=0;
		int num;
		do
		{
			System.out.println("Enter a number:");
			num=sc.nextInt();
			if(num>-1)
			{
				c=c+num;
				
			}
			else
			{
				System.out.println("you have entered a negative number");
				break;
			}
			
		}
		while (num>=0);
		{
			
		}
		System.out.println(c);	
	}
}
