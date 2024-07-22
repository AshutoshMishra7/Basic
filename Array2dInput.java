import java.util.Scanner;
class Array2dInput
{
	public static void main(String args[])
	{
		int r,c;
		int sum=0;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		r=so.nextInt();
		System.out.println("Enter the number of coloumns");
		c=so.nextInt();
		System.out.println("Enter "+(r*c)+" Values");
		int x[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				x[i][j]=so.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(" "+x[i][j]);
				sum=sum+x[i][j];
			}
			System.out.println("\n");
		}
		System.out.println("Sum is:"+sum);
	}
}
