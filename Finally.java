import java.util.Scanner;
class A 
{
	public void hello()
	{
		int x,y,z;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter x");
		x=so.nextInt();
		System.out.println("Enter Y");
		y=so.nextInt();
		try
		{
			z=x/y;
			System.out.println(z);
		}
		finally
		{
			System.out.println("I am in finally Block");
			int size;
			System.out.println("Enter the size of an array");
			size=so.nextInt();
			System.out.println("Enter "+size+" Values");
			int p[]=new int[size];
			int sum=0;
			for(int i=0;i<size;i++)
			{
				p[i]=so.nextInt();
			}
			for(int i=0;i<size;i++)
			{
				System.out.print(" "+p[i]);
				sum=sum+p[i];
			}
			System.out.println("Sum is:"+sum);
			System.out.println("=========");
			int row,cols;
			System.out.println("Enter number of rows");
			row=so.nextInt();
			System.out.println("Enter number of coloumns");
			cols=so.nextInt();
			System.out.println("Enter "+(row*cols)+" Values");
			int s[][]=new int[row][cols];
			for(int r=0;r<row;r++)
			{
				for(int j=0;j<cols;j++)
				{
					s[r][j]=so.nextInt();
				}
			}
			for(int r=0;r<row;r++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.println(s[r][j]);
				}
			}
			System.out.println("==========");
			int m[][][]={
				{{10,20,30},{40,50}},
					{{60,70,80}},
						{{11,12,13},{14,15}}
			};
			for(int i=0;i<m.length;i++)
			{
				for(int j=0;j<m[i].length;j++)
				{
					for(int k=0;k<m[i][j].length;k++)
					{
						System.out.println(m[i][j][k]);
					}
				}
			}
		}
	}
}
class Finally
{
	public static void main(String args[])
	{
		A ao=new A();
		ao.hello();
	}
}

