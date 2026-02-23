import java.util.Scanner;
class Countoddeven 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int e=0;
		int o=0;
		while(n!=0){
			if(n%2==0)
				e++;
			else o++;
			n/=10;
		}
		System.out.println("odd : "+o+" even : "+e);
	}
}
