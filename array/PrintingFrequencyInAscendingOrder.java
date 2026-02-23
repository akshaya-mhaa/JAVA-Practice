class PrintingFrequencyInAscendingOrder 

{
	public static void main(String[] args) 
	{
		int arr[]={1,22,15,76,78,33,99,76,22,78,99,23,22,0,1,15};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		int a[]=new int [max+1];
		for(int i=0;i<arr.length;i++){
			a[arr[i]]++;
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=0)
				System.out.println("count of "+i+"is"+a[i]);
		}
	}
}


//Frequency Print using Hashmap based method