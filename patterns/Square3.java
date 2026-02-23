import java.util.Scanner;
class Square3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n)
					System.out.print("1 ");
				else if(j==n)
					System.out.print(n+" ");
				else if(j==1)
					System.out.print(i+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
