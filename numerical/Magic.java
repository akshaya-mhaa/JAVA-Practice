import java.util.Scanner;
class  Magic
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%9==1)
			System.out.println("It is a magic number");
		else
			System.out.println("It is not a magic number");
	}
}
