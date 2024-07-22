package anonymousinnerclass;
class A
{
	public void hello(int x,int y)
	{
		int z=x+y;
		System.out.println(x+"+"+y+"="+z);
	}
	public static void main(String args[])
	{
		A ao=new A();
		ao.hello(3,4);
		
		A ao2=new A()
		{
			public void hello(int x,int y)
			{
				int z=x-y;
				System.out.println(x+"-"+y+"="+z);
			}
		};
		ao2.hello(17,10);
		
		A ao3=new A()
		{
			public void hello(int x,int y)
			{
				int z=x*y;
				System.out.println(x+"*"+y+"="+z);
			}
		};
		ao3.hello(7,1);
		
		A ao4=new A()
		{
			public void hello(int x,int y)
			{
				int z=x/y;
				System.out.println(x+"/"+y+"="+z);
			}
		};
		ao4.hello(21,3);
	}
}
			