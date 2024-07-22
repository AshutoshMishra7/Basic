class Fibonaccie3
{
	public static void main(String args[])
	{
		int c=1;
		int sum=0;
		int n1,n2,n3;
		n1=0;
		n2=1;
		System.out.println(n1+" "+n2);
		do
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			sum=sum+n3;
			c++;
		}
		while(c<=10);
		System.out.println("Sum is"+sum);
	}
}
