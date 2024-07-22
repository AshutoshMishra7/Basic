class A 
{
	public void hello()
	{
		int x=(int)122.45678965;
		System.out.println(x);
		int y=128;
		byte b=(byte)y;
		System.out.println(b);
		float f=(float)12.12345678901f;
		System.out.println(f);
	}
}
class Explicit_Typecasting
{
	public static void main(String args[])
	{
		A ao=new A();
		ao.hello();
	}
}

		
		