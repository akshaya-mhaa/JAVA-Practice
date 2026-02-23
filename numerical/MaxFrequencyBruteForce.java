class MaxFrequencyBruteForce 
{
	public static void main(String[] args) 
	{
		int arr[]={30,100,20,110,200,40,50,200,300,200};
		int size=arr.length;
		int max=0,i,j,count,ans=0;
		for(i=0;i<(size-1);i++) {
			count=0;
			for(j=i+1;j<size;j++){
				if(arr[i]==arr[j])
					 count++;
			} 
			if(count>max) {
			  max= count;
			  ans=arr[i];
			}
			else if(count==max && count!=0)
			{
				if(arr[i]>ans)
					ans=arr[i];
			}
		}
		if(max==0)
			System.out.println(-1);
		else
			System.out.println(ans+"->"+(max+1));
		
	}
}
// Max Frequency count with brute force method