import java.util.Scanner;
class Child 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		System.out.println("Enter your name:");
		String n=sc.next();
		p.setname(n);
		System.out.println("enter your age:");
		int a=sc.nextInt();
		p.setage(a);
		System.out.println("Enter your phonenumber:");
		long g=sc.nextLong();
		p.setphonenumber(g);
		
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getphonenumber());
	}
}
