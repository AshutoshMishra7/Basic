class Mac
{
	public void hello()
	{
		int x=100;
		while(x<=100 && x>=0)
		{
			System.out.println(x);
			x=x-3;
		}
	}
	public void hello2()
	{
		int x=80;
		do
		{
			System.out.println(x);
			x=x-2;
		}
		while(x<=80 && x>=10);
	}
	public void hello3()
	{
		for(int x=10;x<=100;x+=4)
		{
			System.out.println(x);
		}
	}
}
class Iterative_Statements
{
	public static void main(String args[])
	{
		Mac mo=new Mac();
		mo.hello();
		mo.hello2();
		mo.hello3();
	}
}
