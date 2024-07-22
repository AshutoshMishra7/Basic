class A 
{
	class B 
	{
		System.out.println("I am in Innerclass");
	}
}
class InnerClass
{
	public static void main(String args[])
	{
		A ao=new A();
		A.B bo=ao.new B();
	}
}