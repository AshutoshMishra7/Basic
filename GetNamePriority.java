class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A Name..."+Thread.currentThread().getName());
		System.out.println("Thread A Priority..."+Thread.currentThread().getPriority());
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B name...."+Thread.currentThread().getName());
		System.out.println("Thread C Priority..."+Thread.currentThread().getPriority());
	}
}
class C extends Thread 
{
	public void run()
	{
		System.out.println("Thread C Name..."+Thread.currentThread().getName());
		System.out.println("Thread C Priority..."+Thread.currentThread().getPriority());
	}
}
class GetNamePriority
{
	public static void main(String args[])
	{
		System.out.println("Main Class Thread Name...."+Thread.currentThread().getName());
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
		System.out.println("Parent Thread Priority..."+Thread.currentThread().getPriority());
	}
}

		
		