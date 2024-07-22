import java.util.Scanner;
class Conditional2
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter x:");
		x=so.nextInt();
		System.out.println("Enter Y:");
		y=so.nextInt();
		System.out.println("Enter z:");
		z=so.nextInt();
		if(x>y&&x>z)
		{
			System.out.println(x+" is greater");
		}
		else if(y>x&&y>z)
		{
			System.out.println(y+" is greater");
		}
		else if(z>x&&z>y)
		{
			System.out.println(z+" is greater");
		}
		else
		{
			System.out.println("Equal");
		}
	}
}
