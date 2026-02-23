class MissingNumberWithoutOptimization
{
	public static void main(String[] args) 
	{
		int arr[]={10,12,15,11,13};
		int i,j;
		for(i=0;i<arr.length-1;i++) // Selection
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=1;i<arr.length;i++)
			{
			   if((arr[i]-arr[i-1])!=1)
			   {
				   System.out.println(arr[i]-1);
				   break;
			   }
			}
		
	}
}

// Missing Number without optimization