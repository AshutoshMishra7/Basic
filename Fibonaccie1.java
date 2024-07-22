class Fibonaccie1
{
	public static void main(String args[])
	{
		int n1,n2,n3;
		n1=0;
		n2=1;
		int sum=0;
		System.out.print(" "+n1+" "+n2);
		for(int c=1;c<=20;c++)
		{
			n3=n1+n2;
			System.out.println(n3);
			sum=sum+n3;
			n1=n2;
			n2=n3;
		}
		System.out.println("Sum is "+sum);
	}
}
