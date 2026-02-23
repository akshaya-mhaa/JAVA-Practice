import java.util.Scanner;
class sumprime 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		System.out.println("The sum of primes is "+add(n));
	}
	
	public static int add(int n){
		int num=n;
		int sum=0;
		int a=1;
		while(a<=num){
			
			for(int i=1;i<a;i++){
				if(a%i==0)
					sum+=a;
			}
			a++;
		}
		return sum;
		
	}

}
