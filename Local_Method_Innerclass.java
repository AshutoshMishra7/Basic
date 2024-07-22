class Local_Method_Innerclass
{
	public void show()
	{
		class B 
		{
			public void hello(int x,int y)
			{
				int z=x+y;
				System.out.println("Sum is.."+z);
			}
		}
		B bo=new B();
		bo.hello(10,20);
	}
	public static void main(String args[])
	{
		Local_Method_Innerclass lo=new Local_Method_Innerclass();
		lo.show();
	}
}