import java.util.*;
class HDFC_Bank 
{
	
	static Scanner sc=new Scanner(System.in);
	static Random r1=new Random();
	static String branch="Vadapalani";
	static String ifscCode="hdfcvada001";
	private long accountNumber;
	private String accHolderName;
	private double balance;
	private long mobileNumber;
	{
		System.out.println("\t Welcome to HDFC bank"+branch+"\n");
	}
	HDFC_Bank(String accHolderName1, double balance1,long mobileNumber1)
	{
		accHolderName=accHolderName1;
		balance=balance1;
		mobileNumber=mobileNumber1;
		accountNumber=r1.nextLong(1000000000l,9999999999l);
	}
	
	public long getaccountNumber()
	{
		return accountNumber;
	}
	public long getMobileNumber()
	{
		return mobileNumber;
	}
	public String getaccHolderName()
	{
		return accHolderName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public boolean doverification() 
	{
		System.out.println("Enter registered mobile number:");
		long number=sc.nextLong();
		if(mobileNumber==number)
		{
			System.out.println("Generating OTP.....");
			int otp=r1.nextInt(1000,999999);
			System.out.println(otp);
			System.out.println("Enter OTP:");
			int enteredotp=sc.nextInt();
			if(otp==enteredotp)
				return true;
			else 
				System.out.println("wrong otp");
				return false;
		}
		else
			System.out.println("Entered mobile number is wrong...");
			return false;
	}
	public double deposit(double amount)
	{
		balance+=amount;
		System.out.println("amount deposited successfully \n balance:");
		return balance;
	}
	public double withdraw(double amount)
	{
		if(doverification())
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println("amount withdrawed successfully \n balance");
				return balance;
			}
			else
			{
				System.out.println("insuficient balance");
				return balance;
			}
		}
		else
		{
			System.out.println("invalid user");
			return balance;
		}
	}
	public String  setaccHolderName(String newaccHolderName)
	{
		if(doverification())
		{
			accHolderName=newaccHolderName;
			System.out.println("Account holder name is changed:");
			return accHolderName;
		}
		else
			return accHolderName;
		
	}
	
}
