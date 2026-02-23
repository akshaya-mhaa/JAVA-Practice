class FrequencyUsingHashmap 
{
	public static void main(String[] args) 
	{
		int arr[]={30,100,20,110,200,40,50,200,300,200};
		int size=arr.length;
		int i,j,cc=0;
		int ele[]=new int[size];
		int freq[]=new int[size];
		for(i=0;i<size;i++) 
		{
			boolean flag=false;
			for(j=0;j<cc;j++) {
				if(ele[j]==arr[i]) {
					freq[j]++;
					flag=true;
					break;
				}
			}
			if(flag==false) {
				ele[cc]=arr[i];
				freq[cc++]=1;
			}
		}
		for(i=0;i<cc;i++)
			System.out.println(ele[i]+"->"+freq[i]);
		
	}
}
//Frequency Print using Hashmap based method