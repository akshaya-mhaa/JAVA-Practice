import java.util.Scanner;
import java.util.Arrays;
class sortstr 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		
		Arrays.sort(str);
		for(int j=0;j<n;j++)
		{
			System.out.println(str[j]);
		}
		sc.close();
	}
}
