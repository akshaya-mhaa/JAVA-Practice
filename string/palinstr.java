import java.util.Scanner;
class  palinstr
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a string!");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println(str+"is palindrome");
		else
			System.out.println(str+"is not a palindrome");
	}
}
