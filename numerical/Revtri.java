import java.util.Scanner;
class  Revtri
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		char ch='A';
		ch=(char)(ch+n-1);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i+j>=n)
					System.out.print((char)(ch-i)+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
