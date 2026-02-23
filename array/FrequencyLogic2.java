class FrequencyLogic2 
{
	public static void main(String[] args) 
	{
		int arr[]={30,100,20,110,200,40,50,200,300,200};
		int size=arr.length;
		int i,j;
		String st="";
		for(i=0;i<size-1;i++)
		{
			if(st.contains(arr[i]+"")==false) {
				st=st+arr[i]+" ";  
				int count=1;
				for(j=i+1;j<size;j++) {
					if(arr[i]==arr[j])
						count++;
				}
				System.out.println(arr[i]+"->"+count);
			}
		}
		
	}
}
//Logic-2