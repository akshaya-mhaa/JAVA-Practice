import java .util.*;
class AddAlpha 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int sum=0;
		String str="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				str+=ch;
			else{
				if(!str.isEmpty()){
				sum=sum+Integer.parseInt(str);
				str="";
				}
			}
				
		}
		if(!str.isEmpty())
			sum=sum+Integer.parseInt(str);
		
		System.out.println(sum);
	}
}
