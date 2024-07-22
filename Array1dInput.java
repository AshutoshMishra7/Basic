import java.util.Scanner;
class Array1dInput
{
	public static void main(String args[])
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		size=sc.nextInt();
		System.out.println("Enter "+size+" values");
		int x[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+x[i]);
			sum=sum+x[i];
		}
		System.out.println("Sum is "+sum);
	}
}