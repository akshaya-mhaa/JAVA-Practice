class FindKey5 
{
	public static void main(String[] args) 
	{
		int n1=3521;
		int n2=2452;
		int n3=1352;
		int sum=(max(n1)+max(n2)+max(n3))-(min(n1)+min(n2)+min(n3));
		System.out.print(sum);
	}
	public static int max(int a){
		int lar=0;
		while(a!=0){
			int l=a%10;
			if(l>lar)
				lar=l;
			
			a/=10;
		}
		return lar;
	}
	
	public static int min(int a){
		int sma=10;
		while(a!=0){
			int l=a%10;
			if(l<sma)
				sma=l;
			
			a/=10;
		}
		return sma;
	}
}
