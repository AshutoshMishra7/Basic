class A2
{
	class B2 
	{
		public void show()
		{
			System.out.println("I am In Innerclass");
		}
	}
		public static void main(String args[])
		{
			A2 ao=new A2();
			A2.B2 bo=ao.new B2();
			bo.show();
		}
}