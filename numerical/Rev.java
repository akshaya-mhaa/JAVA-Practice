class Rev 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		int n=12345;
		int rev=0;
		while(n!=0){
			int l=n%10;
			rev=(rev*10)+l;
			n/=10;
		}
		System.out.print(rev);
	}
}
