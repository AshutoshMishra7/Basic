abstract class A 
{
	abstract void hello();
	public void hello2()
	{
		System.out.println("A non-abstractmethod");
	}
	A()
	{
		System.out.println("A constructor");
	}
}
class B extends A
{
	void hello()
	{
		System.out.println("A AABSTRACT method");
	}
	public void hello3()
	{
		System.out.println("B non-abstractmethod");
	}
	B()
	{
		System.out.println("B constructor");
	}
}
class AbstractClass
{
	public static void main(String args[])
	{
		A ao=new B();
		ao.hello();
		ao.hello2();
		B bo=new B();
		bo.hello3();
	}
}
