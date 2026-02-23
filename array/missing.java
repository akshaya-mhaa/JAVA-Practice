import java.util.*;
class  missing
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a string:");
		String str=sc.nextLine();
		System.out.println(missing(str));
	}
	public static String missing(String str)
	{
		str=str.toLowerCase();
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		char num=97;
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			if(('a'+num)==(arr[i]))
			{
				num=num+1;
				System.out.println("if");
			}
			else
			{
				res=res+(char)(num);
				num=num+1;
				System.out.println(res);
				
			}
		}
		return res;	
	}
}
