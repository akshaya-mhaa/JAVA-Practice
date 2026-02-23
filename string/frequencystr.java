import java.util.*;
class frequencystr 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("entera string:");
		String str=sc.nextLine();
		
		str=str.toLowerCase();
		int[] arr=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				arr[ch-'a']++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i]>0)
			{
				System.out.println((char)(i+'a')+"-"+arr[i]);
			}
		}
	}
}
	