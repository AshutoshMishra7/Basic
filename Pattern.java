import java.util.Scanner;
class A 
{
	public void hello()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
}
class B extends A 
{
	public void hello()
	{
		int rows;
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
}
class C extends A 
{
	public void hello()
	{
		int rows;
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
}
class D extends A 
{
	public void hello()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("\n");
		}
	}
}
class E extends A 
{
	public void hello()
	{
	int k=1;
	int rows;
	for(int i=1;i<=rows;i++)
	{
		for(int j=rows;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+k++);
		}
		System.out.println("\n");
	}
	}
}
class Pattern
{
	public static void main(String args[])
	{
		Scanner so=new Scanner(System.in);
		A ao=new A();
		B bo=new B();
		C co=new C();
		D dx=new D();
		E eo=new E();
		ao.hello();
		System.out.println("B rows");
		bo.rows=so.nextInt();
		bo.hello();
		System.out.println("C rows");
		co.rows=so.nextInt();
		co.hello();
		dx.hello();
		System.out.println("E rows");
		eo.rows=so.nextInt();
		eo.hello();
	}
}
