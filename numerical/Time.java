import java.util.Scanner;
class Time 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number of days");
		int n=sc.nextInt();
		System.out.println("Days= "+(n*24)+"Hours= "+(n*24*60)+"Second= "+(n*24*60*60));
	}
}
