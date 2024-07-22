import java.util.Scanner;
class Madan
{
	public void hello()
	{
		boolean isvowel=false;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter any Alphabet");
		char ch=so.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':isvowel=true;
		}
		if(isvowel==true)
		{
			System.out.println(ch+" is a vowel");
		}
		else
		{
			if((ch>='a' && ch<='z')||(ch<='A' && ch>='Z'))
			{
				System.out.println(ch+" is a conosnant");
			}
			else
			{
				System.out.println("Invalid Input....Enter an Alphabet");
			}
		}
	}
}
class Switch_Statement
{
	public static void main(String args[])
	{
		Madan bapa=new Madan();
		bapa.hello();
	}
}
