import java.util.Scanner;
class Conditional3
{
	public static void main(String args[])
	{
		int x;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any number ");
		x=so.nextInt();
		if((x%5==0)&&(x%11==0))
		{
			System.out.println(x+" is divisible by both 5&11");
		}
		else if(x%5==0)
		{
			System.out.println(x+" is divisible by 5 not by 11");
		}
		else if(x%11=0)
		{
			System.out.println(x+" is divisible by 11 not by 5");
		}
		else
		{
			System.out.println(x+" is neither divisible by 5 nor 11");
		}
	}
}
