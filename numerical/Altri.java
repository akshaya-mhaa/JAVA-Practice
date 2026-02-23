import java.util.Scanner;
class Altri 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		char ch='A';
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i+j<n-1)
					System.out.printf((char)(ch+j)+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
