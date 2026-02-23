import java.util.Scanner;
class product

{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		
		int product=1;
		while(num!=0)
		{
			int l=num%10;
			product=product*l;
			num=num/10;
		}
			
			System.out.println(product);
	}
}
