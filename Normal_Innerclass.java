class Normal_Innerclass 
{
	int x=10;
	class B
	{
		int x=20;
		class C 
		{
			int x=30;
			public void show()
			{
				int x=40;
			System.out.println(Normal_Innerclass.this.x);
			System.out.println(B.this.x);
			System.out.println(this.x);
			System.out.println(x);
			}
		}
	}
      public static void main(String args[])
	{
		new Normal_Innerclass().new B().new C().show();
	}
}
