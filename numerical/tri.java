import java.util.Scanner;
class tri
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a character:");
		char ch1=sc.next().charAt(0);
		char ch2= ch1.toLowerCase();
		
		if(ch2 >= 'a' && ch2  <= 'z')
		{
			if(ch2=='a' || ch2=='e' || ch2=='i' ||ch2=='o' ||ch2=='u' )
			{
				System.out.println(ch2+"is vowel");
			}
			else
			{
				System.out.println(ch2+"is consonant");
			}
		}
		else
			{
			System.out.println("enter a vowel");
			}
		
	}
}
