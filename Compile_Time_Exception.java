class Ashu
{
	public void hello()throws Exception
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				Thread.sleep(10000);
			}
			System.out.println(i);
		}
	}
}
class Munu extends Ashu
{
	public void hello()throws Exception
	{
		int i=1;
		int n=7;
		while(i<=10)
		{
			if(i==5)
			{
				Thread.sleep(5000);
			}
			System.out.println(i);
			i++;
		}
	}
}
class Pacha extends Ashu
{
	public void hello()throws Exception
	{
		int x=1;
		int sum=0;
		do
		{
			if(x>=5&&x<=9)
			{
				continue;
			}
			System.out.println(x);
			sum=sum+x;
			x++;
		}
		while(x<=20);
		System.out.println("Sum is:"+sum);
	}
}
class Padu extends Ashu
{
	public void hello()throws Exception
	{
	for(int i=1;i<=10;i++)
	{
		if(i==7)
		{
			break;
		}
		System.out.println(i);
	}
	}
}

class Compile_Time_Exception
{
	public static void main(String args[])throws Exception
	{
		Ashu a[]={new Ashu(),new Munu(),new Pacha(),new Padu()};
		for(Ashu b:a)
		{
			b.hello();
		}
	}
}

		