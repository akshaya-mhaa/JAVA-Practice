import java.util.Scanner;
class Square22
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=-5;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>=0 && j>=0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		}
	
}
