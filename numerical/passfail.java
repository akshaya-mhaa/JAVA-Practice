import java.util.Scanner;
class passfail
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your mark:");
		int input=sc.nextInt();
		if (input>50)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");	
		}
	}
}
