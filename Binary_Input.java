import java.util.Scanner;
class Prince
{
	public void show()
	{
		int x;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Binary Number");
		x=so.nextInt(2);
		System.out.println(x);
	}
}
class Binary_Input
{
	public static void main(String args[])
	{
		Prince suna=new Prince();
		suna.show();
	}
}
