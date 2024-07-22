class A4
{
	int x=10;
	class B4
	{
		int x=20;
		public void show()
		{
			int x=30;
			System.out.println(A4.this.x);
			System.out.println(this.x);
			System.out.println(x);
		}
	}
	public void show()
	{
		B4 bo=new B4();
		bo.show();
	}
	public static void main(String args[])
	{
		new A4().new B4().show();
	}
}
			