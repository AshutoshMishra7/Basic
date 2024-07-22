class Checked_Exception
{
	public static void main(String args[])
	{
		int x=1;
		int sum=0;
		while(x<=10)
		{
			try
			{
				if(x==5)
				{
					Thread.sleep(5000);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(x);
			sum=sum+x;
			x++;
		}
		System.out.println("Sum is:"+sum);
	}
}
