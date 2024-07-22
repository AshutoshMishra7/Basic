import java.util.Scanner;
class Sachin
{
	public void show()
	{
		int n;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Value to get it's Table...");
		n=so.nextInt();
		for(int x=1;x<=10;x++)
		{
			System.out.println(n*x);
		}
	}
	public void show2()
	{
		int n,upto;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Number to get it's table");
		n=so.nextInt();
		System.out.println("Enter upto...");
		upto=so.nextInt();
		for(int x=1;x<=upto;x++)
		{
			System.out.println(n*x);
		}
	}
}
class For_Table
{
	public static void main(String args[])
	{
		Sachin kathia=new Sachin();
		kathia.show();
		kathia.show2();
	}
}
