import java.util.Scanner;
class Array1d
{
	public static void main(String args[])
	{
		int size;
		int sum=0;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		size=so.nextInt();
		System.out.println("Enter "+size+" Values");
		int x[]=new int[size];
		for(int i=0;i<size;i++)
		{
			x[i]=so.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+x[i]);
			sum=sum+x[i];
		}
		System.out.println("\n");
		System.out.println("=============");
		System.out.println("Sum is "+sum);
	}
}
