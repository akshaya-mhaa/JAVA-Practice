import java.util.Scanner;
class strong 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int l=n;
		while(n!=0){
			int s=n%10;
			int m=1;
			for(int i=1;i<=s;i++)
				{
				    m=m*i;
				}
	
			sum=sum+m;
			n=n/10;
		}
		if (sum==l)
		{
			System.out.println(l+"is a strong number");
		}
		else 
			System.out.println(l+"is not a strong number");
	}
}
