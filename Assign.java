import java.util.Scanner;
class BlindCalf
{
	public void bey()
	{
		int x,y,z;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter first Number");
		x=so.nextInt();
		System.out.println("Enter Second Number");
		y=so.nextInt();
		System.out.println("Enter Third Number");
		z=so.nextInt();
		if(x>y && x>z)
		{
			System.out.println(x+ "Is greater");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" Is greater");
		}
		else if(z>x && z>y)
		{
			System.out.println(z+" Is greater");
		}
		else
		{
			System.out.println("opop");
		}
	}
}
class Assign
{
	public static void main(String args[])
	{
		BlindCalf bo=new BlindCalf();
		bo.bey();
	}
}
