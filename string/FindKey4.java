class Findkey4 
{
	public static void main(String[] args) 
	{
		int n1=3521;
		int n2=2452;
		int n3=1352;
		int a=n1/1000;
		int b=(n2/100)%10;
		int c=10;
		while(n3!=0){
			int l=n3%10;
			if(c>l)
				c=l;
			n3/=10;
		}
		
		int sum=a*b+c;
		System.out.println(sum);
	}
}
