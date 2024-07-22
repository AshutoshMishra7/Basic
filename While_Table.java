import java.util.Scanner;
class Barud
{
	public void doge()
	{
		int x=1;
		int n;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter Any value to get it's table");
		n=so.nextInt();
		while(x<=10)
		{
			System.out.println(n*x);
			x++;
		}
	}
	public void doge2()
	{
		int x=1;
		int n;
		int upto;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Value to get it's table");
		n=so.nextInt();
		System.out.println("Enter Upto...");
		upto=so.nextInt();
		while(x<=upto)
		{
			System.out.println(n*x);
			x++;
		}
	}
}
class While_Table
{
	public static void main(String args[])
	{
		Barud bo=new Barud();
		bo.doge();
		bo.doge2();
	}
}
