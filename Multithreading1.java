import java.util.Scanner;
class A extends Thread
{
	public void run()
	{
		int n,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to get it's Sum");
		n = sc.nextInt();
		while(n!=0)
		{
			r =n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum is...(A)"+sum);
	}
}
class B extends Thread
{
	public void run()
	{
		int n,r,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value to get it's Reverse");
		n = sc.nextInt();
		while(n!=0)
		{
			r = n%10;
			rev = (rev*10)+r;
			n = n/10;
		}
		System.out.println("Reverse is...:"+rev);
		int x=n;
		if(x==rev)
		{
			System.out.println("The Given Number is a Pallindrome");
		}
	}
}
class C extends Thread
{
	public void run()
	{
		int n,r,arm=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n = sc.nextInt();
		{
			while(n!=0)
			{
				r=n%10;
				arm=(r*r*r)+arm;
				n=n/10;
			}
			System.out.println(arm);
			int x=n;
			if(x==arm)
			{
				System.out.println("It is an armstrong number");
			}
		}
	}
}
class D extends Thread
{
	public void run()
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value to get it's Table");
		n = sc.nextInt();
		for( i=1;i<=10;i++);
		{
			try
			{
				if(i==5)
				{
					Thread.sleep(10000);
				}
			}
			catch(Exception e)
			{

			}
			System.out.println("D..."+i);
		}
	}
}
class E extends Thread
{
	public void run()
	{
		int n1,n2,n3;
		n1=0;
		n2=1;
		for(int c=0;c<=20;c++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
class Multtheading1
{
	public static void main(String args[])
	{
		A ao = new A();
		B bo = new B();
		C co = new C();
		D dx = new D();
		E eo = new E();
		ao.start();
		bo.start();
		co.start();
		dx.start();
		eo.start();
	}
}

		
			