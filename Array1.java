class Mac
{
	public void hello()
	{
		int x[]={10,20,30,40};
		System.out.println(x);
	}
	public void hello2()
	{
		int x[]={10,20,30,40,50};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}
	public void hello3()
	{
		int x[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int y:x)
		{
			System.out.println(y);
			sum=sum+y;
		}
		System.out.println("Sum is"+sum);
	}
	public void hello4()
	{
		int x[]=new int[3];
		System.out.println(x.length);
		for(int y:x)
		{
			System.out.println(y);
		}
	}
	public void hello5()
	{
		int x[]=new int['a'];
		System.out.println(x.length);
	}
	public void hello6()
	{
		int x[]=new int[(int)12.45];
		System.out.println(x.length);
	}
	public void hello7()
	{
		double d[]={12.36,37,'B',39.77f};
		for(double e:d)
		{
			System.out.println(e);
		}
	}
}
class Array1
{
	public static void main(String args[])
	{
		Mac mo=new Mac();
		mo.hello();
		mo.hello2();
		mo.hello3();
		mo.hello4();
		mo.hello5();
		mo.hello6();
		mo.hello7();
	}
}
