class A
{
	private int x,y;
	public A()
	{
		int x=10;
		int y=11;
		if(x>y)
		{
			System.out.println(x+" is greater");
		}
		else
		{
			System.out.println(y+" is greater");
		}
	}
	public A(int x)
	{
		this.x=x;
		if(x>0)
		{
			if(x%2==0)
			{
				System.out.println(x+" is an even and positive integer");
			}
			else
			{
				System.out.println(x+" is an odd and positive integer");
			}
		}
		else
		{
			if(x%2==0)
			{
				System.out.println(x+" is an even and negative integer");
			}
			else
			{
				System.out.println(x+" is an odd and negative integer");
			}
		}
	}
	public A(int x,int y)
	{
		this.x=x;
		this.y=y;
		int z=x+y;
		System.out.println(x+"+"+y+"="+z);
	}
}
class ConstructorOverloading
{
	public static void main(String args[])
	{
		new A();
		A ao2=new A(-8);
		A ao3=new A(7,-7);
	}
}
