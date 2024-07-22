class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				stop();
			}
			System.out.println("A.."+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		int n=5;
		int x;
		for(x=1;x<=10;x++)
		{
			System.out.println("B.."+(n*x));
		}
	}
}
class C extends Thread 
{
	public void run()
	{
		int x=0;
		while(x<=20)
		{
			try
			{
				if(x==15)
				{
					Thread.sleep(5000);
				}
			}
			catch(Exception e)
			{
			}
			System.out.println("C...."+x);
			x++;
		}
	}
}
class D extends Thread 
{
	public void run()
	{
		int x=1;
		do
		{
			System.out.println("D...."+x);
			x++;
		}
		while(x<=10);
	}
}
class Multithreading2
{
	public static void main(String args[])
	{
		A ao=new A();
		B bo=new B();
		C co=new C();
		D dx=new D();
		ao.start();
		bo.start();
		co.start();
		dx.start();
	}
}