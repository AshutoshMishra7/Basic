class A 
{
	public void show(int x,int y)
	{
		int z=x+y;
		System.out.println("Sum Is..."+z);
	}
	public static void main(String args[])
	{
		A ao=new A();
		ao.show(20,10);
	//Anynomous Innerclass
	A ao2=new A()
	{
		public void show(int x,int y)
		{
			int z=x-y;
			System.out.println("Substarction is..."+z);
		}
	};
	ao2.show(20,10);
	
	A ao3=new A()
	{
		public void show(int x,int y)
		{
			int z=x*y;
			System.out.println("Multiplication is...."+z);
		}
	};
	ao3.show(20,10);
	
	A ao4=new A()
	{
		public void show(int x,int y)
		{
			int z=x/y;
			System.out.println("Division is..."+z);
		}
	};
	ao4.show(20,10);
	}
}

		