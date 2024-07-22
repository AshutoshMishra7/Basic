import java.util.Scanner;
class Toffy
{
	public void method()
	{
		int x,y;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter y");
		y=so.nextInt();//10		
		x= --y + --y * --y;
		System.out.println(x);
		System.out.println(y);
	}
	public void method2()
	{
		int a,b,c;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter C");
		c=so.nextInt();//20
		b=c-- + c--;
		a= --b+ b-- + --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Decrement_Operator2
{
	public static void main(String args[])
	{
		Toffy moti=new Toffy();
		moti.method();
		moti.method2();
	}
}

		