import java.util.Scanner;
class harshad 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int l=n;
		int sum=0;
		while(n!=0){
			int s=n%10;
			sum=sum+s;
			n=n/10;
			
			
		}
		if(l%sum==0)
			System.out.println(l+"is a harshad number");
		else
			System.out.println(l+"is not a harshad number");
	}
}
