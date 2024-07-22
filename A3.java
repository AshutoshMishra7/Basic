class A3
{
	class B3
	{
		public void show()
		{
			System.out.println("Accessing Innerclass Method Via Outerclass");
		}
	}
	public void hello()
	{
		B3 bo=new B3();
		bo.show();
	}
	public static void main(String args[])
	{
		A3 ao=new A3();
		ao.hello();
	}
}