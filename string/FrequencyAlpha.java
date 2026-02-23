import java.util.Scanner;
class FrequencyAlpha 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter a String!");
		String str=sc.nextLine();
		str.toLowerCase();
		int lar=-1;
		int al=0;
		int[] arr= new int[26];
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			arr[ch-'a']++;
			if(arr[ch-'a']>lar){
				lar=arr[ch-'a'];
				al=(ch-'a');
			}
		}
		
		System.out.println((char)(al+'a')+"->"+lar);
	}
}
