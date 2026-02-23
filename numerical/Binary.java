import java.util.Scanner;
class Binary 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		System.out.println("Enter a decimal value:");
		int n=sc.nextInt();
		String str="";		
		if(n==0)
			System.out.println("0");
		else
		{
		while(n!=1){
			if(n%2==0)
				str+=0;
			else
				str+=1;
			
			n/=2;	
		}
		str=str+1;
		System.out.println("reverse binary:"+str);
		int res=0;
		int j=1;
		for(int i=str.length()-1;i>=0;i--)
			{
				if(str.charAt(i)=='1')
				{
					res=j+res;
				}
			j=j+j;
		}
		System.out.println(res);
		}
	}
}
