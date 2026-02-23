import java.util.Scanner;
class Msb 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		while(n>10){
			n=n/10;
		}
		System.out.prinln("the MSB is "+n);
	}
}
