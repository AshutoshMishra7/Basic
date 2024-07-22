class A extends Thread
{
	public void run()
	{
		for(int i=0;;i++)
		{
			System.out.println("Thread A...."+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;;i++)
		{
			System.out.println("Thread B..."+i);
		}
	}
}
class SetPriority
{
	public static void main(String args[])
	{
		A ao=new A();
		B bo=new B();
		ao.setPriority(7);
		bo.setPriority(4);
		ao.start();
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
		}
	}
}