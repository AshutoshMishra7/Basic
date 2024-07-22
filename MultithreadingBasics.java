class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				if(i==5)
				{
					Thread.sleep(10000);
				}
			}
			catch(Exception e)
			{
			}
				System.out.println("A..."+i);
		}
	}
}
class B extends Thread 
{
	public void run()
	{
		int n=2;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		int x=100;
		while(x<=100 && x>=10)
		{
			System.out.println("C"+x);
			x-=2;
		}
	}
}
class MultithreadingBasics
{
	public static void main(String args[])
	{
		A ao = new A();
		B bo = new B();
		C co =new 	C();
		ao.start();
		bo.start();
		co.start();
	}
}