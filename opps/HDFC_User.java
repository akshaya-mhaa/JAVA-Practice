import java.util.*;
class HDFC_User 
{
static Scanner sc=new Scanner (System.in);
 public static void main(String[] args) 
 {
	 System.out.println("Enter your name:");
	 String name=sc.next();
	 System.out.println("Enter your account balance:");
	 double enteramount=sc.nextLong();
	 System.out.println("Enter your mobile number:");
	 long enterno=sc.nextLong();
	 
	 HDFC_Bank hb = new HDFC_Bank(name,enteramount,enterno);
	  System.out.println("Enter 1 to get details \n Enter 2 to deposit money \n Enter 3 to withdraw money \n enter the name to be changed:");
	  int num=sc.nextInt();
	  switch(num)
	 {
		case 1:
		 {
			System.out.println("Account Number : " + hb.getaccountNumber());
		    System.out.println("Account holder Name : " + hb.getaccHolderName());
			System.out.println("Mobile Number : " + hb.getMobileNumber());
			System.out.println("Account Balance : " + hb.getBalance());
			break;
		 }
		 case 2:
		 {
			 System.out.println("Enter amount to be deposited:");
			 double dep=sc.nextDouble();
			System.out.println(hb.deposit(dep));
			break;
		 }
		 case 3:
		 {
			System.out.println("Enter amount to be withdrawed:");
			double with=sc.nextDouble();
			System.out.println(hb.withdraw(with));
			break;
		 }
		 case 4:
		 {
			 System.out.println("Enter the name to be changed:");
			 String n= sc.next();
			 System.out.println(hb.setaccHolderName(n));
			 break;
		 }
		 default:
			 System.out.println("Error !!! \n \t TRY AGAIN");
	 }
 }
}