import java.util.Scanner;
class Abvararg extends Abvar
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter no. of digits to be entered:");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Choose an option:\n 1.Add \n2.Sub \n3.mul \n 4.div");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				add(arr);
				break;
			}
			case 2:
			{
				sub(arr);
				break;
			}
			case 3:
			{
				mul(arr);
				break;
			}
			case 4:
			{
				div(arr);
				break;
			}
		}
			
	}	
}