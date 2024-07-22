class A extends Thread 
{
	public void run()
	{
		int n=4;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A..."+n*i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		int n=2;
		int x=1;
		while(x<=10)
		{
			System.out.println("Thread B..."+n*x);
			x++;
		}
	}
}
class C extends Thread
{
	public void run()
	{
		int n=3;
		int x=1;
		do
		{
			System.out.println("Thread C..."+n*x);
			x++;
		}
		while(x<=10);
	}
}
class MultithreadingJoin
{
	public static void main(String args[])
	{
		System.out.println("Parent Tread Starts");
		A ao=new A();
		B bo=new B();
		C co=new C();
		ao.start();
		bo.start();
		co.start();
		try
		{
			ao.join();
			bo.join();
			co.join();
		}
		catch(Exception e)
		{
		}
		System.out.println("Parent Thread Ends");
	}
}

		