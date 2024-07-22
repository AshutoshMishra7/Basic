class A 
{
	public void show1()
	{
		int x=0b10101010;
		System.out.println(x);
	}
}
class B 
{
	public void show2()
	{
		int x=0B01010101;
		System.out.println(x);
	}
}
class C
{
	public void show3()
	{
		int x=0b110011001;
		System.out.println(x);
	}
}
class Binary_Numbersystem
{
	public static void main(String args[])
	{
		A ao=new A();
		B bo=new B();
		C co=new C();
		ao.show1();
		bo.show2();
		co.show3();
	}
}