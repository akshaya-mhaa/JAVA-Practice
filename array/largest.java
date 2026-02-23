class largest 
{
	public static void main(String[] args) 
	{
		int [] arr={10,27,21,40,49};
		System.out.println(lar(arr));
	}
	public static int lar(int[] arr){
		int lar=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>lar)
					lar=arr[i];
			}
		return lar;
	}
}
