import java.util.*;
class ParentChild
{
	static Random r1= new Random();
	static Scanner sc=new Scanner(System.in);
	private String name;
	private int age;
	private long phonenumber;
	
	ParentChild(){
		
	}
	
	ParentChild( String name,int age,long phonenumber)
	{
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
	}
	
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public long getphonenumber()
	{
		return phonenumber;
	}
	public void setname(String n)
	{
		name=n;
	}
	public void setage(int a)
	{
		age=a;
	}
	public void setphonenumber(long p)
	{
		phonenumber=p;
	}
	
	public static boolean doverification(long phonenumber)
	{
		System.out.println("Enter your phonenumber:");
		long phno=sc.nextLong();
		if(phonenumber==phno)
		{
			System.out.println("Generating OTP");
			int otp=r1.nextInt(1000,9999);
			System.out.println(otp);
			System.out.println("Enter OTP");
			int ootp=sc.nextInt();
			if(otp==ootp)
			{
				System.out.println("Verfication sucessful");
				return true;
			}
			else
			{
				System.out.println("invalid otp");
				return false;
			}
		}
		else
		{
			System.out.println("wrong phonenumber");
			return false;
		}
		}
		
		public static void changename(String name)
		{
			System.out.println("Enter ur phonenumber:");
			long ph=sc.nextLong();
			if(doverification(ph))
			{
				System.out.println("Enter name to be changed:");
				String newname=sc.next();
				name=newname;
				System.out.println(name);
			}
			else
			{
				System.out.println("cannot change phonenumber");
			}
		}
	}
	


