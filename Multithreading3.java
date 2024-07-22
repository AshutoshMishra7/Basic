class Multithreading3
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Prince");
		System.out.println(Thread.currentThread().getName());
	}
}