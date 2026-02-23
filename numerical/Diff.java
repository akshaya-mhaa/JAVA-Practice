import java.util.Scanner;
class  Diff
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
			if(l-p==1||l-p==-1){
				
			}
			else {
				
				a++;
				break;
			}
		}
		if(a>0)
			System.out.println("Not a stepping number");
		else
			System.out.println("Is a Stepping number");
	}
}
