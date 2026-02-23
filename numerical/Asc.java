import java.util.Scanner;
class  Asc
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int a=0;
		while(n>0){
			int l=n%10;
			n/=10;
			int p=n%10;
			if(l<p){
				System.out.println("Not Ascending !");
				break;
			}
			else a++;		
		}
		if(a>0)
			System.out.println(" ascending");
	}
}
