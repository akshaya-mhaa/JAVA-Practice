class Abvar 
{
	
	public static void add(int... arr)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	
	public static void sub(int... arr)
		{
			int dif=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				dif-=arr[i];
			}
			System.out.println(dif);
		}
		
	public static void mul(int... arr)
		{
			int pro=1;
			for(int i=0;i<arr.length;i++)
			{
				pro*=arr[i];
			}
			System.out.println(pro);
		}
		
	public static void div(int... arr)
		{
			int quo=0;
			for(int i=0;i<arr.length-1;i++)
			{
				quo=arr[i+1]/arr[i];
			}
			System.out.println(quo);
		}
}
