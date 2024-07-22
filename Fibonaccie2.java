class Fibonaccie2
{
	public static void main(String artgs[])
	{
		int c=1;
		int n1=0;
		int n2=1;
		int sum=0;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		while(c<=10)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			sum=sum+n3;
			c++;
		}
		System.out.println("Sum is:"+sum);
	}
}
