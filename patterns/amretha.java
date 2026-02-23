import java.util.Scanner;
class amretha
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter n value");
		int n=sc.nextInt();
		//A
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=n/2)||(j==n-1 && i>=n/2) ||i==n/2||i+j==n-1-n/2|| i==j-n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||(i+j==n-1&& i<=n/2)||(i==j && i<=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==n/2&&j<=n/2)||(i+j==n-1 && i<=n/2)||(i==j && i>=n/2)||i==0)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==n/2||i==n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==n/2||i==0)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=n/2)||(j==n-1 && i>=n/2) ||i==n/2||i+j==n-1-n/2|| i==j-n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.print(" ");

		}
		/*
		//M
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||(i+j==n-1&& i<=n/2)||(i==j && i<=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
		
		//R
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==n/2&&j<=n/2)||(i+j==n-1 && i<=n/2)||(i==j && i>=n/2)||i==0)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
		
		//E
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==n/2||i==n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
		
		//T
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n/2||i==0)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.println();
		}
		//H
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
		//A
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
		
		*/

	}
}
