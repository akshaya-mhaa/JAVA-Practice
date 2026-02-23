import java.util.Scanner;
class fibonacci
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("enter a number:");
		int n=sc.nextInt();
		int a=-1;
		int b=1;
		for (int i=1;i<=n ;i++ )
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}