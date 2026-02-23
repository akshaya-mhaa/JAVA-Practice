import java.util.Scanner;
class mountain 
{	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a value");
		int n= sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int lar=Integer.MIN_VALUE;
		int p=0;
		if(n>3)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>lar && j!=n-2 && a[j]!=a[j+1])
				{
					lar=a[j];
				}
				else if(a[j+1]<a[j] && j!=1)
				{	
				}
				else 
					p++;
				
			}
		}
		if(p==0 && n>3)
			System.out.println("is a mountain array");
		else
			System.out.println("is not a mountain array");
	}
	
}
