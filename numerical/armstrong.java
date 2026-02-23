import java.util.Scanner;
class armstrong
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int a=n;
		int sum=0;
		String nasstring=String.valueOf(n);
		int length=nasstring.length();
		while(n!=0)
		{
			int b=n%10;
			int c=(int)Math.pow(b,length);
			sum=sum+c;
			n=n/10;
		}
		if(a==sum)
			System.out.println(a+"is a armstrong number");
	}
}