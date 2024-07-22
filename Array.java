class Array{
	public static void main(String args[])
	{
		int x[]={10,20,30,50};
		int sum=0;
		for(int y:x)
		{
			System.out.println(y);
			sum=sum+y;
		}
		System.out.println("Sum is"+sum);
	}
}