import java.util.Scanner;
class Honey
{
	public void hello()
	{
		int x=1;
		int n;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Value to get it's Table");
		n=so.nextInt();
		do
		{
			System.out.println(n*x);
			x++;
		}
		while(x<=10);
	}
	public void hello2()
	{
		int x=1;
		int n,upto;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any value to get it's Table...");
		n=so.nextInt();
		System.out.println("Enter upto...");
		upto=so.nextInt();
		do{
			System.out.println(n*x);
			x++;
		}
		while(x<=upto);
	}
}
class Do_While_Table
{
	public static void main(String args[])
	{
		Honey dwarf=new Honey();
		dwarf.hello();
		dwarf.hello2();
	}
}

		