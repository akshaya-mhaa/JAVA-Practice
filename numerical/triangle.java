import java.util.Scanner;
class triangle 
{
	static Scanner a=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a side ");
		int p=a.nextInt();
		System.out.println("enter a side ");
		int q=a.nextInt();
		System.out.println("enter a side ");
		int r=a.nextInt();
		if(p+q>=r||p+r>=q||q+r>=p)
		{
			System.out.println("it forms a triangle ");
		}
		else
		{
			System.out.println("it cannot form a triangle");
			
		}
	}
}
