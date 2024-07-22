import java.util.*;
class Honey
{
	public void hello()
	{
		int x;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter Any Hexa-Decimal Integer Number System");
		x=so.nextInt(16);
		System.out.println(x);
	}
}
class Hexadecimal_Input
{
	public static void main(String args[])
	{
		Honey ho=new Honey();
		ho.hello();
	}
}
