class Barood
{
	public void hello()
	{
		int a=8;
		System.out.println(a--);
		System.out.println(a);
	}
	public void hello2()
	{
		int a=17;
		int b=--a;
		System.out.println(a);
		System.out.println(b);
	}
}
class Decrement_Operator
{
	public static void main(String args[])
	{
		Barood bo=new Barood();
		bo.hello();
		bo.hello2();
	}
}
