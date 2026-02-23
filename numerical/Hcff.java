import java.util.Scanner;
class Hcff 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("Enter number 2:");
		int b=sc.nextInt();
		int hcf=1;
		
		for(int i=1;i<Math.min(a,b);i++){
			if(a%i==0&&b%i==0){
				hcf=i;
			}
		}
		System.out.println("HCF is "+hcf);
	}
}
