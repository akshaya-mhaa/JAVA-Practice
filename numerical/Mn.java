import java.util.Scanner;
class Mn 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter a number: ");
		int b=sc.nextInt();
		if(b>a){
			int temp=a;
			a=b;
			b=temp;		
			}
			int sum=0;
		while(b<=a){
			sum+=b;
			b++;
		}
		System.out.println("sum is "+sum);
	}
}
