import java.util.Scanner;
class palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter a number:");
		int m=sc.nextInt();
		int num=m;
		int p=0;
		
		while(num!=0)
		{
			int l=num%10;
			System.out.println(l);
			num=num/10;
			
			
			p=p+l;
			
			p=p*10;
			
		}
		System.out.println(p);
		if(p==m*10)
		{
			System.out.println(m+"is a palindrome");
		}
		else
		{
			System.out.println(m+"is not a aplindrome");
		}
		
	}
}