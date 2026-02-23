import java.util.Scanner;
class Abc 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			//A
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=n/2)||(j==n-1 && i>=n/2) ||i==n/2||i+j==n-1-n/2|| i==j-n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//b
			for(int j=0;j<n;j++)
			{
				if((i==0&&j!=n-1)||(i==n-1&&j!=n-1)||(i==n/2&&j!=n-1)||j==0||(j==n-1)&&(i!=0)&&(i!=n-1)&&(i!=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//c
			for(int j=0;j<n;j++)
			{
				if((i==0&&j!=0)||(i==n-1&&j!=0)||(j==0&&i!=0&&i!=n-1))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//d
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==0&&j!=n-1)||(i==n-1&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//e
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||i==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//f
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||(i==n/2&&j!=n-1))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//g
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||(j==n-1&&i>=n/2)||(i==n/2&&j>=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//h
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//i
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//j
			for(int j=0;j<n;j++)
			{
				if(i==0||(i==n-1&&j<=n/2)||j==n/2||(j==0&&i>=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			System.out.print(" ");
			//k
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==n/2&&j<=n/2)||(i+j==n-1&&i<=n/2)||(i==j&&i>=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//l
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//m
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||(i==j&&i<=n/2)||(i+j==n-1 && j>n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//n
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||(i==j))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//o
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==0||i==n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//p
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==n/2||(j==n-1&&i<n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//q
			for(int j=0;j<n;j++)
			{
				if((j==0&&i!=0&&i!=n-1)||(j==n-1&&i!=0&&i!=n-2)||(i==0&&j!=0&&j!=n-1)||(i==n-1&&j!=0&&j!=n-2)||(i==j&&i>=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			
			//r
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==n/2&&j<=n/2)||(i+j==n-1 && i<=n/2)||(i==j && i>=n/2)||i==0)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.print(" ");
			//s
			for(int j=0;j<n;j++)
			{
				if((j==0&&i<=n/2)||(j==n-1&&i>=n/2)||i==0||i==n-1||i==n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.print(" ");
			//t
			for(int j=0;j<n;j++)
			{
				if(j==n/2||i==0)
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.print(" ");
			//u
			for(int j=0;j<n;j++)
			{
				if((j==0&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1)||(j==n-1&&i!=n-1))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//v
			for(int j=0;j<n;j++)
			{
				if((j==0&i<=n/2)||(j==n-1&&i<=n/2)||(i==j+(n/2))||(i+j==(n/2)*3))
					System.out.print("* ");
				else 
					System.out.print("  ");
				

			}
			System.out.print(" ");
			//w
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||(i==j&&i>=n/2)||(i+j==n-1 && j<=n/2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//x
			for(int j=0;j<n;j++)
			{
				if(i==j||i+j==n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//y
			for(int j=0;j<n;j++)
			{
				if((i==j&&i<=n/2)||(i+j==n-1&&i<=n/2)||(j==n/2)&&i>=n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			//z
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||i+j==n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			
			System.out.println();
		}
	}
}
