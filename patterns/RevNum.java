import java.util.Scanner;
class RevNum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i+j>n)
					System.out.print(j+" ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
