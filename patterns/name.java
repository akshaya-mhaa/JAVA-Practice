import java.util.Scanner;
class name 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=n/2)||(j==n-1 && i>=n/2) ||i==n/2||i+j==n-1-n/2|| i==j-n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==n/2&&j<=n/2)||(i+j==n-1 && i<=n/2)||(i==j && i>=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||(j==0&& i<=n/2)||(j==n-1&&i>=n/2)||i==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=n/2)||(j==n-1 && i>=n/2) ||i==n/2||i+j==n-1-n/2|| i==j-n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==n/2&&i>=n/2)||(i==j&&i<=n/2)||(i+j==n-1&&i<=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=n/2)||(j==n-1 && i>=n/2) ||i==n/2||i+j==n-1-n/2|| i==j-n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.println();
		}
		
		

	}
}
