import java.util.Scanner;
class ComAr 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("java Example");
		String str=sc.nextLine();
		int n=args.length;
		if(n==0)
			System.out.println("No values");
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
	}
}
