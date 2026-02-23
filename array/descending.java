import java.util.Arrays;
class descending
{
	public static void main(String[] args) 
	{
		int [] arr={4,8,3,5,0,1,7};
		System.out.println("before sorting:"+Arrays.toString(arr));
		sort(arr);
		System.out.println("after sorting:"+Arrays.toString(arr));
		
		
		
	}
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++){
			int max=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[max])
					max=j;
			}
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
		}
	}
}
