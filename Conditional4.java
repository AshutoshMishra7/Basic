import java.util.Scanner;
class Conditional4
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Integer");
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println(x+" is an even number");
		}
		else
		{
			System.out.println(x+" is an odd number");
		}
	}
}
