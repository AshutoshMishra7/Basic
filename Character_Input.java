import java.util.Scanner;
class Ash
{
	public void show()
	{
		char ch;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Word");
		ch=so.next().charAt(0);
		ch=so.next().charAt(1);
		System.out.println(ch);
	}
}
class Character_Input
{
	public static void main(String args[])
	{
		Ash ao=new Ash();
		ao.show();
	}
}