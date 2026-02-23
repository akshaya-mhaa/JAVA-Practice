import java.util.Scanner;
class Lcmm 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter first number:");
		int n1=sc.nextInt();
		System.out.print("Enter second number:");
		int n2=sc.nextInt();
		
		int lcm=1;
		for(int i=Math.max(n1,n2);i<=n1*n2;i++){
			if(i%n1==0&&i%n2==0){
				lcm=i;
				break;
			}
		}
		System.out.print("LCM IS "+lcm);
	}
}
