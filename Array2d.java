import java.util.Scanner;
class Array2d
{
	public static void main(String args[])
	{
		int row,cols;
		int sum=0;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		 row=so.nextInt();
		 System.out.println("Enter no Of Coloumns");
		 cols=so.nextInt();
		 System.out.println("Enter "+(row*cols)+" Values");
		 int x[][]=new int[row][cols];
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<cols;j++)
			 {
				 x[i][j]=so.nextInt();
			 }
		 }
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<cols;j++)
			 {
				 System.out.print(" "+x[i][j]);
				 sum=sum+x[i][j];
			 }
			 System.out.println("\n");
		 }
		 System.out.println("================");
		 System.out.println("Sum is "+sum);
	}
}
