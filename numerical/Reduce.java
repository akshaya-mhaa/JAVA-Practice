import java.util.*;
class Reduce 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		String str="";
		int sum=0;
		if(n%2==0)
		{
			while(n>9){
				int l=n%10;
				n/=10;
				str=(Math.abs(l-n%10))+str;
			}
			System.out.println(str);
		}
		else{
			while(n!=0){
				if(n%2!=0)
					sum+=n%10;
				
				n/=10;
			}
			System.out.println(sum);
		}
	}
}
