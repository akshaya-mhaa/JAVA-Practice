import java.util.Scanner;
class HCF1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number:");
		int b = sc.nextInt();
		int hcf=1;
		
		for(int i=1;i<=Math.min(a,b);i++){
			
			if(a%i==0&&b%i==0)
				hcf=i;
				
		}
		System.out.println(hcf);
		
		
	}
}