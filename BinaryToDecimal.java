import java.util.Scanner;
class Ashu
{
	public void hello()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		x=sc.nextInt(2);
		System.out.println(x);
	}
	public void hello2()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Value");
		x=sc.nextInt(2);
		System.out.println(x);
	}
}
class BinaryToDecimal
{
	public static void main(String args[])
	{
		Ashu ao=new Ashu();
		ao.hello();
		ao.hello2();
	}
}

		